package com.corenetworks.modelo;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String Telefono;
    private int cantidadEmpleados;
    //Setters
    private void setIdProveedor(int proveedor) {
        this.idProveedor = idProveedor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }
    public int getIdProveedor() {
        return idProveedor;
    }
    public String getNombre() {
        return nombre;
    }
    public  String getTelefono() {
        return Telefono;
    }
    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

}
