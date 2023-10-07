# Completions
(*completions*)

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
                .setSecurity(new Security("online"){{
                    apiKey = "";
                }})
                .setOrganizationId(638424L)
                .build();

            CreateCompletionRequest req = new CreateCompletionRequest(new CompletionRequest("Extended"){{
bestOf = 1L;
frequencyPenalty = 1343.65d;
logprobs = 786546L;
maxTokens = 1024L;
minTokens = 1L;
n = 69025L;
presencePenalty = 9967.06d;
stop = new String[]{{
    add("the"),
    add("is"),
    add("and"),
}};
temperature = 0.7d;
topP = 1d;
}}, "grey");            

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
                .setSecurity(new Security("and"){{
                    apiKey = "";
                }})
                .setOrganizationId(951257L)
                .build();

            CreateModelCustomizationCompletionRequest req = new CreateModelCustomizationCompletionRequest(new CompletionRequest("streamline"){{
bestOf = 1L;
frequencyPenalty = 7443d;
logprobs = 335513L;
maxTokens = 1024L;
minTokens = 1L;
n = 151932L;
presencePenalty = 3280.71d;
stop = new String[]{{
    add("the"),
    add("is"),
    add("and"),
}};
temperature = 0.7d;
topP = 1d;
}}, "1080p", "Hybrid");            

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

