# ModelCustomization
(*modelCustomization*)

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
                .setSecurity(new Security("online") {{
                    apiKey = "";
                }})
                .setOrganizationId(638424L)
                .build();

            CreateModelCustomizationRequest req = new CreateModelCustomizationRequest(                new CreateCustomizationRequest("Extended", "South") {{
                                additionalHyperParameters = new HyperParameters(996706L);;
                                batchSize = 796474L;
                                description = "Implemented web-enabled success";
                                epochs = 86L;
                                learningRate = 4552.22d;
                                promptTemplate = "evolve";
                                validationDatasetFileId = "fuchsia Gasoline Screen";
                            }};, "mobile");            

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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.writer.sdk.models.operations.CreateModelCustomizationRequest](../../models/operations/CreateModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.writer.sdk.models.operations.CreateModelCustomizationResponse](../../models/operations/CreateModelCustomizationResponse.md)**


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
                .setSecurity(new Security("program") {{
                    apiKey = "";
                }})
                .setOrganizationId(698486L)
                .build();

            DeleteModelCustomizationRequest req = new DeleteModelCustomizationRequest("navigate", "Sausages");            

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

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.writer.sdk.models.operations.DeleteModelCustomizationRequest](../../models/operations/DeleteModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.writer.sdk.models.operations.DeleteModelCustomizationResponse](../../models/operations/DeleteModelCustomizationResponse.md)**


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
                .setSecurity(new Security("female") {{
                    apiKey = "";
                }})
                .setOrganizationId(558834L)
                .build();

            GetModelCustomizationRequest req = new GetModelCustomizationRequest("Hatchback", "Kia");            

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

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.writer.sdk.models.operations.GetModelCustomizationRequest](../../models/operations/GetModelCustomizationRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.writer.sdk.models.operations.GetModelCustomizationResponse](../../models/operations/GetModelCustomizationResponse.md)**


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
                .setSecurity(new Security("Bicycle") {{
                    apiKey = "";
                }})
                .setOrganizationId(257649L)
                .build();

            ListModelCustomizationsRequest req = new ListModelCustomizationsRequest("Product");            

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

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.writer.sdk.models.operations.ListModelCustomizationsRequest](../../models/operations/ListModelCustomizationsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.writer.sdk.models.operations.ListModelCustomizationsResponse](../../models/operations/ListModelCustomizationsResponse.md)**

