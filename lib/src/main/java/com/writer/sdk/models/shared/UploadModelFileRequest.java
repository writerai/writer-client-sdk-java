/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.writer.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.writer.sdk.utils.SpeakeasyMetadata;

public class UploadModelFileRequest {
    @SpeakeasyMetadata("multipartForm:file")
    public UploadModelFileRequestFile file;
    public UploadModelFileRequest withFile(UploadModelFileRequestFile file) {
        this.file = file;
        return this;
    }
    

    public UploadModelFileRequest(@JsonProperty("file") UploadModelFileRequestFile file) {
    this.file = file;
  }
}
