# micro

The Employee Service makes use of the Spring Data Rest repository

Step 1 to run Eureka server
1. run git clone https://github.com/demani06/micro/EurekaSrvr to clone the repo to local system
2. Navigate to EurekaSrvr and run mvn spring-boot:run to start the Eureka (tomcat) server on 8761
3. Run http://localhost:8761 to see the Eureka server (registry) home page

Step 2 to run Employee Service
1. run git clone https://github.com/demani06/micro/EmployeeService to clone the repo to local system
2. run mvn spring-boot:run to run the application/json

To see HSQL DB web console 
http://localhost:9999/h2-console/

To view the Employee API 
http://localhost:9999/api/employees

Run the below step to create a new employee
$ curl -X POST localhost:9999/api/employees/ -d "{\"firstName\": \"Deepak\", \"lastName\": \"Emani\", \"description\":\"Developer\"}" -H "Content-Type:application/json"
