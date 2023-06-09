# Disable Job Run at the first program launch

You can prevent a Spring Batch application from running the job at first launch by setting the spring.batch.job.enabled property to false.

```shell

java -jar target/demo-spring-batch-0.0.1-SNAPSHOT.jar --spring.batch.job.enabled=false

java -Dspring.batch.job.enabled=false -jar target/demo-spring-batch-0.0.1-SNAPSHOT.jar 

```

