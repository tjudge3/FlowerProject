
In Java and many other languages,  it is possible to have a method call itself. This functionality is known as recursion. 

Please study the module on Recursion in Canvas in preparation for this assignment. 

The main thing to remember is the two main requirements of a recursive function:

A Stop Condition – the function returns a value when a certain condition is satisfied, without a further recursive call
The Recursive Call – the function calls itself with an input which is a step closer to the stop condition
Exercise 1: 

For this exercise, you will create several recursive functions in order to get a better understanding of how recursion works.  In exercise 2, we will illustrate using recursion for creating art.  
Create a new project in IntelliJ called Recursion.  Add a new Java class called Recursion with a public static main function.   You will add several functions to your Recursion class as follows:

1  Write a recursive function int sum(int n) that adds up the numbers from n to 1 and print your result.   For example from main do the following: 
        Recursion recursion = new Recursion();
        System.out.println(recursion.sum(6));
  1.2 Write a recursive function factorial(int n) that calculates the factorial of n.  Print out the results.  Add your function to your Recursion class. 

  1.3.   Write a recursive function powerOf10(int n) that calculates 10n.  

  1.4.  Write a more general recursive function powerOfN(int x, int p)  that calculates the power of xp.  Do not use the Math.pow function.  

1.5.  Write a function int bunnyEars(int n) that calculates the number of bunny ears for n bunnies.  Bunnies have two ears.   

Exercise 2: 

This exercise will illustrate generating art with a recursive graphics method.   You will not need to write code for this program but you will need to learn to include a new library into the IntelliJ.   Here are the steps:

Create a new project in IntelliJ called Flower.  Then add a new class to your src directory called Flower.   
Replace the Flower class template in IDEA by downloading a completed Flower.java class file Download Flower.java class file.  Copy and paste the Flower.java file into the template. 
To run and test this class, you will need to add a new library to IDEA.  Here is the procedure: 
Select the root of your Flowers project in the Project tab.   Right click and select New then Directory.  Create a new directory called lib.   This will be above your src directory.  
Download stdlib-101.jar  Download stdlib-101.jarto your computer.  Then drag the stdlib.jar file to the lib directory.  
Press Control-Alt-Shift S to go to the Project Structure screen in IntelliJ.   Click the left plus sign under libraries.  Navigate to your Recursion\lib directory, e.g. C:\Users\<your user name>\IdeaProjects\Recursion\lib, and press OK.  
Comment out the line at top of the file:  "import sedgewick.StdDraw;" 
The compile errors in Flower.java should go away.   
If you still get class not found errors,  try right mouse-clicking on the class.  IntelliJ may prompt you to import the class and the error will clear.  You can do that with each missing class error.  Alt-Enter on the class error will do the same thing.   
Run and Test your program.  
Please submit your .java file and the output  Good luck!
Extra Credit Challenge:  Modify the flower graphic by changing the code. 
