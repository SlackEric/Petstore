# Petstore
This is for Jumbo technical challenge.

Techniques involved: Springboot + Maven + MySQL + MyBatis

To run the test, please make sure your computer has following settings:
1. java runtime environment installed
2. maven installed
3. a mysql database with a schema called "test".
4. The sql script in Petstore/src/main/resources has been run to create a table called users and data has been inserted into the table.

Step 1:
#Clone the repository.
git clone https://github.com/SlackEric/Petstore.git

Step 2:
#change the directory to where your repository is located.
cd %directory of your repository%
#clean the package.
mvn clean package

Step 3:
#launch the microservice.
java -jar target/pestore-0.0.1-SNAPSHOT.jar
