/*
 * Created on 2010-4-29
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2007-2010 the original author or authors.
 */

package org.fest.assertions;

/**
 * Test ensuring that {@link org.fest.assertions.ShortAssert} obeys the {@link org.fest.assertions.GenericAssert#isNotSameAs(Object)}
 * contract for {@link Short}.
 */
public class ShortAssert_Generic_isNotSameAs_Test extends GenericAssert_isNotSameAs_TestBase<Short> {

  @Override
  protected Short createEight() {
    return new Short((short) 8);
  }

  @Override
  protected String eightAsString() {
    return "8";
  }

  @Override
  protected ShortAssert assertionFor(Short actual) {
    return new ShortAssert(actual);
  }
}