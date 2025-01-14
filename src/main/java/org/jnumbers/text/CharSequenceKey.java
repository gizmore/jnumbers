/* 
 Copyright (c) 2015, Laurent Bourges. All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 - Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer.

 - Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.jnumbers.text;

/**
 *
 * @author Laurent Bourges
 */
public final class CharSequenceKey {

    private int hashcode;
    private CharSequence key;

    public CharSequenceKey() {
    }

    public CharSequenceKey(final int hash, final String key) {
        this.hashcode = hash;
        this.key = key;
    }

    public void update(final CharSequence key) {
        this.hashcode = key.hashCode(); // better use hashCode impl of paramter. it might be cached?
        this.key = key;
    }

//    static int hashCode(final CharSequence csq) {
//        int h = 0;
//        for (int i = 0, len = csq.length(); i < len; i++) {
//            h = 31 * h + csq.charAt(i);
//        }
//        return h;
//    }

    @Override
    public int hashCode() {
        return this.hashcode;
    }

    @Override
    public boolean equals(final Object obj) {
//        if (obj instanceof CharSequenceKey) { hehehe
            final CharSequence o = ((CharSequenceKey) obj).key;
            final CharSequence k = this.key;
            int n = k.length();
            if (n == o.length()) {
                int i = 0;
                while (n-- != 0) {
                    if (k.charAt(i) != o.charAt(i)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
//        }
        return false;
    }

}
