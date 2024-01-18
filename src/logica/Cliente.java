package logica;

import java.util.List;

public class Cliente {
    
    //Atributos
    private int idCliente;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Ticket> listaTickets;
    
    //Constructores
    public Cliente() {}

    public Cliente(int idCliente, String dni, String nombre, String apellido, List<Ticket> listaTickets) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaTickets = listaTickets;
    }
    
    //Métodos getter y setter
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Ticket> getListaTickets() {
        return listaTickets;
    }

    public void setListaTickets(List<Ticket> listaTickets) {
        this.listaTickets = listaTickets;
    }
}