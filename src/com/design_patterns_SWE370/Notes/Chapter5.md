## Design patterns example

- Duck example: when adding fly() at super class, we might have extended a duck that doesn't fly, this will introduce undefined behaviour.
- Inheritance is not good when we have behaviour change.
- Using Flyable interface is not the optimal solution because:
    - It minimizes the code usability (Re-usability)
    - Make the behaviour implementation repeating (fly() in each class) because interface doesn't implement behaviour

### Encapsulate what varies
- The solution is to "encapsulate what varies".
    - take the common behaviour and put it in a separate class
    - Favor delegation over inheritance (Apply Delegation)

### Code to an interface
- Code to an interface (Different from using interface): multiple classes implementing the same interface that defines a certain behaviour.
- Classes that implement are different types of that behaviour, like flying is not the same for all ducks

### Final solution
- Interface with FlyBehaviour, implemented by FlyWithWings and FlyNoWay(Not flyable).

### Favoring delegation (composition over inheritance)
- Minimizes re-usability
- Resolves Tight coupling 
- Easier maintenance(flexible)
- Encapsulate similar behaviour
