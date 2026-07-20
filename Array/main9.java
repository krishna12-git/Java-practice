public class main9 {
    public static void main(String[] args) {

        int[] numbers = {15,8,45,23,91,30};

        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++) {

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest = " + min);
    }
}