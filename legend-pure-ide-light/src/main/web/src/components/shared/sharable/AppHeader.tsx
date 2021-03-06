/**
 * Copyright 2020 Goldman Sachs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import React from 'react';

export const AppHeader: React.FC<{
  children?: React.ReactNode;
}> = props => {
  const { children } = props;

  return (
    <div className="app__header">
      <div className="app__header__content">
        <div className="app__header__title">
          <div className="app__header__tag app__header__app-name">Pure IDE</div>
          <div className="app__header__tag app__header__tag__name">env</div>
          <div className="app__header__tag app__header__tag__value app__header__env">LOCAL</div>
        </div>
        <div className="app__header__actions">
          {children}
        </div>
      </div>
    </div>
  );
};
