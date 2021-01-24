public class CalculaSalario {
    public static void main(String[] args) {
		int anoAtual, anoAdmissao;
		double salario, percentual;
		salario = 1000;
		anoAdmissao = 2016;
		percentual = 0.005;
		do {
			System.out.print("Informe o ano atual: ");
			anoAtual = Integer.parseInt(System.console().readLine());
		} while (anoAtual <= anoAdmissao);

		while((anoAdmissao+1) <= anoAtual) {
			salario = salario + percentual * salario;
			anoAdmissao = anoAdmissao + 1;
			percentual = percentual * 2;
		}
		System.out.printf("\nSalario do funcionario no ano atual = R$ %.2f\n", salario);
	}
}

