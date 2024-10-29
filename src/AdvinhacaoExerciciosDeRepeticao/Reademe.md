# Jogo de Adivinhação em Java

Este é um simples jogo de adivinhação em Java, onde o usuário tenta adivinhar um número aleatório gerado pelo programa.
O número está entre 0 e 99, e o jogador tem um máximo de 5 tentativas para acertá-lo. O jogo fornece dicas sobre se o
palpite é maior ou menor do que o número aleatório.

## Funcionalidades

- Geração de um número aleatório entre 0 e 99.
- Limite de 5 tentativas para adivinhar o número.
- Dicas ao jogador informando se o número aleatório é 0 maior ou menor que o palpite.
- Mensagens informativas sobre o resultado do jogo (acerto ou exaustão de tentativas).

## Requisitos

- Java JDK 8 ou superior.
- IDE ou editor de texto para editar e executar o código (por exemplo, IntelliJ IDEA, Eclipse, Visual Studio Code).

## Como Executar

1. Clone o repositório:

Copiar código:

 ```bash
git clone https://github.com/ChristopherADS/estudandoJavaout2024
cd jogo-adivinhacao
```

2. Compile o código:

Abra seu terminal ou prompt de comando, navegue até o diretório onde o arquivo Advinhacao1.java está localizado e
execute:

 ```bash
  javac Advinhacao1.java
```

3. Execute o programa:

Após a compilação, execute o programa com o comando:

```bash
java Advinhacao1
```

4. Siga as instruções na tela para jogar!

## Estrutura do Código

- Pacote: `AdvinhacaoExerciciosDeRepeticao`
- Classe Principal: `Advinhacao1`
- Método Principal: `main(String[] args)`

## Lógica do Jogo

1. Gera um número aleatório.
2. Inicia um loop que permite ao usuário fazer palpites até atingir o limite de tentativas.
3. Verifica se o palpite está correto e fornece dicas se o palpite é maior ou menor que o número aleatório.
4. Exibe mensagens finais ao usuário com o resultado do jogo.

## Contribuiçoes

Sinta-se à vontade para contribuir com melhorias ou correções. Você pode abrir uma issue ou fazer um `pull request` no
repositório.