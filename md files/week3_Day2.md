### Inheritance:

1. **Definition of Inheritance**: 
    - Inheritance is a fundamental principle in object-oriented programming that allows a class to inherit attributes and behaviors (methods) from another class. 
    - This uses `extends` keyword 

2. **Advantages of Inheritance**:
   - **Reusability**: Inheritance promotes the reuse of existing code without having to rewrite it.
   - **Readability**: It makes the code more simple by establishing clear relationships between classes.
   - **Hierarchy**: Establishes parent-child relationships between Classes and Interfaces, making the structure easier to understand and maintain.

3. **Types of Inheritance**:
   - **Single**: A class inherits from one parent class.
   - **Multiple**: A class inherits behaviors from more than one class, typically achieved through interfaces in Java.
   - **Multilevel**: A class inherits from a child class, creating a multilevel chain.
   - **Hierarchical**: Multiple classes inherit from a single parent class.
   - **Hybrid**: A combination of multilevel and hierarchical inheritance.

4. **Java Examples**:
    - Integer extends Number
    - RuntimeException extends Exception
    - List extends Collection
   
5. **Selenium WebDriver Examples**:
        - ChromeDriver extends ChromiumDriver
        - EdgeDriver extends ChromiumDriver
        - ChromiumDriver extends RemoteWebDriver
        ![Alt text](image.png)

### Interview Question
1. Could you explain Inheritance concept in Java?
   Answer:
     Definition, Types, Advantages, Examples
2. Give realtime examples in Java, Selenium  
3. Explain where have you applied Inheritance in your Framework? 

### Abstraction:

1. **Definition**: 
   - Abstraction is an OOPs concept that focuses on hiding complex implementation details and exposing only the necessary parts of an object. It's about representing features without including background details.

2. **Advantages of Abstraction**:
   - **Simplicity**: Abstraction simplifies the view of an object, so you don't need to understand the internal workings to use it.
   - **Reusability**: Abstract classes and interfaces can be reused to implement common methods in multiple subclasses.

3. **Keyword**: The `implements` keyword is used to implement an Interface

4. **Types**:
   - **Interfaces**: Used for full abstraction, they cannot have any implementation.
   - **Abstract Classes**: Provide partial abstraction with some implemented methods.
   - **Concrete Classes**: Regular classes with full implementation.

5. **Java Examples**: 
   - **Interfaces**: `List`, `Set`, `Map` are interfaces providing a standard set of methods to be implemented by concrete collections.
   - **Abstract Classes**: `AbstractList`, `AbstractCollection` provide skeletal implementations that can be used as starting points for creating concrete collections.

6. **Selenium WebDriver Examples**:
   - **Interfaces**: `WebDriver`, `WebElement`, `Alert` are interfaces representing abstract concepts in browser automation.
   - **Abstract Classes**: `By` is an abstract class providing methods to locate elements.
   - **Concrete Classes**: `RemoteWebDriver` is a concrete implementation of the `WebDriver` interface.






Inheritance
-----------
      - keywords used for inherit another class - extends
      - By using object can able to call/use all the methods and variables from the same/current class and able to access super/parent/grandParent class.
      - Cannot able to access the methods and variables declared in child/sub class.
      - cannot able to inherit subClass/ child class/ grand child class.