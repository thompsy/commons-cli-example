# Apache Commons CLI Example

This project is a very brief demo of the Apache Commons CLI framework. The application has several command line arguments defined and simply parses them and prints out the supplied argument values.

The program can be run using Maven:

`mvn compile exec:java -Dexec.mainClass="uk.co.downthewire.example.Main" -Dexec.args="-a 'Example task' --date '12/12/21' -t '10am'"`