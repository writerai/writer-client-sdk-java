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
import com.writer.sdk.models.shared.CreateTermsRequestFailHandlingEnum;
import com.writer.sdk.models.shared.LinkedTermCreate;
import com.writer.sdk.models.shared.Security;
import com.writer.sdk.models.shared.TermCreate;
import com.writer.sdk.models.shared.TermCreatePosEnum;
import com.writer.sdk.models.shared.TermCreateTypeEnum;
import com.writer.sdk.models.shared.TermExampleCreate;
import com.writer.sdk.models.shared.TermExampleCreateTypeEnum;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePosEnum;
import com.writer.sdk.models.shared.TermTagCreate;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("debitis") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(260341L)
                .build();

            AddTermsRequest req = new AddTermsRequest(                new CreateTermsRequest() {{
                                failHandling = CreateTermsRequestFailHandlingEnum.VALIDATE_ONLY;
                                models = new com.writer.sdk.models.shared.TermCreate[]{{
                                    add(new TermCreate(false, "ipsam", TermCreateTypeEnum.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "facilis";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("repudiandae", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "architecto";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                            add(new TermExampleCreate("repellat", TermExampleCreateTypeEnum.BAD) {{
                                                example = "expedita";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 904648L;
                                                reference = "pariatur";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "magni") {{
                                                caseSensitive = false;
                                                mistake = "consequuntur";
                                                pos = TermMistakeCreatePosEnum.ADVERB;
                                                reference = "natus";
                                            }}),
                                        }};
                                        pos = TermCreatePosEnum.NOUN;
                                        reference = "quo";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("maxime") {{
                                                tag = "pariatur";
                                            }}),
                                            add(new TermTagCreate("excepturi") {{
                                                tag = "ea";
                                            }}),
                                            add(new TermTagCreate("ea") {{
                                                tag = "odit";
                                            }}),
                                            add(new TermTagCreate("ab") {{
                                                tag = "accusantium";
                                            }}),
                                        }};
                                        term = "maiores";
                                        type = TermCreateTypeEnum.PENDING;
                                    }}),
                                    add(new TermCreate(false, "error", TermCreateTypeEnum.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "autem";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("nemo", TermExampleCreateTypeEnum.BAD) {{
                                                example = "eaque";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("amet", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "perferendis";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("hic", TermExampleCreateTypeEnum.BAD) {{
                                                example = "cumque";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 171629L;
                                                reference = "quis";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 521037L;
                                                reference = "dignissimos";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 54338L;
                                                reference = "quis";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "minus") {{
                                                caseSensitive = false;
                                                mistake = "eos";
                                                pos = TermMistakeCreatePosEnum.NOUN;
                                                reference = "dolores";
                                            }}),
                                        }};
                                        pos = TermCreatePosEnum.VERB;
                                        reference = "dolor";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("hic") {{
                                                tag = "nostrum";
                                            }}),
                                            add(new TermTagCreate("omnis") {{
                                                tag = "recusandae";
                                            }}),
                                            add(new TermTagCreate("perspiciatis") {{
                                                tag = "facilis";
                                            }}),
                                            add(new TermTagCreate("porro") {{
                                                tag = "voluptatem";
                                            }}),
                                        }};
                                        term = "consequuntur";
                                        type = TermCreateTypeEnum.BANNED;
                                    }}),
                                    add(new TermCreate(false, "ipsa", TermCreateTypeEnum.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "occaecati";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("earum", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "adipisci";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("deleniti", TermExampleCreateTypeEnum.BAD) {{
                                                example = "iste";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("libero", TermExampleCreateTypeEnum.BAD) {{
                                                example = "provident";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                        }};
                                        highlight = false;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 554242L;
                                                reference = "aliquid";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 212390L;
                                                reference = "dolorem";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "excepturi") {{
                                                caseSensitive = false;
                                                mistake = "qui";
                                                pos = TermMistakeCreatePosEnum.NOUN;
                                                reference = "hic";
                                            }}),
                                        }};
                                        pos = TermCreatePosEnum.ADVERB;
                                        reference = "voluptate";
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("amet") {{
                                                tag = "reiciendis";
                                            }}),
                                            add(new TermTagCreate("numquam") {{
                                                tag = "dolorum";
                                            }}),
                                        }};
                                        term = "veritatis";
                                        type = TermCreateTypeEnum.APPROVED;
                                    }}),
                                }};
                            }};, 487838L);            

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
                .setSecurity(new Security("quaerat") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(881005L)
                .build();

            DeleteTermsRequest req = new DeleteTermsRequest(696344L) {{
                xRequestID = "voluptatibus";
                ids = new Long[]{{
                    add(617658L),
                    add(179603L),
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

## find

Find terms

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.FindTermsPartOfSpeechEnum;
import com.writer.sdk.models.operations.FindTermsRequest;
import com.writer.sdk.models.operations.FindTermsResponse;
import com.writer.sdk.models.operations.FindTermsSortFieldEnum;
import com.writer.sdk.models.operations.FindTermsSortOrderEnum;
import com.writer.sdk.models.operations.FindTermsTypeEnum;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("atque") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(24678L)
                .build();

            FindTermsRequest req = new FindTermsRequest(854614L) {{
                limit = 67249L;
                offset = 743835L;
                partOfSpeech = FindTermsPartOfSpeechEnum.ADVERB;
                sortField = FindTermsSortFieldEnum.CREATION_TIME;
                sortOrder = FindTermsSortOrderEnum.ASC;
                tags = new String[]{{
                    add("deleniti"),
                    add("omnis"),
                    add("necessitatibus"),
                }};
                term = "distinctio";
                type = FindTermsTypeEnum.PENDING;
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
import com.writer.sdk.models.shared.TermExampleCreateTypeEnum;
import com.writer.sdk.models.shared.TermMistakeCreate;
import com.writer.sdk.models.shared.TermMistakeCreatePosEnum;
import com.writer.sdk.models.shared.TermTagCreate;
import com.writer.sdk.models.shared.TermUpdate;
import com.writer.sdk.models.shared.TermUpdatePosEnum;
import com.writer.sdk.models.shared.TermUpdateTypeEnum;
import com.writer.sdk.models.shared.UpdateTermsRequest;
import com.writer.sdk.models.shared.UpdateTermsRequestFailHandlingEnum;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("nihil") {{
                    apiKey = "YOUR_API_KEY_HERE";
                }})
                .setOrganizationId(216897L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(                new UpdateTermsRequest() {{
                                failHandling = UpdateTermsRequestFailHandlingEnum.VALIDATE;
                                models = new com.writer.sdk.models.shared.TermUpdate[]{{
                                    add(new TermUpdate(false, 253941L, "enim", TermUpdateTypeEnum.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "saepe";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("amet", TermExampleCreateTypeEnum.BAD) {{
                                                example = "aspernatur";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                            add(new TermExampleCreate("saepe", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "accusamus";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 645785L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 324683L;
                                                reference = "repellendus";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 519711L;
                                                reference = "similique";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 55L;
                                                reference = "at";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "officiis") {{
                                                caseSensitive = false;
                                                mistake = "tempora";
                                                pos = TermMistakeCreatePosEnum.VERB;
                                                reference = "quod";
                                            }}),
                                            add(new TermMistakeCreate(false, "esse") {{
                                                caseSensitive = false;
                                                mistake = "qui";
                                                pos = TermMistakeCreatePosEnum.ADVERB;
                                                reference = "a";
                                            }}),
                                        }};
                                        pos = TermUpdatePosEnum.ADVERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("quisquam") {{
                                                tag = "ipsum";
                                            }}),
                                            add(new TermTagCreate("amet") {{
                                                tag = "tenetur";
                                            }}),
                                        }};
                                        term = "tempore";
                                        type = TermUpdateTypeEnum.PENDING;
                                    }}),
                                    add(new TermUpdate(false, 355613L, "nam", TermUpdateTypeEnum.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "sapiente";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("expedita", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "nihil";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                            add(new TermExampleCreate("libero", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "sed";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                            add(new TermExampleCreate("ipsum", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "deserunt";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 186458L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 807581L;
                                                reference = "pariatur";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 747080L;
                                                reference = "dicta";
                                            }}),
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 674848L;
                                                reference = "totam";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "facilis") {{
                                                caseSensitive = false;
                                                mistake = "aspernatur";
                                                pos = TermMistakeCreatePosEnum.NOUN;
                                                reference = "distinctio";
                                            }}),
                                            add(new TermMistakeCreate(false, "temporibus") {{
                                                caseSensitive = false;
                                                mistake = "aliquid";
                                                pos = TermMistakeCreatePosEnum.VERB;
                                                reference = "molestias";
                                            }}),
                                        }};
                                        pos = TermUpdatePosEnum.NOUN;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("magni") {{
                                                tag = "fugit";
                                            }}),
                                        }};
                                        term = "odio";
                                        type = TermUpdateTypeEnum.APPROVED;
                                    }}),
                                    add(new TermUpdate(false, 231701L, "vero", TermUpdateTypeEnum.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "voluptatem";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("et", TermExampleCreateTypeEnum.BAD) {{
                                                example = "soluta";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("nobis", TermExampleCreateTypeEnum.BAD) {{
                                                example = "ipsum";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                            add(new TermExampleCreate("aperiam", TermExampleCreateTypeEnum.BAD) {{
                                                example = "tempore";
                                                type = TermExampleCreateTypeEnum.BAD;
                                            }}),
                                            add(new TermExampleCreate("labore", TermExampleCreateTypeEnum.GOOD) {{
                                                example = "dolorem";
                                                type = TermExampleCreateTypeEnum.GOOD;
                                            }}),
                                        }};
                                        highlight = false;
                                        id = 677263L;
                                        linkedTerms = new com.writer.sdk.models.shared.LinkedTermCreate[]{{
                                            add(new LinkedTermCreate() {{
                                                linkedTermId = 63038L;
                                                reference = "aut";
                                            }}),
                                        }};
                                        mistakes = new com.writer.sdk.models.shared.TermMistakeCreate[]{{
                                            add(new TermMistakeCreate(false, "repellendus") {{
                                                caseSensitive = false;
                                                mistake = "itaque";
                                                pos = TermMistakeCreatePosEnum.NOUN;
                                                reference = "est";
                                            }}),
                                            add(new TermMistakeCreate(false, "facilis") {{
                                                caseSensitive = false;
                                                mistake = "porro";
                                                pos = TermMistakeCreatePosEnum.ADJECTIVE;
                                                reference = "ut";
                                            }}),
                                            add(new TermMistakeCreate(false, "laudantium") {{
                                                caseSensitive = false;
                                                mistake = "cupiditate";
                                                pos = TermMistakeCreatePosEnum.NOUN;
                                                reference = "quae";
                                            }}),
                                        }};
                                        pos = TermUpdatePosEnum.VERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("quisquam") {{
                                                tag = "voluptatibus";
                                            }}),
                                            add(new TermTagCreate("omnis") {{
                                                tag = "vero";
                                            }}),
                                            add(new TermTagCreate("ipsum") {{
                                                tag = "quis";
                                            }}),
                                        }};
                                        term = "delectus";
                                        type = TermUpdateTypeEnum.BANNED;
                                    }}),
                                }};
                            }};, 492268L) {{
                xRequestID = "hic";
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
