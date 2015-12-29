package com.github.gfx.android.robolectricinstrumentation;

import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class BasicTest {

    @Test
    public void testGetContext() throws Exception {
        assertThat(InstrumentationRegistry.getTargetContext(), is(instanceOf(Context.class)));
    }

    @Test
    public void testGetString() throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
        assertThat(context.getString(R.string.app_name), is("RobolectricInstrumentation"));
    }
}
