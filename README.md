# Gradle + jUnit5 + logback + Selenide

A sample gradle base project which uses jUnit5 for running tests, logback library for logging and
Selenide for browser manipulations.

# To Run

`./gradlew test` will run all the test inside `src/test` .

After the tests are ran, you can see:

* jUnit test reports under `build/reports/tests/index.html`
* logs from file appender under `build/logs/log.log`
* screenshots and saved .html from Selenide `build/reports/tests`

## Selenide configuration

Selenide provides a lot of things out of the box, no extra configuration required for sample
project. In case you would like to do custom configuration you can find an example in
AppConfiguration.class.

* Default browser is `chrome`
* By default Selenide puts screenshots and .html to folder `build/reports/tests`
* To change the browser you can use `-Dselenide.browser=firefox`

## Logback configuration

You can find logback configuration here `src/test/resources`

Current configuration contains two appenders:

* ConsoleAppender will output logs to system out stream
* FileAppender will output logs to `build/logs/log.log`
    1. Current configuration will append data to existing log file

## Libraries Used

* [Junit](https://junit.org/junit5/docs/current/user-guide/) - 5.7.0
* [Gradle](https://gradle.org/guides) - 6.8.3
* [Logback](http://logback.qos.ch/manual/index.html) - 1.2.3
* [Selenide](https://rselenide.org/documentation.html) - 5.20.1
* [Selenide](https://github.com/selenide/selenide/wiki)