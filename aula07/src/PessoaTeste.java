public class PessoaTeste {
    public static void main(String[]args){
        Pessoa p = new Pessoa();
        p.setName("João");
        p.setIdade(10);
        p.setGenero("Masculino");

        imprimir(p);

        p.setIdade(-10);

    }

    private static void imprimir(Pessoa p){
        System.out.println(p.getName());
        System.out.println(p.getIdade());
        System.out.println(p.getGenero());
    }
}
