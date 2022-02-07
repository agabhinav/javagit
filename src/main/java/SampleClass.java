public class SampleClass {

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("hello");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("That's not a number.");
        } finally {
            System.out.println("Finally here!");
        }
    }
}
