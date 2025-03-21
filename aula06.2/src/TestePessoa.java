public class TestePessoa {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa("Henrique", 19);
        var filha = new Pessoa("Joana");
        var p = new Pessoa();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println(filha.getIdade());
        System.out.println(filha.getNome());

        System.out.println(p.getIdade());
        System.out.println(p.getNome());
    }
}
