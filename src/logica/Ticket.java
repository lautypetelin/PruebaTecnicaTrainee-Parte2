package logica;

import java.util.Date;

public class Ticket {
    
    //Atributos
    private int numeroTicket;
    private int fila;
    private int asiento;
    private Date fechaCompra;
    private Date fechaValidez;
    private double precio;
    
    //Constructores
    public Ticket() {}

    public Ticket(int numeroTicket, int fila, int asiento, Date fechaCompra, Date fechaValidez, double precio) {
        this.numeroTicket = numeroTicket;
        this.fila = fila;
        this.asiento = asiento;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
        this.precio = precio;
    }
    
    //Métodos getter y setter
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Número de ticket: " + numeroTicket + ", Fila:" + fila + ", Asiento: " + asiento + ", Fecha de Compra: " + fechaCompra + ", Fecha de Validez: " + fechaValidez + ", Precio: " + precio;
    }
}