# snippet

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
                .setSecurity(new Security("repellat") {{
                    apiKey = "";
                }})
                .setOrganizationId(653108L)
                .build();

            DeleteSnippetsRequest req = new DeleteSnippetsRequest(581850L) {{
                xRequestID = "numquam";
                ids = new String[]{{
                    add("quam"),
                    add("molestiae"),
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
                .setSecurity(new Security("velit") {{
                    apiKey = "";
                }})
                .setOrganizationId(623510L)
                .build();

            FindSnippetsRequest req = new FindSnippetsRequest(158969L) {{
                limit = 338007L;
                offset = 110375L;
                search = "laborum";
                shortcuts = new String[]{{
                    add("enim"),
                    add("odit"),
                    add("quo"),
                }};
                sortField = FindSnippetsSortField.SHORTCUT;
                sortOrder = FindSnippetsSortOrder.DESC;
                tags = new String[]{{
                    add("id"),
                    add("possimus"),
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
                .setSecurity(new Security("aut") {{
                    apiKey = "";
                }})
                .setOrganizationId(97101L)
                .build();

            UpdateSnippetsRequest req = new UpdateSnippetsRequest(622846L) {{
                requestBody = new com.writer.sdk.models.shared.SnippetUpdate[]{{
                    add(new SnippetUpdate("itaque", "incidunt") {{
                        description = "laborum";
                        id = "1ffe78f0-97b0-4074-b154-71b5e6e13b99";
                        shortcut = "pariatur";
                        snippet = "modi";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("voluptates") {{
                                tag = "rem";
                            }}),
                            add(new SnippetTagV2("repudiandae") {{
                                tag = "quasi";
                            }}),
                            add(new SnippetTagV2("veritatis") {{
                                tag = "sint";
                            }}),
                        }};
                    }}),
                    add(new SnippetUpdate("in", "illum") {{
                        description = "enim";
                        id = "0ad2abd4-4269-4802-9502-a94bb4f63c96";
                        shortcut = "provident";
                        snippet = "necessitatibus";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("dolor") {{
                                tag = "officia";
                            }}),
                            add(new SnippetTagV2("a") {{
                                tag = "debitis";
                            }}),
                            add(new SnippetTagV2("in") {{
                                tag = "dolorum";
                            }}),
                        }};
                    }}),
                    add(new SnippetUpdate("eum", "vero") {{
                        description = "maiores";
                        id = "b14cd66a-e395-4efb-9ba8-8f3a66997074";
                        shortcut = "distinctio";
                        snippet = "id";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("suscipit") {{
                                tag = "labore";
                            }}),
                            add(new SnippetTagV2("nobis") {{
                                tag = "natus";
                            }}),
                        }};
                    }}),
                    add(new SnippetUpdate("magni", "sunt") {{
                        description = "aspernatur";
                        id = "14195989-0afa-4563-a251-6fe4c8b711e5";
                        shortcut = "expedita";
                        snippet = "nihil";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("sed") {{
                                tag = "quibusdam";
                            }}),
                            add(new SnippetTagV2("pariatur") {{
                                tag = "saepe";
                            }}),
                            add(new SnippetTagV2("consequuntur") {{
                                tag = "accusantium";
                            }}),
                            add(new SnippetTagV2("natus") {{
                                tag = "praesentium";
                            }}),
                        }};
                    }}),
                }};
                xRequestID = "quo";
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

