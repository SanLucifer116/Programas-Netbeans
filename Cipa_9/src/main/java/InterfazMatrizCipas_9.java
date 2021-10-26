
import javax.swing.*;

public class InterfazMatrizCipas_9 {

    static Numerocipa9 Matriz[][]; //SE INSTANCIA LA MATIZ 
    static int tamFila, tamColum;
    static int f, c;
    static int num;

    public static void lonitudMatriz() {

        tamFila = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Tamaño Fila"));
        tamColum = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Tamaño Columnas"));

        Matriz = new Numerocipa9[tamFila][tamColum];

        JOptionPane.showMessageDialog(null, "¡Matriz Creada con Exito!");

    }

    public static void LlenarMatriz() {

        // SE ALMACENARA LOS DATOS QUE SE DEN, SE LLENAN FILA, SE LLENA COLUMNA
        // F Y C SON LOS QUE LLEVAN LA POSICION DE LA MATRIZ
        for (f = 0; f < tamFila; f++) {
            for (c = 0; c < tamColum; c++) {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite Numero "));
                Matriz[f][c] = new Numerocipa9(num); //SE ALMACENA EL VALOR DE LA VARIABLE EN LA POSICION QUE CORRESPONDA
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz Llena!");

    }

    public static void VerMatriz() {

        System.out.print(" MATRIZ\n");
        for (f = 0; f < tamFila; f++) {
            for (c = 0; c < tamColum; c++) {

                System.out.print(" " + Matriz[f][c].getNumero());
            }
            System.out.println(); // ESTE PRINTLN SIRVE PARA SALTAR UNA RENGLON

        }

    }

    public static void VerMatriCz() {
        String x = "";

        for (f = 0; f < tamFila; f++) {
            for (c = 0; c < tamColum; c++) {
                x += Matriz[f][c].getNumero();
                x += " ";

            }
            x += "\n"; // ESTE PRINTLN SIRVE PARA SALTAR UNA RENGLON

        }
        JOptionPane.showMessageDialog(null, "MATRIZ\n" + x);
        
    }

    public static void TipoNumero() {

        int conpares = 0;
        int contimapres = 0;
        for (f = 0; f < tamFila; f++) {
            for (c = 0; c < tamColum; c++) {

                if (Matriz[f][c].getNumero() % 2 == 0) {
                    conpares++;
                } else {
                    contimapres++;

                }
            }

        }

        JOptionPane.showMessageDialog(null, " Cantidad de Numeros Pares: "
                + conpares + "\nCantidad de Numeros Impares: " + contimapres + "\n   ლ(ಠ_ಠლ)   " + "( ..•˘___˘• .. )");

    }
    
    
    public static void BuscarDato() {
        int valorBuscar = 0;
        int sw=0;
        if (tamFila <= 0 & tamColum <= 0) {
            JOptionPane.showMessageDialog(null, "¡Matriz no esta Dimencionada!");
            lonitudMatriz();
        } else {
            valorBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Valor a Buscar"));
            for (f = 0; f < tamFila; f++) {
                for (c = 0; c < tamColum; c++) {
                    if (Matriz[f][c].getNumero() == valorBuscar) {
                       sw=1;
                      JOptionPane.showMessageDialog(null, "Valor Encontrado en la Posición [" + f + "][" + c + "]");
                      VerMatriCz();
                    }
                }
            }

        }
        
        if( sw == 0){
          JOptionPane.showMessageDialog(null, "Valor No existente en la Matriz");

        } 
    }
    
    
    
    public static void ModificarDato() {
        int valorBuscar = 0, valorCambiar , sw = 0;

        if (tamFila <= 0 & tamColum <= 0) {
            JOptionPane.showMessageDialog(null, "¡Matriz no esta Dimencionada!");
            lonitudMatriz();
        } else {
            JOptionPane.showMessageDialog(null, "A Continuación se Mostraran los Datos Almacenados en la Matriz");
            VerMatriCz();
            valorBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor, Digite Valor a Modificar"));
            for (f = 0; f < tamFila; f++) {
                for (c = 0; c < tamColum; c++) {

                    if (Matriz[f][c].getNumero() == valorBuscar) {
                        sw = 1;
                        valorCambiar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Numero para reemplazar " + valorBuscar + " en la posición[" + f + "][" + c + "]"));
                        Matriz[f][c].setNumero(valorCambiar);
                    }
                }
            }
            if (sw == 0) {
                JOptionPane.showMessageDialog(null, "Valor No existente en la Matriz");

            } else {
               JOptionPane.showMessageDialog(null, " ¡Matriz Actualizada!");
               VerMatriCz();
              
            }
        }
    }



    public static void main(String[] args) {

        int menu;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal"
                    + "\n+------------+" + "\n 1:Crear Matriz"
                    + "\n 2: Agregar Datos" + "\n 3: Ver Matriz por Consola "  
                    +"\n 4: Ver Matriz por Pantalla "
                    + "\n 5. Numeros Pares e Impares " + "\n 6. Buscar un Valor Especifico "
                    +"\n 7. Modificar un Valor de la Matriz"+"\n 8. Salir"));

            switch (menu) {

                case 1: {
                    lonitudMatriz();
                    break;

                }
                case 2: {
                    LlenarMatriz();
                    break;

                }

                case 3: {
                    VerMatriz();
                    break;

                }

                case 4: {

                    VerMatriCz();
                    break;

                }
                
                case 5:{
                    TipoNumero();
                    break;
                }
            
                case 6: {

                    BuscarDato();
                    break;

                }
                 case 7: {

                   ModificarDato();
                    break;

                }
            }
       
        } while (menu != 8);

    }
}
