package heraca2;

public abstract class Produto  {
    protected String Marca;
    protected String Modelo;

    protected String armazenamento;

    public Produto(String marca, String modelo, String armazenamento) {
        Marca = marca;
        Modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
}
