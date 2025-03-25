public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEmEstoque;

    public Produto(String nome, Double preco, Integer quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidadeEmEstoque;
    }
}
