package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Usage {
    @JsonProperty("coWriteWords")
    public UsageItem coWriteWords;
    public Usage withCoWriteWords(UsageItem coWriteWords) {
        this.coWriteWords = coWriteWords;
        return this;
    }
    
    @JsonProperty("team")
    public UsageItem team;
    public Usage withTeam(UsageItem team) {
        this.team = team;
        return this;
    }
    
    @JsonProperty("user")
    public UsageItem user;
    public Usage withUser(UsageItem user) {
        this.user = user;
        return this;
    }
    
    @JsonProperty("words")
    public UsageItem words;
    public Usage withWords(UsageItem words) {
        this.words = words;
        return this;
    }
    
}
