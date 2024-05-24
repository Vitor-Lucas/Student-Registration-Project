public class Curso {
    private String nomeCurso;
    private int codigo;
    
    public Curso(){
        this.nomeCurso = "";
        this.codigo = 0;
    }
    public Curso(String nomeCurso, int codigo){
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
    }
    
    public String setNomeCurso(String nomeCurso){
        return this.nomeCurso = nomeCurso;
    }
    
    public int setCodigo(int codigo){
        return this.codigo = codigo;
    }
    
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
}