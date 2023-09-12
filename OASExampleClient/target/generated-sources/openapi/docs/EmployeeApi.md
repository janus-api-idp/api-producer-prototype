# EmployeeApi

All URIs are relative to *http://api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEmployee**](EmployeeApi.md#addEmployee) | **POST** /employee | Add a new employee
[**getEmployees**](EmployeeApi.md#getEmployees) | **GET** /employee | Get all employees



## addEmployee

> String addEmployee(employee)

Add a new employee

Add a new employee

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api/v1");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        Employee employee = new Employee(); // Employee | Create a new employee
        try {
            String result = apiInstance.addEmployee(employee);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#addEmployee");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee** | [**Employee**](Employee.md)| Create a new employee |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **400** | Invalid request |  -  |


## getEmployees

> List&lt;Employee&gt; getEmployees()

Get all employees

Get all employees

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EmployeeApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api/v1");

        EmployeeApi apiInstance = new EmployeeApi(defaultClient);
        try {
            List<Employee> result = apiInstance.getEmployees();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EmployeeApi#getEmployees");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid request |  -  |

