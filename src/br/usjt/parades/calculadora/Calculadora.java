package br.usjt.parades.calculadora;

public class Calculadora {

	public double n1, n2;

	public Calculadora(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public Calculadora() {
	}

	public double adiciona(double n1, double n2) {
		return n1 + n2;
	}

	public int adicionaI(int n1, int n2) {
		return n1 + n2;
	}

	public double subtrai(double n1, double n2) {
		return n1 - n2;
	}

	public int subtraiI(int n1, int n2) {
		return n1 - n2;
	}

	public double multiplica(double n1, double n2) {
		return n1 * n2;
	}

	public int multiplicaI(int n1, int n2) {
		return n1 * n2;
	}

	public double divide(double n1, double n2) {
		return n1 / n2;
	}

	public int divideI(int n1, int n2) {
		return n1 / n2;
	}

	public double calcula(char operacao) {
		switch (operacao) {
		case '+':
			return adiciona(n1, n2);
		case '-':
			return subtrai(n1, n2);
		case '*':
			return multiplica(n1, n2);
		case '/':
			return divide(n1, n2);
		default:
			return 0.0d;

		}
	}

}