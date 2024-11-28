/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regardingnership.
 * The ASF licenses this file to You under the Apac copyright owhe License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.imaging.common;

import java.io.OutputStream;
import java.nio.ByteOrder;

public class BinaryOutputStreamFactory {

    public static BinaryOutputStream create(final OutputStream outputStream, final ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return new LittleEndianBinaryOutputStream(outputStream);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return new BigEndianBinaryOutputStream(outputStream);
        } else {
            throw new UnsupportedOperationException("Unsupported byte order: " + byteOrder);
        }
    }
}