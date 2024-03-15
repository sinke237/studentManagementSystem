### Description
 Playing with Spring Boot; practicing 
 - CRUD
 - Authorisation
 - Integration testing with JGiven, TestContainers

### Database Setup
I am assuming you want a disposible database like me.
A database running in a docker container.
```dockerfile
docker pull postgres
```
```dockerfile
docker run --name <container_name> -e POSTGRES_PASSWORD=<password> -d -p 5432:5432 postgres
```
```dockerfile
docker exec -it <containerName> psql -U postgres
```
To create a new db use,
```sql
CREATE USER <username> WITH PASSWORD '<password>';
```
If not you may use the default postgres User
Create Database
```sql
CREATE DATABASE dbName OWNER <username>;
```
To list all DBs
```sql
\l
```
To quit 
```sql
\q
```
To check if all is alright
```dockerfile
    docker logs <containerName>
```
!!! Be sure to configure the application.properties file(`./src/main/resources`).

### Check the data inside your database
```dockerfile
docker exec -it <containerName> bash
```
```dockerfile
psql -U <username> <databaseName>
```
```sql
SELECT * FROM <tableName>;
```