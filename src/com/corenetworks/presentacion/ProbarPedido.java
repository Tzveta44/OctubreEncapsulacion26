package com.corenetworks.presentacion;


import com.corenetworks.modelo.Pedido;

public class ProbarPedido {
        public static void main(String[] args) {
            Pedido p1 = new Pedido();
            p1.setIdPedido(5);//p1.idPedido=5
            p1.setImporte(400);
            p1.setFormaPago('e');
            System.out.println("Pedido Nº: " + p1.getIdPedido());
            System.out.println("Importe: " + p1.getImporte());
            System.out.println("Forma de pago: " + p1.getFormaPago());

        }
    }
