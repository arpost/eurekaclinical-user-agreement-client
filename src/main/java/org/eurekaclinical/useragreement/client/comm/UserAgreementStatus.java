package org.eurekaclinical.useragreement.client.comm;

/*-
 * #%L
 * Eureka! Clinical User Agreement Client
 * %%
 * Copyright (C) 2016 Emory University
 * %%
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
 * #L%
 */

import java.util.Date;

/**
 *
 * @author Andrew Post
 */
public class UserAgreementStatus {
    private Long id;
    private String username;
    private String fullname;
    private Date expiry;
    private Status status;
    private Long userAgreement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getExpiry() {
        return expiry;
    }

    /**
     * Sets the expiration date of the user agreement. This field is read-only,
     * and set values are ignored.
     * 
     * @param expiry the expiration date.
     */
    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of a user agreement (e.g., active, expired). The status
     * field is read-only, and set values are ignored.
     * 
     * @param status the status.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getUserAgreement() {
        return userAgreement;
    }

    public void setUserAgreement(Long userAgreement) {
        this.userAgreement = userAgreement;
    }
    
}
