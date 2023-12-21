/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int first_random = (int)(Math.random() * (b - a) + a);
        int second_random = (int)(Math.random() * (b - a) + a);
        int third_random = (int)(Math.random() * (b - a) + a);
        int minimal = Math.min(first_random, second_random);
        minimal = Math.min(minimal, third_random);
        System.out.println(first_random);
        System.out.println(second_random);
        System.out.println(third_random);
        System.out.println("The minimal generated number was " + minimal);
    }
}