# downloadTheCustomizedModel

## Overview

Methods related to Download the customized model

### Available Operations

* [fetchFile](#fetchfile) - Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

## fetchFile

Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.FetchCustomizedModelFileRequest;
import com.writer.sdk.models.operations.FetchCustomizedModelFileResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("corporis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(613064L)
                .build();

            FetchCustomizedModelFileRequest req = new FetchCustomizedModelFileRequest("iure", "saepe");            

            FetchCustomizedModelFileResponse res = sdk.downloadTheCustomizedModel.fetchFile(req);

            if (res.fetchCustomizedModelFile200ApplicationOctetStreamBinaryString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
