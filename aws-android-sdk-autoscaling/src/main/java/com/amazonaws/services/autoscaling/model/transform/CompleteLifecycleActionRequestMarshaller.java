/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CompleteLifecycleActionRequest
 */
public class CompleteLifecycleActionRequestMarshaller implements
        Marshaller<Request<CompleteLifecycleActionRequest>, CompleteLifecycleActionRequest> {

    public Request<CompleteLifecycleActionRequest> marshall(
            CompleteLifecycleActionRequest completeLifecycleActionRequest) {
        if (completeLifecycleActionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CompleteLifecycleActionRequest)");
        }

        Request<CompleteLifecycleActionRequest> request = new DefaultRequest<CompleteLifecycleActionRequest>(
                completeLifecycleActionRequest, "AmazonAutoScaling");
        request.addParameter("Action", "CompleteLifecycleAction");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (completeLifecycleActionRequest.getLifecycleHookName() != null) {
            prefix = "LifecycleHookName";
            String lifecycleHookName = completeLifecycleActionRequest.getLifecycleHookName();
            request.addParameter(prefix, StringUtils.fromString(lifecycleHookName));
        }
        if (completeLifecycleActionRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = completeLifecycleActionRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (completeLifecycleActionRequest.getLifecycleActionToken() != null) {
            prefix = "LifecycleActionToken";
            String lifecycleActionToken = completeLifecycleActionRequest.getLifecycleActionToken();
            request.addParameter(prefix, StringUtils.fromString(lifecycleActionToken));
        }
        if (completeLifecycleActionRequest.getLifecycleActionResult() != null) {
            prefix = "LifecycleActionResult";
            String lifecycleActionResult = completeLifecycleActionRequest
                    .getLifecycleActionResult();
            request.addParameter(prefix, StringUtils.fromString(lifecycleActionResult));
        }
        if (completeLifecycleActionRequest.getInstanceId() != null) {
            prefix = "InstanceId";
            String instanceId = completeLifecycleActionRequest.getInstanceId();
            request.addParameter(prefix, StringUtils.fromString(instanceId));
        }

        return request;
    }
}
