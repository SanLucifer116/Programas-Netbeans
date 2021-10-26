package demoDto;

import businessObject.ClienteBO;
import valueObject.ClienteVO;

public class DTODemo {

    public static void main(String[] args) {
        // TODO code application logic here

        //objeto business object
        ClienteBO clienteBusinessObject = new ClienteBO();
//obtiene todos los clientes
        clienteBusinessObject.obtenerClientes().forEach(System.out::println);
// actualiza un cliente
        System.out.println("****");
        ClienteVO cliente = clienteBusinessObject.obtenerCliente(2);
        cliente.setNombre("Luis");
        clienteBusinessObject.actualizarCliente(cliente);
// obtiene un cliente
        System.out.println("****");
        cliente = clienteBusinessObject.obtenerCliente(1);
        System.out.println(cliente);
//elimina un cliente
        System.out.println("****");
        cliente = clienteBusinessObject.obtenerCliente(1);
        clienteBusinessObject.eliminarCliente(cliente);
    }
}
