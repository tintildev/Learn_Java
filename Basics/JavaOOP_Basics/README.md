# Java OOP and Streams Practice

This small project contains two practice exercises to refresh key Java concepts:
- Object-Oriented Programming (OOP)
- Java Streams API

The project is part of my preparation for applying to a Java developer position.

## 🚗 Exercise 1: Inheritance and Polymorphism

### Description

This exercise demonstrates the use of **inheritance**, **abstract classes**, and **polymorphism**.

### Structure

- Abstract class `Fahrzeug` (Vehicle):
    - Attribute: `geschwindigkeit` (speed)
    - Abstract method: `fahren()` (drive)

- Derived classes:
    - `PKW` (car) implements `fahren()`
    - `Motorrad` (motorcycle) implements `fahren()`

### Goal

- Create an array or list of `Fahrzeug` objects (mix of `PKW` and `Motorrad`)
- Call `fahren()` on each object → shows **polymorphic behavior**

---

## 🔢 Exercise 2: Java Streams

### Description

This exercise demonstrates the use of the **Java Streams API** to process a list of integers.

### Given List

```java
List<Integer> zahlen = Arrays.asList(3, 5, 7, 8, 9, 10, 13, 14, 15);
