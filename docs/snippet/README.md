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
                .setSecurity(new Security("quis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(110375L)
                .build();

            DeleteSnippetsRequest req = new DeleteSnippetsRequest(674752L) {{
                xRequestID = "animi";
                ids = new String[]{{
                    add("odit"),
                    add("quo"),
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
                .setSecurity(new Security("sequi") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(949572L)
                .build();

            FindSnippetsRequest req = new FindSnippetsRequest(368725L) {{
                limit = 662527L;
                offset = 820994L;
                search = "aut";
                shortcuts = new String[]{{
                    add("error"),
                }};
                sortField = FindSnippetsSortField.MODIFICATION_TIME;
                sortOrder = FindSnippetsSortOrder.DESC;
                tags = new String[]{{
                    add("reiciendis"),
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
                .setSecurity(new Security("voluptatibus") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(878194L)
                .build();

            UpdateSnippetsRequest req = new UpdateSnippetsRequest(468651L) {{
                requestBody = new com.writer.sdk.models.shared.SnippetUpdate[]{{
                    add(new SnippetUpdate("quibusdam", "labore") {{
                        description = "voluptatibus";
                        id = "097b0074-f154-471b-9e6e-13b99d488e1e";
                        shortcut = "sint";
                        snippet = "veritatis";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("enim") {{
                                tag = "incidunt";
                            }}),
                            add(new SnippetTagV2("est") {{
                                tag = "consequatur";
                            }}),
                            add(new SnippetTagV2("explicabo") {{
                                tag = "quibusdam";
                            }}),
                            add(new SnippetTagV2("distinctio") {{
                                tag = "deserunt";
                            }}),
                        }};
                    }}),
                    add(new SnippetUpdate("accusamus", "non") {{
                        description = "modi";
                        id = "269802d5-02a9-44bb-8f63-c969e9a3efa7";
                        shortcut = "in";
                        snippet = "illum";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("dicta") {{
                                tag = "rerum";
                            }}),
                            add(new SnippetTagV2("cumque") {{
                                tag = "magnam";
                            }}),
                            add(new SnippetTagV2("ea") {{
                                tag = "facere";
                            }}),
                            add(new SnippetTagV2("laborum") {{
                                tag = "aliquid";
                            }}),
                        }};
                    }}),
                    add(new SnippetUpdate("reiciendis", "mollitia") {{
                        description = "occaecati";
                        id = "5efb9ba8-8f3a-4669-9707-4ba4469b6e21";
                        shortcut = "magnam";
                        snippet = "et";
                        tags = new com.writer.sdk.models.shared.SnippetTagV2[]{{
                            add(new SnippetTagV2("provident") {{
                                tag = "ullam";
                            }}),
                            add(new SnippetTagV2("sint") {{
                                tag = "quos";
                            }}),
                            add(new SnippetTagV2("mollitia") {{
                                tag = "accusantium";
                            }}),
                        }};
                    }}),
                }};
                xRequestID = "ad";
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
