
<p align="center"><img src="http://spring.io/img/homepage/icon-spring-framework.svg"></p>

# springboot-properties-outside
How to work with a properties configuration file outside of your spring boot application!

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Maven
- JDK 1.8.0
- IDE (preferred)

### Clone

Feel free to clone or download the project:

```
git clone https://github.com/renanviana/springboot-properties-outside.git
```

## Running the tests
After importing the project into your IDE, you can enter in the run argument the command:
```
--spring.config.location=file:"path of your properties file"
```
Example for Windows:
```
--spring.config.location=file:"C:\Users\Renan Viana\Desktop\application.properties"
```
Example for Linux:
```
--spring.config.location=file:'/home/rviana/application.properties'
```
If you wish, you can run command-line programming after compiling the project:
```
java -jar springboot-propeties-outside.jar --spring.config.location=file:"path of your properties file"
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Renan Viana** - [renanviana](https://github.com/renanviana)

## License

The Spring Boot is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
