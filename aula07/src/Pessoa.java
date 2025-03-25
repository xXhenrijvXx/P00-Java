public class Pessoa {
    private String name;
    private Integer idade;
    private String genero;

    public Integer getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

    public String getName() {
        return name;
    }

    public void setIdade(Integer idade) {
        if(idade >= 0){
            this.idade = idade;

        }
    }

    public void setGenero(String genero) {
        if(isGeneroValido(genero)){
            this.genero = genero;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isGeneroValido(String genero){

        return "masculino".equals(genero) ||
                "feminino".equals(genero) ||
                "não-binário".equals(genero);
    }
}
