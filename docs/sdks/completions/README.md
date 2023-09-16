# Completions

## Overview

Methods related to Completions

### Available Operations

* [create](#create) - Create completion for LLM model
* [createModelCustomizationCompletion](#createmodelcustomizationcompletion) - Create completion for LLM customization model

## create

Create completion for LLM model

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.CreateCompletionRequest;
import com.writer.sdk.models.operations.CreateCompletionResponse;
import com.writer.sdk.models.shared.CompletionRequest;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("excepturi") {{
                    apiKey = "";
                }})
                .setOrganizationId(392785L)
                .build();

            CreateCompletionRequest req = new CreateCompletionRequest(                new CompletionRequest("recusandae") {{
                                bestOf = 1L;
                                frequencyPenalty = 8360.79d;
                                logprobs = 71036L;
                                maxTokens = 1024L;
                                minTokens = 1L;
                                n = 337396L;
                                presencePenalty = 871.29d;
                                stop = new String[]{{
                                    add("deserunt"),
                                }};
                                temperature = 0.7d;
                                topP = 1d;
                            }};, "perferendis");            

            CreateCompletionResponse res = sdk.completions.create(req);

            if (res.completionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.writer.sdk.models.operations.CreateCompletionRequest](../../models/operations/CreateCompletionRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.writer.sdk.models.operations.CreateCompletionResponse](../../models/operations/CreateCompletionResponse.md)**


## createModelCustomizationCompletion

Create completion for LLM customization model

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.CreateModelCustomizationCompletionRequest;
import com.writer.sdk.models.operations.CreateModelCustomizationCompletionResponse;
import com.writer.sdk.models.shared.CompletionRequest;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKey = "";
                }})
                .setOrganizationId(832620L)
                .build();

            CreateModelCustomizationCompletionRequest req = new CreateModelCustomizationCompletionRequest(                new CompletionRequest("sapiente") {{
                                bestOf = 1L;
                                frequencyPenalty = 7781.57d;
                                logprobs = 140350L;
                                maxTokens = 1024L;
                                minTokens = 1L;
                                n = 870013L;
                                presencePenalty = 8700.88d;
                                stop = new String[]{{
                                    add("maiores"),
                                }};
                                temperature = 0.7d;
                                topP = 1d;
                            }};, "molestiae", "quod");            

            CreateModelCustomizationCompletionResponse res = sdk.completions.createModelCustomizationCompletion(req);

            if (res.completionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                          | Type                                                                                                                                               | Required                                                                                                                                           | Description                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                          | [com.writer.sdk.models.operations.CreateModelCustomizationCompletionRequest](../../models/operations/CreateModelCustomizationCompletionRequest.md) | :heavy_check_mark:                                                                                                                                 | The request object to use for the request.                                                                                                         |


### Response

**[com.writer.sdk.models.operations.CreateModelCustomizationCompletionResponse](../../models/operations/CreateModelCustomizationCompletionResponse.md)**

