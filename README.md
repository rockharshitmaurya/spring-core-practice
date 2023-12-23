### 1. What is Spring Framework?
Spring is a comprehensive framework that simplifies Java development by providing solutions for various aspects like dependency injection, transaction management, and more.

### 2. Spring Framework's Modules
Spring is divided into modules like Core Container, AOP (Aspect-Oriented Programming), Data Access/Integration, Web, etc., each catering to specific functionalities.

### 3. Spring IOC Container
IOC (Inversion of Control) Container manages the creation and lifecycle of objects. It relies on DI (Dependency Injection) to inject dependencies into objects.

### 4. Dependency Injection in Spring Framework
Dependency Injection is a core principle where objects are given their dependencies rather than creating them internally.

### 5. Injecting Values
#### Code:
```java
public class Student {
    private int studentId;
    private String studentName;
    // getters and setters
}
```
#### XML Config:
```xml
<bean id="student" class="com.extramarks.springcore.Student">
    <property name="studentId" value="1" />
    <property name="studentName" value="John" />
</bean>
```
#### Annotation:
```java
@Component
public class Student {
    @Value("1")
    private int studentId;
    @Value("John")
    private String studentName;
    // getters and setters
}
```

### 6. Injecting Collection
#### Code:
```java
public class Employee {
    private List<String> names;
    // getter and setter
}
```
#### XML Config:
```xml
<bean id="employee" class="com.extramarks.springcore.collections.Employee">
    <property name="names">
        <list>
            <value>John</value>
            <value>Alice</value>
        </list>
    </property>
</bean>
```
#### Annotation:
```java
@Component
public class Employee {
    @Value("#{'${employee.names}'.split(',')}")
    private List<String> names;
    // getter and setter
}
```

### 7. Injecting Reference Type
Reference types can be injected using either XML configuration or annotations similar to the above examples.

### 8. Constructor Injection
#### Code:
```java
public class Person {
    private String name;
    // constructor
}
```
#### XML Config:
```xml
<bean id="person" class="com.extramarks.springcore.constructor_injection.Person">
    <constructor-arg value="John" />
</bean>
```
#### Annotation:
```java
@Component
public class Person {
    private String name;
    @Autowired
    public Person(@Value("John") String name) {
        this.name = name;
    }
    // getter and setter
}
```

### 9. Ambiguity Problem
Occurs when Spring encounters multiple beans of the same type and can't decide which one to inject. Qualifiers or `@Primary` annotation can resolve this.

### 10. Spring Bean LifeCycle
Beans in Spring have a lifecycle: creation, initialization, and destruction. You can implement interfaces or use annotations (`@PostConstruct`, `@PreDestroy`) to manage these phases.

### 11. Autowiring of Spring Beans
Autowiring automatically injects dependencies. Types include `byName`, `byType`, `constructor`, `autodetect`, etc.

### 12. Standalone Collections
#### Code:
```java
public class Person {
    private List<String> hobbies;
    // getter and setter
}
```
#### XML Config:
```xml
<bean id="person" class="com.extramarks.springcore.standalone.collections.Person">
    <property name="hobbies">
        <list>
            <value>Cooking</value>
            <value>Reading</value>
        </list>
    </property>
</bean>
```
#### Annotation:
```java
@Component
public class Person {
    @Value("#{'${person.hobbies}'.split(',')}")
    private List<String> hobbies;
    // getter and setter
}
```

These examples cover the basics of Spring Core concepts with both XML configuration and annotation-based setups.
