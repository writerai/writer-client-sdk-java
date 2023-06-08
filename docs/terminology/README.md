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
                .setSecurity(new Security("debitis") {{
                    apiKey = "";
                }})
                .setOrganizationId(260341L)
                .build();

            AddTermsRequest req = new AddTermsRequest(                new CreateTermsRequest() {{
                                failHandling = CreateTermsRequestFailHandling.VALIDATE_ONLY;
                                models = new com.writer.sdk.models.shared.TermCreate[]{{
                                    add(new TermCreate(false, "ipsam", TermCreateType.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "facilis";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("repudiandae", TermExampleCreateType.GOOD) {{
                                                example = "architecto";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("repellat", TermExampleCreateType.BAD) {{
                                                example = "expedita";
                                                type = TermExampleCreateType.GOOD;
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
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "natus";
                                            }}),
                                        }};
                                        pos = TermCreatePos.NOUN;
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
                                        type = TermCreateType.PENDING;
                                    }}),
                                    add(new TermCreate(false, "error", TermCreateType.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "autem";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("nemo", TermExampleCreateType.BAD) {{
                                                example = "eaque";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("amet", TermExampleCreateType.GOOD) {{
                                                example = "perferendis";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("hic", TermExampleCreateType.BAD) {{
                                                example = "cumque";
                                                type = TermExampleCreateType.GOOD;
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
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "dolores";
                                            }}),
                                        }};
                                        pos = TermCreatePos.VERB;
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
                                        type = TermCreateType.BANNED;
                                    }}),
                                    add(new TermCreate(false, "ipsa", TermCreateType.BANNED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "occaecati";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("earum", TermExampleCreateType.GOOD) {{
                                                example = "adipisci";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("deleniti", TermExampleCreateType.BAD) {{
                                                example = "iste";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("libero", TermExampleCreateType.BAD) {{
                                                example = "provident";
                                                type = TermExampleCreateType.BAD;
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
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "hic";
                                            }}),
                                        }};
                                        pos = TermCreatePos.ADVERB;
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
                                        type = TermCreateType.APPROVED;
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
                    apiKey = "";
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
                .setSecurity(new Security("atque") {{
                    apiKey = "";
                }})
                .setOrganizationId(24678L)
                .build();

            FindTermsRequest req = new FindTermsRequest(854614L) {{
                limit = 67249L;
                offset = 743835L;
                partOfSpeech = FindTermsPartOfSpeech.ADVERB;
                sortField = FindTermsSortField.CREATION_TIME;
                sortOrder = FindTermsSortOrder.ASC;
                tags = new String[]{{
                    add("deleniti"),
                    add("omnis"),
                    add("necessitatibus"),
                }};
                term = "distinctio";
                type = FindTermsType.PENDING;
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
                .setSecurity(new Security("nihil") {{
                    apiKey = "";
                }})
                .setOrganizationId(216897L)
                .build();

            UpdateTermsRequest req = new UpdateTermsRequest(                new UpdateTermsRequest() {{
                                failHandling = UpdateTermsRequestFailHandling.VALIDATE;
                                models = new com.writer.sdk.models.shared.TermUpdate[]{{
                                    add(new TermUpdate(false, 253941L, "enim", TermUpdateType.APPROVED) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "saepe";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("amet", TermExampleCreateType.BAD) {{
                                                example = "aspernatur";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("saepe", TermExampleCreateType.GOOD) {{
                                                example = "accusamus";
                                                type = TermExampleCreateType.GOOD;
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
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "quod";
                                            }}),
                                            add(new TermMistakeCreate(false, "esse") {{
                                                caseSensitive = false;
                                                mistake = "qui";
                                                pos = TermMistakeCreatePos.ADVERB;
                                                reference = "a";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.ADVERB;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("quisquam") {{
                                                tag = "ipsum";
                                            }}),
                                            add(new TermTagCreate("amet") {{
                                                tag = "tenetur";
                                            }}),
                                        }};
                                        term = "tempore";
                                        type = TermUpdateType.PENDING;
                                    }}),
                                    add(new TermUpdate(false, 355613L, "nam", TermUpdateType.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "sapiente";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("expedita", TermExampleCreateType.GOOD) {{
                                                example = "nihil";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("libero", TermExampleCreateType.GOOD) {{
                                                example = "sed";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("ipsum", TermExampleCreateType.GOOD) {{
                                                example = "deserunt";
                                                type = TermExampleCreateType.GOOD;
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
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "distinctio";
                                            }}),
                                            add(new TermMistakeCreate(false, "temporibus") {{
                                                caseSensitive = false;
                                                mistake = "aliquid";
                                                pos = TermMistakeCreatePos.VERB;
                                                reference = "molestias";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.NOUN;
                                        tags = new com.writer.sdk.models.shared.TermTagCreate[]{{
                                            add(new TermTagCreate("magni") {{
                                                tag = "fugit";
                                            }}),
                                        }};
                                        term = "odio";
                                        type = TermUpdateType.APPROVED;
                                    }}),
                                    add(new TermUpdate(false, 231701L, "vero", TermUpdateType.PENDING) {{
                                        approvedTermExtension = new ApprovedTermExtensionCreate(false, false, false) {{
                                            capitalize = false;
                                            fixCase = false;
                                            fixCommonMistakes = false;
                                        }};
                                        caseSensitive = false;
                                        description = "voluptatem";
                                        examples = new com.writer.sdk.models.shared.TermExampleCreate[]{{
                                            add(new TermExampleCreate("et", TermExampleCreateType.BAD) {{
                                                example = "soluta";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("nobis", TermExampleCreateType.BAD) {{
                                                example = "ipsum";
                                                type = TermExampleCreateType.GOOD;
                                            }}),
                                            add(new TermExampleCreate("aperiam", TermExampleCreateType.BAD) {{
                                                example = "tempore";
                                                type = TermExampleCreateType.BAD;
                                            }}),
                                            add(new TermExampleCreate("labore", TermExampleCreateType.GOOD) {{
                                                example = "dolorem";
                                                type = TermExampleCreateType.GOOD;
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
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "est";
                                            }}),
                                            add(new TermMistakeCreate(false, "facilis") {{
                                                caseSensitive = false;
                                                mistake = "porro";
                                                pos = TermMistakeCreatePos.ADJECTIVE;
                                                reference = "ut";
                                            }}),
                                            add(new TermMistakeCreate(false, "laudantium") {{
                                                caseSensitive = false;
                                                mistake = "cupiditate";
                                                pos = TermMistakeCreatePos.NOUN;
                                                reference = "quae";
                                            }}),
                                        }};
                                        pos = TermUpdatePos.VERB;
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
                                        type = TermUpdateType.BANNED;
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
