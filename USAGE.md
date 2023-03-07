<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer.Builder builder = Writer.builder();

            Writer sdk = builder.build();

            ContentDetectorApiRequest req = new ContentDetectorApiRequest() {{
                pathParams = new ContentDetectorApiPathParams() {{
                    organizationId = 548814;
                }};
                headers = new ContentDetectorApiHeaders() {{
                    authorization = "deserunt";
                }};
                request = new ContentDetectorRequest() {{
                    input = "porro";
                }};
            }};

            ContentDetectorApiResponse res = sdk.aiContentDetector.contentDetectorApi(req);

            if (res.contentDetectorResponses.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->