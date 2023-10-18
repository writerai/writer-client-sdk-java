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
                .setSecurity(new Security("transmit"){{
                    apiKey = "";
                }})
                .setOrganizationId(554561L)
                .build();

            AddTermsRequest req = new AddTermsRequest(new CreateTermsRequest(){{
failHandling = CreateTermsRequestFailHandling.SKIP;
models = new com.writer.sdk.models.shared.TermCreate[]{{
    add(new TermCreate(false, "holistic", TermCreateType.APPROVED){{
        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false){{
            capitalize = false;
            fixCase = false;
            fixCommonMistakes = false;
        }};
        caseSensitive = false;
        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
            add(new TermExampleCreate("Soul", TermExampleCreateType.GOOD){{
                example = "Toyota";
                type = TermExampleCreateType.BAD;
            }}),
        }};
        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
            add(new LinkedTermCreate(){{}}),
        }};
        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
            add(new TermMistakeCreate(false, "ivory"){{
                caseSensitive = false;
                mistake = "Chief";
            }}),
        }};
        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
            add(new TermTagCreate("Division"){{
                tag = "Rapids";
            }}),
        }};
        term = "ohm";
        type = TermCreateType.BANNED;
    }}),
}};
}}, 927036L);            

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
                .setSecurity(new Security("program"){{
                    apiKey = "";
                }})
                .setOrganizationId(698486L)
                .build();

            DeleteTermsRequest req = new DeleteTermsRequest(557937L){{
                xRequestID = "complexity";
                ids = new Long[]{{
                    add(952479L),
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
                .setSecurity(new Security("Ghana"){{
                    apiKey = "";
                }})
                .setOrganizationId(488098L)
                .build();

            FindTermsRequest req = new FindTermsRequest(949900L){{
                limit = 939943L;
                offset = 111247L;
                partOfSpeech = FindTermsPartOfSpeech.NOUN;
                sortField = FindTermsSortField.TYPE;
                sortOrder = FindTermsSortOrder.ASC;
                tags = new String[]{{
                    add("Dynamic"),
                }};
                term = "Granite";
                type = FindTermsType.BANNED;
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
                .setSecurity(new Security("Van"){{
                    apiKey = "";
                }})
                .setOrganizationId(15652L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(new UpdateTermsRequest(){{
failHandling = UpdateTermsRequestFailHandling.VALIDATE;
models = new com.writer.sdk.models.shared.TermUpdate[]{{
    add(new TermUpdate(false, 139579L, "Forward", TermUpdateType.PENDING){{
        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false){{
            capitalize = false;
            fixCase = false;
            fixCommonMistakes = false;
        }};
        caseSensitive = false;
        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
            add(new TermExampleCreate("Quality", TermExampleCreateType.GOOD){{
                example = "male";
                type = TermExampleCreateType.GOOD;
            }}),
        }};
        id = 443076L;
        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
            add(new LinkedTermCreate(){{}}),
        }};
        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
            add(new TermMistakeCreate(false, "Islands"){{
                caseSensitive = false;
                mistake = "cheater";
            }}),
        }};
        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
            add(new TermTagCreate("dynamic"){{
                tag = "online";
            }}),
        }};
        term = "white";
        type = TermUpdateType.BANNED;
    }}),
}};
}}, 889838L){{
                xRequestID = "East";
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

