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
package org.assertj.swing.monitor;

import static org.assertj.swing.test.awt.Toolkits.newToolkitStub;

import java.awt.EventQueue;
import java.awt.Window;
import java.util.Map;

import org.assertj.swing.test.awt.ToolkitStub;
import org.junit.Before;

/**
 * Base test case for {@link WindowEventQueueMapping}.
 * 
 * @author Alex Ruiz
 */
public abstract class WindowEventQueueMapping_TestCase {
  EventQueue eventQueue;
  ToolkitStub toolkit;
  WindowEventQueueMapping mapping;
  Map<EventQueue, Map<Window, Boolean>> queueMap;

  @Before
  public final void setUp() {
    eventQueue = new EventQueue();
    toolkit = newToolkitStub(eventQueue);
    mapping = new WindowEventQueueMapping();
    queueMap = mapping.queueMap;
    onSetUp();
  }

  void onSetUp() {
  }
}
