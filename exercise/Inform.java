import java.util.Scanner;

public class Inform{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Entr your age:");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter your College:");
        String College = sc.nextLine();

        System.out.print("Enter your city:");
        String city = sc.nextLine();




        System.out.println(name);
        System.out.println(age);
         System.out.println(College);
        System.out.println(city);


    }
}