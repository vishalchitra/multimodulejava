# multimodulejava
jacoco code coverage for multi module in JAVA

There are 3 modules:
1. module-numbers
2. module-strings
3. common-reports: has pom.xml which has dependencies for above 2 modules. So, report-aggregate goal will use these 2 modules as dependencies and create the aggregated report during Verify phase.
4. parent pom.xml -> should have modules tag which includes all those 3 modules and 2 goals - (prepare agent and report). we refered this parent pom in all child poms. So, this parent pom will be used by child module's pom for executions and create jacoco.xml files separately for each modules.

$ mvn Verify 
-> to get aggregated jacoco code coverage reports.

path for aggregated reports: common-reports/target/site/jacoco-aggregate/jacoco.xml

paths for jacoco report for each module: ./module-numbers/target/site/jacoco/jacoco.xml,
                                         ./module-strings/target/site/jacoco/jacoco.xml

Use the aggregated report path in sonar.coverage.jacoco.xmlReportPaths property to use the coverage report properly.
