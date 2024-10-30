# Spring Bean Lifecycle Project

This project demonstrates the **Spring Bean Lifecycle** and how to manage bean creation and destruction events in Spring. It covers three different approaches to implement lifecycle methods for beans, including **Declarative (XML)**, **Programmatic**, and **Annotation-based** approaches.

## Overview

- **Spring Bean**: A class managed by the Spring IoC container, where we can define lifecycle methods to execute custom logic during initialization and destruction.
- **Lifecycle Methods**:
  - **Post Construct**: Executed after bean creation.
  - **Pre Destroy**: Executed before bean removal.
- **Approaches**:
  1. **Declarative Approach (XML)**: Define `init-method` and `destroy-method` in XML configuration.
  2. **Programmatic Approach**: Implement `InitializingBean` (for `afterPropertiesSet`) and `DisposableBean` (for `destroy`) interfaces.
  3. **Annotation Approach**: Use annotations `@PostConstruct` and `@PreDestroy` for lifecycle management.

## Approaches Explained

### 1. Declarative Approach

Define `init-method` and `destroy-method` in the XML configuration file.

**Java Class**:
```java
public class UserDao {  
    public void init() {
        System.out.println("getting db connection...");
    }  
    public void getData() {
        System.out.println("getting data from db...");
    }  
    public void destroy() {
        System.out.println("closing db connection...");
    }
} 
XML Configuration:

xml
Copy code
<bean id="dao" 
      class="in.ashokit.UserDao" 
      init-method="init" 
      destroy-method="destroy" />


2. Programmatic Approach
Implement InitializingBean and DisposableBean interfaces.

Java Class:

java
Copy code
public class UserDao implements InitializingBean, DisposableBean {  
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method...");
    }  
    public void destroy() throws Exception {
        System.out.println("destroy method...");
    }
    public void getData() {
        System.out.println("getting data from db...");
    }
}


3. Annotation Approach
Use @PostConstruct and @PreDestroy annotations to define lifecycle methods.

Java Class:

java
Copy code
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class UserDao {  
    @PostConstruct
    public void init() {
        System.out.println("getting db connection...");
    }  

    public void getData() {
        System.out.println("getting data from db...");
    }  
    
    @PreDestroy
    public void destroy() {
        System.out.println("closing db connection...");
    }
}

Running the Project
Clone the repository and open it in an IDE with Spring support.
Configure the necessary beans in beans.xml or use Java configuration based on the approach.
Run the application to observe the bean lifecycle in action.
