import java.util.Scanner;
public class aOn{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current temperature");
        Integer temp = scanner.nextInt();
       
    if (temp>30) {
        System.out.println("It is hot outside");
    }
    else if (temp>=20 && temp<=31){
        System.out.println("It's warm outside");

    }   
    else {
        System.out.println("It's cold outside");
    }
}

}
