package heraca2;

public class Main {
    public static void main(String[] args) {
        Processo processo1 = new Processo("Intel", "i7-9700K", "N/A", "3.6GHz");
        Placa placa1 = new Placa("ASUS", "ROG STRIX B450-F", "N/A", "AM4");
        Armazenamento armazenamento1 = new Armazenamento("Samsung", "EVO 860", "1TB", "SATA");
        Memoria memoria1 = new Memoria("Corsair", "Vengeance LPX", "16GB", "DDR4");


        System.out.println(processo1.toString());
        System.out.println(placa1.toString());
        System.out.println(armazenamento1.toString());
        System.out.println(memoria1.toString());
    }
}