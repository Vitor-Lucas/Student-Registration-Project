

public class Aluno {
    private int matricula;
    private String nomeAluno;
    private Turma turma;
    
    public Aluno(){
        this.matricula = 0;
        this.nomeAluno = "";
    }
    public Aluno(int matricula, String nomeALuno){
        this.matricula = matricula;
        this.nomeAluno = nomeALuno;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }
    
    public Turma getTurma(){
        return this.turma;
    }
    
    public int getNomeAluno(){
        return this.matricula;
    }
    
     public int getMatricula(){
        return this.matricula;
    }
    
}