import javax.swing.JOptionPane;
public class Arreglo {
    
    public static void main(String[] args) {

       int x;
       String mostrar = ""; 
       
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite tamaño del arreglo"));

        int arreglo1[]  = new int [x];
        for (int i=0;i<x;i++){
           
            arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Posición " + (i+1)+ ")." + " Digite un numero " ));
        }
        
        for (int i=0;i<x;i++){
        mostrar = mostrar+arreglo1[i]+ "\n";
        }
    
    	JOptionPane.showMessageDialog(null, "Su Vector es :" + "\n-----------------" +"\n" + mostrar );

    
    
    
    
    
    
    
    
    }



















}



