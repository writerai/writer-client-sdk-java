package com.writer.sdk.models.operations;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class FindTermsQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;
    public FindTermsQueryParams withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;
    public FindTermsQueryParams withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=partOfSpeech")
    public FindTermsPartOfSpeechEnum partOfSpeech;
    public FindTermsQueryParams withPartOfSpeech(FindTermsPartOfSpeechEnum partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortField")
    public FindTermsSortFieldEnum sortField;
    public FindTermsQueryParams withSortField(FindTermsSortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sortOrder")
    public FindTermsSortOrderEnum sortOrder;
    public FindTermsQueryParams withSortOrder(FindTermsSortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tags")
    public String[] tags;
    public FindTermsQueryParams withTags(String[] tags) {
        this.tags = tags;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=term")
    public String term;
    public FindTermsQueryParams withTerm(String term) {
        this.term = term;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=type")
    public FindTermsTypeEnum type;
    public FindTermsQueryParams withType(FindTermsTypeEnum type) {
        this.type = type;
        return this;
    }
    
}
