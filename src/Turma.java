

public class Turma {
    private Curso curso;
    private String nomeTurma;
    private int numeroVagas;
    private int codigo;
    private int alunosMatriculados;

    public Turma() {
        this.nomeTurma = "";
        this.numeroVagas = 0;
        this.codigo = 0;
        this.alunosMatriculados = 0;
    }

    public Turma(String nomeTurma, int numeroVagas, int codigo, int alunosMatriculados) {
        this.nomeTurma = nomeTurma;
        this.numeroVagas = numeroVagas;
        this.codigo = codigo;
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public void setNomeCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setAlunosMatriculados(int alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public String getNomeTurma() {
        return this.nomeTurma;
    }

    public int getNumeroVagas() {
        return this.numeroVagas;
    }

    public int getNomeCodigo() {
        return this.codigo;
    }

    public int getAlunosMatriculados() {
        return this.alunosMatriculados;
    }

    public boolean matricularAluno() {
        if (this.numeroVagas > 0) {
            this.alunosMatriculados++;
            this.numeroVagas--;
            return true;
        } else {
            return false;
        }
    }
}