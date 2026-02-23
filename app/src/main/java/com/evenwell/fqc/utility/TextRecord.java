/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.evenwell.fqc.utility;

import android.nfc.NdefRecord;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TextRecord { /* implementation hidden */ }
    /** ISO/IANA language code */
    public TextRecord(String languageCode, String text) { /* implementation hidden */ }
//    public View getView(Activity activity, LayoutInflater inflater, ViewGroup parent, int offset) {
//        TextView text = (TextView) inflater.inflate(R.layout.tag_text, parent, false);
//        text.setText(mText);
//        return text;
//    }
    public String getText() { /* implementation hidden */ }
    /**
     * Returns the ISO/IANA language code associated with this text element.
     */
    public String getLanguageCode() { /* implementation hidden */ }
    // TODO: deal with text fields which span multiple NdefRecords
    public void parse(NdefRecord record) { /* implementation hidden */ }
            /*
             * payload[0] contains the "Status Byte Encodings" field, per the
             * NFC Forum "Text Record Type Definition" section 3.2.1.
             *
             * bit7 is the Text Encoding Field.
             *
             * if (Bit_7 == 0): The text is encoded in UTF-8 if (Bit_7 == 1):
             * The text is encoded in UTF16
             *
             * Bit_6 is reserved for future use and must be set to zero.
             *
             * Bits 5 to 0 are the length of the IANA language code.
             */
            // should never happen unless we get a malformed tag.
}

    public boolean isText(NdefRecord record) { /* implementation hidden */ }
}

    public static <T> T checkNotNull(final T reference) { /* implementation hidden */ }
}

    public static void checkArgument(boolean expression) { /* implementation hidden */ }
}
