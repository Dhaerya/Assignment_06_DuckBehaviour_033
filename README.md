# Assignment_06_DuckBehaviour_033
# Duck Behavior Simulation - Strategy Design Pattern

## Description
This Java program demonstrates the **Strategy Design Pattern** by implementing different flying and swimming behaviors for various types of ducks. The program allows each duck to have interchangeable behaviors for flying and swimming, making it flexible and reusable.

## Features
- Implements **encapsulated behaviors** for **flying and swimming**.
- Ducks can **change their behavior dynamically**.
- Uses **interfaces** (`FlyBehavior` and `SwimBehavior`) to allow different implementations.
- Demonstrates **polymorphism** by treating all ducks as a common superclass (`Duck`).

## Class Overview
### 1. Behavior Interfaces
- `FlyBehavior` - Interface for flying behavior.
- `SwimBehavior` - Interface for swimming behavior.

### 2. Flying Behavior Implementations
- `Fly` - Represents ducks that can fly.
- `NotFly` - Represents ducks that cannot fly.

### 3. Swimming Behavior Implementations
- `Swim` - Represents ducks that can swim.
- `FloatSwim` - Represents ducks that float on water.
- `Drown` - Represents ducks that drown in water.

### 4. Duck Class (Superclass)
- `Duck` (Abstract Class) - Holds references to `FlyBehavior` and `SwimBehavior`.
- Contains `performFly()` and `performSwim()` to delegate behaviors to respective objects.

### 5. Specific Duck Implementations
- `MallardDuck` - A duck that flies and swims.
- `RedheadDuck` - A duck that flies and swims.
- `RubberDuck` - A duck that floats but cannot fly.
- `DecoyDuck` - A duck that drowns and cannot fly.

### 6. Main Execution
- The `Main.java` class creates instances of all ducks and calls their methods to show their behaviors.

## How to Run the Program
1. Ensure all `.java` files are in the same directory.
2. Open the terminal or command prompt in the project directory.
3. Compile all files using:
   ```sh
   javac *.java
   ```
4. Run the program:
   ```sh
   java Main
   ```
5. Observe the output displaying each duck's behavior.

## Expected Output
```
I am a Mallard Duck.
This duck can fly.
This duck swims in water.

I am a Redhead Duck.
This duck can fly.
This duck swims in water.

I am a Rubber Duck.
This duck cannot fly.
This duck floats on water.

I am a Decoy Duck.
This duck cannot fly.
This duck drowns in water.
```

## UML Class Diagram
A UML class diagram should be included in the project, showing relationships between classes and interfaces.

## Conclusion
This program effectively demonstrates the **Strategy Pattern**, making it easy to extend with new behaviors without modifying existing code. By encapsulating behaviors, ducks can change their actions dynamically, promoting reusability and maintainability.

---

**Author:** Dhaerya
**Batch:** A2  
**PRN:** 23070126033