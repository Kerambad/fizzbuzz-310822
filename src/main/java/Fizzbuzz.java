import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {


        String solution = fizzbuzz(input());

        print(solution);

        again();

    }
    public static String fizzbuzz(int number) {

        if ((number % 3) == 0 && (number % 5) == 0) {
            return "fizzbuzz";
        }
        else if ((number % 5) == 0) {
            return "buzz";
        }
        else if ((number % 3) == 0) {
            return "fizz";
        }
        else {

            return String.valueOf(number);
        }
    }

    public static void print(String input){
        System.out.println(input);
    }

    public static int input() {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter an int.");
            main(new String[]{"main" });
        }
        else {
            num = scanner.nextInt();
        }
        return num;


    }
    public static void again(){

        System.out.println("Run again? if yes enter y, for no type any key");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("y")) {
            main(new String[]{"main" });
        }
    }
}
