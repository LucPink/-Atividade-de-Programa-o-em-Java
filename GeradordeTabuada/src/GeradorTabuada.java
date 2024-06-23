import javax.swing.JOptionPane;

public class GeradorTabuada {

    
    public static void gerarTabuada(int numero) {
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Digite um número para gerar a tabuada:");
        int numero = Integer.parseInt(input);

        
        gerarTabuada(numero);
    }
}
