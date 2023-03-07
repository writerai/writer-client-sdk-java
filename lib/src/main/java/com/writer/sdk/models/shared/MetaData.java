package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaData {
    @JsonProperty("portal")
    public java.util.Map<String, String> portal;
    public MetaData withPortal(java.util.Map<String, String> portal) {
        this.portal = portal;
        return this;
    }
    
    @JsonProperty("reporting")
    public java.util.Map<String, String> reporting;
    public MetaData withReporting(java.util.Map<String, String> reporting) {
        this.reporting = reporting;
        return this;
    }
    
    @JsonProperty("snippetsCount")
    public Long snippetsCount;
    public MetaData withSnippetsCount(Long snippetsCount) {
        this.snippetsCount = snippetsCount;
        return this;
    }
    
    @JsonProperty("ssoAccess")
    public Boolean ssoAccess;
    public MetaData withSsoAccess(Boolean ssoAccess) {
        this.ssoAccess = ssoAccess;
        return this;
    }
    
    @JsonProperty("styleguide")
    public java.util.Map<String, String> styleguide;
    public MetaData withStyleguide(java.util.Map<String, String> styleguide) {
        this.styleguide = styleguide;
        return this;
    }
    
    @JsonProperty("teamCount")
    public Long teamCount;
    public MetaData withTeamCount(Long teamCount) {
        this.teamCount = teamCount;
        return this;
    }
    
    @JsonProperty("termsCount")
    public Long termsCount;
    public MetaData withTermsCount(Long termsCount) {
        this.termsCount = termsCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tier")
    public MetaDataTierEnum tier;
    public MetaData withTier(MetaDataTierEnum tier) {
        this.tier = tier;
        return this;
    }
    
}
