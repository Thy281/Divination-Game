# 🎮 Jogo de Adivinhação | Divination Game

### 🇧🇷 Português

**Descrição** Este é um desafio de lógica desenvolvido em Java que simula um jogo de adivinhação. O programa gera um número aleatório entre 0 e 100, e o usuário tem até 5 tentativas para acertar, recebendo dicas se o número secreto é maior ou menor que o palpite atual.

**Principais Aprendizados:**
* **Entrada de Dados**: Uso da classe `Scanner` para capturar os palpites do usuário via terminal.
* **Geração Aleatória**: Implementação da classe `Random` para criar um número secreto dinâmico a cada execução.
* **Controle de Fluxo**: Uso de estrutura de repetição `while` para limitar as jogadas e condicionais `if/else` para as regras de negócio.
* **Instrução Break**: Aplicação do `break` para interromper o loop imediatamente após o acerto, conforme sugerido no exercício.

---

### 🇺🇸 English

**Description** This is a logic challenge developed in Java that simulates a divination game. The program generates a random number between 0 and 100, and the user has up to 5 attempts to guess it, receiving hints if the secret number is higher or lower than the current guess.

**Key Learnings:**
* **Data Input**: Using the `Scanner` class to capture user guesses via terminal.
* **Random Generation**: Implementing the `Random` class to create a dynamic secret number for each run.
* **Flow Control**: Using the `while` loop to limit attempts and `if/else` conditionals for game rules.
* **Break Instruction**: Applying `break` to stop the loop immediately after a correct guess, as suggested by the exercise.

---

### 🛠️ Tecnologias | Technologies
* **Java 17+**
* **IntelliJ IDEA**
* **Git & GitHub**
* **Arch Linux** (Ambiente de Desenvolvimento / Dev Environment)

### 🚀 Como rodar | How to run
```bash
# Clone o repositório / Clone the repository
git clone [https://github.com/Thy281/Divination-Game.git](https://github.com/Thy281/Divination-Game.git)

# Entre na pasta src / Enter the src folder
cd Divination-Game/src

# Compile o código / Compile the code
javac JavaCore/JogoAdivinhacao.java

# Execute o jogo / Run the game
java JavaCore.JogoAdivinhacao
