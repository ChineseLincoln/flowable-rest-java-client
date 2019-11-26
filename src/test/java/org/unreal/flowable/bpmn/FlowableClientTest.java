package org.unreal.flowable.bpmn;

import org.junit.Assert;
import org.junit.Test;
import org.unreal.flowable.FlowableClient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2018/3/20.
 */
public class FlowableClientTest {

    ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    @Test
    public void testSingleton() throws ExecutionException {
        AtomicInteger index = new AtomicInteger(0);

        List<Callable<FlowableClient>> callables = new ArrayList<>();
        while (index.getAndIncrement() < 1000) {
            callables.add(new TestThread(index.get()));
        }
        try {
            List<Future<FlowableClient>> futures = cachedThreadPool.invokeAll(callables);
            for (Future<FlowableClient> future : futures) {
                Assert.assertEquals(future.get(), futures.get(0).get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class TestThread implements Callable<FlowableClient> {

        int index;

        public TestThread(int index) {
            this.index = index;
        }

        @Override
        public FlowableClient call() throws Exception {
            Thread.sleep(1000);
            System.out.println("Get Instance, thread: " + this.toString() + ", index: " + index);
            return FlowableClient.getInstance();
        }
    }
}