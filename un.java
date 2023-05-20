public class un {
    public static void main(String[] args) {

        float x = 3.977f;
        float y = 56.974f;
        float z = 498.6578f;

        //switch x=>z, y=>x, z=>y

        float temp = x;
        x=z;
        z=y;
        y=temp;


        

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    
    }
    
}
