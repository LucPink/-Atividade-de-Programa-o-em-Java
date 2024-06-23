import javax.swing.JOptionPane;

public class SistemaLogin {

    
    public static boolean verificarLogin(String usuario, String senha) {
        return usuario.equals("java8") && senha.equals("java8");
    }

    public static void main(String[] args) {
        
        int maxTentativas = 3;
        int tentativas = 0;
        boolean logado = false;

       
        while (tentativas < maxTentativas) {
            
            String usuario = JOptionPane.showInputDialog("Digite o usuário:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            
            if (verificarLogin(usuario, senha)) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                logado = true;
                break; 
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente.");
                tentativas++;
            }
        }

        
        if (!logado) {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso bloqueado.");
        }
    }
}
