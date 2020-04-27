# amdocs

# User Profile service
 User profile service which performs CRUD operation over User profile database
 It has 1 Synchronous operation and 2 Asynchronous operations
 
# POST /profile 
Creates User profile
Synchronous rest call between Authorization and Profile Service.

# PUT Event Listener
Update user profile based on events received from kafka
Asynchronous rest call between Authorization and Profile Service.

# DELETE Event Listener
Deletes user profile based on events received from kafka
Asynchronous rest call between Authorization and Profile Service.

# Steps to run this Service on local
1. Check kafka bootstrapAddress, topics, group id  in application.yml
2. Build this service using command "mvn clean install"
3. Run this service using command "mvn spring-boot:run"



 
 