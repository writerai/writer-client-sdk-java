# CoWrite
(*coWrite*)

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
                .setSecurity(new Security("suscipit") {{
                    apiKey = "";
                }})
                .setOrganizationId(437587L)
                .build();

            GenerateContentRequest req = new GenerateContentRequest(                new GenerateTemplateRequest("magnam") {{
                                inputs = new com.writer.sdk.models.shared.MagicRequestInput[]{{
                                    add(new MagicRequestInput("minus") {{
                                        name = "Larry Windler";
                                        value = new String[]{{
                                            add("molestiae"),
                                        }};
                                    }}),
                                }};
                            }};, 812169L);            

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

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.writer.sdk.models.operations.GenerateContentRequest](../../models/operations/GenerateContentRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[com.writer.sdk.models.operations.GenerateContentResponse](../../models/operations/GenerateContentResponse.md)**


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
                .setSecurity(new Security("voluptatum") {{
                    apiKey = "";
                }})
                .setOrganizationId(479977L)
                .build();

            ListTemplatesRequest req = new ListTemplatesRequest(568045L, "nisi");            

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

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [com.writer.sdk.models.operations.ListTemplatesRequest](../../models/operations/ListTemplatesRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[com.writer.sdk.models.operations.ListTemplatesResponse](../../models/operations/ListTemplatesResponse.md)**

