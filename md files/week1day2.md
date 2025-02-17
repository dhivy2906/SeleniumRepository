**Methods:**

   *Definition:* 
      A method in Java is a set of instructions or a block of code encapsulated within a named unit. It is designed to perform a specific task and can be invoked (called) from other parts of the program. Methods promote code reusability, modularization, and a more organized code structure. They are defined using the def keyword, followed by the method's signature, which includes its name, parameters, and return type.

   Explanation: 
      Declaration: Methods are declared with a return type, a name, and parameters (if any). Return Type: Specifies the type of data the method will return, or "void" if it doesn't return anything. Parameters: Input values passed to the method for processing.

**Objects:**

   *Definition:*
      In Java, an object is an instance of a class, representing a real-world entity or concept. Objects encapsulate data (attributes) and behavior (methods) related to the entity they represent. They are created from class blueprints and follow the principles of object-oriented programming (OOP), including encapsulation, inheritance, and polymorphism. Objects interact with each other through method calls and can store and manipulate data.

   Explanation
      Instantiation: Objects are created from classes using the new keyword. Attributes (Fields): Define the properties of an object. Behaviors (Methods): Define the actions an object can perform.


**Method Signature**
      Access modifier returntype  methodName(input arguments){}



**Access Modifier**
   1. public - Able to access anywhere
   2. private - able to access in that particular class alone
   3. default - able to access in that package alone 
   4. protected - able to access in same package and than different package with inheritance.


   1.Create a method within a class and outside the main method/ normal method.
   2. Nested method not possible in java.
   3. Create a method in any order(No Restriction).


   Default values for dataTypes
   ----------------------------
      byte,short, int,long = 0
      float and double = 0.0
      boolean = false
      char = null
      String = null


      Gobal variables vs Local varibales
      gobal -> blue color
      local -> brown color

      gobal --> able to access anywhere
      local --> able to access in that particular method alone.

 **Control and Jump Statements:**

   *Definition:* 
      Control statements in Java are used to manage the flow of execution in a program. They include decision-making statements

   *Looping Statements:*
      For Loop: Repeats a block of code a specific number of times.

   *Jump Statements:*
      Break Statement: Terminates the innermost loop or switch statement. Continue Statement: Skips the current iteration and continues to the loop and proceeds to the next iteration.