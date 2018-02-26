Definition 
1. Placeholder for another object to control access to it.
2. In the real work your credit card is a proxy for what is in your bank account. 
It can be used in place of cash, which is what is needed, and provides a means of 
accessing that cash when required. And that's exactly what the Proxy pattern does - 
controls and manage access to the object they are "protecting".
3. 

Rule


Usage
1. Typically, you'll want to use a proxy when communication with a third party is an 
expensive operation, perhaps over a network. The proxy would allow you to hold your 
data until you are ready to commit, and can limit the amount of times that the 
communication is called.
2. The proxy is also useful if you want to decouple actual implementation code from 
the access to a particular library. Proxy is also useful for access to large files, 
or graphics. By using a proxy, you can delay loading the resource until you really 
need the data inside. Without the concept of proxies, an application could be slow, 
and appear non-responsive.
3. Virtual Proxies: delaying the creation and initialization of expensive objects until 
needed, where the objects are created on demand (For example creating the RealSubject 
object only when the doSomething method is invoked).
4. Remote Proxies: providing a local representation for an object that is in a 
different address space. A common example is Java RMI stub objects. 
The stub object acts as a proxy where invoking methods on the stub would cause the 
stub to communicate and invoke methods on a remote object (called skeleton) found on a 
different machine.
5. Protection Proxies: where a proxy controls access to RealSubject methods, by giving 
access to some objects while denying access to others.
6. Smart References: providing a sophisticated access to certain objects such as tracking 
the number of references to an object and denying access if a certain number is reached, 
as well as loading an object from database into memory on demand.

Problems - One of few design patterns that do not have issues.

Links
1. http://java-design-patterns.com/patterns/proxy/
2. http://www.oodesign.com/proxy-pattern.html
3. https://dzone.com/articles/design-patterns-proxy
