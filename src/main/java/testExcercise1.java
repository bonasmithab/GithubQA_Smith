import java.util.Scanner;

public class testExcercise1 {
    public static void main(String[] args) {
        //Addition, Subtraction, Multiplication, Division and remainder Calculation
        //        Create a simple Calculator that does:

        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("Enter two numbers for calculation: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double result;
        String c;

       // if(c == "+")
=======
        System.out.println("Enter two numbers for calculation and please give the math symbol: ");



        String c =input.nextLine();


        Double num1 =c.indexOf(0).
        double num2 = input.nextDouble();




        if(c.equals("+") ){
            System.out.println(num1 + num2);
        } else if (c.equals("-")) {
            System.out.println(num1-num2);

        } else if (c.equals("/")) {
            System.out.println(num1 / num2);

        } else if (c.equals("*")) {
            System.out.println(num1 * num2);

        }else if (c.equals("%")) {
            System.out.println(num1 % num2);
        } else {
            System.out.println("invalid symbol");
        }
>>>>>>> refs/remotes/origin/master


    }
}
