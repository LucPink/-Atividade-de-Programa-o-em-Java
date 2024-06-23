# Calculadora de Aposentadoria em Java

Este programa em Java utiliza `JOptionPane` para receber idade, sexo e anos de contribuição de uma pessoa, e determina se ela pode se aposentar com base nas regras de aposentadoria por idade ou por tempo de contribuição.

## Funcionalidade

- **Entrada de Dados**: Utiliza caixas de diálogo `JOptionPane` para solicitar ao usuário as seguintes informações:
  - Idade da pessoa.
  - Sexo da pessoa (M para masculino, F para feminino).
  - Anos de contribuição da pessoa.

- **Cálculo da Aposentadoria**:
  - **Aposentadoria por Idade**:
    - Homens podem se aposentar aos 65 anos.
    - Mulheres podem se aposentar aos 62 anos.
    - Informa quantos anos faltam para atingir a idade mínima, se aplicável.
  - **Aposentadoria por Tempo de Contribuição**:
    - É necessário ter pelo menos 35 anos de contribuição.
    - Informa quantos anos faltam para atingir o tempo mínimo de contribuição, se aplicável.

- **Saída**:
  - Utiliza `JOptionPane.showMessageDialog` para exibir uma mensagem informando se a pessoa pode se aposentar, quantos anos faltam para aposentadoria por idade, por tempo de contribuição ou por ambos, conforme o caso.