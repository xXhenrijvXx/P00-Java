public class Teste2 {
    public static void main(String[]args){
        var aluno1 = new Aluno("João", 123, null);
        var aluno2 = new Aluno("Aleg", 456, null);
        var aluno3 = new Aluno("Andrey", 789, null);
        var aluno4 = new Aluno("Robesvaldo", 245, null);

        var curso1 = new Curso("Medicina", 1);
        var curso2 = new Curso("Ciência da Computação", 2);

        curso1.matriculaAluno(aluno1);
        curso2.matriculaAluno(aluno2);
        curso1.matriculaAluno(aluno3);
        curso1.relatorio();
        curso1.removerAlunos(456);
        curso1.relatorio();

        curso2.matriculaAluno(aluno4);
        curso2.relatorio();

    }
}
