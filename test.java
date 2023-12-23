import java.util.*;

public class rev{
    public static void main(String args[]){
        int i= 10899;
        while (i > 0) {
           
            int lastdigit = i%10;
            System.out.print(lastdigit);
            i=i/10;
        }
        
        System.out.println();
    }
}
