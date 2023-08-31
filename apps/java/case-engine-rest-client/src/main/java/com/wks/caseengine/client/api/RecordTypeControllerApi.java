/*
 * WKS Platform - Open-Source Project
 * 
 * This file is part of the WKS Platform, an open-source project developed by WKS Power.
 * 
 * WKS Platform is licensed under the MIT License.
 * 
 * © 2021 WKS Power. All rights reserved.
 * 
 * For licensing information, see the LICENSE file in the root directory of the project.
 */
package com.wks.caseengine.client.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;

import com.wks.caseengine.client.invoker.ApiClient;
import com.wks.caseengine.client.model.RecordType;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-26T12:12:09.236578+01:00[Europe/Dublin]")
public class RecordTypeControllerApi {
	private ApiClient apiClient;

	public RecordTypeControllerApi() {
		this(new ApiClient());
	}

	public RecordTypeControllerApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id (required)
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public void delete1(String id) throws RestClientException {
		delete1WithHttpInfo(id);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id (required)
	 * @return ResponseEntity&lt;Void&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public ResponseEntity<Void> delete1WithHttpInfo(String id) throws RestClientException {
		Object localVarPostBody = null;

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'id' when calling delete1");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("id", id);

		final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<>();
		final HttpHeaders localVarHeaderParams = new HttpHeaders();
		final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<>();
		final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<>();

		final String[] localVarAccepts = {};
		final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		final String[] localVarContentTypes = {};
		final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
		};
		return apiClient.invokeAPI("/record-type/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams,
				localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept,
				localVarContentType, localVarAuthNames, localReturnType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @return List&lt;RecordType&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public List<RecordType> find2() throws RestClientException {
		return find2WithHttpInfo().getBody();
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @return ResponseEntity&lt;List&lt;RecordType&gt;&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public ResponseEntity<List<RecordType>> find2WithHttpInfo() throws RestClientException {
		Object localVarPostBody = null;

		final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<>();
		final HttpHeaders localVarHeaderParams = new HttpHeaders();
		final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<>();
		final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<>();

		final String[] localVarAccepts = { "*/*" };
		final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		final String[] localVarContentTypes = {};
		final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		ParameterizedTypeReference<List<RecordType>> localReturnType = new ParameterizedTypeReference<List<RecordType>>() {
		};
		return apiClient.invokeAPI("/record-type/", HttpMethod.GET, Collections.<String, Object>emptyMap(),
				localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams,
				localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id (required)
	 * @return RecordType
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public RecordType get1(String id) throws RestClientException {
		return get1WithHttpInfo(id).getBody();
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id (required)
	 * @return ResponseEntity&lt;RecordType&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public ResponseEntity<RecordType> get1WithHttpInfo(String id) throws RestClientException {
		Object localVarPostBody = null;

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'id' when calling get1");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("id", id);

		final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<>();
		final HttpHeaders localVarHeaderParams = new HttpHeaders();
		final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<>();
		final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<>();

		final String[] localVarAccepts = { "*/*" };
		final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		final String[] localVarContentTypes = {};
		final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		ParameterizedTypeReference<RecordType> localReturnType = new ParameterizedTypeReference<RecordType>() {
		};
		return apiClient.invokeAPI("/record-type/{id}", HttpMethod.GET, uriVariables, localVarQueryParams,
				localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept,
				localVarContentType, localVarAuthNames, localReturnType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param recordType (required)
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public void save1(RecordType recordType) throws RestClientException {
		save1WithHttpInfo(recordType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param recordType (required)
	 * @return ResponseEntity&lt;Void&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public ResponseEntity<Void> save1WithHttpInfo(RecordType recordType) throws RestClientException {
		Object localVarPostBody = recordType;

		// verify the required parameter 'recordType' is set
		if (recordType == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'recordType' when calling save1");
		}

		final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<>();
		final HttpHeaders localVarHeaderParams = new HttpHeaders();
		final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<>();
		final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<>();

		final String[] localVarAccepts = {};
		final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		final String[] localVarContentTypes = { "application/json" };
		final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
		};
		return apiClient.invokeAPI("/record-type/", HttpMethod.POST, Collections.<String, Object>emptyMap(),
				localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams,
				localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id         (required)
	 * @param recordType (required)
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public void update1(String id, RecordType recordType) throws RestClientException {
		update1WithHttpInfo(id, recordType);
	}

	/**
	 *
	 *
	 * <p>
	 * <b>200</b> - OK
	 *
	 * @param id         (required)
	 * @param recordType (required)
	 * @return ResponseEntity&lt;Void&gt;
	 * @throws RestClientException if an error occurs while attempting to invoke the
	 *                             API
	 */
	public ResponseEntity<Void> update1WithHttpInfo(String id, RecordType recordType) throws RestClientException {
		Object localVarPostBody = recordType;

		// verify the required parameter 'id' is set
		if (id == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'id' when calling update1");
		}

		// verify the required parameter 'recordType' is set
		if (recordType == null) {
			throw new HttpClientErrorException(HttpStatus.BAD_REQUEST,
					"Missing the required parameter 'recordType' when calling update1");
		}

		// create path and map variables
		final Map<String, Object> uriVariables = new HashMap<>();
		uriVariables.put("id", id);

		final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<>();
		final HttpHeaders localVarHeaderParams = new HttpHeaders();
		final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<>();
		final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<>();

		final String[] localVarAccepts = {};
		final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
		final String[] localVarContentTypes = { "application/json" };
		final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

		String[] localVarAuthNames = new String[] {};

		ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {
		};
		return apiClient.invokeAPI("/record-type/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams,
				localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept,
				localVarContentType, localVarAuthNames, localReturnType);
	}
}
