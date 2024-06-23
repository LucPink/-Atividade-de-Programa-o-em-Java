import javax.swing.JOptionPane;

public class CircuitoResistencias {

    
    public static double calcularResistenciaEquivalente(double r1, double r2, double r3, double r4) {
        return r1 + r2 + r3 + r4;
    }
    
    
    public static double encontrarMaiorResistencia(double r1, double r2, double r3, double r4) {
        double maior = r1;
        if (r2 > maior) maior = r2;
        if (r3 > maior) maior = r3;
        if (r4 > maior) maior = r4;
        return maior;
    }
    
    
    public static double encontrarMenorResistencia(double r1, double r2, double r3, double r4) {
        double menor = r1;
        if (r2 < menor) menor = r2;
        if (r3 < menor) menor = r3;
        if (r4 < menor) menor = r4;
        return menor;
    }
    
    public static void main(String[] args) {
        
        String inputR1 = JOptionPane.showInputDialog("Digite o valor da resistência R1:");
        double resistencia1 = Double.parseDouble(inputR1);

        String inputR2 = JOptionPane.showInputDialog("Digite o valor da resistência R2:");
        double resistencia2 = Double.parseDouble(inputR2);

        String inputR3 = JOptionPane.showInputDialog("Digite o valor da resistência R3:");
        double resistencia3 = Double.parseDouble(inputR3);

        String inputR4 = JOptionPane.showInputDialog("Digite o valor da resistência R4:");
        double resistencia4 = Double.parseDouble(inputR4);
        
        
        double resistenciaEquivalente = calcularResistenciaEquivalente(resistencia1, resistencia2, resistencia3, resistencia4);
        
        
        double maiorResistencia = encontrarMaiorResistencia(resistencia1, resistencia2, resistencia3, resistencia4);
        
        
        double menorResistencia = encontrarMenorResistencia(resistencia1, resistencia2, resistencia3, resistencia4);
        
       
        String mensagem = "Resistência Equivalente: " + resistenciaEquivalente + "\n";
        mensagem += "Maior Resistência: " + maiorResistencia + "\n";
        mensagem += "Menor Resistência: " + menorResistencia;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
