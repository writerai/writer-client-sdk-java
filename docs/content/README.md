# content

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
                .setSecurity(new Security("sed") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(612096L)
                .build();

            ContentCheckRequest req = new ContentCheckRequest(                new ContentRequest("dolor",                 new ContentSettings(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false););, 616934L);            

            ContentCheckResponse res = sdk.content.check(req);

            if (res.processedContent != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

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
                .setSecurity(new Security("laboriosam") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(943749L)
                .build();

            ContentCorrectRequest req = new ContentCorrectRequest(                new ContentRequest("saepe",                 new ContentSettings(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false););, 681820L) {{
                xRequestID = "in";
            }};            

            ContentCorrectResponse res = sdk.content.correct(req);

            if (res.correctionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
