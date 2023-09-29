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
                .setSecurity(new Security("program") {{
                    apiKey = "";
                }})
                .setOrganizationId(698486L)
                .build();

            DeleteSnippetsRequest req = new DeleteSnippetsRequest(557937L) {{
                xRequestID = "Sausages synergy";
                ids = new String[]{{
                    add("objective"),
                }};
            }};            

            DeleteSnippetsResponse res = sdk.snippet.delete(req);

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
import com.writer.sdk.models.operations.FindSnippetsSortField;
import com.writer.sdk.models.operations.FindSnippetsSortOrder;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("Ghana") {{
                    apiKey = "";
                }})
                .setOrganizationId(488098L)
                .build();

            FindSnippetsRequest req = new FindSnippetsRequest(949900L) {{
                limit = 939943L;
                offset = 111247L;
                search = "Electric";
                shortcuts = new String[]{{
                    add("Dynamic"),
                }};
                sortField = FindSnippetsSortField.SHORTCUT;
                sortOrder = FindSnippetsSortOrder.DESC;
                tags = new String[]{{
                    add("World"),
                }};
            }};            

            FindSnippetsResponse res = sdk.snippet.find(req);

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
                .setSecurity(new Security("Van") {{
                    apiKey = "";
                }})
                .setOrganizationId(15652L)
                .build();

            UpdateSnippetsRequest req = new UpdateSnippetsRequest(344620L) {{
                requestBody = new com.writer.sdk.models.shared.SnippetUpdate[]{{
                    add(new SnippetUpdate("Carolina", "syndicate") {{
                        description = "Reactive zero tolerance definition";
                        id = "<ID>";
                        shortcut = "Analyst invoice";
                        snippet = "Islands";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("Plastic") {{
                                tag = "withdrawal extend";
                            }}),
                        }};
                    }}),
                }};
                xRequestID = "implement JBOD";
            }};            

            UpdateSnippetsResponse res = sdk.snippet.update(req);

            if (res.snippetWithUsers != null) {
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

