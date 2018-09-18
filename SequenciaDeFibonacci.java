import java.util.Scanner;
public class SequenciaDeFibonacci {
     	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		int atual = 0;
		int proximo = 0;
		int anterior = 1;
		System.out.println("Digite a posicao da sequencia fibonacci desejada: ");
		int num = aaa.nextInt();
		int sequencia[] = new int [num];
		for (int j = 0; j < sequencia.length; j++) {
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			sequencia[j] = proximo;
		}
		for (int i = 0; i < sequencia.length; i++) {
			System.out.print(sequencia[i] + "\t");
		} 

	}
}

