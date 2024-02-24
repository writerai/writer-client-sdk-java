# Content
(*content*)

## Overview

Methods related to Content

### Available Operations

* [check](#check) - Check your content against your preset styleguide.
* [correct](#correct) - Apply the style guide suggestions directly to your content.

## check

Check your content against your preset styleguide.

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ContentCheckRequest;
import com.writer.sdk.models.operations.ContentCheckResponse;
import com.writer.sdk.models.shared.ContentRequest;
import com.writer.sdk.models.shared.ContentSettings;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(935464L)
                .build();

            com.writer.sdk.models.operations.ContentCheckRequest req = new ContentCheckRequest(
                new ContentRequest(
                    "<value>",
                    new ContentSettings(
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false)),
                38270L);

            com.writer.sdk.models.operations.ContentCheckResponse res = sdk.content.check(req);

            if (res.processedContent != null) {
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
| `request`                                                                                              | [com.writer.sdk.models.operations.ContentCheckRequest](../../models/operations/ContentCheckRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[com.writer.sdk.models.operations.ContentCheckResponse](../../models/operations/ContentCheckResponse.md)**


## correct

Apply the style guide suggestions directly to your content.

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ContentCorrectRequest;
import com.writer.sdk.models.operations.ContentCorrectResponse;
import com.writer.sdk.models.shared.ContentRequest;
import com.writer.sdk.models.shared.ContentSettings;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(501355L)
                .build();

            com.writer.sdk.models.operations.ContentCorrectRequest req = new ContentCorrectRequest(
                new ContentRequest(
                    "<value>",
                    new ContentSettings(
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false)),
                31310L){{
                xRequestID = "<value>";

            }};

            com.writer.sdk.models.operations.ContentCorrectResponse res = sdk.content.correct(req);

            if (res.correctionResponse != null) {
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
| `request`                                                                                                  | [com.writer.sdk.models.operations.ContentCorrectRequest](../../models/operations/ContentCorrectRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[com.writer.sdk.models.operations.ContentCorrectResponse](../../models/operations/ContentCorrectResponse.md)**

