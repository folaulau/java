DEFINITION
1. Singleton pattern restricts the instantiation of a class and ensures that only one instance of 
the class exists in the java virtual machine.
2. The singleton class must provide a global access point to get the instance of the class.
3. ENUM is recommended as the best method of making singletons in Java.

Rule
1. Constructors must be private - to restrict instantiation of the class from other classes.
2. Private static variable of the same class that is the only instance of the class.
3. Public static method that returns the instance of the class, this is the global access point 
   for outer world to get the instance of the singleton class.


USAGE
1. Logging
2. Drivers objects
3. Caching
4. Thread pool


LINKS
1. 
2.