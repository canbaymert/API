package get_requests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {

    /*
        1) Postman is used for manual API test
        2) Rest-Assured Library is used for API automation tests.
        3) To write automation codes these steps should be followed:
            a) Understand the requirements
            b) Write a test case ('Gherkin Language' is used)
                  'Gherkin' language keywords:
                  x) Given: First conditions
                  y) When: Actions-->Get, Put, ...
                  z) Then: Results--> Assert ...
                  t) And:  Multiple actions.

            c) Steps to write a test code

                   i)   Set the URL
                   ii)  Set the expected data(POST-PUT-PATCH)
                   iii) Type code to send request
                   iv)  Do Assertion

        Given
            https://restful-booker.herokuapp.com/booking/55
        When
            User sends a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK

          */


        @Test
        public void get01(){
           // i)  Set the URL
            String url = "https://restful-booker.herokuapp.com/booking/55";

           // ii) Set the expected data (POST-PUT-PATCH)

           // iii) Type code to send request
           Response response= given().when().get(url);
           response.prettyPrint();

           // iv) Do Assertion
            response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

            // Print the 'Status Code'
            System.out.println("Status Code: "+response.statusCode());

            // Print the 'Content Type'
            System.out.println("Content Type: "+response.contentType());

            // Print the 'Status Line'

            System.out.println("Status Line: "+response.statusLine());

            // Print the User-Agent on the 'Headers'

            System.out.println(response.header("User-Agent"));

            // Print the 'Headers'
            System.out.println("Headers:\n"+response.headers());

            // Print the 'Time'
            System.out.println("Time: "+response.getTime());

        }
}
