/**
 * Copyright (c) 2014 Eclectic Logic LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.eclecticlogic.pedal.dm;

import java.io.Serializable;

/**
 * @author kabram.
 *
 */
public interface DAORegistry extends DAOLite {

    /**
     * @param clz The class of the entity
     * @return DAO for the entity.
     */
    <E extends Serializable, P extends Serializable> DAO<E, P> get(Class<E> clz);


    /**
     * @param entity Instance of an entity
     * @return DAO for the entity.
     */
    <E extends Serializable, P extends Serializable> DAO<E, P> get(E entity);


    /**
     * Tests various operations on the DAOs (DAOs should implement the TestableDAO interface).
     */
    <E extends Serializable, P extends Serializable> void testDAOs();
}
