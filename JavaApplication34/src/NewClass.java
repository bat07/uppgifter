import javax.swing.*;
public class NewClass {
    
    public static void main(String [] str){
        String ord = JOptionPane.showInputDialog("ange ett lösenord");
        String ord_försök =JOptionPane.showInputDialog("ange ett lösenord");
        
        int l = ord.length()-1;
        System.out.println(l);
        char [] orddd = ord.toCharArray();
        
        while(l>=0){
            if( orddd[l]!=ord_försök.charAt(l))
               System.out.println("du har skrivit fel på plats "+l);
            
            l=l-1;
        }
        
        System.out.println(orddd);
    }
    
}
