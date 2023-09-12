package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-12T19:15:26.200-04:00[America/New_York]")
@Component("org.openapitools.client.api.EmployeeApi")
public class EmployeeApi {
    private ApiClient apiClient;

    public EmployeeApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmployeeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new employee
     * Add a new employee
     * <p><b>200</b> - Created
     * <p><b>400</b> - Invalid request
     * @param employee Create a new employee (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String addEmployee(Employee employee) throws RestClientException {
        return addEmployeeWithHttpInfo(employee).getBody();
    }

    /**
     * Add a new employee
     * Add a new employee
     * <p><b>200</b> - Created
     * <p><b>400</b> - Invalid request
     * @param employee Create a new employee (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> addEmployeeWithHttpInfo(Employee employee) throws RestClientException {
        Object postBody = employee;
        
        // verify the required parameter 'employee' is set
        if (employee == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'employee' when calling addEmployee");
        }
        
        String path = apiClient.expandPath("/employee", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/text"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all employees
     * Get all employees
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid request
     * @return List&lt;Employee&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Employee> getEmployees() throws RestClientException {
        return getEmployeesWithHttpInfo().getBody();
    }

    /**
     * Get all employees
     * Get all employees
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid request
     * @return ResponseEntity&lt;List&lt;Employee&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Employee>> getEmployeesWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/employee", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap formParams = new LinkedMultiValueMap();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Employee>> returnType = new ParameterizedTypeReference<List<Employee>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, accept, contentType, authNames, returnType);
    }
}
