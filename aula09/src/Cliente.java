import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Pedido> pedido;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void addPedido(Pedido pedido){
        this.pedido.add(pedido);
    }
}
