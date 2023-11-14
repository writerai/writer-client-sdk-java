# CompletionRequest


## Fields

| Field              | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `bestOf`           | *Long*             | :heavy_minus_sign: | N/A                | 1                  |
| `frequencyPenalty` | *Double*           | :heavy_minus_sign: | N/A                |                    |
| `logprobs`         | *Long*             | :heavy_minus_sign: | N/A                |                    |
| `maxTokens`        | *Long*             | :heavy_minus_sign: | N/A                | 1024               |
| `minTokens`        | *Long*             | :heavy_minus_sign: | N/A                | 1                  |
| `n`                | *Long*             | :heavy_minus_sign: | N/A                |                    |
| `presencePenalty`  | *Double*           | :heavy_minus_sign: | N/A                |                    |
| `prompt`           | *String*           | :heavy_check_mark: | N/A                |                    |
| `stop`             | List<*String*>     | :heavy_minus_sign: | N/A                | the,is,and         |
| `temperature`      | *Double*           | :heavy_minus_sign: | N/A                | 0.7                |
| `topP`             | *Double*           | :heavy_minus_sign: | N/A                | 1                  |