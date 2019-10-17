/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.identity.governance.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Governance connector response with minimal attributes.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;
@ApiModel(description = "Governance connector response with minimal attributes.")
public class CategoryConnectorsRes  {
  
    private String id;
    private String self;

    /**
    * Connector id.
    **/
    public CategoryConnectorsRes id(String id) {

        this.id = id;
        return this;
    }
    
    @ApiModelProperty(example = "c3VzcGVuc2lvbi5ub3RpZmljYXRpb24", value = "Connector id.")
    @JsonProperty("id")
    @Valid
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    /**
    * Path to retrieve the full connector information.
    **/
    public CategoryConnectorsRes self(String self) {

        this.self = self;
        return this;
    }
    
    @ApiModelProperty(example = "/t/carbon.super/api/server/v1/identity-governance/QWNjb3VudCBNYW5hZ2VtZW50IFBvbGljaWVz/connectors/c3VzcGVuc2lvbi5ub3RpZmljYXRpb24", value = "Path to retrieve the full connector information.")
    @JsonProperty("self")
    @Valid
    public String getSelf() {
        return self;
    }
    public void setSelf(String self) {
        this.self = self;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryConnectorsRes categoryConnectorsRes = (CategoryConnectorsRes) o;
        return Objects.equals(this.id, categoryConnectorsRes.id) &&
            Objects.equals(this.self, categoryConnectorsRes.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, self);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryConnectorsRes {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

