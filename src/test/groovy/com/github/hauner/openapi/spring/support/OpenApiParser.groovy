/*
 * Copyright 2019 https://github.com/hauner/openapi-spring-generator
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

package com.github.hauner.openapi.spring.support

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.parser.OpenAPIV3Parser

class OpenApiParser {
    static OpenAPI parse(String apiYaml, showWarnings = true) {
        def contents = new OpenAPIV3Parser ().readContents (apiYaml)

        if (showWarnings) {
            printWarnings(contents.messages)
        }

        contents.openAPI
    }

    private static printWarnings(List<String> warnings) {
        if (warnings.empty) {
            return
        }

        println "OpenAPI warnings:"
        warnings.each {
            println it
        }
    }
}
