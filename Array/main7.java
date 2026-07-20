public class  main7 {
    public static void main(String[] args) {

        int[] marks = {80,90,70,60,100};

        int sum = 0;

        for(int mark : marks) {
            sum += mark;
        }

        double average = (double)sum / marks.length;

        System.out.println("Average = " + average);
    }
}