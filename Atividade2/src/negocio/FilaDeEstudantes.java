package negocio;

import javax.swing.JOptionPane;

import modelagem.Estudante;
public class FilaDeEstudantes {

	private Estudante[] fila;
    private int tamanho;
    private int capacidade;

    public FilaDeEstudantes(int capacidade) {
        this.capacidade = capacidade;
        fila = new Estudante[capacidade];
        tamanho = 0;
    }

    public void adicionarEstudante(Estudante estudante) {
        if (tamanho < capacidade) {
            fila[tamanho++] = estudante;
        } else {
            JOptionPane.showMessageDialog(null, "Fila cheia. Não é possível adicionar mais estudantes.");
        }
    }

    public Estudante removerEstudante() {
        if (tamanho > 0) {
            Estudante estudanteRemovido = fila[0];
            for (int i = 0; i < tamanho - 1; i++) {
                fila[i] = fila[i + 1];
            }
            tamanho--;
            return estudanteRemovido;
        } else {
            JOptionPane.showMessageDialog(null, "Fila vazia. Não há estudantes para remover.");
            return null;
        }
    }
}
