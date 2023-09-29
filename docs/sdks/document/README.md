# Document
(*document*)

## Overview

Methods related to document

### Available Operations

* [get](#get) - Get document details
* [list](#list) - List team documents

## get

Get document details

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GetDocumentDetailsRequest;
import com.writer.sdk.models.operations.GetDocumentDetailsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("female") {{
                    apiKey = "";
                }})
                .setOrganizationId(558834L)
                .build();

            GetDocumentDetailsRequest req = new GetDocumentDetailsRequest(844199L, 544221L);            

            GetDocumentDetailsResponse res = sdk.document.get(req);

            if (res.document != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.writer.sdk.models.operations.GetDocumentDetailsRequest](../../models/operations/GetDocumentDetailsRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.writer.sdk.models.operations.GetDocumentDetailsResponse](../../models/operations/GetDocumentDetailsResponse.md)**


## list

List team documents

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListTeamDocumentsRequest;
import com.writer.sdk.models.operations.ListTeamDocumentsResponse;
import com.writer.sdk.models.operations.ListTeamDocumentsSortField;
import com.writer.sdk.models.operations.ListTeamDocumentsSortOrder;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("Bicycle") {{
                    apiKey = "";
                }})
                .setOrganizationId(257649L)
                .build();

            ListTeamDocumentsRequest req = new ListTeamDocumentsRequest(678317L) {{
                limit = 297548;
                offset = 177706L;
                search = "Ergonomic Shores";
                sortField = ListTeamDocumentsSortField.CREATION_TIME;
                sortOrder = ListTeamDocumentsSortOrder.ASC;
            }};            

            ListTeamDocumentsResponse res = sdk.document.list(req);

            if (res.briefDocuments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.writer.sdk.models.operations.ListTeamDocumentsRequest](../../models/operations/ListTeamDocumentsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[com.writer.sdk.models.operations.ListTeamDocumentsResponse](../../models/operations/ListTeamDocumentsResponse.md)**

