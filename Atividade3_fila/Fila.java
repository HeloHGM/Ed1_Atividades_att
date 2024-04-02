import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    private Queue<Integer> fila;
    private int Max;

    // Método para criar uma nova fila
    public void cria(int Max) {
        this.Max = Max;
        this.fila = new LinkedList<>();
    }

    // Método para destruir a fila
    public void destruir() {
        this.fila = null;
    }

    // Método para verificar se a fila está cheia
    public boolean cheio() {
        return this.fila.size() == this.Max;
    }

    // Método para verificar se a fila está vazia
    public boolean vazio() {
        return this.fila.isEmpty();
    }

    // Método para inserir um elemento na fila
    public void inserir(int elemento) {
        if (cheio()) {
            System.out.println("Erro: A fila está cheia.");
            return;
        }
        this.fila.offer(elemento);
    }

    // Método para remover um elemento da fila
    public int remove() {
        if (vazio()) {
            System.out.println("Erro: A fila está vazia.");
            return -1;
        }
        return this.fila.poll();
}


    // Método para localizar um elemento na fila
    public int achaElem(int elemento) {
        if (!vazio()) {
            int posicao = 0;
            for (int item : this.fila) {
            if (item == elemento) {
            return posicao;
                }
    posicao++;
            }
        }
    return -1;
    }

    
    
    
    
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.cria(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        System.out.println("Elemento removido: " + fila.remove());
        int posicao = fila.achaElem(20);
        if (posicao != -1) {
            System.out.println("Elemento 20 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 20 não encontrado na fila.");
        }
        fila.destruir();
    }



}
