# Snippet
(*snippet*)

## Overview

Methods related to Snippets

### Available Operations

* [delete](#delete) - Delete snippets
* [find](#find) - Find snippets
* [update](#update) - Update snippets

## delete

Delete snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.DeleteSnippetsRequest;
import com.writer.sdk.models.operations.DeleteSnippetsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "";
                }})
                .setOrganizationId(545907L)
                .build();

            com.writer.sdk.models.operations.DeleteSnippetsRequest req = new DeleteSnippetsRequest(
                841399L){{
                xRequestID = "string";
                ids = new String[]{{
                    add("string"),
                }};

            }};

            com.writer.sdk.models.operations.DeleteSnippetsResponse res = sdk.snippet.delete(req);

            if (res.deleteResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.writer.sdk.models.operations.DeleteSnippetsRequest](../../models/operations/DeleteSnippetsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.writer.sdk.models.operations.DeleteSnippetsResponse](../../models/operations/DeleteSnippetsResponse.md)**


## find

Find snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.FindSnippetsRequest;
import com.writer.sdk.models.operations.FindSnippetsResponse;
import com.writer.sdk.models.operations.SortField;
import com.writer.sdk.models.operations.SortOrder;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "";
                }})
                .setOrganizationId(40141L)
                .build();

            com.writer.sdk.models.operations.FindSnippetsRequest req = new FindSnippetsRequest(
                326883L){{
                limit = 488098L;
                offset = 949900L;
                search = "string";
                shortcuts = new String[]{{
                    add("string"),
                }};
                sortField = SortField.MODIFICATION_TIME;
                sortOrder = SortOrder.ASC;
                tags = new String[]{{
                    add("string"),
                }};

            }};

            com.writer.sdk.models.operations.FindSnippetsResponse res = sdk.snippet.find(req);

            if (res.paginatedResultSnippetWithUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [com.writer.sdk.models.operations.FindSnippetsRequest](../../models/operations/FindSnippetsRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[com.writer.sdk.models.operations.FindSnippetsResponse](../../models/operations/FindSnippetsResponse.md)**


## update

Update snippets

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.UpdateSnippetsRequest;
import com.writer.sdk.models.operations.UpdateSnippetsResponse;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.SnippetTagV2;
import com.writer.sdk.models.shared.SnippetUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "";
                }})
                .setOrganizationId(857478L)
                .build();

            com.writer.sdk.models.operations.UpdateSnippetsRequest req = new UpdateSnippetsRequest(
                24555L){{
                requestBody = new com.writer.sdk.models.shared.SnippetUpdate[]{{
                    add(new SnippetUpdate(
                    "string",
                    "string"){{
                        id = "<ID>";
                        snippet = "string";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2(
                            "string"){{
                                tag = "string";
                            }}),
                        }};
                    }}),
                }};
                xRequestID = "string";

            }};

            com.writer.sdk.models.operations.UpdateSnippetsResponse res = sdk.snippet.update(req);

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [com.writer.sdk.models.operations.UpdateSnippetsRequest](../../models/operations/UpdateSnippetsRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.writer.sdk.models.operations.UpdateSnippetsResponse](../../models/operations/UpdateSnippetsResponse.md)**

