<div align="center">
    <picture>
        <source srcset="https://user-images.githubusercontent.com/6267663/223574357-9a053550-02f9-49f1-b453-1b11db148d7b.svg" media="(prefers-color-scheme: dark)" width="500">
        <img src="https://user-images.githubusercontent.com/6267663/223574369-77805bfe-6d95-44e8-ac48-f9494101e1dc.svg" width="500">
    </picture>
    <h1>Java SDK</h1>
   <p>AI for everyone.</p>
   <a href="https://dev.writer.com/docs"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=000000&style=for-the-badge" /></a>
   <a href="https://github.com/writerai/writer-client-sdk-java/actions"><img src="https://img.shields.io/github/actions/workflow/status/writerai/writer-client-sdk-java/speakeasy_generate.yaml?style=for-the-badge" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
  <a href="https://github.com/writerai/writer-client-sdk-java/releases"><img src="https://img.shields.io/github/v/release/writerai/writer-client-sdk-java?sort=semver&style=for-the-badge" /></a>
</div>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.writer.sdk:api:0.2.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.writer.sdk.Writer;
import com.writer.sdk.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            Writer.Builder builder = Writer.builder();

            Writer sdk = builder.build();

            ContentDetectorApiRequest req = new ContentDetectorApiRequest() {{
                pathParams = new ContentDetectorApiPathParams() {{
                    organizationId = 548814;
                }};
                headers = new ContentDetectorApiHeaders() {{
                    authorization = "deserunt";
                }};
                request = new ContentDetectorRequest() {{
                    input = "porro";
                }};
            }};

            ContentDetectorApiResponse res = sdk.aiContentDetector.contentDetectorApi(req);

            if (res.contentDetectorResponses.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations


### aiContentDetector

* `contentDetectorApi` - Content detector api

### billing

* `getSubscriptionDetails` - Get your organization subscription details

### coWrite

* `generateContent` - Generate content using predefined templates
* `getTemplateInputs` - Get a list of your existing CoWrite templates

### completions

* `completions` - Create completion for LLM model
* `customizationCompletions` - Create completion for LLM customization model

### content

* `contentCheck` - Check your content against your preset styleguide.
* `contetnCorrect` - Apply the style guide suggestions directly to your content.

### downloadTheCustomizedModel

* `fetchCustomizedModelFile` - Download your fine-tuned model (available only for Palmyra Base and Palmyra Large)

### files

* `deleteFile` - Delete file
* `files` - List files
* `getFile` - Get file
* `uploadFile` - Upload file

### fineTunes

* `createModelCustomization` - Create model customization
* `customizations` - List model customizations
* `deleteModelCustomization` - Delete Model customization
* `getModelCustomization` - Get model customization

### models

* `models` - List available LLM models

### snippet

* `deleteSnippets` - Delete snippets
* `findSnippets` - Find snippets
* `updateSnippets` - Update snippets

### styleguide

* `listPages` - List your styleguide pages
* `pageDetails` - Page details

### terminology

* `addTerms` - Add terms
* `deleteTerms` - Delete terms
* `findTerms` - Find terms
* `updateTerms` - Update terms

### user

* `listUsers` - List users
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
