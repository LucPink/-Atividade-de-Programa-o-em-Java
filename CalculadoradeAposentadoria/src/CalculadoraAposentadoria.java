import javax.swing.JOptionPane;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        
        String inputIdade = JOptionPane.showInputDialog("Digite sua idade:");
        int idade = Integer.parseInt(inputIdade);

        
        String sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F):");

        
        String inputAnosContribuicao = JOptionPane.showInputDialog("Digite seus anos de contribuição:");
        int anosContribuicao = Integer.parseInt(inputAnosContribuicao);

        
        boolean podeAposentarPorIdade = false;
        int anosFaltantesIdade = 0;

        if (sexo.equalsIgnoreCase("M")) { // Homem
            if (idade >= 65) {
                podeAposentarPorIdade = true;
            } else {
                anosFaltantesIdade = 65 - idade;
            }
        } else if (sexo.equalsIgnoreCase("F")) { // Mulher
            if (idade >= 62) {
                podeAposentarPorIdade = true;
            } else {
                anosFaltantesIdade = 62 - idade;
            }
        }

        
        boolean podeAposentarPorContribuicao = false;
        int anosFaltantesContribuicao = 0;

        if (anosContribuicao >= 35) {
            podeAposentarPorContribuicao = true;
        } else {
            anosFaltantesContribuicao = 35 - anosContribuicao;
        }

        
        String mensagem = "Situação da Aposentadoria:\n";

        if (podeAposentarPorIdade && podeAposentarPorContribuicao) {
            mensagem += "Você pode se aposentar por idade e por tempo de contribuição.";
        } else if (podeAposentarPorIdade) {
            mensagem += "Você pode se aposentar por idade, faltam " + anosFaltantesContribuicao + " anos de contribuição.";
        } else if (podeAposentarPorContribuicao) {
            mensagem += "Você pode se aposentar por tempo de contribuição, faltam " + anosFaltantesIdade + " anos de idade.";
        } else {
            mensagem += "Você ainda não pode se aposentar. Faltam " + anosFaltantesIdade + " anos de idade e " + anosFaltantesContribuicao + " anos de contribuição.";
        }

        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
