/*
 * Created on Jul 19, 2009
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2009-2013 the original author or authors.
 */
package org.assertj.swing.driver;

import org.junit.Test;

/**
 * Tests for {@link ComponentDriver#requireFocused(java.awt.Component)}.
 * 
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class ComponentDriver_requireFocused_Test extends ComponentDriver_TestCase {
  @Test
  public void should_fail_if_Component_does_not_have_focus() {
    thrown.expectAssertionError("Expected component");
    thrown.expectMessageToContain("to have input focus");
    driver.requireFocused(window.button);
  }

  @Test
  public void should_pass_if_Component_has_focus() {
    showWindow();
    driver.requireFocused(window.textField);
  }
}
