# Spring Boot Elastic Search Demo

## Steps

clone the repo

cd spring-mysql-elastic-search

open your mysql and execute MOCK_DATA.sql file

then update application properties for dev and init

then in application.properties make profile to 'init' and start the application

then stop the application and change profile to 'dev' and start the application

for testing execute this request 'http://localhost:8080/api/v1/es/user/lsnelman4'
