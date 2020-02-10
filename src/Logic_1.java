import java.util.Scanner;

public class Logic_1 {
    public static void main(String args[]){

        String input;
        int numInt = -1;

        Scanner sc = new Scanner((System.in));

        do{
            System.out.println("Enter an integer: ");
            input = sc.next();
            try {
                numInt = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Just intergers allowed ");
                break;
            }

            if (input.contains("5") && numInt % 3 == 0){
                System.out.println("CiraDinha");
            }
            else if(numInt % 3 == 0){
                System.out.println("Cira");
            }
            else if(input.contains("5")){
                System.out.println("Dinha");
            }
            else{
                System.out.println("Inserted number does not contains 5 and its not divisible by 3.");
            }
        } while (numInt != 0);
    }
}
