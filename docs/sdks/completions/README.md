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
                .setSecurity(new Security("recusandae") {{
                    apiKey = "";
                }})
                .setOrganizationId(836079L)
                .build();

            CreateCompletionRequest req = new CreateCompletionRequest(                new CompletionRequest("ab") {{
                                bestOf = 1L;
                                frequencyPenalty = 3373.96d;
                                logprobs = 87129L;
                                maxTokens = 1024L;
                                minTokens = 1L;
                                n = 648172L;
                                presencePenalty = 202.18d;
                                stop = new String[]{{
                                    add("ipsam"),
                                }};
                                temperature = 0.7d;
                                topP = 1d;
                            }};, "repellendus");            

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
                .setSecurity(new Security("sapiente") {{
                    apiKey = "";
                }})
                .setOrganizationId(778157L)
                .build();

            CreateModelCustomizationCompletionRequest req = new CreateModelCustomizationCompletionRequest(                new CompletionRequest("odit") {{
                                bestOf = 1L;
                                frequencyPenalty = 8700.13d;
                                logprobs = 870088L;
                                maxTokens = 1024L;
                                minTokens = 1L;
                                n = 978619L;
                                presencePenalty = 4736.08d;
                                stop = new String[]{{
                                    add("quod"),
                                }};
                                temperature = 0.7d;
                                topP = 1d;
                            }};, "quod", "esse");            

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

