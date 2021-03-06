/*
 * Copyright (c) 2011 Jeppetto and Jonathan Thompson
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

package org.iternine.jeppetto.test;


import org.iternine.jeppetto.dao.ConditionType;
import org.iternine.jeppetto.dao.annotation.Condition;
import org.iternine.jeppetto.dao.annotation.DataAccessMethod;


public interface SimpleObjectAnnotationDAO {

    @DataAccessMethod(
            conditions = { @Condition(field = "intValue", type = ConditionType.GreaterThan) }
    )
    SimpleObject getHighIntValueObjects(int intValue);
}
