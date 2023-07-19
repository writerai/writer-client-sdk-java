# terminology

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
                .setSecurity(new Security("ab") {{
                    apiKey = "";
                }})
                .setOrganizationId(982575L)
                .build();

            AddTermsRequest req = new AddTermsRequest(                new CreateTermsRequest() {{
                                failHandling = CreateTermsRequestFailHandling.SKIP;
                                models = new com.writer.sdk.models.shared.TermCreate[]{{
                                    add(new TermCreate(false, "rerum", TermCreateType.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "voluptate";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("pariatur", TermExampleCreateType.GOOD) {{
                                                example = "nam";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("fugiat", TermExampleCreateType.GOOD) {{
                                                example = "voluptatibus";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 764912L;
                                                reference = "corporis";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "quis") {{
                                                caseSensitive = false;
                                                mistake = "libero";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "dolores";
                                            }}),
                                            add(new TermMistakeCreate(false, "quis") {{
                                                caseSensitive = false;
                                                mistake = "totam";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "eaque";
                                            }}),
                                            add(new TermMistakeCreate(false, "dolores") {{
                                                caseSensitive = false;
                                                mistake = "nesciunt";
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "perferendis";
                                            }}),
                                            add(new TermMistakeCreate(false, "vero") {{
                                                caseSensitive = false;
                                                mistake = "minus";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "dolor";
                                            }}),
                                        }};
                                        pos = TermCreatePos.VERB;
                                        reference = "hic";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("facilis") {{
                                                tag = "omnis";
                                            }}),
                                            add(new TermTagCreate("voluptatem") {{
                                                tag = "perspiciatis";
                                            }}),
                                            add(new TermTagCreate("consequuntur") {{
                                                tag = "porro";
                                            }}),
                                            add(new TermTagCreate("error") {{
                                                tag = "blanditiis";
                                            }}),
                                        }};
                                        term = "eaque";
                                        type = TermCreateType.BANNED;
                                    }}),
                                    add(new TermCreate(false, "voluptate", TermCreateType.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "asperiores";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("dolorum", TermExampleCreateType.BAD) {{
                                                example = "modi";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("nobis", TermExampleCreateType.BAD) {{
                                                example = "pariatur";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("quos", TermExampleCreateType.GOOD) {{
                                                example = "delectus";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("dolor", TermExampleCreateType.GOOD) {{
                                                example = "dolorem";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 944373L;
                                                reference = "excepturi";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "amet") {{
                                                caseSensitive = false;
                                                mistake = "voluptate";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "reiciendis";
                                            }}),
                                            add(new TermMistakeCreate(false, "ipsa") {{
                                                caseSensitive = false;
                                                mistake = "dolorum";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "veritatis";
                                            }}),
                                            add(new TermMistakeCreate(false, "quaerat") {{
                                                caseSensitive = false;
                                                mistake = "ipsa";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "odio";
                                            }}),
                                        }};
                                        pos = TermCreatePos.ADJECTIVE;
                                        reference = "quidem";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("natus") {{
                                                tag = "voluptas";
                                            }}),
                                            add(new TermTagCreate("atque") {{
                                                tag = "eos";
                                            }}),
                                            add(new TermTagCreate("fugiat") {{
                                                tag = "sit";
                                            }}),
                                            add(new TermTagCreate("soluta") {{
                                                tag = "ab";
                                            }}),
                                        }};
                                        term = "dolorum";
                                        type = TermCreateType.BANNED;
                                    }}),
                                }};
                            }};, 536579L);            

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
                .setSecurity(new Security("omnis") {{
                    apiKey = "";
                }})
                .setOrganizationId(896672L)
                .build();

            DeleteTermsRequest req = new DeleteTermsRequest(714697L) {{
                xRequestID = "asperiores";
                ids = new Long[]{{
                    add(216897L),
                    add(456015L),
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
                .setSecurity(new Security("id") {{
                    apiKey = "";
                }})
                .setOrganizationId(906418L)
                .build();

            FindTermsRequest req = new FindTermsRequest(263322L) {{
                limit = 137220L;
                offset = 20651L;
                partOfSpeech = FindTermsPartOfSpeech.NOUN;
                sortField = FindTermsSortField.TYPE;
                sortOrder = FindTermsSortOrder.DESC;
                tags = new String[]{{
                    add("saepe"),
                    add("suscipit"),
                }};
                term = "deserunt";
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
                .setSecurity(new Security("minima") {{
                    apiKey = "";
                }})
                .setOrganizationId(831049L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(                new UpdateTermsRequest() {{
                                failHandling = UpdateTermsRequestFailHandling.SKIP;
                                models = new com.writer.sdk.models.shared.TermUpdate[]{{
                                    add(new TermUpdate(false, 863856L, "soluta", TermUpdateType.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "alias";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("vel", TermExampleCreateType.BAD) {{
                                                example = "quaerat";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("dolorum", TermExampleCreateType.BAD) {{
                                                example = "officiis";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("iusto", TermExampleCreateType.GOOD) {{
                                                example = "esse";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("amet", TermExampleCreateType.BAD) {{
                                                example = "quisquam";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 880298L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 313692L;
                                                reference = "dolorem";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 957451L;
                                                reference = "totam";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "sed") {{
                                                caseSensitive = false;
                                                mistake = "sit";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "neque";
                                            }}),
                                            add(new TermMistakeCreate(false, "deserunt") {{
                                                caseSensitive = false;
                                                mistake = "vel";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "voluptas";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.VERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("qui") {{
                                                tag = "incidunt";
                                            }}),
                                        }};
                                        term = "cupiditate";
                                        type = TermUpdateType.PENDING;
                                    }}),
                                    add(new TermUpdate(false, 584476L, "aperiam", TermUpdateType.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "laborum";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("dolores", TermExampleCreateType.BAD) {{
                                                example = "incidunt";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("quam", TermExampleCreateType.BAD) {{
                                                example = "facilis";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("neque", TermExampleCreateType.GOOD) {{
                                                example = "temporibus";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 164959L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 124833L;
                                                reference = "ullam";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 722081L;
                                                reference = "hic";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "et") {{
                                                caseSensitive = false;
                                                mistake = "cumque";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "nobis";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.ADJECTIVE;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("nobis") {{
                                                tag = "veritatis";
                                            }}),
                                        }};
                                        term = "quos";
                                        type = TermUpdateType.PENDING;
                                    }}),
                                    add(new TermUpdate(false, 941378L, "distinctio", TermUpdateType.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "dolorem";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("dolorum", TermExampleCreateType.GOOD) {{
                                                example = "labore";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("quas", TermExampleCreateType.BAD) {{
                                                example = "quae";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 9240L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 833038L;
                                                reference = "porro";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 984330L;
                                                reference = "ut";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 703495L;
                                                reference = "cupiditate";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "occaecati") {{
                                                caseSensitive = false;
                                                mistake = "quae";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "odio";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.ADJECTIVE;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("omnis") {{
                                                tag = "vero";
                                            }}),
                                            add(new TermTagCreate("ipsum") {{
                                                tag = "quis";
                                            }}),
                                            add(new TermTagCreate("voluptate") {{
                                                tag = "delectus";
                                            }}),
                                            add(new TermTagCreate("vero") {{
                                                tag = "consectetur";
                                            }}),
                                        }};
                                        term = "tenetur";
                                        type = TermUpdateType.BANNED;
                                    }}),
                                }};
                            }};, 486160L) {{
                xRequestID = "similique";
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

