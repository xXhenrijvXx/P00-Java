public class TesteClasseCaixa {
    public static void main(String[] args) {
        Caixa<String> caixa = new Caixa<>("Olá, meu nome é Henrique");
        Caixa<Double> caixa2 = new Caixa<>(1500.00);

        System.out.println(caixa.getConteudo());
        System.out.println(caixa2.getConteudo());

        System.out.println(caixa.getConteudo().getClass());
    }
}
