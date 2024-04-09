package Atividade3;

public class Aluno extends Pessoa {
   

    private String curso;
    private int matricula;


    public Aluno(String nome, String curso, int matricula){
        super(nome); 
        this.curso=curso;
        this.matricula=matricula;
    }

    public String getCurso(){
        return curso;}
    public void setCurso(String curso){
        this.curso=curso;}



    public int getMatricula(){
        return matricula;}
    public void setMatricula(int matricula){
        this.matricula=matricula;}

    
    

    @Override
    public String toString(){
        return "Aluno: " + getNome() +"curso: "+getCurso()+ " Matricula: " + getMatricula() ;
    }
    


}
