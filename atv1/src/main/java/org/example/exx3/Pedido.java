package org.example.exx3;

public enum Pedido {
    ABERTO("Aberto"),
    CANCELADO ("Cancelado"),
    CONCLUIDO ("Concluído");

    private String texto;

    private Pedido(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

}
