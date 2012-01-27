/*
 * Copyright 2011 madvertise Mobile Advertising GmbH
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

/**
 * Interface for the non-returning functions of the MRAID standard, version 1.0.
 */

package de.madvertise.android.sdk.mraid;

public interface IMraidBridge {
    public void close();
    public void expand(final String url);
    public void setExpandProperties(String json);
    public void open(String url);
    public void useCustomClose(boolean useCustomClose);
}
