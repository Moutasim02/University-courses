# Chapter 2

Created by: Moutasim EL Ayoubi
Mail: moutasim9997@gmail.com

### Integer Division

- +, -, *, /, and %
- 5 / 2 yields an integer 2.
- 5.0 / 2 yields a double value 2.5
- 5 % 2 yields 1 (the remainder of the division)

### Remainder Operator

- Remainder is very useful in programming. For example, an even number % 2 is always 0 and an odd number % 2 is always 1. So you can use this property to determine whether a number is even or odd. Suppose today is Saturday and you and your friends are going to meet in 10 days. What day is in 10 days? You can find that day is Tuesday using the following expression:

(6+10) % 7 = 2 (2nd day which is Monday)

### **Exponent Operations**

- Math.pow(x,y) returns double

### Number Literals

- Number Literals are the assigned value to the variable
- Integer literal numbers needs (L) or (l (L lowercase)) at the end to be denoted as long
- You can make a number a float by appending the letter f or F (Same for double (d or D))
- The double type values are more accurate than the float type values

### Evaluate an Expression

- PEMDAS is the method used in calculating multiple expressions: parentheses,
  exponents, multiplication, division, addition, and subtraction.
- Even though multiplication is listed before division, they are
  actually of the same priority.
- Even though addition is listed before subtraction, they are actually
  of the same priority.
- When deciding which of two operations of the same priority to do
  first, do them in left-to-right order.
- Problem: Converting Temperatures

  celsius = (5.0 / 9) * (fahrenheit – 32) //make sure to put 5.0 not 5 only

- Problem: Displaying Current Time
  - we will use currentTimeMillis method
  - returns the current time in milliseconds since the midnight, January 1, 1970 GMT

    ```java
    public class CurrentTime {
    
        public static void main(String[] args) {
            // Obtain the total milliseconds since midnight, Jan 1, 1970
            long totalMilliseconds = System.currentTimeMillis();
    
            // Obtain the total seconds since midnight, Jan 1, 1970
            long totalSeconds = totalMilliseconds / 1000; 
            System.out.println("Number of seconds " + totalSeconds);
    
            // Compute the current second in the minute in the hour
            long currentSecond = totalSeconds % 60;
    
            // Obtain the total minutes
            long totalMinutes = totalSeconds / 60;
    
            // Compute the current minute in the hour
            long currentMinute = totalMinutes % 60;
    
            // Obtain the total hours
            long totalHours = totalMinutes / 60;
    
            // Compute the current hour
            long currentHour = totalHours % 24;
            currentHour += 4;
    
            // Display results
            System.out.println("Current time in UAE is " + currentHour + ":"
                    + currentMinute + ":" + currentSecond);
        }
    }
    ```


### Increment and Decrement Operators

![https://www.wikitechy.com/tutorials/csharp/img/c-sharp-images/c-sharp-increment-decrement-operator.png](https://www.wikitechy.com/tutorials/csharp/img/c-sharp-images/c-sharp-increment-decrement-operator.png)

Increment operator: ++var_name; (or) var_name++;
Decrement operator: - -var_name; (or) var_name - -;

(You need to practice those by your own)

### Numeric Type Conversion Rules

- If one of the operands is double, the other is converted into double.
- Otherwise, if one of the operands is float, the other is converted into float.
- Otherwise, if one of the operands is long, the other is converted into long.
- Otherwise, both operands are converted into int.

### Type Casting

- Implicit casting
  - double d = 3; (type widening)
- Explicit casting
  - int i = (int)3.0; (type narrowing)
  - int i = (int)3.9; (Fraction part is truncated)