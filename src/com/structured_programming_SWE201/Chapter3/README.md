# Chapter 3

Property: Moutasim EL Ayoubi
Tags: 0556170992

### **The boolean Type and Operators**

- used to say the condition is true or false
- often used with logical operators (ex: AND/ OR)

![https://1.bp.blogspot.com/-1eAEcNvnItI/XfUft1kH1nI/AAAAAAAAE0I/Z5QglYGGFW8AKZ7-XH1wAWpSRFoLu4_6QCLcBGAsYHQ/s1600/Screenshot%2B%2528453%2529.png](https://1.bp.blogspot.com/-1eAEcNvnItI/XfUft1kH1nI/AAAAAAAAE0I/Z5QglYGGFW8AKZ7-XH1wAWpSRFoLu4_6QCLcBGAsYHQ/s1600/Screenshot%2B%2528453%2529.png)

### **If Statements**

- Java if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not

```java
if(condition) 
{
   // Statements to execute if
   // condition is true
}
```

### **Working of if statement**

1. Control falls into the if block.
2. The flow jumps to Condition.
3. Condition is tested.
    1. If Condition yields true, go to Step 4.
    2. If Condition yields false, go to Step 5.
4. The if-block or the body inside the if is executed.
5. Flow steps out of the if block.

(You have to practice if and else statement your self)

We also have nested if-else statements that look like this (Please practice it more with the examples given):

```java
//assuming we have a variable (score) we can print out a letter 
//out of it for grading for example
if (score >= 90.0)
  System.out.print("A"); //make sure to close the if statement here with (;)
else if (score >= 80.0) {
  System.out.print("B")
} // or you can use curly braces instead
else if (score >= 70.0)
  System.out.print("C");
else if (score >= 60.0)
  System.out.print("D");
else
  System.out.print("F");
/* note that you can add curly braces to if else statement to include more
than one statement to execute */
```

### **Logical Operators**

Logical operators are used to determine the logic between variables or values:

[Untitled](https://www.notion.so/3096e0c14cb74bfb87cdcff73f60d6cf)

Please find truth tables of each operator online

### **Switch Statement:**

Use the switch statement to select one of many code blocks to be executed.

```java
int day = 4;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
```

### **Conditional Operator**

The Java Conditional Operator selects one of two expressions for evaluation, which is based on the value of the first operands. It is also called "ternary operator" because it takes three arguments.

expression1 ? expression2:expression3;

Example:

```java
public class condiop {
 public static void main(String[] args) {
  String out;
  int  a = 6, b = 12;
  out = a==b ? "Yes":"No"; //here is the ternary operator
  System.out.println("Ans: "+out);
 }
}
```

Example 2:

```java
(num % 2 == 0)? num + “is even” :
num + “is odd”);
```

That's it, Congratulations in finishing Chapter 3 Quick Review