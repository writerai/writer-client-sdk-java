# modelCustomization

## Overview

Methods related to Model Customization

### Available Operations

* [create](#create) - Create model customization
* [delete](#delete) - Delete Model customization
* [get](#get) - Get model customization
* [list](#list) - List model customizations

## create

Create model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.CreateModelCustomizationRequest;
import com.writer.sdk.models.operations.CreateModelCustomizationResponse;
import com.writer.sdk.models.shared.CreateCustomizationRequest;
import com.writer.sdk.models.shared.HyperParameters;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("enim") {{
                    apiKey = "";
                }})
                .setOrganizationId(607831L)
                .build();

            CreateModelCustomizationRequest req = new CreateModelCustomizationRequest(                new CreateCustomizationRequest("nemo", "minima") {{
                                additionalHyperParameters = new HyperParameters(570197L);;
                                batchSize = 38425L;
                                description = "iure";
                                epochs = 634274L;
                                learningRate = 9883.74d;
                                promptTemplate = "sapiente";
                                validationDatasetFileId = "architecto";
                            }};, "mollitia");            

            CreateModelCustomizationResponse res = sdk.modelCustomization.create(req);

            if (res.modelCustomization != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## delete

Delete Model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.DeleteModelCustomizationRequest;
import com.writer.sdk.models.operations.DeleteModelCustomizationResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("dolorem") {{
                    apiKey = "";
                }})
                .setOrganizationId(635059L)
                .build();

            DeleteModelCustomizationRequest req = new DeleteModelCustomizationRequest("consequuntur", "repellat");            

            DeleteModelCustomizationResponse res = sdk.modelCustomization.delete(req);

            if (res.deleteModelCustomization200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## get

Get model customization

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.GetModelCustomizationRequest;
import com.writer.sdk.models.operations.GetModelCustomizationResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("mollitia") {{
                    apiKey = "";
                }})
                .setOrganizationId(581850L)
                .build();

            GetModelCustomizationRequest req = new GetModelCustomizationRequest("numquam", "commodi");            

            GetModelCustomizationResponse res = sdk.modelCustomization.get(req);

            if (res.modelCustomization != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

List model customizations

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListModelCustomizationsRequest;
import com.writer.sdk.models.operations.ListModelCustomizationsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("quam") {{
                    apiKey = "";
                }})
                .setOrganizationId(474697L)
                .build();

            ListModelCustomizationsRequest req = new ListModelCustomizationsRequest("velit");            

            ListModelCustomizationsResponse res = sdk.modelCustomization.list(req);

            if (res.customizationsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
