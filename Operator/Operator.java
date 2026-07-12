public class Operator{
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition = " + (a + b));
        System.out.println("Greater? " + (a > b));
        System.out.println("Logical = " + (a > 5 && b < 5));

        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        a++;
        System.out.println("After Increment = " + a);
    }
}