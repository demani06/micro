Microservice Running steps

# Step 1 to run Eureka server
1. Run git clone https://github.com/demani06/micro/ to clone the repo to local system
2. Navigate to EurekaSrvr and run mvn spring-boot:run to start the Eureka (tomcat) server on 8761
3. Run http://localhost:8761 to see the Eureka server (registry) home page

# Step 2 to run Employee Service
1. Navigate to EmployeeService folder and run mvn spring-boot:run to run the application
2.To see list of departments , click on http://localhost:9999/employee-service/employees

# Step 3 to run Department Service
1. Navigate to DepartmentService folder and run mvn spring-boot:run to run the application
2. To see list of departments , click on http://localhost:9099/department-service/departments

# Step 4 - Zuul/API Gateway server 
1. Navigate to APIGateway folder and run mvn spring-boot:run to run the application
2. Click on below links to view the respective services URLS on Zuul

http://localhost:9000/employee-service/employees
http://localhost:9000/department-service/departments

