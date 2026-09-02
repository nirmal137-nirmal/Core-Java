# Core Java

This repository contains practical examples and programs covering important **Core Java concepts**, **MySQL**, and **Docker**.

## 📚 Topics Covered

### 1. Array
- Array declaration and initialization
- One-dimensional Array
- Multi-dimensional Array
- Array traversal
- Searching and sorting

### 2. String
- String creation
- String methods
- String comparison
- String manipulation
- Immutable String

### 3. StringBuffer
- StringBuffer creation
- append()
- insert()
- replace()
- delete()
- reverse()

### 4. StringBuilder
- StringBuilder creation
- append()
- insert()
- replace()
- delete()
- reverse()

-----------------------------------------*-------------------------------------*---------------------------------------*

## 🔷 OOP (Object-Oriented Programming)

### 5. Class
- Class declaration
- Instance variables
- Methods
- Constructors

### 6. Object
- Object creation
- Accessing variables and methods
- Object initialization

### 7. Encapsulation
- Data hiding
- Private variables
- Getters and Setters

### 8. Inheritance
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance
- `extends` keyword

### 9. Abstraction
- Abstract Class
- Abstract Methods
- `abstract` keyword

### 10. Method Overriding
- Runtime Polymorphism
- Method overriding rules
- `@Override` annotation

---------------------------------------------------------------------------------------------------------------

## 🗄️ MySQL

- Database creation
- Table creation
- Insert data
- Update data
- Delete data
- Select queries
- Where clause
- Order By
- Group By
- Joins
- Primary Key
- Foreign Key

---------------------------------------------------------------------------------------------------------------------------

## ⚠️ Exception Handling

- Exception
- Error
- Try-Catch
- Finally
- Throw
- Throws
- Checked Exception
- Unchecked Exception
- Custom Exception

------------------------------------------------------------------------------------------------------------------------------

  ## 📦 Collection Framework

### Interfaces

#### List
- ArrayList
- LinkedList
- Vector
- Stack

#### Set
- HashSet
- LinkedHashSet
- TreeSet

#### Queue
- PriorityQueue
- Deque
- ArrayDeque

#### Map
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---------------------------------------------------------------------------------------------------------------------------


#### Iterator and Enumeration

##### Iterator

Iterator is used to traverse elements of a collection one by one.

Methods:

#### hasNext() – Checks if another element exists.
#### next() – Returns the next element.
#### remove() – Removes the current element.

#### Enumeration

Enumeration is a legacy interface used mainly with Vector and Hashtable.

Methods:

#### hasMoreElements() – Checks if more elements exist.
#### nextElement() – Returns the next element.

---------------------------------------------------------------------------------------------------------------------------------

# Comparable and Comparator in Java

## 🔄 Comparable vs Comparator

- **Comparable Interface** → `java.lang` package
- **Method** → `compareTo()`
- `compareTo()` is an **abstract method** of the `Comparable` interface.
- The class implements `Comparable<T>`.
- Used for **natural/default sorting**.
- Generally used to define sorting based on the object's **primary/default attribute**.
- The sorting logic is defined **inside the class itself**.

Java provides two interfaces to sort objects based on different criteria:

- **Comparable** → Natural/default sorting
- **Comparator** → Custom sorting
- **Comparator Interface** → `java.util` package
- **Method** → `compare()`
- Used for **custom sorting**.
- We can sort objects based on **any attribute/field**, such as:
  - `id`
  - `name`
  - `age`
  - `salary`
  - `price`
- Multiple sorting criteria can be created for the same class.

------------------------------------------------------------------------------------------------------------------------------

## 📦 Wrapper Class in Java

A **Wrapper Class** in Java converts primitive data types into objects.

### 🔹 Primitive Types and Wrapper Classes

| Primitive | Wrapper Class |
|---|---|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

-------------------------------------------------------------------------------------------------------------------------------
## 📥📤 I/O (Input/Output) in Java

**I/O (Input/Output)** in Java is used to read data from an input source and write data to an output destination.

### 🔹 Types of I/O

1. **Input** → Reading data into the program.
2. **Output** → Sending data from the program to another destination.

### 🔹 Java I/O Packages

| Package | Purpose |
|---|---|
| `java.io` | File and stream-based I/O |
| `java.nio` | Modern and efficient I/O operations |

### 🔹 Common I/O Classes

| Class | Use |
|---|---|
| `File` | Represents a file or directory |
| `FileInputStream` | Reads byte data from a file |
| `FileOutputStream` | Writes byte data to a file |
| `FileReader` | Reads character data |
| `FileWriter` | Writes character data |
| `BufferedReader` | Reads text efficiently |
| `BufferedWriter` | Writes text efficiently |
| `PrintWriter` | Writes formatted text |
| `InputStream` | Base class for byte input |
| `OutputStream` | Base class for byte output |
| `Reader` | Base class for character input |
| `Writer` | Base class for character output |

----------------------------------------------------------------------------------------------------------------------------------

#### Java Stream API

The Stream API was introduced in Java 8 to process collections of objects in a clean, readable, and functional-style way. It is mainly used to perform operations such as filtering, sorting, mapping, searching, and collecting data.

## Key Features
Process data from Collections, Lists, Sets, Arrays, etc.
Supports functional-style programming.
Makes data processing concise and readable.
Supports operations like filter(), map(), sorted(), forEach(), and collect().
Stream does not store data; it processes data from a source.
Streams can be used for sequential as well as parallel processing.


## Basic Stream Flow

Source → Intermediate Operations → Terminal Operation

----------------------------------------------------------------------------------------------------------------------------------

# Java I/O (Input/Output)
📌 Overview

# This project demonstrates the concept of Java I/O (Input/Output) operations.

#  Java I/O is used to read data from input sources and write data to output destinations such as files, console, and other streams.

📂 Concepts Covered
File Handling
FileInputStream
FileOutputStream
FileReader
FileWriter
BufferedReader
BufferedWriter
Reading Files
Writing Files
Creating Files
💻 Technologies Used
Java
Java I/O Package
Eclipse IDE
📦 Important Packages
import java.io.*;
🔑 Common Classes
Class	Description

File	: Represents a file or directory,

FileInputStream : 	Reads byte data from a file,

FileOutputStream	: Writes byte data to a file,

FileReader	: Reads character data,

FileWriter :	Writes character data,

BufferedReader	: Reads text efficiently,

BufferedWriter : Writes text efficiently

---------------------------------------------------------------------------------------------------------------------------------------------------



