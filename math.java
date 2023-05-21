import java.util.Scanner;

public class math {

    public static void main(String[] args) {
        
        //x= sqrt (y*y + z*z)

        Scanner scanner = new Scanner(System.in);



        System.out.println("input side 1");
        double y = scanner.nextDouble();

        System.out.println("input side 2");
        double z = scanner.nextDouble();

        double x = Math.sqrt((z*z)+(y*y));


        System.out.println("hypotenuse is "+ x);

        scanner.close();

        
        

    }
    
}
