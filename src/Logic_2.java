import java.util.Scanner;

public class Logic_2 {

    public static void main(String args[]){

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number");
        String numString = sc.next();
        Long numInt;
        try{
            numInt = Long.parseLong(numString);
        } catch (NumberFormatException e){
            System.out.println("Just integers are allowed ");
            return;
        }
        int sum = 0;
        char[] digits = numString.toCharArray();

        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(digits[i]);
        }
        System.out.println(sum);
    }
}
