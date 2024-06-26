/*
 * Copyright 2021 - 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.rewrite.plugin.maven;

import org.springframework.rewrite.plugin.shared.PluginInvocationResult;

import java.nio.file.Path;

/**
 * @author Fabian Krüger
 */
public interface RewriteMavenPluginBuilder {

	public interface Recipes {

		MavenPLuginVersionBuilder recipes(String... recipeNames);

	}

	interface MavenPLuginVersionBuilder {

		FinalizingBuilder withMavenPluginVersion(String mavenPluginVersion);

	}

	interface FinalizingBuilder extends MavenPLuginVersionBuilder {

		FinalizingBuilder withDependencies(String... dependencies);

		FinalizingBuilder withDebugger(int port, boolean suspend);

		FinalizingBuilder withDebug();

		FinalizingBuilder withMemory(String s, String s1);

		PluginInvocationResult onDir(Path baseDir);

	}

}
