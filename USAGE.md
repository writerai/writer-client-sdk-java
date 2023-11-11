<!-- Start SDK Example Usage -->


```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GetSubscriptionDetailsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(850421L)
                .build();

            GetSubscriptionDetailsResponse res = sdk.billing.getSubscriptionDetails();

            if (res.subscriptionPublicResponseApi != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->