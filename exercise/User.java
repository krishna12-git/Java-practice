import java.util.Scanner;

public class User{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Entr your age:");
        int age = sc.nextInt();

        System.out.println(name);
        System.out.println(age);


    }
}