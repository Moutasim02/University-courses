# Chapter 4
- Pattern is a common solution to a problem within a context.
- Any typical pattern has four main components: name, problems, solution, consequences.
- Development frameworks use design patterns, look at some of there code...
- Slide 16, 17 v. important
  - Design pattern features:
    - name
    - intent
    - problem
    - solution
    - participants
    - consequences
    - implementation
    - structure
- Importance: 
  - Experience reuse solutions
  - Shared vocabulary upon designers 
  - Motivation in learning.

## Design patterns example
- Duck example: when adding fly() at super class, we might have extended a duck that doesn't fly, this will introduce undefined behaviour.
- Inheritance is not good when we have behaviour change.
- Using Flyable interface is not the optimal solution because:
  - It minimizes the code usability (Re-usability)
  - Make the behaviour implementation repeating (fly() in each class) because interface doesn't implement behaviour
  
- The solution is to "encapsulate what varies".
  - take the common behaviour and put it in a separate class
  - Favor delegation over inheritance

- Code to an interface (Different from using interface)