/*
 * Copyright 2020 the original authors
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

package com.github.hauner.openapi.processor.spring

import io.openapiprocessor.spring.writer.java.HeaderWriterKt
import spock.lang.Specification

class EndToEndBase extends Specification {

    void setupSpec () {
        // set a "fixed" header, we don't want moving version/date/time parts

        HeaderWriterKt.HEADER = """\
/*
 * DO NOT MODIFY - this class was auto generated by openapi-processor-spring
 *
 * test
 * time
 * https://docs.openapiprocessor.io/spring 
 */

"""
    }

}
