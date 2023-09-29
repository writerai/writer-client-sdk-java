# Terminology
(*terminology*)

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
                .setSecurity(new Security("transmit") {{
                    apiKey = "";
                }})
                .setOrganizationId(554561L)
                .build();

            AddTermsRequest req = new AddTermsRequest(                new CreateTermsRequest() {{
                                failHandling = CreateTermsRequestFailHandling.SKIP;
                                models = new com.writer.sdk.models.shared.TermCreate[]{{
                                    add(new TermCreate(false, "Fiat", TermCreateType.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "Stand-alone upward-trending time-frame";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("kelvin", TermExampleCreateType.GOOD) {{
                                                example = "bypass Chief";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 796304L;
                                                reference = "generating payment quantify";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "Northeast") {{
                                                caseSensitive = false;
                                                mistake = "AGP volt";
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "at";
                                            }}),
                                        }};
                                        pos = TermCreatePos.VERB;
                                        reference = "female";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("Sharable") {{
                                                tag = "policy";
                                            }}),
                                        }};
                                        term = "about electric";
                                        type = TermCreateType.BANNED;
                                    }}),
                                }};
                            }};, 900532L);            

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
                .setSecurity(new Security("program") {{
                    apiKey = "";
                }})
                .setOrganizationId(698486L)
                .build();

            DeleteTermsRequest req = new DeleteTermsRequest(557937L) {{
                xRequestID = "Sausages synergy";
                ids = new Long[]{{
                    add(953140L),
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
                .setSecurity(new Security("Ghana") {{
                    apiKey = "";
                }})
                .setOrganizationId(488098L)
                .build();

            FindTermsRequest req = new FindTermsRequest(949900L) {{
                limit = 939943L;
                offset = 111247L;
                partOfSpeech = FindTermsPartOfSpeech.NOUN;
                sortField = FindTermsSortField.TYPE;
                sortOrder = FindTermsSortOrder.ASC;
                tags = new String[]{{
                    add("Dynamic"),
                }};
                term = "generating";
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
                .setSecurity(new Security("Van") {{
                    apiKey = "";
                }})
                .setOrganizationId(15652L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(                new UpdateTermsRequest() {{
                                failHandling = UpdateTermsRequestFailHandling.VALIDATE;
                                models = new com.writer.sdk.models.shared.TermUpdate[]{{
                                    add(new TermUpdate(false, 352933L, "Internal", TermUpdateType.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "Reactive zero tolerance definition";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("Islands", TermExampleCreateType.GOOD) {{
                                                example = "Analyst invoice";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 446863L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 369182L;
                                                reference = "white";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "Baht") {{
                                                caseSensitive = false;
                                                mistake = "Carolina syndicate";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "East";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.ADVERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("Sharable") {{
                                                tag = "guestbook driver users";
                                            }}),
                                        }};
                                        term = "Lev Wooden";
                                        type = TermUpdateType.BANNED;
                                    }}),
                                }};
                            }};, 834574L) {{
                xRequestID = "brightly";
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

