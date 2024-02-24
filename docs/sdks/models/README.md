# Models
(*models*)

## Overview

Methods related to Model

### Available Operations

* [list](#list) - List available LLM models

## list

List available LLM models

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListModelsRequest;
import com.writer.sdk.models.operations.ListModelsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(768578L)
                .build();

            com.writer.sdk.models.operations.ListModelsRequest req = new ListModelsRequest(
);

            com.writer.sdk.models.operations.ListModelsResponse res = sdk.models.list(req);

            if (res.generationModelsResponse != null) {
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
| `request`                                                                                          | [com.writer.sdk.models.operations.ListModelsRequest](../../models/operations/ListModelsRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[com.writer.sdk.models.operations.ListModelsResponse](../../models/operations/ListModelsResponse.md)**

