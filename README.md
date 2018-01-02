# SpringPlayground

These are my notes on the great course [Spring Core - Learn Spring Framework 4 and Spring Boot on Udemy](https://www.udemy.com/spring-core). This repository does not include everything mentioned in the course, so go ahead and have a look at the other great courses from the [springframeworkguru John Thompson](https://springframework.guru)!

## History
- 1998 EJB Specification, aimed for scalability, security, high availability, by Sun. Multiple problems in usage, for example tightly coupled to application server
- 2004 first release Spring as OpenSource (Spring Source, today Pivotal). Better testability because parts of implementation easily interchangeable by mocks or other implementations
- today: Spring greatest market share. However, EJB also developed further. However, a lot of debate on how EJB will be developed in the future.

## Spring Core
- = central part of Spring framework
- Spring beans = simple Java Objects (POJO)
- by design, Spring Beans are meant to be simple, not overly complex objects (Single Responsibility Principle)
- Dependency Injection (DI)
	- = dependent objects are injected into class at hand
	- first largely absent in original EJB specification
- Inversion of Control (IoC)
	- Spring Framework is in control and manages software components and injection of components into dependent objects
- DI + IoC allow for loosely coupled classes: when testing a web controller, inject mock database or mock service instead of the real classes
- Spring Context = "what all brings together". Knows beans and configuration and injects objects accordingly
- a lot of projects around Spring Core, for example Data, MVC, Security, Boot

## Hello World
- in package 01_helloWorld major concepts of Spring shown in practice

## Dependency Injection & Inversion of Control
- package 02_dependencyInjection
- Spring manages dependencies
- dependencies can be composed at runtime instead of compile time. Often-seen example in legacy code: data-sources hardwired to classes using them. 

### types of DI
1. constructor-based
1. setter-based
- [constructor-based DI is preferred](https://stevenschwenke.de/useDependencyInjectionViaConstructor)
- interface-based DI: best practice to code dependencies to an interface, for more flexibility in testing

## Spring Profiling
- package 03_profiling
- different profiles cause different beans to be injected

### Default profiles
- if profile in service-impl-classes is "default", this implementation is chosen if no active profile is set in properties-file (and gets overridden if there is a profile in the properties file)
- an implementation can be default and additionally named:


    @Profile({"default", "english"})

### Spring Java Configuration
- originally, Spring used XML-based configuration
- movement towards Java configuration
- today: everything possible with XML also possible in Java config
- Java config debuggable, huge plus
- package 04_javaConfiguration
- Spring Boot sets up a component scan for the package that it's in
- in code for this section: _JavaConfigurationApplication_ moved to package _springboot_ so that automatic component scan will not detect other classes
- adding manual scan to _JavaConfigurationApplication_ solves this:


    @ComponentScan("demo")

- Moving declaration of _HelloWorldServiceEnglishImpl_ and _HelloWorldServiceSpanishImpl_ from these classes to new class _Config_    

## Other concepts mentioned in the course
- @Primary to mark the primary interface in case of multiple candidates are found
- @Qualifier in combination with @Bean(name="xy") to autowire by name instead of by type

## Tooling
- Spring Initializr in IntelliJ IDEA: File -> new -> Project -> Spring Initializr -> easy setup for new applications 

# TODO
[ ] Read forums on Udemy
[ ] Have a look at Martins Github-Repos

# sources
- [Spring Core - Learn Spring Framework 4 and Spring Boot (Udemy)](https://www.udemy.com/spring-core)