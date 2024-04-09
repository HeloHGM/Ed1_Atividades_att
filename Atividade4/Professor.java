package Atividade3;

public class Professor extends Servidor{
    
    
    private String titulacao;
    
    public Professor(String nome, int siape, String titulacao){
        super(nome, siape);
        this.titulacao=titulacao;
    }

    public String getTitulacao(){
        return titulacao;}
    public void setTitulacao(String titulacao){
        this.titulacao=titulacao;}

        
    @Override
    public String toString(){
        return "Professor: " + getNome() + " SIAPE: " + getSiape() + " titulação: " + getTitulacao();
    }
    

}
