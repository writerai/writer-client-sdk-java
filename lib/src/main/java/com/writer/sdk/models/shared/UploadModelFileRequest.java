package com.writer.sdk.models.shared;

import com.writer.sdk.utils.SpeakeasyMetadata;

public class UploadModelFileRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public UploadModelFileRequestFile file;
    public UploadModelFileRequest withFile(UploadModelFileRequestFile file) {
        this.file = file;
        return this;
    }
    
}
