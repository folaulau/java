Definition
1. when a change to one object requires changing others, and you don't know 
how many objects need to be changed

Rules
1. Define a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically.

2. Encapsulate the core (or common or engine) components in a Subject abstraction, 
and the variable (or optional or user interface) components in an Observer hierarchy.

Usage

Problems
1. A large monolithic design does not scale well as new graphing or monitoring requirements 
are levied.
2. changing in one object leads to a change in other objects

Links
1. https://sourcemaking.com/design_patterns/observer

