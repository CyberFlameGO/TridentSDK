/*
 * Trident - A Multithreaded Server Alternative
 * Copyright 2016 The TridentSDK Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tridentsdk.base;

import org.junit.Assert;
import org.junit.Test;

public class SubstanceTest {
    @Test
    public void testId() throws Exception {
        for (Substance substance : Substance.values()) {
            Assert.assertEquals(substance.id(), substance.ordinal());
        }
    }

    @Test
    public void testToString() throws Exception {
        for (Substance substance : Substance.values()) {
            Assert.assertEquals(substance.toString(), "minecraft:" + substance.name().toLowerCase());
        }
    }

    @Test
    public void testOf() throws Exception {
        for (Substance substance : Substance.values()) {
            Assert.assertEquals(substance, Substance.of(substance.id()));
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOobOf() {
        Substance.of(Integer.MAX_VALUE);
    }
}