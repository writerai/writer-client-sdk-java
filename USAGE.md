<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GetSubscriptionDetailsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "string"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(850421L)
                .build();

            com.writer.sdk.models.operations.GetSubscriptionDetailsResponse res = sdk.billing.getSubscriptionDetails();

            if (res.subscriptionPublicResponseApi != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->