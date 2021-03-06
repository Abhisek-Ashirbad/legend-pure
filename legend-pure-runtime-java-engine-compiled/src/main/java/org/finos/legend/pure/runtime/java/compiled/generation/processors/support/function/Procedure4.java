// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.pure.runtime.java.compiled.generation.processors.support.function;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure4<T1, T2, T3, T4> extends Serializable
{
    void value(T1 var1, T2 var2, T3 var3, T4 var4);

    default void accept(T1 argument1, T2 argument2, T3 argument3, T4 argument4)
    {
        this.value(argument1, argument2, argument3, argument4);
    }
}
