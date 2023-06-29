package desafio;
import java.util.Scanner;

public class desafio {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosExceptions exception) {
			
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExceptions {
		if(parametroUm < parametroDois) {
			throw new ParametrosInvalidosExceptions("Ocorreu um erro específico!");
		}
		int contagem = parametroDois - parametroUm;
		
	}

}
