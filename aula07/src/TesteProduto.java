public class TesteProduto {
    public static void main(String[]args){
        Produto produto = new Produto("Maçã", 1.25, 10);

        imprimir(produto);
        produto.setQuantidadeEmEstoque(2);
        produto.setPreco(-1.0);
    }

    public static void imprimir(Produto produto){
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());
        System.out.println("#################");
    }
}
