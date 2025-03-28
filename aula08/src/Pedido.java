public class Pedido {

    private Produto[] produtos;

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public double calcularValorTotal(){
        double valor = 0.0;
        for (Produto produto : produtos){
            valor += produto.getPreco();
        }
        return valor;
    }
}
