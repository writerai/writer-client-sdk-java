<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.operations.DetectContentRequest;
import com.writer.sdk.models.operations.DetectContentResponse;
import com.writer.sdk.models.shared.ContentDetectorRequest;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security() {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(548814)
                .build();

            DetectContentRequest req = new DetectContentRequest() {{
                contentDetectorRequest = new ContentDetectorRequest() {{
                    input = "provident";
                }};
            }}            

            DetectContentResponse res = sdk.aiContentDetector.detect(req);

            if (res.contentDetectorResponses.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->