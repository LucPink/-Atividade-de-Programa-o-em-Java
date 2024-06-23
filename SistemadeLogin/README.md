# Sistema de Login em Java

Este programa em Java simula um sistema de login simples utilizando `JOptionPane` para entrada de dados do usuário. O sistema permite três tentativas para o usuário inserir corretamente o login e senha, comparando os dados inseridos com o valor "java8".

## Funcionalidade

- **Entrada de Dados**: Utiliza caixas de diálogo `JOptionPane` para solicitar ao usuário o nome de usuário e senha.
  
- **Verificação de Login**: Compara os dados inseridos com o valor fixo "java8". O login é bem-sucedido se ambos o nome de usuário e a senha estiverem corretos.

- **Tentativas de Login**: O usuário tem três tentativas para inserir corretamente o login e senha. Após três tentativas incorretas, o acesso ao sistema é bloqueado.

- **Mensagens Informativas**: O programa exibe mensagens informativas através de `JOptionPane.showMessageDialog` para indicar se o login foi realizado com sucesso ou se houve erro de autenticação.
