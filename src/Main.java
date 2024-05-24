import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nomeCurso = JOptionPane.showInputDialog("Digite o nome do Curso:");
        int codigoCurso = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Curso:"));
        Curso curso = new Curso(nomeCurso, codigoCurso);
        
        String nomeTurma = JOptionPane.showInputDialog("Digite o nome da Turma:");
        int numeroVagas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vagas da Turma:"));
        int alunosMatriculados = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de alunos matriculados:"));
        int codigoTurma = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Turma:"));
        Turma turma = new Turma(nomeTurma, numeroVagas, codigoTurma, alunosMatriculados);
        turma.setCurso(curso);
        
        if (turma.matricularAluno()) {
            Aluno aluno1 = new Aluno();
            aluno1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula do Aluno 1:")));
            aluno1.setNomeAluno(JOptionPane.showInputDialog("Digite o nome do Aluno 1:"));
            aluno1.setTurma(turma);
            JOptionPane.showMessageDialog(null, "Aluno 1 matriculado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não há vagas disponíveis para o Aluno 1! ");
        }
        
        if (turma.matricularAluno()) {
            int numeroMatricula2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula do Aluno 2:"));
            String nomeAluno2 = JOptionPane.showInputDialog("Digite o nome do Aluno 2:");
            Aluno aluno2 = new Aluno(numeroMatricula2, nomeAluno2);
            aluno2.setTurma(turma);
            JOptionPane.showMessageDialog(null, "Aluno 2 matriculado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não há vagas disponíveis para o Aluno 2!");
        }
        
        JOptionPane.showMessageDialog(null, "Curso: " + curso.getNomeCurso() + ", Código: " + curso.getCodigo());
        JOptionPane.showMessageDialog(null, "Turma: " + turma.getNomeTurma() + ", Código: " + turma.getNomeCodigo() + ", Vagas: " + turma.getNumeroVagas() + ", Matriculados: " + turma.getAlunosMatriculados());
    }
}