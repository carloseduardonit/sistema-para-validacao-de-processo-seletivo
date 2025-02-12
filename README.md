# Sistema para Validação de Processo Seletivo 🚀

Esse projeto foi desenvolvido como parte do curso da DIO Bootcamp e tem como objetivo principal facilitar a **validação** e o **gerenciamento** dos processos seletivos, garantindo que os dados dos candidatos sejam analisados de forma segura e eficiente. O sistema foi implementado em **Java** e incorpora conceitos de boas práticas de desenvolvimento, validação de dados e automação de processos.

---

## Funcionalidades ✨

- **Validação de Dados:** Confere a integridade e a consistência dos dados dos candidatos ✅  
- **Gerenciamento de Processos Seletivos:** Organiza e automatiza as etapas do processo seletivo 📋  
- **Interface Intuitiva:** Foco na simplicidade e usabilidade para facilitar o uso diário 🎨  
- **Integração:** Possibilidade de integração com outros sistemas e APIs para ampliar a automação 🔗

---

### Caso 1:

Vamos imaginar que em um processo seletivo existe o valor base salarial de RS 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:

- Se o valor salario base for maior que valor salario pretentido, imprima:
**"LIGAR PARA O CANDIDATO"**;
- Senão Se o valor salario base for igual ao valor salario pretentido, imprima:
**"LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA"**;
- Senão imprima: **"AGUARDANDO RESULTADO DEMAIS CANDIDATOS"**

### Caso 2:

Foi solicitado que nosso sistema garanta que diante das inúmeras
candidaturas sejam selecionados apenas no máximo 5 candidatos para
entrevista onde o salário pretendido seja menor ou igual ao salário base:

### Caso 3: imprimir a lista dos candidatos selecionados

Agora é hora imprimir a lista dos candidatos selecionados para disponibilizar para o RH entrar em contato.

### [ ] Caso 4: O RH deverá realizar uma ligação

O RH deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda, deve-se

- imprimir: **"CONSEGUIMOS CONTATO COM [CANDIDATO] Após [TENTATIVA] TENTATIVA(S)"**
- do contrário imprima: **"NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO] "**

### Caso 5: Controle de Fluxo - Desafio

DIO - Trilha Java Básico
www.dio.me

Autores
Gleyson Sampaio
Controle de Fluxo - Desafio
Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
Crie o projeto DesafioControleFluxo
Dentro do projeto, crie a classe Contador.java para realizar toda a codificação do nosso programa.
Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham ??

``` java
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
	}
}
```
---

## Tecnologias Utilizadas 🛠️

- **Java:** Linguagem principal utilizada no desenvolvimento do sistema.  
- [Outras bibliotecas ou frameworks, se houver, podem ser listados aqui]

---

## Como Executar ⚙️

1. **Clone o repositório:**

   ``` bash

   git clone https://github.com/carloseduardonit/sistema-para-validacao-de-processo-seletivo.git

   ```

<div align="center"> <small>Desenvolvido com ♥ por <strong>Carlos Eduardo NIT</strong> durante o DIO Bootcamp</small> </div>