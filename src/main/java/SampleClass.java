public class SampleClass {

    public int add (int num1, int num2) {
        return num1 + num2;
    }

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
