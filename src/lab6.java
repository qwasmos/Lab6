import java.util.Scanner;


public class lab6 {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int conditional = 0;
        System.out.println("Enter a number ");
        num1 = scnr.nextInt();
        System.out.println("Enter a number ");
        num2 = scnr.nextInt();
        System.out.println("Enter 1 for addition or enter 2 for subtraction ");
        if(conditional == 1){
            System.out.println("Result: "+ num1+num2);
        }
        else if(conditional == 2) {
            System.out.println("Result: " + (num1 - num2));
        }
        else{
            System.out.println("Error, incorrect input ");
            }



    }
}
