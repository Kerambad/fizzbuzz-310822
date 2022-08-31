public class Fizzbuzz {
    public static void main(String[] args) {

        int num = 5;
        String solution = fizzbuzz(num);
        print(solution);

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
            String s = String.valueOf(number);
            return s;
        }
    }

    public static void print(String input){
        System.out.println(input);
    }
}
