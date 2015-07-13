package com.marcthomas.testrobolectric;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = "app/src/main/AndroidManifest.xml", sdk = 18)
public class ApplicationTest {

    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.buildActivity(MyActivity.class).create().get() != null);
    }
}
