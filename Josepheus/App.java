import javax.swing.JOptionPane;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ListaLigada lista = new ListaLigada();
        Random random = new Random();
        
        for(int i = 1; i < 21; i++){
            Pessoa pessoa = new Pessoa();
            pessoa.nome = JOptionPane.showInputDialog("Nome");
            pessoa.cpf = JOptionPane.showInputDialog("CPF");
            pessoa.numero = JOptionPane.showInputDialog("Numero:");
            lista.AdicionarNoComeco(pessoa);
        }
        
        int sorteadoIndex = random.nextInt(lista.tamanho());
        Pessoa sorteado = (Pessoa) lista.pega(sorteadoIndex);
        
        System.out.println("Removendo... ");
        while(lista.tamanho() != 0){
            lista.removeDoComeco();
        }
        
        System.out.println("Vencedor: " + sorteado.nome + ", CPF: " + sorteado.cpf + ", Numero: " + sorteado.numero);
    }
}
