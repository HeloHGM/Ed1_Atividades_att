package Atividade3;


import java.util.LinkedList;
import java.util.Queue;

public class Refeitorio {
    public static void main(String[] args) {
        Queue<Pessoa>fila = new LinkedList<>();

        fila.add(new Aluno("loloh", "bcc", 202310410));
        fila.add(new TecAdm("lolo", 2023104));
        fila.add(new Professor("lol", 20231, "ed1"));

        for(Pessoa pessoa: fila){
            System.out.println(pessoa);
        }

        
    }




/*// Programa principal para teste da fila
funcao inicio() {
Fila fila //instacia a filaok
fila.criarFila(10) // cria a filaok
fila.inserirElemento(10) // insere elementook
fila.inserirElemento(20) // insere elementook
fila.inserirElemento(30) // insere elementook
escreva("Elemento removido: ", fila.removerElemento()) //remove elemento
inteiro posicao <- fila.localizarElemento(20) //verifica se o elemento 20 está na fila
se (posicao != -1) { escreva("Elemento 20 encontrado na posição: ", posicao) }
senao { escreva("Elemento 20 não encontrado na fila.") }
fila.destruirFila()
} // verifique se o elemento 10 está na fila */
}
