
import javax.swing.*;

public class InterfazClienteBancoCipa9 {

    //METODO 1
    public static ClienteBancoCipa_9 VectorCliente[];
    public static ClienteBancoCipa_9 VectorClienteSel[];
    public static int Tvec;
    public static int Cont = 0;
    public static int sw = 0; //VARIABLE ESTADO
    public static int sw2 = 0;//VARIABLE ESTADO
    public static int existe = 0;

    public static void Tamvec() {

        sw = 1;//CAMBIO VALOR VARIABLE ESTADO

        Tvec = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamaño del Vector"));
        VectorCliente = new ClienteBancoCipa_9[Tvec];

        JOptionPane.showMessageDialog(null, "Vector Dimensionado");

    }

    //METODO 2
    public static void AgregarCliente() {

        sw2 = 1;   //CAMBIO VALOR VARIABLE ESTADO 2

        if (sw == 1) { //CONDICIONAL QUE PERMITE ENTRAR AL METODO
            if (Cont < Tvec) {//CONDICIONAL VECTOR LLENO 
                int numcuenta;
                String numced;
                String nombre;
                Double capital;
                int tipoCuenta;

                numcuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero De cuenta"));
                if (Cont > 0) {
                    existe = VerificarCuentas(numcuenta);
                }

                if (existe == 0) {
                    numced = (JOptionPane.showInputDialog(null, "Numero Cedula"));
                    nombre = (JOptionPane.showInputDialog(null, "Nombre Cliente"));
                    capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor Capital"));
                    tipoCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo Cuenta 1=Ahorro/ 2=Corriente"));

                    VectorCliente[Cont] = new ClienteBancoCipa_9(numcuenta, numced, nombre, capital, tipoCuenta);

                    ++Cont;
                    JOptionPane.showMessageDialog(null, "Cliente Creado");
                } else {
                    JOptionPane.showMessageDialog(null, "El número de Cuenta Ya Existe, Favor Verificar");

                }

            } else {
                JOptionPane.showMessageDialog(null, "Vector lleno");
                VerClientes(); //LLEVA AL METODO 2
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor Crear Vector");
            Tamvec();// LLEVA AL METODO 1 
            sw = 1;//CAMBIO VALOR VARIABLE ESTADO

        }

    }

    //METODO 3
    public static void VerClientes() {

        int I;

        if (sw == 1) {//CONDICIONAL QUE PERMITE ENTRAR AL METODO
            if (sw2 == 1) { //CONDICIONAL PARA MOSTRAR EN PANTALLA
                for (I = 0; I < Cont; ++I) {
                    JOptionPane.showMessageDialog(null, "Numero de Cuenta: " + VectorCliente[I].getNumcuenta() + "\n" + "Cedula: " + VectorCliente[I].getNumced() + "\n" + "Cliente: " + VectorCliente[I].getNombre() + "\n" + "Capital:" + VectorCliente[I].getCapital() + "\n" + "Tipo de Cuenta 1/2: " + VectorCliente[I].getTipoCuenta());
                }
            } else {
                JOptionPane.showMessageDialog(null, "El vector esta vacio");
                AgregarCliente();//LLEVA AL METODO 2 
                sw2 = 1;//CAMBIO VALOR VARIABLE ESTADO

            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor Crear Vector");
            Tamvec();//LLEVA AL METODO 1 
            sw = 1;//CAMBIO VALOR VARIABLE ESTADO
        }

    }

    public static void BuscarCliente() {

        int CuentaBuscar = 0;
        boolean Existe = false;
        int pos = 0; // CONTARA LAS POSICIONES 

        if (sw == 1) { //CONDICIONAL QUE PERMITE ENTRAR AL METODO

            //METODO
            if (Cont == 0) { // VALIDA QUE XISTAN DATOS, EN CASO DE NO PASA AL ELSE 
                JOptionPane.showMessageDialog(null, "No hay clientes, Vector Vacio");
            } else {
                CuentaBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero de la Cuenta a Buscar"));
                while (pos < Cont && Existe == false) {

                    if (CuentaBuscar == VectorCliente[pos].getNumcuenta()) {

                        Existe = true;

                    } else {
                        ++pos;
                    }

                }

                if (Existe == false) {

                    JOptionPane.showMessageDialog(null, "La Cuenta No Existe");

                } else {

                    JOptionPane.showMessageDialog(null, " Numero de Cuenta: " + VectorCliente[pos].getNumcuenta() + "\n Cedula: " + VectorCliente[pos].getNumced() + "\n Cliente" + VectorCliente[pos].getNombre() + "\n  Capital " + VectorCliente[pos].getCapital() + "\n Tipo de cuenta 1=Ahorro/2=Corriente: " + VectorCliente[pos].getTipoCuenta());
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Favor Crear Vector");
            Tamvec();// LLEVA AL METODO 1 
            sw = 1;//CAMBIO VALOR VARIABLE ESTADO

        }

    }

    public static void ModificarSaldo() {

        int CuentaBuscar = 0;
        boolean Existe = false;
        int pos = 0; // CONTARA LAS POSICIONES 
        int Tipo = 0;
        double ValorTran;

        //METODO
        if (Cont == 0) { // VALIDA QUE XISTAN DATOS, EN CASO DE NO PASA AL ELSE 
            JOptionPane.showMessageDialog(null, "No hay clientes, Vector Vacio");
        } else {
            CuentaBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero de la Cuenta a Buscar"));
            while (pos < Cont && Existe == false) {

                if (CuentaBuscar == VectorCliente[pos].getNumcuenta()) {

                    Existe = true;
                    Tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "1 = consignacion" + "\n  2 = retiro"));

                    if (Tipo == 1) {

                        ValorTran = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite Valor a Consignar"));
                        VectorCliente[pos].setCapital(ValorTran + VectorCliente[pos].getCapital());
                        JOptionPane.showMessageDialog(null, " Consignacion Aprobada");

                    } else {

                        ValorTran = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite Valor a Retirar"));
                        if (ValorTran < VectorCliente[pos].getCapital()) {

                            VectorCliente[pos].setCapital(VectorCliente[pos].getCapital() - ValorTran);

                            JOptionPane.showMessageDialog(null, " Retiro Aprobado");

                        } else {

                            JOptionPane.showMessageDialog(null, " Fondos Insuficientes");

                        }
                    }

                } else {
                    ++pos;
                }

            }

            if (Existe == false) {

                JOptionPane.showMessageDialog(null, "La Cuenta No Existe");

            } else {

                JOptionPane.showMessageDialog(null, " Numero de Cuenta: " + VectorCliente[pos].getNumcuenta() + "\n Cedula: " + VectorCliente[pos].getNumced() + "\n Cliente" + VectorCliente[pos].getNombre() + "\n  Capital " + VectorCliente[pos].getCapital() + "\n Tipo de cuenta 1=Ahorro/2=Corriente: " + VectorCliente[pos].getTipoCuenta());
            }

        }

    }

    public static void MostrarClientes(double valoradm) {

        //int i;
        int pos = 0;
        // double valoradm;
        VectorClienteSel = new ClienteBancoCipa_9[Tvec];
        for (int i = 0; i < VectorCliente.length; i++) // length es la longitud del vector
        {
            if (VectorCliente[i].getCapital() >= valoradm) {
                VectorClienteSel[i] = VectorCliente[i];
                pos++;

                //System.out.println("\n______________________\n" + " Cliente   :" + (i + 1) + "\n Cuenta  :" + VectorCliente[i].getNumcuenta() + "\n Cédula   :" + VectorCliente[i].getNumced() + "\nCapital  :" + VectorCliente[i].getCapital());
                JOptionPane.showMessageDialog(null, " Cliente " + (i + 1) + " Con Valor superior Al promedio:" + "\n " + " Numero de Cuenta: " + VectorCliente[i].getNumcuenta() + "\n" + " Cedula: " + VectorCliente[i].getNumced() + "\n" + " Cliente: " + VectorCliente[i].getNombre() + "\n" + " Capital: " + VectorCliente[i].getCapital() + "\n" + " Tipo de Cuenta: " + VectorCliente[i].getTipoCuenta());
            }
        }
        //  for (int i = 0; i < pos; i++) {
        //   System.out.println("\n______________________\n" + " Cliente   :" + (i + 1) + "\n Cuenta  :" + VectorCliente[i].getNumcuenta() + "\n Cédula   :" + VectorCliente[i].getNumced() + "\nCapital  :" + VectorCliente[i].getCapital());

        // }
    }

    /**
     *
     * @param CuentaBuscar
     * @return
     */
    public static int VerificarCuentas(int CuentaBuscar) {

        for (int i = 0; i < Cont; i++) {
            if (CuentaBuscar == VectorCliente[i].numcuenta) {
                return 1;
            }
        }
        return 0;
    }

    public static void EliminarCliente() {
        if (Tvec > 0) {
            int CuentaBuscar = 0;
            boolean Existe = false;
            int pos = 0; // CONTARA LAS POSICIONES

            if (Cont == 0) { // VALIDA QUE XISTAN DATOS, EN CASO DE NO PASA AL ELSE 
                JOptionPane.showMessageDialog(null, "No hay clientes, Vector Vacio");
            } else {
                CuentaBuscar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Numero de la Cuenta a Buscar"));
                while (pos < Cont && Existe == false) {

                    if (CuentaBuscar == VectorCliente[pos].getNumcuenta()) {

                        while (pos < Cont - 1) {

                            VectorCliente[pos] = VectorCliente[pos + 1];
                            pos++;
                        }
                        Cont--;
                        Existe = true;

                    } else {
                        ++pos;
                    }

                }

            }
            if (Existe == false) {

                JOptionPane.showMessageDialog(null, "La Cuenta No Existe");

            } else {

                JOptionPane.showMessageDialog(null, "Cuenta Eliminda Satisfactoreamente");

            }
        }
    }

    public static void EliminarTipo() {
        int tipoCuenta = 0;
        int ContEliminados = 0;
        int pos = 0;
        int pc = 0;

        tipoCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Tipo de Cuenta 1/2 "));
        for (int i = 0; i < Cont; i++) {
            if (tipoCuenta == VectorCliente[pc].getTipoCuenta()) {
                ContEliminados++;
                while (pos < Cont - 1) {

                    VectorCliente[pos] = VectorCliente[pos + 1];
                    pos++;
                }
                Cont--;
                pos = pc;
            } else {
                pos++;
                pc++;
                i=0;

            }
          
        }
        
        JOptionPane.showMessageDialog(null, ContEliminados + "  Cuentas Eliminadas  ");
        // System.out.println(  ContEliminados + "  Cuentas Eliminadas  ");

    }
  
    public static void increCuenCorri() {
        int pos = 0;
        double incre, acu = 0.0;

        if (Cont == 0) { // VALIDA QUE XISTAN DATOS, EN CASO DE NO PASA AL ELSE 
            JOptionPane.showMessageDialog(null, "No hay clientes, Vector Vacio");
            Tamvec();
        } else {
            while (pos < Cont) {

                if (VectorCliente[pos].getTipoCuenta() == 2) {
                    incre = (VectorCliente[pos].getCapital() * 0.02);
                    acu += incre;
                    VectorCliente[pos].setCapital(VectorCliente[pos].getCapital() + incre);
                }
                pos++;
            }
        }

        ImpresionAmento();
        JOptionPane.showMessageDialog(null, "Incremento Total de Todos los Clientes con Cuenta Corriente = " 
                + acu);

    }

    public static void ImpresionAmento() {

        for (int i = 0; i < Cont; i++) {

            if (VectorCliente[i].getTipoCuenta() == 2) {

                JOptionPane.showMessageDialog(null, "Clientes con Cuentas Corrientes" + "\n--------------\n" 
                + "\n Numero de Cuenta: " + VectorCliente[i].getNumcuenta() 
                +"\n Cedula: " + VectorCliente[i].getNumced()
                + "\n Cliente" + VectorCliente[i].getNombre() + "\n  Capital " + VectorCliente[i].getCapital()
                + "\n Tipo de cuenta Corriente: " + VectorCliente[i].getTipoCuenta());

            }

        }

    }
    

    public static void main(String[] args) {

        int menu;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal" + "\n+------------+"
                    + "\n 1:Crear Arreglo" + 
                    "\n 2: Agregar Cliente" +
                    "\n 3: Ver Cliente" + "\n 4: Buscar Cliente" + "\n 5: Modificar Saldo: " 
                    + "\n 6: Clientes con Valor Mayor al Promedio" + "\n 7: Eliminar Cliente "
                    + "\n 8: Eliminar Cliente Con Mismo Tipo de Dato "
                    + "\n 9. Incremento de Cuentas Corrientes" +"\n 10. Salir" ));

            switch (menu) {

                case 1: {
                    Tamvec();
                    break;
                }
                case 2: {

                    AgregarCliente();

                    break;
                }
                case 3: {

                    VerClientes();

                    break;
                }

                case 4: {

                    BuscarCliente();

                    break;

                }

                case 5: {

                    ModificarSaldo();
                    break;
                }

                case 6: {
                    double valoradm = Double.parseDouble(JOptionPane.showInputDialog(null, " Ingrese Rango Minimo que se Desea Alistar"));
                    MostrarClientes(valoradm);
                    break;

                }

                case 7: {
                    EliminarCliente();
                    break;
                }
                

                case 8: {

                    EliminarTipo();
                    break;

                }
                case 9: {

                   increCuenCorri();
                    break;

                }
                
                
            }

        } while (menu != 10);

    }
}
