/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.core.matcher;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.swing.test.builder.JLabels.label;
import static org.assertj.swing.test.builder.JTextFields.textField;

import org.assertj.swing.test.core.EDTSafeTestCase;
import org.junit.Test;

/**
 * Tests for {@link JLabelMatcher#matches(java.awt.Component)}.
 * 
 * @author Alex Ruiz
 */
public class JLabelMatcher_matches_any_Test extends EDTSafeTestCase {
  @Test
  public void should_Always_Return_True_When_Matching_Any_JLabel() {
    JLabelMatcher matcher = JLabelMatcher.any();
    assertThat(matcher.matches(label().createNew())).isTrue();
  }

  @Test
  public void should_Return_False_If_Component_Is_Not_JLabel() {
    JLabelMatcher matcher = JLabelMatcher.any();
    assertThat(matcher.matches(textField().createNew())).isFalse();
  }
}
