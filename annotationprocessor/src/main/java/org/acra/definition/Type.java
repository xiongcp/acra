/*
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acra.definition;

import com.squareup.javapoet.TypeName;

import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;

/**
 * @author F43nd1r
 * @since 04.06.2017
 */

public class Type {
    private final TypeElement element;
    private final TypeMirror mirror;
    private final TypeName name;

    public Type(TypeElement element) {
        this.element = element;
        mirror = element.asType();
        name = TypeName.get(mirror);
    }

    public Type(TypeElement element, TypeMirror mirror, TypeName name) {
        this.element = element;
        this.mirror = mirror;
        this.name = name;
    }

    public TypeElement getElement() {
        return element;
    }

    public TypeMirror getMirror() {
        return mirror;
    }

    public TypeName getName() {
        return name;
    }
}
