# Files

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
                .setSecurity(new Security("commodi") {{
                    apiKey = "";
                }})
                .setOrganizationId(473600L)
                .build();

            DeleteFileRequest req = new DeleteFileRequest("modi");            

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

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [com.writer.sdk.models.operations.DeleteFileRequest](../../models/operations/DeleteFileRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[com.writer.sdk.models.operations.DeleteFileResponse](../../models/operations/DeleteFileResponse.md)**


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
                .setSecurity(new Security("qui") {{
                    apiKey = "";
                }})
                .setOrganizationId(774234L)
                .build();

            GetFileRequest req = new GetFileRequest("cum");            

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

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [com.writer.sdk.models.operations.GetFileRequest](../../models/operations/GetFileRequest.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[com.writer.sdk.models.operations.GetFileResponse](../../models/operations/GetFileResponse.md)**


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
                .setSecurity(new Security("esse") {{
                    apiKey = "";
                }})
                .setOrganizationId(216550L)
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

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [com.writer.sdk.models.operations.ListFilesRequest](../../models/operations/ListFilesRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[com.writer.sdk.models.operations.ListFilesResponse](../../models/operations/ListFilesResponse.md)**


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
                .setSecurity(new Security("excepturi") {{
                    apiKey = "";
                }})
                .setOrganizationId(135218L)
                .build();

            UploadFileRequest req = new UploadFileRequest(                new UploadModelFileRequest(                new UploadModelFileRequestFile("perferendis".getBytes(), "ad");););            

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

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [com.writer.sdk.models.operations.UploadFileRequest](../../models/operations/UploadFileRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[com.writer.sdk.models.operations.UploadFileResponse](../../models/operations/UploadFileResponse.md)**

