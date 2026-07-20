public class Main {
    public static void main(String[] args) {

        int[] numbers = {15,8,45,23,91,30};

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest = " + max);
    }
}