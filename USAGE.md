<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.DetectContentRequest;
import com.writer.sdk.models.operations.DetectContentResponse;
import com.writer.sdk.models.shared.ContentDetectorRequest;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(496531L)
                .build();

            DetectContentRequest req = new DetectContentRequest(new ContentDetectorRequest("string"));            

            DetectContentResponse res = sdk.aiContentDetector.detect(req);

            if (res.contentDetectorResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->