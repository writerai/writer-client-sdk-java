package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentSettings {
    @JsonProperty("ageAndFamilyStatus")
    public Boolean ageAndFamilyStatus;
    public ContentSettings withAgeAndFamilyStatus(Boolean ageAndFamilyStatus) {
        this.ageAndFamilyStatus = ageAndFamilyStatus;
        return this;
    }
    
    @JsonProperty("confidence")
    public Boolean confidence;
    public ContentSettings withConfidence(Boolean confidence) {
        this.confidence = confidence;
        return this;
    }
    
    @JsonProperty("contentSafeguards")
    public Boolean contentSafeguards;
    public ContentSettings withContentSafeguards(Boolean contentSafeguards) {
        this.contentSafeguards = contentSafeguards;
        return this;
    }
    
    @JsonProperty("disability")
    public Boolean disability;
    public ContentSettings withDisability(Boolean disability) {
        this.disability = disability;
        return this;
    }
    
    @JsonProperty("genderIdentitySensitivity")
    public Boolean genderIdentitySensitivity;
    public ContentSettings withGenderIdentitySensitivity(Boolean genderIdentitySensitivity) {
        this.genderIdentitySensitivity = genderIdentitySensitivity;
        return this;
    }
    
    @JsonProperty("genderInclusiveNouns")
    public Boolean genderInclusiveNouns;
    public ContentSettings withGenderInclusiveNouns(Boolean genderInclusiveNouns) {
        this.genderInclusiveNouns = genderInclusiveNouns;
        return this;
    }
    
    @JsonProperty("genderInclusivePronouns")
    public Boolean genderInclusivePronouns;
    public ContentSettings withGenderInclusivePronouns(Boolean genderInclusivePronouns) {
        this.genderInclusivePronouns = genderInclusivePronouns;
        return this;
    }
    
    @JsonProperty("grammar")
    public Boolean grammar;
    public ContentSettings withGrammar(Boolean grammar) {
        this.grammar = grammar;
        return this;
    }
    
    @JsonProperty("healthyCommunication")
    public Boolean healthyCommunication;
    public ContentSettings withHealthyCommunication(Boolean healthyCommunication) {
        this.healthyCommunication = healthyCommunication;
        return this;
    }
    
    @JsonProperty("passiveVoice")
    public Boolean passiveVoice;
    public ContentSettings withPassiveVoice(Boolean passiveVoice) {
        this.passiveVoice = passiveVoice;
        return this;
    }
    
    @JsonProperty("raceEthnicityNationalitySensitivity")
    public Boolean raceEthnicityNationalitySensitivity;
    public ContentSettings withRaceEthnicityNationalitySensitivity(Boolean raceEthnicityNationalitySensitivity) {
        this.raceEthnicityNationalitySensitivity = raceEthnicityNationalitySensitivity;
        return this;
    }
    
    @JsonProperty("sexualOrientationSensitivity")
    public Boolean sexualOrientationSensitivity;
    public ContentSettings withSexualOrientationSensitivity(Boolean sexualOrientationSensitivity) {
        this.sexualOrientationSensitivity = sexualOrientationSensitivity;
        return this;
    }
    
    @JsonProperty("spelling")
    public Boolean spelling;
    public ContentSettings withSpelling(Boolean spelling) {
        this.spelling = spelling;
        return this;
    }
    
    @JsonProperty("substanceUseSensitivity")
    public Boolean substanceUseSensitivity;
    public ContentSettings withSubstanceUseSensitivity(Boolean substanceUseSensitivity) {
        this.substanceUseSensitivity = substanceUseSensitivity;
        return this;
    }
    
    @JsonProperty("unclearReference")
    public Boolean unclearReference;
    public ContentSettings withUnclearReference(Boolean unclearReference) {
        this.unclearReference = unclearReference;
        return this;
    }
    
    @JsonProperty("wordiness")
    public Boolean wordiness;
    public ContentSettings withWordiness(Boolean wordiness) {
        this.wordiness = wordiness;
        return this;
    }
    
}
