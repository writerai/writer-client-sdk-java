# User
(*user*)

## Overview

Methods related to User

### Available Operations

* [list](#list) - List users

## list

List users

### Example Usage

```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.operations.ListUsersQueryParamSortField;
import com.writer.sdk.models.operations.ListUsersQueryParamSortOrder;
import com.writer.sdk.models.operations.ListUsersRequest;
import com.writer.sdk.models.operations.ListUsersResponse;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer sdk = Writer.builder()
                .setSecurity(new Security(
                "<value>"){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                }})
                .setOrganizationId(768578L)
                .build();

            com.writer.sdk.models.operations.ListUsersRequest req = new ListUsersRequest(
){{
                limit = 99895L;
                offset = 547272L;
                search = "<value>";
                sortField = ListUsersQueryParamSortField.NAME;
                sortOrder = ListUsersQueryParamSortOrder.DESC;

            }};

            com.writer.sdk.models.operations.ListUsersResponse res = sdk.user.list(req);

            if (res.paginatedResultUserPublicResponse != null) {
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
| `request`                                                                                        | [com.writer.sdk.models.operations.ListUsersRequest](../../models/operations/ListUsersRequest.md) | :heavy_check_mark:                                                                               | The request object to use for the request.                                                       |


### Response

**[com.writer.sdk.models.operations.ListUsersResponse](../../models/operations/ListUsersResponse.md)**

