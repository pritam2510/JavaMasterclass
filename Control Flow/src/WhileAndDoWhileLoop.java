public class WhileAndDoWhileLoop {
    public static void main(String[] args) {
        //WHILE LOOP
        /*
         * So for loop is one type of control flow keyword which is used to loop through a given statement or code block
         * The loop wil continue to repeat the process as long as a given condition is true and will stop as soon as the condition is false
         *
         * THE SYNTAX:
         *   int loopControl = 1; //Initialization
         *   while ( loopControl <= 10) { //Assessment of the condition
         *       System.out.println(loopControl);
         *       loopControl++ // Change the value of the loop
         *   }
         * int loopControl = 1; ==> This is the initialization step. This will be executed only once at the start of the for loop
         *
         * loopControl <= 10; ==> This is the condition which is checked everytime the code loops and if this is false the code stops, else it continues.
         *
         * loopControl++ ==> This is the step where we make change to the loopControl value, because we miss this step then the condition would never be false, and it will make an infinite loop. So this will execute everytime the code block is executed.
         *
         *
         *
         * while loops are generally used when we have no idea about the number iteration that is going to take place, i.e. we only have a condition which when results in false we stop the looping
         *
         * */

        System.out.println("\nUsing FOR loop");
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nUsing WHILE loop");
        int j = 0;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n WHILE loop concept using FOR loop syntax");
        int k = 0;
        for (; k <= 5; ) {
            System.out.print(k + " ");
            k++;
        }


        //WHILE LOOP
        /*
         * So for loop is one type of control flow keyword which is used to loop through a given statement or code block
         * The loop wil continue to repeat the process as long as a given condition is true and will stop as soon as the condition is false
         *
         * THE SYNTAX:
         *   int loopControl = 1;   //Initialization
         *   do {
         *       System.out.println(loopControl);
         *       loopControl++  // Change the value of the loop
         *   }while ( loopControl <= 10);    //Assessment of the condition
         *
         *
         * int loopControl = 1; ==> This is the initialization step. This will be executed only once at the start of the for loop
         *
         * loopControl <= 10; ==> This is the condition which is checked everytime the code loops and if this is false the code stops, else it continues.
         *
         * loopControl++ ==> This is the step where we make change to the loopControl value, because we miss this step then the condition would never be false, and it will make an infinite loop. So this will execute everytime the code block is executed.
         *
         *
         *
         * do-while loop exactly similar to while loop, except that do-while loop while always execute the code block at least once irrespective of the condition being true or false.
         * Because as we see in the syntax "do" keyword is followed by the code block to be executed and so that is executed first and only after
         * that we check the condition.
         * So even if the condition is false right from the beginning the do-while will still execute once whereas a while or for loop while never execute
         *
         *
         * */


        System.out.println("\nUsing DO-WHILE loop");
        int l = 0;
        do {
            System.out.print(l + " ");
            l++;
        } while (l <= 5);

        System.out.println("\nHow DO-WHILE loop executes at least once even if the condition is false, \nbut WHILE and FOR loop will not execute if the condition is false at the starting");
        do {
            System.out.print("\nI will execute at least 1 time, since I am DO_WHILE loop");
        } while (false);

        while (l < 0) {
            System.out.print("I will never execute, since I am WHILE loop");
        }

        for (; l < 0; ) {
            System.out.print("I will never execute, since I am FOR loop");
        }

        //BREAK AND CONTINUE
        /*
         * Break and continue are 2 important keywords in Java control flow
         * "break" is a keyword that is used to break the program execution control out of the current code block and into the parent code block.
         * So as soon as java encounters a break it stops execution in the current block ignoring all the other code and jumps out to parent block.
         * "break" is used with loops, switches, if-else and any other place where explicitly want to alter the execution flow
         *
         *
         * "continue" is a keyword used by loop statements.
         * so when java compiler encounters a "continue" in a loop, it will stop executing the current iteration (i.e. all the code followed by "continue") and start the next iteration.
         * "continue" will all the loop to continue to the next iteration whereas a "break" stops the loop all together.
         *
         *
         * */



        System.out.println("\nUsing CONTINUE loop");
        int number = 0;
        while ((number < 100)) {
            number += 5;
            if (number % 15 == 0) {
                continue;
            }
            if (number == 50) {
                break;
            }
            System.out.println(number);
        }
    }
}





































































































