public class Curso {

    private String nome;
    private Integer codigo;
    private Aluno[] alunos;
    private Integer totalDeAlunos;

    public Curso(String nome, Integer codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.totalDeAlunos = 0;
        this.alunos = new Aluno[10];
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void matriculaAluno(Aluno aluno){
        alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void removerAlunos(Integer matricula){
        int idxRemoved = 0;
            for(int i = 0; i < totalDeAlunos; i++){
                if(alunos[i].getMatricula().equals(matricula)){
                    alunos[i] = null;
                    idxRemoved = i;
                }
            }

            for(int i = idxRemoved; i < totalDeAlunos - 1; i++){
                alunos[i] = alunos[i+1];
            }
            alunos[totalDeAlunos-1] = null;
            totalDeAlunos--;
    }

    public void relatorio(){
        System.out.println(nome + " tem " + totalDeAlunos + " alunos");
        for(int i = 0; i < totalDeAlunos; i++){
            System.out.println(alunos[i].getNome());
        }
    }

}
