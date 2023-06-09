# completions

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
                .setSecurity(new Security("at") {{
                    apiKey = "";
                }})
                .setOrganizationId(870088L)
                .build();

            CreateCompletionRequest req = new CreateCompletionRequest(                new CompletionRequest("maiores") {{
                                bestOf = 473608L;
                                frequencyPenalty = 7991.59d;
                                logprobs = 800911L;
                                maxTokens = 461479L;
                                minTokens = 520478L;
                                n = 780529L;
                                presencePenalty = 6788.8d;
                                stop = new String[]{{
                                    add("nam"),
                                }};
                                temperature = 6399.21d;
                                topP = 5820.2d;
                            }};, "fugit");            

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
                .setSecurity(new Security("deleniti") {{
                    apiKey = "";
                }})
                .setOrganizationId(944669L)
                .build();

            CreateModelCustomizationCompletionRequest req = new CreateModelCustomizationCompletionRequest(                new CompletionRequest("optio") {{
                                bestOf = 521848L;
                                frequencyPenalty = 1059.07d;
                                logprobs = 414662L;
                                maxTokens = 473600L;
                                minTokens = 264555L;
                                n = 186332L;
                                presencePenalty = 7742.34d;
                                stop = new String[]{{
                                    add("esse"),
                                    add("ipsum"),
                                    add("excepturi"),
                                }};
                                temperature = 1352.18d;
                                topP = 187.89d;
                            }};, "ad", "natus");            

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
