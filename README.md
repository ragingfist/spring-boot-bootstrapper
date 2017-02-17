# spring-boot-bootstrapper
Bootstraps your Spring Boot application development.

## Flyway tips
1. configure Flyway Maven plugin.
2. 'mvn flyway:info' to verify that Flyway can see the migration scripts.

##### State: Database is empty
This is usually the case when setting up a new environment.
1. 'mvn flyway:migrate' to execute all migration scripts to update database.
2. 'mvn flyway:info' to verify all scripts executed successfully.
3. Double-check in DB that the schema_version table contains all migration scripts executed successfully.

##### State: Introduce Flyway to a fully populated database
This happens when Flyway needs to be added to manage the database migrations.
1. Create a backup script that can bring the database to its current state.
2. Copy this script into Flyway migration scripts folder and name it V1__baseline.sql
3. Configure Flyway Maven plugin to use baselineVersion=1 
4. 'mvn flyway:baseline' to start the schema at version 1 without running the V1__baseline.sql script.
5. 'mvn flyway:info' to verify that version 1 baseline has a state of Success.
6. Migration scripts can be added and named V2 and above.
7. 'mvn flyway:migrate' to execute the additional scripts.

