package com.corenetworks.modelo;

public class Producto {

    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidadExistencias;
    public void setIdProducto(int valor) {

        idProducto = valor;
    }
    public void setNombre(String nombre){
        this.nombre =nombre;}
        public void setCantidadExistencias(int cantidadExistencias){
            this.cantidadExistencias=cantidadExistencias;
        }

        //Getters
        public int getIdProducto(){
            return idProducto;

        }
        public String getNombre(){
            return nombre;
        }
        public int getCantidadExistencias(){
        return cantidadExistencias;
        }

    }

