# Java OOPs (Object-Oriented Programming) Concepts

---

## What is OOP?

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of **objects** and **classes**. It aims to implement real-world entities and simplify software development and maintenance.

### Real-World Analogy:

* **Object**: Like a Car (state: color, model; behavior: drive, brake)
* **Class**: Blueprint of the Car

---

## 🔑 Key Concepts of OOP in Java

### 1. **Object**

* **Definition**: Instance of a class.
* **Properties**: Has **state** and **behavior**.
* **Example**: A dog (name, breed) that can bark and eat.

### 2. **Class**

* **Definition**: Logical structure (blueprint) to create objects.
* **Does not consume memory** until an object is instantiated.

```java
class Car {
    String color;
    void drive() {
        System.out.println("Driving");
    }
}
```

---

### 3. **Inheritance**

* Allows a class (child) to **inherit** properties and behavior from another class (parent).
* **Promotes code reusability**.
* **Keyword**: `extends`

```
          Animal
            |
        ------------
        |          |
      Dog        Cat
```

---

### 4. **Polymorphism**

* One method can behave differently depending on context.
* **Types**:

  * Compile-time (Method Overloading)
  * Runtime (Method Overriding)

```java
class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Woof"); }
}
```

---

### 5. **Abstraction**

* Hiding internal details and showing only essential features.
* **Achieved using**:

  * `abstract` class
  * `interface`

```java
abstract class Phone {
    abstract void call();
}
class Android extends Phone {
    void call() { System.out.println("Calling..."); }
}
```

---

### 6. **Encapsulation**

* Wrapping data (variables) and code (methods) into a single unit (class).
* **Achieved using:**

  * Private variables
  * Public getters/setters

```java
class Employee {
    private int salary;
    public void setSalary(int s) { salary = s; }
    public int getSalary() { return salary; }
}
```

---

## 📚 Other Important OOP Terms

### ✅ Coupling

* Degree of knowledge one class has about another.
* **Loose coupling** is better (achievable using interfaces).

### ✅ Cohesion

* How closely related responsibilities of a class are.
* High cohesion = better design

### ✅ Association

* Relationship between classes (has-a relationship)
* Types:

  * One-to-One
  * One-to-Many
  * Many-to-One
  * Many-to-Many

### ✅ Aggregation

* **Has-a** relationship
* **Weak association** (child can exist independently)

```java
class Department {}
class University {
    Department dept; // aggregation
}
```

### ✅ Composition

* Stronger form of Aggregation
* **Child cannot exist** without the parent

```java
class Engine {}
class Car {
    Engine e = new Engine(); // composition
}
```

---

## 🎯 Advantages of OOP

1. **Improved maintainability**
2. **Code reusability** (Inheritance)
3. **Better modeling of real-world** scenarios
4. **Data hiding** (Encapsulation)

### 🔁 Comparison with Procedural Programming

| Feature     | OOP                  | POP (Procedural)       |
| ----------- | -------------------- | ---------------------- |
| Structure   | Objects & Classes    | Functions & Procedures |
| Data Access | Restricted (private) | Global                 |
| Modularity  | High                 | Low                    |
| Reusability | High (Inheritance)   | Limited                |

---

## 🎯 Java OOPs Example Code

```java
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class OOPs {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println("Dog name: " + dog.getName());
        dog.makeSound();

        System.out.println("Cat name: " + cat.getName());
        cat.makeSound();
    }
}
```

### Output:

```
Dog name: Buddy
Woof
Cat name: Whiskers
Meow
```

---

## 🚫 Object-Oriented vs Object-Based

| Feature     | Object-Oriented Language | Object-Based Language |
| ----------- | ------------------------ | --------------------- |
| Inheritance | Supported                | Not supported         |
| Example     | Java, C++                | JavaScript, VBScript  |

---

## 📌 Summary Diagram

```
          OOP
         / | \
   Class Object Inheritance
         |     |        \
    Encapsulation  Abstraction
         |             |
      Polymorphism  Association
                         |\
                    Aggregation Composition
```

---

### 📘 Quick Recap

* **Object** = instance of a class
* **Class** = blueprint for objects
* **Inheritance** = reuse code
* **Polymorphism** = same name, different behavior
* **Abstraction** = hide internal logic
* **Encapsulation** = bundle data & methods

> Practice these concepts with real-world examples like employees, vehicles, devices, and users to gain strong understanding!
