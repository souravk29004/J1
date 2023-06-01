import javax.swing.JOptionPane;

public class ifStat {

   public static void main(String[] args) {
    

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        


        
        if (age>=21){

            JOptionPane.showMessageDialog(null, "Allowed");
        }

        else if(age>=18){
           
            JOptionPane.showMessageDialog(null, "Allowed but no alcohol");


        }


        else{

            JOptionPane.showMessageDialog(null, "Not allowed");
        }



    }


    
}
