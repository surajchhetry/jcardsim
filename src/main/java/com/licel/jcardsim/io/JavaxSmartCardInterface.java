/*
 * Copyright 2013 Licel LLC.
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
package com.licel.jcardsim.io;

import com.licel.jcardsim.base.Simulator;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;

/**
 * Class with javacardx.smartcardio Command/Response support
 */
public class JavaxSmartCardInterface extends Simulator {

    /**
     * Wraper for the transmitCommand(byte[]) 
     * @param commandApdu CommandAPDU
     * @return ResponseAPDU
     */
    public ResponseAPDU transmitCommand(CommandAPDU commandApdu) {
        return new ResponseAPDU(transmitCommand(commandApdu.getBytes()));
    }
}
