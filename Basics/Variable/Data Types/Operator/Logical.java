public class LogicalExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID); // true
        System.out.println(age < 18 || hasID);  // true
        System.out.println(!hasID);             // false
    }
}