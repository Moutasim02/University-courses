# Chapter 4

Created by: Moutasim EL Ayoubi
Mail: moutasim9997@gmail.com

### This chapter talks about Mathematical Functions, Characters, and Strings and it has too many methods to understand so please try to practice it yourself.

We have a class baked-in into java called (Math class) which is used for common mathematical functions.

There are two main categories used in the Math class:

- Class constants:
    - PI
    - E
- Class methods (like myMethod())
    - Trigonometric Methods
    - Exponent Methods
    - Rounding Methods
    - min, max, abs, and random Methods

### **Trigonometric Methods**

- sin(double a)
- cos(double a)
- tan(double a)
- acos(double a)
- asin(double a)
- atan(double a)

you can change degree results to radian too, for example: toRadians(90)

### **Exponent Methods**

- exp(double a)
    - Returns e raised to the power of a.
- log(double a)
    - Returns the natural logarithm of a.
- log10(double a)
    - Returns the 10-based logarithm of a.
- pow(double a, double b)
    - Returns a raised to the power of b.
- sqrt(double a)
    - Returns the square root of a.


### **Rounding Methods**

- double ceil(double x)
    - x rounded up to its nearest integer. This integer is returned as a double value.
- double floor(double x)
    - x is rounded down to its nearest integer. This integer is returned as a double value.
- double rint(double x)
    - x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double.
- int round(float x)
    - Return (int)Math.floor(x+0.5).
- long round(double x)
    - Return (long)Math.floor(x+0.5).

Some examples will help to understand the concept:

```java
Math.ceil(2.1) returns 3.0 
Math.ceil(2.0) returns 2.0
Math.ceil(-2.0) returns –2.0
Math.ceil(-2.1) returns -2.0
Math.floor(2.1) returns 2.0
Math.floor(2.0) returns 2.0
Math.floor(-2.0) returns –2.0
Math.floor(-2.1) returns -3.0
Math.rint(2.1) returns 2.0
Math.rint(2.0) returns 2.0
Math.rint(-2.0) returns –2.0
Math.rint(-2.1) returns -2.0
Math.rint(2.5) returns 2.0
Math.rint(-2.5) returns -2.0
Math.round(2.6f) returns 3 
Math.round(2.0) returns 2   
Math.round(-2.0f) returns -2   
Math.round(-2.6) returns -3  
```

### **min, max, and abs**

- max(a, b)and min(a, b)
    - Returns the maximum or minimum of two parameters.
- abs(a)
    - Returns the absolute value of the parameter.
- random()
    - Returns a random double value
      in the range [0.0, 1.0).
        - Please practice the random() method using your development environment to understand it more

Some use cases of the method is:

```java
(int) Math.random() * 10; //Returns a random integer between 0 and 9
50 + (int) (Math.random() * 50); //Returns a random integer between 50 and 99
```

### Character (char) Data Type

```java
char letter = 'A'; //ASCII    
char numChar = '4'; //ASCII
char letter = '\u0041'; //Unicode
char numChar = '\u0034'; //Unicode
```

- The increment and decrement operators can also be used on char variables to get the next or preceding Unicode character

Now I will list some important key-points that you need to understand how it works and how to implement in code (I suppose you already know how to implement it here)

### Commonly used ASCII codes:

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled.png)

### Escape Sequences for Special Characters

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%201.png)

### Comparing and Testing Characters

```java
if (ch >= 'A' && ch <= 'Z') 
  System.out.println(ch + " is an uppercase letter"); 
else if (ch >= 'a' && ch <= 'z') //notice the logical operators used too
  System.out.println(ch + " is a lowercase letter"); 
else if (ch >= '0' && ch <= '9') 
  System.out.println(ch + " is a numeric character"); 
```

### Methods in the Character Class

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%202.png)

### The String Type

Unlike char type, String can store more than one character

```java
char myFirstCharacter = 'M'; //only holds one character at a time
String myStringVar = "Hello, My name is moutasim"; //here you can write full statement
```

### Simple Methods for String Objects

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%203.png)

*I wish I can explain each one in detail, but the summary will look like a booklet*

### Comparing Strings

we use those to compare to strings, let us say usernames for example...

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%204.png)

### Obtain Sub-strings

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%205.png)

### Finding a character or substring in a string

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%206.png)

**`In my opinion, You do not need to memorize each one, but it will be helpful to know for later usage.`**

### Conversion between Strings and Numbers

```java
int intValue = Integer.parseInt(intString); //here we chaged normal int nub
double doubleValue = Double.parseDouble(doubleString);
```

### Formatting Strings

*Use the printf statement.*

`System.out.printf(format, items);`

The format is a string that may consist of substrings and format specifiers.

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%207.png)

![Untitled](Chapter%204%20c771028afb4a4f999525f2ae23ea368e/Untitled%208.png)