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
package org.assertj.swing.query;

import static org.assertj.core.util.Preconditions.checkNotNull;
import static org.assertj.swing.edt.GuiActionRunner.execute;

import java.awt.Component;
import java.awt.Dimension;

import javax.annotation.Nonnull;

import org.assertj.swing.annotation.RunsInEDT;

/**
 * Returns the size of an AWT or Swing {@code Component}. This query is executed in the event dispatch thread (EDT).
 * 
 * @see Component#getSize()
 * 
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public final class ComponentSizeQuery {
  /**
   * Returns the size of the given AWT or Swing {@code Component}. This query is executed in the event dispatch thread
   * (EDT).
   * 
   * @param component the given {@code Component}.
   * @return the size of the given {@code Component}.
   * @see Component#getSize()
   */
  @RunsInEDT
  @Nonnull public static Dimension sizeOf(final @Nonnull Component component) {
    Dimension result = execute(() -> component.getSize());
    return checkNotNull(result);
  }

  private ComponentSizeQuery() {
  }
}