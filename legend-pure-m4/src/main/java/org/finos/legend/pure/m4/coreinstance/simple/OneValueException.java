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

package org.finos.legend.pure.m4.coreinstance.simple;

public class OneValueException extends Exception
{
    private final int size;

    OneValueException(int size)
    {
        super();
        this.size = size;
    }

    @Override
    public String getMessage()
    {
        return "Expected at most 1 value, found " + this.size;
    }

    public int getSize()
    {
        return this.size;
    }
}