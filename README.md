# URL SHORT

Most of us are familiar with seeing URLs like bit.ly or t.co on our Twitter or Facebook feeds. 
These are examples of shortened URLs, which are a short alias or pointer to a longer page link. 
For example, I can send you the shortened URL http://bit.ly/SaaYw5 that will forward you to a very long Google URL with search results on how to iron a shirt.
This project is my implementation of this behavior.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

### Prerequisites

What things you need to install the software

Gradle 4.4 +
Java JDK 1.8 +

### Running

Run on your local environment

```
./gradlew build && java -jar build/libs/url-short-0.0.1-SNAPSHOT.jar
```

OR run in a Docker container on interactive mode

```
./gradlew build docker && docker run -it -p 8080:8080 vpfeifer/url-short
```

OR run in a Docker container on detach mode

```
./gradlew build docker && docker run -d -p 8080:8080 vpfeifer/url-short
```

You can see some test data going to http://localhost:8080/shortUrls

## Built With

* [SpringBoot](https://spring.io/projects/spring-boot) - The web framework used
* [Docker](https://www.docker.com/) - Containers tool
* [Java](https://www.java.com/en/) - Programming Language
* [Gradle](https://gradle.org/) - Dependency management and build tasks


## Authors

* **Vinicius Pfeifer**