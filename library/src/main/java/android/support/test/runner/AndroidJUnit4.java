/*
 * Copyright (c) 2015 FUJI Goro (gfx).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.runner;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

/**
 * An {@link AndroidJUnit4} implementation with {@link RobolectricTestRunner}.
 *
 * Usage: {@code @RunWith(AndroidJUnit4.class)}
 */
public class AndroidJUnit4 extends RobolectricTestRunner {

    public AndroidJUnit4(Class<?> testClass) throws InitializationError {
        super(testClass);
    }
}
