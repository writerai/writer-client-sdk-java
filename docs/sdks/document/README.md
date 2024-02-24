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
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(700347L)
                .build();

            com.writer.sdk.models.operations.GetDocumentDetailsRequest req = new GetDocumentDetailsRequest(
                90065L,
                558834L);

            com.writer.sdk.models.operations.GetDocumentDetailsResponse res = sdk.document.get(req);

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
import com.writer.sdk.models.operations.ListTeamDocumentsQueryParamSortField;
import com.writer.sdk.models.operations.ListTeamDocumentsQueryParamSortOrder;
import com.writer.sdk.models.operations.ListTeamDocumentsRequest;
import com.writer.sdk.models.operations.ListTeamDocumentsResponse;
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

            com.writer.sdk.models.operations.ListTeamDocumentsRequest req = new ListTeamDocumentsRequest(
                99895L){{
                limit = 547272;
                offset = 257649L;
                search = "<value>";
                sortField = ListTeamDocumentsQueryParamSortField.MODIFIED_BY_ME_TIME;
                sortOrder = ListTeamDocumentsQueryParamSortOrder.ASC;

            }};

            com.writer.sdk.models.operations.ListTeamDocumentsResponse res = sdk.document.list(req);

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

