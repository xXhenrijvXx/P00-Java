public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
