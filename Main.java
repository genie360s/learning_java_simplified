public class Main {

    //declaring the main method
   public static void main (String[] args){
       //printing out 

       System.out.println("This is Java Basics");

       //declaring variables
       /**multiline comments */
       /**
        * types of variables
        string=== stores text (characters) within double quotes
        int === stores integers (whole numbers)
        float === stores floating numbers (decimals)
        char === stores single characters i.e 'b'
        boolean === stores a truth value (true / false)
        */

        //declaring a string variable

        String author = "Alex Mkwizu";

        System.out.println("The course author is " +author);

        //declaring an integer variable

        int a = 7 ;

        System.out.println("Our first integer variable is "+ a);

        //assigning a new variable to an existing variable

         a = 9 ;

        System.out.println("Our first reassigned integer variable a is "+ a);

        //declaring a constant (use the word "final")

        final int b = 10;

        System.out.println("Our first constant integer variable b is "+ b);

        //other variables

        float workerSalary = 1700.50f;
        char  workerGrade = 'A';
        boolean signedIn = true;

        System.out.println("Other Variables workersSalary "+workerSalary+" workerGrade "+workerGrade+" signedIn "+signedIn  );

        //declare multiple variables

        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println(x +y +z);

        //declaring one value to many 

        int r, s, t;

        r = s = t = 10;

        System.out.println(r +s +t);

        //declaring double variable

        double salaryPerWorker = 56700;

        System.out.println(salaryPerWorker);

        //java type casting (conversion form one primitive data type to another)
        // narrow and wide casting

        //widening casting

        int g = 10;

        System.out.println(g);

        double w = g;

        System.out.println(w);

        //vice versa is narrowing casting

        /**
         * divide /
         * multiply *
         * add +
         * minus -
         * remainder(modulus) %
         * ++ increment
         * -- decrement
         *  | BITWISE ADD
         * 
         * logical operators
         * || OR
         * && AND
         * ! NOT
         * 
         */

         //concatenation means joining two variables

         String firstName = "Alex" ;
         String lastName = "Mkwizu" ;

         System.out.println(firstName + lastName);

         //or
         String myName = firstName + lastName;

         System.out.println(myName);

         //or concat()

         System.out.println(firstName.concat(lastName));

         //string methods

         // stringvariable.length()

         System.out.println("the length of the string is "+ myName.length());

         // stringvariable.toUpperCase

         System.out.println(myName.toUpperCase());

         //stringvariable.toLowerCase

         System.out.println(myName.toLowerCase());

         //backslash to add special characters

         /**
          * \\
          * \'
          * \"
          */

          /**
           * escape sequences
           * \n new line
           * \r carriage return
           * \t tab
           * \b backspace
           * \f form feed
           */

           //math methods

           Math.max(a, b);

           Math.min(a, b);

           Math.sqrt(a);

           Math.abs(-4.7);

        //Math.random(); returns a number btn 0.0 and 1.0

           //boolean expressions i.e  a>b >, <, ==, <=, =>

           System.out.println(a>b);


        //conditions

        /**
         * if statement
         * if (condition) {
         * block of code to be executed if the condition is true}
         */

         if (20 > 10){
             System.out.println("20 is greater than 7");
         }

         //the else statement is to be executed if the condition is false

        //  if (9 > 30){
        //      System.out.println("20 is greater than 30");
        //  } else {
        //      System.out.println("20 is less than 30");
        //  }

         //else if statement is to specify new condition if the firtst condition is false

         int age = 17;

         if (age > 18){
             System.out.println("This is an Adult");
         } else if (age < 18){
             System.out.println("This is a Child");
         } else {
             System.out.println("Age is unspecified");
         }

         //shorthand of If..Else (ternary Operator)
         // variable = (condition) ? expressionTrue : expressionFalse i.e

         int myAge = 17;

         String result = (myAge<18) ? "This is a child" : "This is an adult";
         System.out.println(result);

         //switch statements are used to select one out of many of code blocks

         //example creating a simple chatbot for now we shall assume  a fixed value.

         int value = 0 ;

         switch (value){
             case 1:
             System.out.println("You chose Swahili");
             break;

             case 2:
             System.out.println("You chose English");
             break;

             case 3:
             System.out.println("You chose French");
             break;

             case 4:
             System.out.println("You chose Spanish");
             break;

             default:
             System.out.println("No language chosen");
             
         }

         //while loop-- executes a block of code as the condition is met

         int height = 0;

         while (height < 9){
             System.out.println("child a child");
             height++;
         }

         //do while loop -- does the block once , then checks the condition

         int heights = 0;

         do {
             System.out.println("Printing do While Loop");
             heights++;
         }

         while (heights < 4);


         //for loop-- when you wan't to loop for an exact number of times
         /***
          * for (statement 1; statement 2; statement 3) {
              //code block to be executed
              1.executed once before execution of the code block(sets variable)
              2.defines the condition of the code block(defines the condition)
              3.executed everytime after the codeblock has been executed(increases / decreases)
          }
          */

          for (int status = 0; status < 6; status++){
              System.out.println(status);
          }

          //for-each-loop for arrays
          //note array is also a secondary data type

          String[] fruits = {"Mangoes", "Tomatoes", "Apples"};
          for (String fruitType : fruits) {
              System.out.println("fruitType is " + fruitType);
          }

          /**break & continue  
           * break is used to  break a loop
           * continue is used to continue a loop
          */

          for (int j= 0; j<7 ; j++){
              if(j==4){
                  break;
              }
              System.out.println(j);
              if(j==4){
                  continue;
              }
              System.out.println(j);
              
          }

          //for a while loop

          int bean = 0;
            while(bean<9){
                bean++;
                if (bean==5){
                    continue;
                }
                System.out.println(bean);
                
            }

            //arrays explained

            //declaration of arrays

            String[] names = {"Alex","John","Lily","Edgar"};

            System.out.println(names[0]);

            //arrays loop
            /**
             * for (typevariable : arrayname){
             *  }
             */

             for (String v: names){
                 System.out.println(v);
             }

             //multidimensional arrays

             //declaration

             int[][] mySets = {{1,2,3},{4,5,6}};

             for (int k = 0; k < mySets.length; ++k){
                 for (int m = 0; m < mySets[k].length; ++m){
                     System.out.println(mySets[k][m]);
                 }
             }




        









   }
}
