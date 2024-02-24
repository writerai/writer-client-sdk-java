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
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(569932L)
                .build();

            com.writer.sdk.models.operations.GenerateContentRequest req = new GenerateContentRequest(
                new GenerateTemplateRequest(
                    "<value>"){{
                    inputs = new com.writer.sdk.models.shared.MagicRequestInput[]{{
                        add(new MagicRequestInput(
                        "<value>"){{
                            name = "<value>";
                        }}),
                    }};

                }},
                888452L);

            com.writer.sdk.models.operations.GenerateContentResponse res = sdk.coWrite.generateContent(req);

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
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(380445L)
                .build();

            com.writer.sdk.models.operations.ListTemplatesRequest req = new ListTemplatesRequest(
                882866L,
                "<value>");

            com.writer.sdk.models.operations.ListTemplatesResponse res = sdk.coWrite.listTemplates(req);

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

