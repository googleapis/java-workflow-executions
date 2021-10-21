/*
 * Copyright 2021 Google LLC
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

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= ExecutionsClient =======================
 *
 * <p>Service Description: Executions is used to start and manage running instances of
 * [Workflows][google.cloud.workflows.v1.Workflow] called executions.
 *
 * <p>Sample for ExecutionsClient:
 *
 * <pre>{@code
 * try (ExecutionsClient executionsClient = ExecutionsClient.create()) {
 *   WorkflowName parent = WorkflowName.of("[PROJECT]", "[LOCATION]", "[WORKFLOW]");
 *   Execution execution = Execution.newBuilder().build();
 *   Execution response = executionsClient.createExecution(parent, execution);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.workflows.executions.v1;

import javax.annotation.Generated;
