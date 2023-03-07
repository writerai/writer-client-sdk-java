package com.writer.sdk.models.shared;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UploadModelFileRequestFile {
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;
    public UploadModelFileRequestFile withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:name=file")
    public String file;
    public UploadModelFileRequestFile withFile(String file) {
        this.file = file;
        return this;
    }
    
}
