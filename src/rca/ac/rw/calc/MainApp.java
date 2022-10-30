package rca.ac.rw.calc;
import java.util.Scanner;
public class MainApp {
	public static void main(String args[]) {
		int sum,difference,quotient,product;
		System.out.println("Welcome To The Simple Mmathematics Calculator");
		String signs[] ={"+","-","*","/"};
		String signDescription[] = {"Addition","subtraction","Multiplication","Division"};;
		Scanner operand = new Scanner(System.in);
		System.out.println("Choose any of the following signs");
		for(String i:signs){
			System.out.println(i);	
			
			
		}
		String chosenOperand = operand.next();
		System.out.println("Enter The first nuber : ");
		int num1 = operand.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = operand.nextInt();
		switch(chosenOperand){
		case "+":
			sum=num1+num2;
			System.out.println("You have chosen the addition operation and the sum of" +num1 +" and " +num2 +" is " + sum);
			break;
		case "-":
			difference = num1-num2;
			System.out.println("You have chosen the difference sign and the difference of "+ num1 + " and " + num2+ " is "+ difference );
			break;
		case "*":
			product = num1*num2;
			System.out.println("You have chosen the multiplication sign and the product of "+num1+ " and "+ num2 + " is "+ product);
			break;
		case "/":
			quotient = num1/num2;
			System.out.println(" You have chosen the ddivision sign and the quotient of "+num1+" and "+ num2 +" is " +quotient);
			break;
		}
		
		
		
		
		

}}