/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.unreal.flowable.config;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Converter;

import java.io.BufferedReader;
import java.io.IOException;

final class ResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final TypeAdapter<T> adapter;

    ResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.gson = gson;
        this.adapter = adapter;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {

        MediaType mediaType = value.contentType();
        if (mediaType == null) {
            throw new IllegalStateException("Missing response header [content-type] ");
        }
        if (mediaType.type().equals("application") && mediaType.subtype().equals("json")) {
            try {
                JsonReader jsonReader = gson.newJsonReader(value.charStream());
                jsonReader.setLenient(true);
                T result = adapter.read(jsonReader);
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
                return result;
            } finally {
                value.close();
            }
        }else if(mediaType.type().equals("text") && mediaType.subtype().equals("plain")){
            return (T) value.string();
        }else if(mediaType.type().equals("image")){
            return (T) value.byteStream();
        }

        BufferedReader in = new BufferedReader(value.charStream());
        StringBuilder buffer = new StringBuilder();
        String line;
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return (T) buffer.toString();
    }
}
