import java.util.Scanner;

public class trois {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        Integer age = scanner.nextInt();
        scanner.nextLine();//to clear \n from scanner

        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("hello "+ name);
        System.out.println("Your are "+ age+ " year old.");
        System.out.println("your favourite food is "+ food);






    }

}