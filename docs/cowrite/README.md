# coWrite

## Overview

Methods related to CoWrite

### Available Operations

* [generateContent](#generatecontent) - Generate content using predefined templates
* [listTemplates](#listtemplates) - Get a list of your existing CoWrite templates

## generateContent

Generate content using predefined templates

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GenerateContentRequest;
import com.writer.sdk.models.operations.GenerateContentResponse;
import com.writer.sdk.models.shared.GenerateTemplateRequest;
import com.writer.sdk.models.shared.MagicRequestInput;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("vel") {{
                    apiKey = "";
                }})
                .setOrganizationId(623564L)
                .build();

            GenerateContentRequest req = new GenerateContentRequest(                new GenerateTemplateRequest("deserunt") {{
                                inputs = new com.writer.sdk.models.shared.MagicRequestInput[]{{
                                    add(new MagicRequestInput("placeat") {{
                                        name = "Dr. Valerie Toy";
                                        value = new String[]{{
                                            add("molestiae"),
                                            add("minus"),
                                        }};
                                    }}),
                                    add(new MagicRequestInput("perferendis") {{
                                        name = "Ted Mante";
                                        value = new String[]{{
                                            add("ab"),
                                            add("quis"),
                                            add("veritatis"),
                                            add("deserunt"),
                                        }};
                                    }}),
                                }};
                            }};, 368241L);            

            GenerateContentResponse res = sdk.coWrite.generateContent(req);

            if (res.draft != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listTemplates

Get a list of your existing CoWrite templates

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListTemplatesRequest;
import com.writer.sdk.models.operations.ListTemplatesResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("repellendus") {{
                    apiKey = "";
                }})
                .setOrganizationId(957156L)
                .build();

            ListTemplatesRequest req = new ListTemplatesRequest(778157L, "odit");            

            ListTemplatesResponse res = sdk.coWrite.listTemplates(req);

            if (res.templateDetailsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
