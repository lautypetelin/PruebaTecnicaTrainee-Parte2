package test;

import logica.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import logica.Cliente;

public class Main {

    public static void main(String[] args) {
      
        //Creación de un objeto de tipo Scanner para el ingreso de datos.
        Scanner entrada = new Scanner(System.in);
        
        //Creación de estructura de datos.
        List<Ticket> listaTickets = new ArrayList<Ticket>();
        
        //Creación tickets mediante constructor con parámetros.
        Ticket ticket1 = new Ticket(12, 2, 3, new Date(), new Date(), 1500);  
        Ticket ticket2 = new Ticket(13, 2, 4, new Date(), new Date(), 1500);
        
        //Creación ticket mediante constructor vacío y aplico encapsulamiento.
        Ticket ticket3 = new Ticket();    
        ticket3.setNumeroTicket(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        ticket3.setPrecio(2300);
        
        //Agrego elementos a la lista.
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //Variable acumuladora para los precios de los tickets.
        double precioTotal = 0;
        
        //Recorrida mediante bucle for each para sumar los precios.
        for(Ticket lista: listaTickets){
            precioTotal += lista.getPrecio();
        }
        
        //Mostrar la suma de los precios.
        System.out.println("El precio total de los tickets es: $" + precioTotal);
        
        //Pedimos al usario que ingrese un número de fila.
        System.out.print("\nIngrese un número de fila para conocer los tickets  de la misma: ");
        int fila = entrada.nextInt();
        
        boolean bandera = false;
        
        System.out.println(); //Salto de línea
        
        for(Ticket lista: listaTickets){
            if(lista.getFila() == fila){
                System.out.println(lista.toString());
                bandera = true;
            }
        }
        
        if(bandera == false){
            System.out.println("No se encontraron datos de la fila " + fila + ".");
        }
        
        //Prueba de cliente
        Cliente cliente1 = new Cliente();
        cliente1.setIdCliente(1);
        cliente1.setNombre("Servando");
        cliente1.setApellido("Villanueva");
        cliente1.setDni("21487522");
        
        cliente1.getListaTickets().add(ticket1);
        
        Ticket ticket4 = new Ticket(12, 4, 6, new Date(2023-10-12), new Date(), 2000);
        cliente1.getListaTickets().add(ticket4);
    }
}