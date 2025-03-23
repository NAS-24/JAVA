package Exercise;
/*You have to create a custom calculator with the following operations
  1.+-> Addition
  2.- -> Subtraction
  3.-> Multiplication
  4./ -> Division
 which throws the following exceptions:
#Invalid Input Exception (e.g., 8 & 9)
#Cannot Divide by 0 Exception
#Max Input Exception if any of the inputs is greater than 100000
#Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/



import java.util.Scanner;

class invalid extends Exception{
    @Override
    public String toString() {
        return "Invalid operation";
    }
}
class zeroDiv extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}
class Max_Input extends Exception{
    @Override
    public String toString() {
        return "Max Input Reached";
    }
}
class Max_Multi extends Exception{
    @Override
    public String toString() {
        return "Max Multiplier Reached";
    }
}

public class Exception_Calcu {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values");
        int operand1 = sc.nextInt();
        int operand2 = sc.nextInt();
        try {
            if (operand1 > 100000 || operand2 > 100000) {

                throw new Max_Input();

            }


            System.out.println("Enter the operation");
            choice = sc.next();

            switch (choice) {

                case "+":
                    System.out.println(operand1 + operand2);
                    break;

                case "-":
                    System.out.println(operand1 - operand2);
                    break;

                case "*":
                    if (operand1 > 7000 || operand2 > 7000) {

                        throw new Max_Multi();
                    }

                    System.out.println(operand1 * operand2);
                    break;

                case "/":
                    if (operand2 == 0) {

                        throw new zeroDiv();
                    }
                    System.out.println(operand1 / operand2);
                    break;

                default:
                    throw new invalid();

            }
        } catch (invalid | zeroDiv | Max_Input | Max_Multi e) {
            System.out.println(e.toString());
        }
    }
        }





