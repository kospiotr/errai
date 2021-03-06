/*
 * Copyright 2011 JBoss, by Red Hat, Inc
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

package org.jboss.errai.jpa.test.client;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite running all JPA integration tests.
 *
 * @author Christian Sadilek <csadilek@redhat.com>
 * @author Jonathan Fuerth <jfuerth@redhat.com>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  ErraiJpaTest.class,
  HibernateJpaTest.class,
  QueryTest.class,
  HibernateQueryTest.class,
  InheritanceTest.class,
  HibernateInheritanceTest.class,
  GlobalEntityListenerTest.class,
  IdGeneratorTest.class,
  ErraiCascadeTest.class,
  HibernateCascadeTest.class,
  JsonUtilTest.class,
  NamespacedEntityManagerTest.class})
public class AllJpaTests {

}
