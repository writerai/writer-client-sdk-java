# Styleguide
(*.styleguide*)

## Overview

Methods related to Styleguide

### Available Operations

* [get](#get) - Page details
* [listPages](#listpages) - List your styleguide pages

## get

Page details

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.PageDetailsRequest;
import com.writer.sdk.models.operations.PageDetailsResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(700347L)
                .build();

            PageDetailsRequest req = new PageDetailsRequest(90065L);            

            PageDetailsResponse res = sdk.styleguide.get(req);

            if (res.pageWithSectionResponse != null) {
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
| `request`                                                                                            | [com.writer.sdk.models.operations.PageDetailsRequest](../../models/operations/PageDetailsRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[com.writer.sdk.models.operations.PageDetailsResponse](../../models/operations/PageDetailsResponse.md)**


## listPages

List your styleguide pages

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListPagesRequest;
import com.writer.sdk.models.operations.ListPagesResponse;
import com.writer.sdk.models.operations.Status;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security("string"){{
                    apiKey = "";
                }})
                .setOrganizationId(763372L)
                .build();

            ListPagesRequest req = new ListPagesRequest(){{
                limit = 760116L;
                offset = 303332L;
                status = Status.LIVE;
            }};            

            ListPagesResponse res = sdk.styleguide.listPages(req);

            if (res.paginatedResultPagePublicApiResponse != null) {
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
| `request`                                                                                        | [com.writer.sdk.models.operations.ListPagesRequest](../../models/operations/ListPagesRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[com.writer.sdk.models.operations.ListPagesResponse](../../models/operations/ListPagesResponse.md)**

