package exer1;

public class Main {

	public static void main(String[] args) {

		// Calculadora
		System.out.println("Exercício Calculadora");
		Calculadora.soma(2, 3);
		Calculadora.subtracao(3, 2);
		Calculadora.multiplicacao(3, 2);
		Calculadora.divisao(6, 2);
		System.out.println();

		// Mensagem
		System.out.println("Exercício Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		System.out.println();

		// Empréstimo
		System.out.println("Exercício Empréstimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);
		System.out.println();

	}

}
