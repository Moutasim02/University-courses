# Chapter 5

Created by: Moutasim EL Ayoubi
Mail: moutasim9997@gmail.com

Imagine you want to print a statement multiple times in java, for the sake of redundancy and messy code we use something called a loop...

```java
// Redundant method
System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");

//This method can lead to unreadable & uneffiecient way way of coding
```

Thus, we use something called loops... We have multiple ways of writing loops, firstly we will start with the **while loop**.

```java
int count = 0;
        while (count < 5) { //beginning of the loop and it's condition before executing
        System.out.println("Welcome to Java"); //statement to be executed
        count++; //incrementing the value of the variable used in the condition
        }
```

The second type of loops is called **do while loop,** The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

```java
do {
        // code block to be executed
        }
        while (condition);

//here is an example
        do {
        System.out.println(i);
        i++;
        }
        while (i < 5);
```

The third type is called **for loop,** When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

```java
for (statement 1; statement 2; statement 3) {
        // code block to be executed
        }
```

- Statement 1 is executed (one time) before the execution of the code block.
- Statement 2 defines the condition for executing the code block.
- Statement 3 is executed (every time) after the code block has been executed.

Here is an example:

```java

for (int i = 0; i < 5; i++) {
        System.out.println(i);
        }
```

- Statement 1 sets a variable before the loop starts (int i = 0).
- Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.
- Statement 3 increases a value (i++) each time the code block in the loop has been executed.

Done for the types for now...

Let us talk about two keywords that will be helpful to know and use in your next programming project, break and continue keywords...

The **break** statement can also be used to jump out of a loop.

```java
for (int i = 0; i < 10; i++) {
        if (i == 4) {
        break; //here it will stop the loop when i is equal to 4
        }
        System.out.println(i);
        } 
```

The **continue** statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

```java
for (int i = 0; i < 10; i++) {
        if (i == 4) {
        continue; //This example skips the value of 4
        }
        System.out.println(i);
        }
```