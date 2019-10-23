package Epic1;

import javax.sound.sampled.Line;

public class variables_class {

	public static void main(String[] args) {
/*  *JAVA DATA TYPES: 
    * String - stores text, such as "Hello". String values are surrounded by double quotes (String myText = "Hello";) 
    * int - stores integers (whole numbers), without decimals, such as 123 or -123 (int myNum = 5;)
    * double - stores fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d"
    * float - stores floating point numbers, with decimals, such as 19.99 or -19.99 (float myFloatNum = 5.99f;)
    * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes (char myLetter = 'D';)
    * boolean - stores values with two states: true or false (boolean myBool = true;)  */

		//int[] int_array = {23,39,4};
		
		//double[] double_array = {23.0,39,1.4};
		
		/*String[] string_array = {"one","two","three"};
		System.out.println(string_array[1]);
		
		string_array[2] = "five";
		System.out.println(string_array[2]);*/
		
		// lets quickly talk about print vs. println
		/*System.out.println("one"); starts a new line
		System.out.print("two"); continues to print on the same line
		System.out.println("three");
		System.out.println("four");*/
		
		/*OPERATORS: 
		 * Addition: + adds two values together (x + y)
		 * Subtraction: - subtracts one value from another (x - y)
		 * multiplication: * multiplies two values (x * y)
		 * division: / divides one value from another (x / y)
		 * modulus: % returns the division remainder (x % y)
		 * increment: ++ increases the value of a variable by 1 (++x)
		 * decrement: -- decreases the value of a variable by 1 (--x)
		 */
		
		/*int y = 1 + 3; 
		System.out.println("result = " + y);
		
		int result_of_result = y;
		System.out.println(result_of_result);
		
		System.out.println(y - 1);*/
		
		/*int x = 10;
		int multi = x * 5;
		System.out.println(multi);
		
		int div = x / 5;
		System.out.println(div);
		
	    x = x % 3;    // the remainder of (4 % 3) = 1
	    System.out.println("4 % 3 = " + x);
	    
	    int y = 5;
	    int z = 2;
	    System.out.println(y % z);
		
		int x = 2;
		x++;
		System.out.println(x);
		
		int y = 5;
		y--;
		System.out.println(y);*/
		
		/*ASSIGNMENTS:
		 * Operator  Example  Same As
		 * =          x=5       x=5
		 
		 * +=         x+=3      x = x+3
		 int x = 5;
		 x +=3;
		 System.out.println(x);
		 
		 * -=         x-=3      x = x-3
		 int x = 5;
		 x -=3;
		 System.out.println(x);
		 
		 * *=         x*=3      x = x*3
		 int x = 5;
		 x *=3;
		 System.out.println(x);
		 
		 * /=          x/=3     x = x/3
		 double x = 5;
		 x /=3;
		 System.out.println(x); //what would I write if I wanted this value to be rounded to the tenth place/two decimal places? 
		 
		 * %=          x%=3     x = x%3
		 int x = 5;
		 x %=3;
		 System.out.println(x);
		 
		 * &=          x&=3     x = x&3
		 */
		 
		 
		 /*BOOLEAN: Often in programming you need a data type that can only have one of two values, like: Yes/No; On/Off; True/False
		   For this Java has Boolean which can take the values true or false.	
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);*/
		
		/* BOOLEAN EXPRESSION: is a java expression that returns a Boolean value of true or false. 
		   One can use a comparison operator, such as the greater than (>) operator to find out if an expression or a variable is true:
		
		int x = 10;
		int y = 9;
		int z = 10;
		z = 20;
		boolean variable = x==z;
		System.out.println(x>y); //returns true because 10 is greater than 9. 
		System.out.println(10>9); //returns true because 10 is greater than 9. 
		System.out.println(x<y); //returns false because 10 is not less than 9. 
		System.out.println(x==10); //returns true because x is equal to 10. 
		System.out.println(x==15); //returns false because x is not equal to 15.
		System.out.println(variable);*/
		 
		 
		/* JAVA IF...ELSE
		Java supports the usual logical conditions from mathematics:
		 * Less than: a < b
		 * Less than or equal to: a <= b
		 * Greater than: a > b
		 * Greater than or equal to: a >= b
		 * Equal to a == b
		 * Not Equal to: a != b
		
		Java has the following conditional statements:
		 * Use if to specify a block of code to be executed, if a specified condition is true
		if (20>18) {
			 System.out.println("20 is greater than 18");
			 }
		
		int x = 20;
		int y = 18;
		if(x>y) {
			System.out.println("X is greater than Y");
		} */
		 
	/*	 * Use else to specify a block of code to be executed, if the same condition is false
		int time = 20;
		if(time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		} 
		
		int time = 20;
		if(time > 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening.");
		} 
		
		*/
		 	
	/*	 * Use else if to specify a new condition to test, if the first condition is false
		int time = 22;
		if(time < 10){
			System.out.println("Good morning");
		}else if (time < 20){
			System.out.println("Good day");
		}else {
			System.out.println("Good evening");
		}  
		
		int timeofDay = 22;
		if(timeofDay >= 10){
			System.out.println("Good morning");
		}else if (timeofDay > 20){
			System.out.println("Good day");
		}else {
			System.out.println("Good evening");
		}  */
		
		
	/*	 * Use switch to specify many alternative blocks of code to be executed (use switch statement to select one of many code blocks to be executed.)  
	 	 * The switch expression is evaluated once.
	 	 * The value of the expression is compared with the values of each case.
	 	 * If there is a match, the associated block of code is executed.
	 	 * The break and default keywords are optional*/
	 	 
		int dayofWeek = 3;
		switch (dayofWeek) {
		case 1:
			System.out.println("Monday");
			break;            //When Java reaches a "break" keyword it breaks out of the switch block. This stops the executing of more code and case testing inside the block.   
		case 2:              // When a match is found, and the job is done, it's time for a break. There is no need for more testing.  
			System.out.println("Tuesday"); // A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block. 
			break;
		case 3:
			System.out.println("Wednesday"); //Question: Not able to understand what happens if I don't put a break for a case? When I run the function it doesn't seem to fail. 
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Looking forward to the Weekend");
		}

		
		/*int month = 10;
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			System.out.println("we can do more than just print one thing in a case");
		int number = 32;

		if(number == 32) {
			System.out.println("sooooo cool");
		}else {
			System.out.println("cool");
		}
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			System.out.println("Yay! Halloween");
			int day = 31;
			if(day != 31) {
			System.out.println("Today is Halloween!");
		}else {
			System.out.println("Today is Not Halloween :(");	
		}
		break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("This is not a valid month");
			break;
		}  */
		 
		/*RATIONAL: < (less than) <= (less than or equal to) > (greater than) >= (greater than or equal to) == (equal to) != (not equal)
// lets practice

		int small_num = 10;
		int big_num = 100;
		int not_bigger_num = 100;
		int biggest_num = 101;

//100 = 100
		if(big_num == not_bigger_num)
			System.out.println("100 is equal to 100");

// 10 < 100 = true
		if(small_num < big_num)
			System.out.println("10 is less than 100");

// 100 <= 100 = true
		if(big_num <= not_bigger_num)
			System.out.println("100 is less than or equal to 100");

// 101 < 100 = false
		if(biggest_num < big_num) {
			System.out.println("101 is greater than 100");
			}else {
				System.out.println("101 is NOT less than 100");
			}

// 101 >= 100 = true
		if(biggest_num >= not_bigger_num)
			System.out.println("101 is greater than or equal to 100");  */

		
		/*	JAVA LOGICAL OPERATORS: Logical operators are used to determine the logic between variables or values:
		 *  Operator         Name              Description                                                         Example
		 *   &&              Logical and       Returns true if both statements are true                          x < 5 &&  x < 10 
	//Example 1	    
			int x = 5;
		    System.out.println(x>3 && x<10); //returns true because 5 is greater than 3 AND less than 10. 
		    
	//Example 2	    
		    int small_num = 10;
		    int big_num = 100;
		    int big_num_2 = 100;
		    int bigger_num = 101;
		    
		  //101 > 10 and 101 <= 1000
		    if(bigger_num > small_num && bigger_num < 1000) {
		    	System.out.println("101 is greater than 10 and 101 is less than 1000"); //101 is greater than 10 AND 101 is less than 1000. 
		    }
		    	    
		    
		 *   ||              Logical or        Returns true if one of the statements is true                     x < 5 || x < 4 
	//Example 3
		    int y = 5;
		    System.out.println(y > 3 || y < 4); //returns true because one of the conditions is true (5 is greater than 3, but 5 is not less then 4)
		    
    //Example 4
		 // 101 > 10 or 101 < 1000
		    if(bigger_num > small_num || bigger_num > 1000) {
		    System.out.println("101 is greater than 10 and 101 is less than 1000"); //101 is greater than 10, but 101 is not greater than 1000. 
		    }
		    
	//Example 5
		 // 101 > 10 or 101 >= 1000
		    if(bigger_num > small_num || bigger_num >= 1000) {
		    System.out.println("101 is greater than 10 and 101 is less than but not equal to 1000"); //only one of the statements is true. 
		    }
	   	    
		    
		 *   !               Logical not       Reverse the result, returns false if the result is true           !(x < 5 && x < 10)  
	 //Example 6
		    int z = 5;
		    System.out.println(!(z > 3 && z > 4)); //Returns false because ! (not) is used to reverse the result. In this case the statement is true which is why it's returning false. 
		*/
		
	/*	* WHILE LOOP: The WHILE LOOP loops through a block of code as long as a specified condition is true. 
			 int i = 0;
			 while(i<5) {
				 System.out.println(i);
				 i++;     //Important to increase the variable used in the condition, otherwise the loop will never end!
			 }
			 
			 int loop_num = 0;
			 while (loop_num < 6){
			 System.out.println("while - Hello World!");
			 loop_num++;
			 }  */
			  
	/*	 * FOR LOOP: When you know exactly how many times you want to loop through a block of code, 
	       use the FOR LOOP instead of a WHILE LOOP: 
		for (int i = 0; i < 5; i++) {  
//statement 1: is executed one time before the execution of the code block; statement 2: defines the condition for executing the code block; statement 3: is executed (every time) after the code block has been executed.
		      System.out.println(i); // This example will print numbers 0 to 4.
		      }
		
		for (int i = 0; i < 6; i++) {
			System.out.println("for - Hello World!");
			}  */ 
		
		
	     
	 
		    
		    
		    
	  
		    
		    
	 
				
	}
	
	}

	
		



