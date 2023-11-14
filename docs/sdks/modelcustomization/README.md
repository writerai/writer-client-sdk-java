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
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(486589L)
                .build();

            CreateModelCustomizationRequest req = new CreateModelCustomizationRequest(new CreateCustomizationRequest("string", "string"){{
additionalHyperParameters = new HyperParameters(489382L);
batchSize = 638424L;
description = "Synchronised full-range emulation";
epochs = 134365L;
learningRate = 7865.46d;
promptTemplate = "string";
validationDatasetFileId = "string";
}}, "string");            

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
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(545907L)
                .build();

            DeleteModelCustomizationRequest req = new DeleteModelCustomizationRequest("string", "string");            

            DeleteModelCustomizationResponse res = sdk.modelCustomization.delete(req);

            if (res.object != null) {
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
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(700347L)
                .build();

            GetModelCustomizationRequest req = new GetModelCustomizationRequest("string", "string");            

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
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(768578L)
                .build();

            ListModelCustomizationsRequest req = new ListModelCustomizationsRequest("string");            

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

