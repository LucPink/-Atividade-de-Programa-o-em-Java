import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {
    public static void main(String[] args) {
        
        String inputNota1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        double nota1 = Double.parseDouble(inputNota1);

        
        String inputNota2 = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        double nota2 = Double.parseDouble(inputNota2);

        
        String inputNotaTrabalho = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double notaTrabalho = Double.parseDouble(inputNotaTrabalho);

        
        double media = (nota1 + nota2 + notaTrabalho) / 3;

        
        String mensagem;
        if (media >= 6.0) {
            mensagem = "Parabéns! Você está aprovado com média " + media;
        } else {
            mensagem = "Infelizmente você está reprovado com média " + media;
        }

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
