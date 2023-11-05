/*
* SEE THIS CODE IS HARD TO READ AND UNDERSTAND
* SO ALWAYS USE PROPER INDENTATION TO UNDERSTAND THE FLOW OF THE CODE
*/

public class StatementsWhiteSpaceAndIndenting {
public static void main(String[] args) {
/*
*In Java a statement is a single unit of work which might or might immediately return a result like method definition, if-else statements etc.
* Mostly all statement in Java ends with an ";". That tells Java compiler that a statement has ended.
* Now a statement can be in one line or multiple lines
* Here are few of the examples.
*
*/

int var = 5;
// var = 5 this is an expression
// int var = 5 ; this is a statement with data type and ;

var ++;
var --;

System.out.println("This is one line statement");

System.out.println("This is multiple line statement " +
"this is the second line " +
"this is the third line " +
"and so on..... ");


/*
 * THE BELOW CODE IS HARD TO READ AND UNDERSTAND
 * SO ALWAYS USE PROPER INDENTATION AND WHITESPACE IN CODE TO BETTER UNDERSTAND THE FLOW OF THE CODE
 */
int myVar = 100; myVar = myVar * (100 + ((myVar*1000)/ (myVar + 99))); if(myVar >= 0) {System.out.println("The value of myVar " + myVar);}
}
}
