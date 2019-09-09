# Customer Vehicle Info
Description: Vehicle Simulation live project

## Step 1 - Deploying Application in GCP:

- Created a Spring boot application.
- Created a project in Google Cloud Platform(GCP) and added the dependencies in pom.xml
- Written a sample Restful "GET" Api to test the application
- Created app.yaml file which is required for deploying in Google App Engine.

## Step 2 - Create and invoke data from H2(Java in-memory DB):
- Enable the H2 console and other Data source information in application.properties
- Create schema in schema.sql and data to be inserted in data.sql and add spring-boot-starter-jdbc dependency in pom.xml
- Build and start the spring boot server and login to H2 console using configured properties. 

## Step 3 - Create Restful APIs
- Create a Model(POJO) for the customerInfo table
- Create a Interface and implementation class to query the DB
- Created getCustomers() and findCustomerById() APIs.
- Add util method to generate the vehicle status in random

## Step 4 - Create User Interface using Angular
 - Create the Angular application. 
 - Create routes and table to display the data
 - Add pipe to file data from the table data
 - Set interval(ms) to refresh the data in periodic time.
 - Create the app.yaml(gae config) and dispatch.yaml(backend config)
 - Deploy in Google app engine using Storage bucket.

GAE public URL: https://vehiclesimulation.appspot.com/customers
Please find the attached screenshot in repo for more details. 
