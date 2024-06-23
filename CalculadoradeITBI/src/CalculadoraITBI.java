import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double valorTransacao = Double.parseDouble(inputTransacao);

        
        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double valorVenal = Double.parseDouble(inputVenal);

        
        String inputPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");
        double porcentagemITBI = Double.parseDouble(inputPorcentagem);

        
        double maiorValor = Math.max(valorTransacao, valorVenal);
        double valorITBI = maiorValor * (porcentagemITBI / 100);

        
        JOptionPane.showMessageDialog(null, "Valor do ITBI a ser pago: R$ " + valorITBI);
    }
}
