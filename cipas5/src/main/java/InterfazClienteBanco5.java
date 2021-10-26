import java.util.Arrays;
import javax.swing.*;

public class InterfazClienteBanco5 {
    public static ClienteBanco5 ArregloCliente[];
    public static int TamArreglo;
    public static int cont=0;
    
    public static void TamañoArreglo()
    {
        TamArreglo=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de cuentas: "));
        ArregloCliente=new ClienteBanco5[TamArreglo];
        JOptionPane.showMessageDialog(null, "Arreglo Creado exitosamente");
    }
       
    public static void AgregarCliente()
    {
        int NumCuenta;
        String NumCed;
        String Nombre;
        double Capital = 0;
        String TipoCuenta;
        if (cont< TamArreglo)
        {
            int posic=0;
            boolean Existe= false;
            NumCuenta=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta: "));
            while (posic < cont & Existe== false)
            {
                if(ArregloCliente[posic].getNumCuenta()== NumCuenta){
                Existe=true;   
            }else{
                ++posic;
            }
            }
            if (Existe==true) 
            {
                JOptionPane.showMessageDialog(null, "ERROR... Ya existe el numero de cuenta!!!");  
            }else{
                NumCed=JOptionPane.showInputDialog(null, "Digite la cédula: ");
                Nombre=JOptionPane.showInputDialog(null, "Digite el nombre: ");
                Capital=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor de su capital: "));
                TipoCuenta=JOptionPane.showInputDialog(null, "Dijite el tipo de cuenta: "
                    + "\n1= Ahorro \n2= Corriente");
                    switch (TipoCuenta){
                    case "1" :TipoCuenta = "Ahorro";break;
                    case "2" :TipoCuenta = "Corriente";break;   
                    default: JOptionPane.showMessageDialog(null,"ERROR... opción no válida!!!");
                    }
                ArregloCliente[cont]=new ClienteBanco5(NumCuenta,NumCed, Nombre, Capital, TipoCuenta);
                ++cont;
                JOptionPane.showMessageDialog(null, "Cliente agregado con exito");
            }
        }else{
            if ( TamArreglo == 0)
            {
                JOptionPane.showMessageDialog(null, "ERROR... opción no válida!!!");
                TamañoArreglo();
            }else{ 
                JOptionPane.showMessageDialog(null, "ERROR... Arreglo lleno!!!");
                VerClientes();
            }
        }
    }
    
    public static void OrdenarClientes()
    {
        if(TamArreglo>0)
        {
            ClienteBanco5 conta = new ClienteBanco5();
            for(int i=1; i<cont ;i++)
            {
                for(int j=0; j<cont -i;j++)
                {
                    if(ArregloCliente[j].getCapital()>ArregloCliente[j+1].getCapital())
                    {
                        conta=ArregloCliente[j];
                        ArregloCliente[j]=ArregloCliente[j+1];
                        ArregloCliente[j+1]=conta;
                    }
                } 
            } 
        }
        int I;
        for (I=0; I<cont; ++I)
        {
            JOptionPane.showMessageDialog(null, " Numero de cuenta: "+ ArregloCliente[I].getNumCuenta()+
                    "\n Cédula: "+ ArregloCliente[I].getNumCed()+
                    "\n Cliente: "+ ArregloCliente[I].getNombre()+
                    "\n Capital: "+ ArregloCliente[I].getCapital()+
                    "\n Cuenta: "+ ArregloCliente[I].getTipoCuenta());
        }
    }
    
    public static void BuscarClientes()
    {
        int CuentaBuscar=0;
        boolean Existe=false;
        int posic=0;
        if (cont==0)
        {
            JOptionPane.showMessageDialog(null,"ERROR... NO HAY CLIENTES");
        }else{
            CuentaBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta a buscar."));
            while (posic<cont & Existe==false)
            {
                if (CuentaBuscar==ArregloCliente[posic].getNumCuenta())
                {
                    Existe=true;
                }else{
                    ++posic;
                }
            }
            if (Existe==false)
            {
                JOptionPane.showMessageDialog(null, "NUMERO DE CUENTA NO EXISTE");
            }else{
                JOptionPane.showMessageDialog(null, " Numero de cuenta: "+ ArregloCliente[posic].getNumCuenta()+
                "\n Cédula: "+ ArregloCliente[posic].getNumCed()+
                "\n Cliente: "+ ArregloCliente[posic].getNombre()+
                "\n Capital: "+ ArregloCliente[posic].getCapital()+
                "\n Cuenta: "+ ArregloCliente[posic].getTipoCuenta());
            }
        }
    }
    
    public static void ModificarSaldo()
    {
        int CuentaBuscar=0;
        boolean Existe=false;
        int posic=0;
        int Tipo=0;
        double ValorTran;
        if(cont==0)
        {
            JOptionPane.showMessageDialog(null, " NO HAY CLIENTES, ARREGLO VACIO ");
        }else{
            CuentaBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta a buscar."));        
            while(posic<cont & Existe==false)
            {
                if(CuentaBuscar==ArregloCliente[posic].getNumCuenta())
                {
                    Existe=true;  
                    Tipo=Integer.parseInt(JOptionPane.showInputDialog(null, "1=Consignar \n 2=Retirar \n Digite opción "));
                    if(Tipo==1)
                    {
                        ValorTran=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor a consignar: "));
                        ArregloCliente[posic].setCapital(ValorTran+ArregloCliente[posic].getCapital());
                        JOptionPane.showInputDialog(null,"CONSIGNACION APROBADA ");
                    }else{
                        ValorTran=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor el retiro "));
                        if(ValorTran<ArregloCliente[posic].getCapital())
                        {
                            ArregloCliente[posic].setCapital(ArregloCliente[posic].getCapital()-ValorTran);
                            JOptionPane.showMessageDialog(null, "RETIRO APROBADA ");
                        }else{
                            JOptionPane.showMessageDialog(null, "FONDOS INSUFUCIENTES ");
                        }
                    }
                }else{
                    ++posic;
                }  
            }
            if (Existe==false)  
            {
                JOptionPane.showMessageDialog(null, "NUMERO DE CUENTA NO EXISTE");
            }else{
                JOptionPane.showMessageDialog(null, " Numero de cuenta: "+ ArregloCliente[posic].getNumCuenta()+
                "\n Cédula: "+ ArregloCliente[posic].getNumCed()+
                "\n Cliente: "+ ArregloCliente[posic].getNombre()+
                "\n Capital: "+ ArregloCliente[posic].getCapital()+
                "\n Cuenta: "+ ArregloCliente[posic].getTipoCuenta());
            }
        }
    }
    
    public static void MostrarCapital()
    {
        boolean Existe=false;
        double rango = 0;
        int posic=0;
        if (cont==0)
        {
            JOptionPane.showMessageDialog(null, "NO HAY CLIENTES, ARREGLO VACIO");
        }else{
            rango=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a partir de cuanto capital desea buscar: "));
        }
        while (posic<cont )
        {
           if(ArregloCliente[posic].getCapital()>=rango)
            {
                JOptionPane.showMessageDialog(null, " Numero de cuenta: "+ ArregloCliente[posic].getNumCuenta()+
                "\n Cédula: "+ ArregloCliente[posic].getNumCed()+
                "\n Cliente: "+ ArregloCliente[posic].getNombre()+
                "\n Capital: "+ ArregloCliente[posic].getCapital()+
                "\n Cuenta: "+ ArregloCliente[posic].getTipoCuenta());
                Existe=true;
            }
                ++posic;   
        }
        if (Existe==false)
        {
            JOptionPane.showMessageDialog(null, "No existe capital mayor a: " + rango );          
        }                              
    }
    
    public static void EliminarCliente()
    {
        int CuentaBuscar=0;
        boolean Existe=false;
        int posic=0;
        if (cont==0)
        {
            JOptionPane.showMessageDialog(null,"ERROR... NO HAY CLIENTES");
        }else{
            CuentaBuscar=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de cuenta a buscar."));
            while (posic<cont & Existe==false)
            {
            if(CuentaBuscar==ArregloCliente[posic].getNumCuenta())
            {
                Existe=true;
                for(int k=posic; k<cont-1;++k)
                {
                    ArregloCliente[k]=ArregloCliente[k+1];
                }
                cont--;
                JOptionPane.showMessageDialog(null, "CUENTA ELIMINADA");
            }else{
                ++posic;
            }
            }
            if (Existe==false)
            {
                JOptionPane.showMessageDialog(null, "NUMERO DE CUENTA NO EXISTE");
            }else{
                JOptionPane.showMessageDialog(null, " Numero de cuenta: "+ ArregloCliente[posic].getNumCuenta()+
                "\n Cédula: "+ ArregloCliente[posic].getNumCed()+
                "\n Cliente: "+ ArregloCliente[posic].getNombre()+
                "\n Capital: "+ ArregloCliente[posic].getCapital()+
                "\n Cuenta: "+ ArregloCliente[posic].getTipoCuenta());
            }
        }
    }
    
    public static void BorrarTipo()
    {
        int Tipo;
        int borrados=0;
        String cuenta=" ";
        Tipo=Integer.parseInt(JOptionPane.showInputDialog(null, "Elija tipo de cuentas a eliminar: "
            + "\n1= Ahorro \n2= Corriente") ) ;
        if(Tipo == 1)
        {
            cuenta="Ahorro";
            for( int i=0 ; i<cont; i++)
            {
                if( "Ahorro".equals(ArregloCliente[i].getTipoCuenta()))
                {                 
                    ArregloCliente[i]=new ClienteBanco5(0,"","",0.0,"");       
                    borrados =borrados+1;  
                };
            }    
        } 
        if(Tipo == 2)
        {
            cuenta="Corriente";
            for( int i=0 ; i<cont; i++)
            {
                if( "Corriente".equals(ArregloCliente[i].getTipoCuenta()))
                {
                    ArregloCliente[i]=new ClienteBanco5(0,"","",0.0,"");          
                    borrados =borrados+1;  
                };
            }          
        } 
        for( int j=0 ; j<cont ; j++)
        {
            if("".equals(ArregloCliente[j].getTipoCuenta()))
            {
                String go= "c";
                int contar=-1;
                int i=j;
                int cont1=cont-1;
                while(go=="c")
                {
                    if("".equals(ArregloCliente[j].getTipoCuenta()) & j+contar<cont1 &
                       "".equals(ArregloCliente[i].getTipoCuenta()))
                    {
                        contar=contar+1;
                        i=contar+j;
                        go="c";
                    }else{
                        go="p";
                    }
                }   
                if(contar+j<cont)
                {
                    ArregloCliente[j]=ArregloCliente[i];
                    ArregloCliente[i]=new ClienteBanco5(0,"","",0.0,"");
                }
            }
        }      
        int cont2=cont ;
        cont = cont2-borrados;
        JOptionPane.showMessageDialog(null, "SE ELIMINO "+borrados+" CUENTAS "+cuenta);
    }
    
    public static void VerClientes()
    {
    }

    public static void main(String args[])
    {
        int opc;
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog(null,"                MENU PRINCIPAL"+
                "\n 1.DIGITAR EL NUMERO DE CUENTAS \n 2.AGREGAR CLIENTE \n 3.VER CLIENTES \n 4.BUSCAR CLIENTE "
                + "\n 5.MODIFICAR SALDO \n 6.MOSTRAR CLIENTES CON SALDO MAYOR A "
                + "\n 7.ELIMINAR UN CLIENTE \n 8.ELIMINAR CLIENTES POR SU TIPO DE CUENTA \n 9.SALIR"));
            switch(opc)
            {
            case 1:{TamañoArreglo();}break;
            case 2:{AgregarCliente();}break;
            case 3:{VerClientes();OrdenarClientes();}break;
            case 4:{BuscarClientes();}break;
            case 5:{ModificarSaldo();}break;
            case 6:{MostrarCapital();}break;
            case 7:{EliminarCliente();}break;
            case 8:{BorrarTipo();}break;
            case 9:{System.exit(0);}break;
            default: JOptionPane.showMessageDialog(null,"ERROR... opción no válida!!!");
            }
        }while (opc!=9);
    }
}
    
   