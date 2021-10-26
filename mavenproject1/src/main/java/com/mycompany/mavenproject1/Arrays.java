package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class Arrays {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("digite el numero de estudiantes de la clase"));
        int[] numeros = new int[n];

        /*  numeros[0]= 6;
        numeros[1]= 8;
        numeros[2]= 10;
         */
        int suma = 0;
        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Dijite la estatura del estudiante " + (i + 1)));

            suma = suma + numeros[i];
        }
        double media = suma / n;

        JOptionPane.showMessageDialog(null, "La media de altura de la clase es de: " + media);
        for (int i = 0; i < n; i++) {

            if (numeros[i] > media) {

                JOptionPane.showMessageDialog(null, "Los valores por encima de la media son:  " + numeros[i]);

            }
            if (numeros[i] < media) {
                
                JOptionPane.showMessageDialog(null, "Los valores por debajo de la media son:  " + numeros[i]);
            }
            //JOptionPane.showMessageDialog(null, numeros[i]);

//            JOptionPane.showMessageDialog(null,"hola mundo");


        }

    }

}
