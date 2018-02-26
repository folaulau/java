* LINKS
1. https://www.geeksforgeeks.org/facade-design-pattern-introduction/
2. http://java-design-patterns.com/patterns/facade/

1. Facade pattern hides the complexities of the system and provides an interface to the client 
using which the client can access the system. This type of design pattern comes under 
structural pattern as this pattern adds an interface to existing system to hide its complexities.

2. So, As the name suggests, it means the face of the building. The people walking past the road 
can only see this glass face of the building. They do not know anything about it, the wiring, 
the pipes and other complexities. It hides all the complexities of the building and displays a 
friendly face.

3. Facade pattern provides a simplified interface to a complex subsystem.

USAGE
1. You can use the facade pattern when you need to provide a simple interface as an entry point 
to access a complex system. In essence, if you have a complex system where the abstractions and 
the implementations of it are tightly coupled and you would not want the consumer to contact the 
complex system directly, the facade pattern is an excellent choice. In using the facade design 
pattern in this case, you can eliminate the need of the client to call the methods of the complex 
system directly and rather provide an interface to which the client can communicate.

2. The facade pattern is also a good candidate if the sub system contains many different 
methods while you would need just a few of those methods from among them -- 
you can use the facade design pattern in this case and provide only access to only 
those methods that are needed through a high level interface.

3. 