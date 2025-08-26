package heraca;

public class Main {
    public static void main(String[] args) {

        Cliente cliente=new Cliente("cauan",12,"30/12/90","debito");

        Fucionario fucionario=new Fucionario("cauan",12,"323232","ds",1200.00);

        System.out.println(cliente.toString());
        System.out.println(fucionario.toString());

    }
}
