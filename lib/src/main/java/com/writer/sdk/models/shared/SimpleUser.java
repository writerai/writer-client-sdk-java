package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleUser {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public SimpleUser withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonProperty("firstName")
    public String firstName;
    public SimpleUser withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;
    public SimpleUser withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastName")
    public String lastName;
    public SimpleUser withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
}
