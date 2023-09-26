# Terminology

## Overview

Methods related to Terminology

### Available Operations

* [add](#add) - Add terms
* [delete](#delete) - Delete terms
* [find](#find) - Find terms
* [update](#update) - Update terms

## add

Add terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.AddTermsRequest;
import com.writer.sdk.models.operations.AddTermsResponse;
import com.writer.sdk.models.shared.ApprovedTermExtensionCreate;
import com.writer.sdk.models.shared.CreateTermsRequest;
import com.writer.sdk.models.shared.CreateTermsRequestFailHandling;
import com.writer.sdk.models.shared.LinkedTermCreate;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.TermCreate;
import com.writer.sdk.models.shared.TermCreatePos;
import com.writer.sdk.models.shared.TermCreateType;
import com.writer.sdk.models.shared.TermExampleCreate;
import com.writer.sdk.models.shared.TermExampleCreateType;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePos;
import com.writer.sdk.models.shared.TermTagCreate;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("enim") {{
                    apiKey = "";
                }})
                .setOrganizationId(880476L)
                .build();

            AddTermsRequest req = new AddTermsRequest(                new CreateTermsRequest() {{
                                failHandling = CreateTermsRequestFailHandling.VALIDATE;
                                models = new com.writer.sdk.models.shared.TermCreate[]{{
                                    add(new TermCreate(false, "enim", TermCreateType.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "repudiandae";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("quidem", TermExampleCreateType.BAD) {{
                                                example = "quae";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 566602L;
                                                reference = "pariatur";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "voluptates") {{
                                                caseSensitive = false;
                                                mistake = "modi";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "rem";
                                            }}),
                                        }};
                                        pos = TermCreatePos.NOUN;
                                        reference = "repudiandae";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("veritatis") {{
                                                tag = "sint";
                                            }}),
                                        }};
                                        term = "itaque";
                                        type = TermCreateType.APPROVED;
                                    }}),
                                }};
                            }};, 667411L);            

            AddTermsResponse res = sdk.terminology.add(req);

            if (res.createTermsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [com.writer.sdk.models.operations.AddTermsRequest](../../models/operations/AddTermsRequest.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[com.writer.sdk.models.operations.AddTermsResponse](../../models/operations/AddTermsResponse.md)**


## delete

Delete terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.DeleteTermsRequest;
import com.writer.sdk.models.operations.DeleteTermsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("quibusdam") {{
                    apiKey = "";
                }})
                .setOrganizationId(131797L)
                .build();

            DeleteTermsRequest req = new DeleteTermsRequest(647174L) {{
                xRequestID = "distinctio";
                ids = new Long[]{{
                    add(841386L),
                }};
            }};            

            DeleteTermsResponse res = sdk.terminology.delete(req);

            if (res.deleteResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.writer.sdk.models.operations.DeleteTermsRequest](../../models/operations/DeleteTermsRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[com.writer.sdk.models.operations.DeleteTermsResponse](../../models/operations/DeleteTermsResponse.md)**


## find

Find terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.FindTermsPartOfSpeech;
import com.writer.sdk.models.operations.FindTermsRequest;
import com.writer.sdk.models.operations.FindTermsResponse;
import com.writer.sdk.models.operations.FindTermsSortField;
import com.writer.sdk.models.operations.FindTermsSortOrder;
import com.writer.sdk.models.operations.FindTermsType;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("labore") {{
                    apiKey = "";
                }})
                .setOrganizationId(264730L)
                .build();

            FindTermsRequest req = new FindTermsRequest(183191L) {{
                limit = 397821L;
                offset = 586513L;
                partOfSpeech = FindTermsPartOfSpeech.ADVERB;
                sortField = FindTermsSortField.TERM;
                sortOrder = FindTermsSortOrder.ASC;
                tags = new String[]{{
                    add("assumenda"),
                }};
                term = "ipsam";
                type = FindTermsType.APPROVED;
            }};            

            FindTermsResponse res = sdk.terminology.find(req);

            if (res.paginatedResultFullTermWithUser != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `request`                                                                                        | [com.writer.sdk.models.operations.FindTermsRequest](../../models/operations/FindTermsRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[com.writer.sdk.models.operations.FindTermsResponse](../../models/operations/FindTermsResponse.md)**


## update

Update terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.UpdateTermsRequest;
import com.writer.sdk.models.operations.UpdateTermsResponse;
import com.writer.sdk.models.shared.ApprovedTermExtensionCreate;
import com.writer.sdk.models.shared.LinkedTermCreate;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.TermExampleCreate;
import com.writer.sdk.models.shared.TermExampleCreateType;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePos;
import com.writer.sdk.models.shared.TermTagCreate;
import com.writer.sdk.models.shared.TermUpdate;
import com.writer.sdk.models.shared.TermUpdatePos;
import com.writer.sdk.models.shared.TermUpdateType;
import com.writer.sdk.models.shared.UpdateTermsRequest;
import com.writer.sdk.models.shared.UpdateTermsRequestFailHandling;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("fugit") {{
                    apiKey = "";
                }})
                .setOrganizationId(677817L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(                new UpdateTermsRequest() {{
                                failHandling = UpdateTermsRequestFailHandling.SKIP;
                                models = new com.writer.sdk.models.shared.TermUpdate[]{{
                                    add(new TermUpdate(false, 680056L, "in", TermUpdateType.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "tempora";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("labore", TermExampleCreateType.BAD) {{
                                                example = "facilis";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 433288L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 248753L;
                                                reference = "eligendi";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "necessitatibus") {{
                                                caseSensitive = false;
                                                mistake = "sint";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "provident";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.ADVERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("dolor") {{
                                                tag = "officia";
                                            }}),
                                        }};
                                        term = "debitis";
                                        type = TermUpdateType.PENDING;
                                    }}),
                                }};
                            }};, 846409L) {{
                xRequestID = "maiores";
            }};            

            UpdateTermsResponse res = sdk.terminology.update(req);

            if (res.createTermsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.writer.sdk.models.operations.UpdateTermsRequest](../../models/operations/UpdateTermsRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[com.writer.sdk.models.operations.UpdateTermsResponse](../../models/operations/UpdateTermsResponse.md)**

