package com.writer.sdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.writer.sdk.utils.HTTPClient;
import com.writer.sdk.utils.HTTPRequest;
import com.writer.sdk.utils.JSON;
import com.writer.sdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Content {
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Content(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * contentCheck - Check your content against your preset styleguide.
    **/
    public com.writer.sdk.models.operations.ContentCheckResponse contentCheck(com.writer.sdk.models.operations.ContentCheckRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(baseUrl, "/content/organization/{organizationId}/team/{teamId}/check", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.writer.sdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        java.util.Map<String, java.util.List<String>> headers = com.writer.sdk.utils.Utils.getHeaders(request.headers);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.ContentCheckResponse res = new com.writer.sdk.models.operations.ContentCheckResponse() {{
            processedContent = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.ProcessedContent out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.ProcessedContent.class);
                res.processedContent = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }

        return res;
    }
	
    
    /**
     * contetnCorrect - Apply the style guide suggestions directly to your content.
    **/
    public com.writer.sdk.models.operations.ContetnCorrectResponse contetnCorrect(com.writer.sdk.models.operations.ContetnCorrectRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.writer.sdk.utils.Utils.generateURL(baseUrl, "/content/organization/{organizationId}/team/{teamId}/correct", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.writer.sdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        java.util.Map<String, java.util.List<String>> headers = com.writer.sdk.utils.Utils.getHeaders(request.headers);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.writer.sdk.models.operations.ContetnCorrectResponse res = new com.writer.sdk.models.operations.ContetnCorrectResponse() {{
            correctionResponse = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
            failResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.CorrectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.CorrectionResponse.class);
                res.correctionResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }
        else if (httpRes.statusCode() == 500) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (com.writer.sdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.writer.sdk.models.shared.FailResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.writer.sdk.models.shared.FailResponse.class);
                res.failResponse = out;
            }
        }

        return res;
    }
}