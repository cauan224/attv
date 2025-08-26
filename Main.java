public class Main {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa(1,"Mario",30,"122","mar@gami",Sexo.MASCULINO,
                new Endereco("ribeira","121","casa","salvador",Uf.BAHIA,"12111"));

        System.out.println(pessoa.toString());


    }
}
