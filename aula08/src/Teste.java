public class Teste {
    public static void main(String[]args){
        var p1 = new Produto("Maça", 6.00, 10);
        var p2 = new Produto("Leite", 5.99);
        var p3 = new Produto("Banana", 1.99);
        var p4 = new Produto("Pipoteca", 7.59);

        Produto[] lista1 = {p1, p3};
        Produto[] lista2 = {p2, p4};

        var pedido1 = new Pedido();
        var pedido2 = new Pedido();

        pedido1.setProdutos(lista1);
        pedido2.setProdutos(lista2);

        var joao = new Cliente("João", "111.222.333-44");
        var maria = new Cliente("Maria", "222.333.444-55");

        System.out.println("Pedidos do joão: ");
        joao.adicionarPedido(pedido1);
        maria.adicionarPedido(pedido2);
        joao.relatorio();

        System.out.println("Pedidos da Maria:");
        maria.adicionarPedido(pedido2);
        maria.relatorio();

    }
}
