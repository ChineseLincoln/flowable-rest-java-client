package org.unreal.flowable.bpmn;

import org.junit.Test;
import org.unreal.flowable.Version;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Administrator on 2018/3/19.
 */
public class VersionTest {

    @Test
    public void testVersion() {
        assertNotNull(Version.getVersion());
        assertEquals("1.0.0", Version.getVersion());
        assertEquals("6.2.1.0", Version.getSupportVersion());
    }

}
