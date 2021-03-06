/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.sso.cas.request;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkClientException;
import org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CASIdentityRequest extends IdentityRequest {
    private static final Log log = LogFactory.getLog(CASIdentityRequest.class);
    String serviceUrlFromRequest;
    String subject;

    public CASIdentityRequest(CASIdentityRequestBuilder builder) throws FrameworkClientException {
        super(builder);
        this.serviceUrlFromRequest = builder.serviceUrlFromRequest;
        this.subject = builder.subject;
    }

    public static class CASIdentityRequestBuilder extends IdentityRequestBuilder {
        String serviceUrlFromRequest;
        String subject;

        public CASIdentityRequestBuilder(HttpServletRequest request, HttpServletResponse response) {
            super(request, response);
        }

        public CASIdentityRequestBuilder() {
        }
    }
}
