import java.util.Scanner;
public class aOn{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current temperature");
        Integer temp = scanner.nextInt();
       
    if (temp>30) {
        System.out.println("It is hot outside");
    }
    else if (temp>=20 && temp<=30){
        System.out.println("It is warm outside");

    }   
    else {
        System.out.println("It is cold outside");
    }
}

}
