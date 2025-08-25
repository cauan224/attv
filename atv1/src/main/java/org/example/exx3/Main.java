package org.example.exx3;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 =new Cliente("João", Pedido.CONCLUIDO);

        System.out.println("nome " +cliente1.getNome());
        System.out.println("estado do pedido  "+cliente1.getPedido().getTexto());

    }
}

