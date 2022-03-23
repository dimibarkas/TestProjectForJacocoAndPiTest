# Unit-Test Runner

This repository holds the application code of Unit-Test Runner.

## Dependencies

* mvn (v3.8.4)
* jacoco (v.0.8.7)
* pitest (v1.7.3)

### Test

To execute all test run the following command:
This will setup the Jacoco Agent and set him in Motion.

```
mvn test
```

## Coverage Report 

To generate the coverage report with Jacoco run:

```
mvn test
```

and 

```
mvn jacoco:report
```

## MutationTest Coverage

To generate the coverage report with PiTest (mutations) run:

```
mvn test
```

and

```
mvn pitest:mutationCoverage
```







