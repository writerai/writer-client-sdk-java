# files

## Overview

Methods related to Files

### Available Operations

* [delete](#delete) - Delete file
* [get](#get) - Get file
* [list](#list) - List files
* [upload](#upload) - Upload file

## delete

Delete file

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.DeleteFileRequest;
import com.writer.sdk.models.operations.DeleteFileResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("quidem") {{
                    apiKey = "";
                }})
                .setOrganizationId(99280L)
                .build();

            DeleteFileRequest req = new DeleteFileRequest("ipsa");            

            DeleteFileResponse res = sdk.files.delete(req);

            if (res.deleteFile200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## get

Get file

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GetFileRequest;
import com.writer.sdk.models.operations.GetFileResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("reiciendis") {{
                    apiKey = "";
                }})
                .setOrganizationId(666767L)
                .build();

            GetFileRequest req = new GetFileRequest("mollitia");            

            GetFileResponse res = sdk.files.get(req);

            if (res.modelFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

List files

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListFilesRequest;
import com.writer.sdk.models.operations.ListFilesResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("laborum") {{
                    apiKey = "";
                }})
                .setOrganizationId(170909L)
                .build();

            ListFilesRequest req = new ListFilesRequest();            

            ListFilesResponse res = sdk.files.list(req);

            if (res.modelFilesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## upload

Upload file

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.UploadFileRequest;
import com.writer.sdk.models.operations.UploadFileResponse;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.UploadModelFileRequest;
import com.writer.sdk.models.shared.UploadModelFileRequestFile;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("dolorem") {{
                    apiKey = "";
                }})
                .setOrganizationId(358152L)
                .build();

            UploadFileRequest req = new UploadFileRequest(                new UploadModelFileRequest(                new UploadModelFileRequestFile("explicabo".getBytes(), "nobis");););            

            UploadFileResponse res = sdk.files.upload(req);

            if (res.modelFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
