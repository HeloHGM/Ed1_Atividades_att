package Atividade3;

public class TecAdm extends Servidor {
    
    
    public TecAdm(String nome,  int siape){
        super(nome, siape);
    }

    
    @Override
    public String toString(){
        return "TecAmd: " + getNome() + " SIAPE: " + getSiape() ;
}}
