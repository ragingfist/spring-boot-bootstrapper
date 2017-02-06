# run the image 'mysql' and call it 'db2'
# map the port 192.168.99.100:3306 to port 3306 in the container
# Creates a database 'myapp' that can be accessed with root and no password
# map the local volume db/docker-entrypoint-initdb.d to /docker-entrypoint-initdb.d on container so that scripts will run on startup
docker run --name db2 -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=true -e MYSQL_DATABASE=myapp -v /c/Users/bailey/projects/spring-boot-bootstrapper/db/docker-entrypoint-initdb.d:/docker-entrypoint-initdb.d mysql