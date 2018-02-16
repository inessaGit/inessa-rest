# inessa-gonzalez

### Getting Started
- Make sure you have [JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) installed ( version 1.7 or newer)
- Make sure you have [Maven](https://maven.apache.org/) installed
- IDE: Eclipse (or IDE of your choice)
- [TestNG](http://testng.org/doc/)

#### Explanation/Strategy for task of testing RESTful API : 
1. For each endpoint test different CRUD operations using http request types e.g GET/POST/PATCH 
2. Prioritization of test cases based on complexity
e.g first assert the Response Status Code (to ensure that the request was OK), then the Media Type of the Response, then Response body 

3. GET 
- without parameters 
- with parameter e.g read 
- Assert status code
- Assert response content type

/v1/messages

/v1/messages?read=true 

/v1/messages/26

/v1/messages/999

4.PATCH 
Assumption:  
- PATCH call to an existing resource is handled as an "update." 
- PATCH call against a resource that does not exist  result in an HTTP "409 Conflict" error.

/v1/messages/1

/v1/messages/999

4. Currently it is running separate test methods and test classes but with TestNG there is an option for creating test suite
5. Once testng suite.xml created it can be run via Maven in Eclipse, via command line or plugged in into Jenkins
6. Optionally Rest-assuared could be added https://github.com/rest-assured/rest-assured

#### Useful links:
- [REST API DEV tools](https://github.com/yosriady/api-development-tools)
- [API Security](https://github.com/shieldfy/API-Security-Checklist)
- [HTTP PATCH spec](https://tools.ietf.org/html/rfc5789)
