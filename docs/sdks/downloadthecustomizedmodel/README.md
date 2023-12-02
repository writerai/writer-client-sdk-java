# DownloadTheCustomizedModel
(*downloadTheCustomizedModel*)

## Overview

Methods related to Download the customized model

### Available Operations

* [fetchFile](#fetchfile) - Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

## fetchFile

Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.FetchCustomizedModelFileRequest;
import com.writer.sdk.models.operations.FetchCustomizedModelFileResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "";
                }})
                .setOrganizationId(501762L)
                .build();

            com.writer.sdk.models.operations.FetchCustomizedModelFileRequest req = new FetchCustomizedModelFileRequest(
                "string",
                "string");

            com.writer.sdk.models.operations.FetchCustomizedModelFileResponse res = sdk.downloadTheCustomizedModel.fetchFile(req);

            if (res.bytes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.writer.sdk.models.operations.FetchCustomizedModelFileRequest](../../models/operations/FetchCustomizedModelFileRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.writer.sdk.models.operations.FetchCustomizedModelFileResponse](../../models/operations/FetchCustomizedModelFileResponse.md)**

