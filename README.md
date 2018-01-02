# SpringPlayground

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
- in 01_helloWorld major concepts of Spring shown in practice

## Dependency Injection & Inversion of Control
- in 02_dependencyInjection major concepts of Spring shown in practice
- Spring manages dependencies
- dependencies can be composed at runtime instead of compile time. Often-seen example in legacy code: data-sources hardwired to classes using them. 

### types of DI
1. constructor-based
1. setter-based
- [constructor-based DI is preferred](https://stevenschwenke.de/useDependencyInjectionViaConstructor)
- interface-based DI: best practice to code dependencies to an interface, for more flexibility in testing

## Tooling
- Spring Initializr in IntelliJ IDEA: File -> new -> Project -> Spring Initializr -> easy setup for new applications 

# TODO
[ ] Read forums on Udemy
[ ] Have a look at Martins Github-Repos

# sources
- [Spring Core - Learn Spring Framework 4 and Spring Boot (Udemy)](https://www.udemy.com/spring-core)