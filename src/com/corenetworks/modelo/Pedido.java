package com.corenetworks.modelo;

public class Pedido {


        //Atributos
        public int idPedido;
        public Double Importe;
       public char FormaPago;
        public void setIdPedido(int valor) {

            idPedido = valor;
        }
        public void setImporte(double Importe){
            this.Importe =Importe;}
        public void setFormaPago(char setFormaPago){
            this.FormaPago=FormaPago;
        }

        //Getters
        public int getIdPedido(){
            return idPedido;

        }
        public double getImporte(){
            return Importe;
        }
        public int getFormaPago(){
            return FormaPago;
        }

    }


