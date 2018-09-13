import java.util.Scanner;
public class BancoFuncaoProcedimento {
    public static void main(String[] args) {
               Scanner TT = new Scanner(System.in);
               BancoFuncaoProcedimento objeto = new BancoFuncaoProcedimento();
               double saldo = 0;
               while(true){
                       Menu();
                       int opcao = TT.nextInt();
                       switch(opcao){
                           case 1:
                               objeto.MostrarSaldo(saldo);
                               break;
                           case 2:
                               objeto.Sacar(saldo);
                               break;
                           case 3:
                               objeto.Depositar(saldo);
                               break;
                           case 4:
                               objeto.Sair();
                           default:
                               System.out.println("Por favor, digite uma opção válida e tente novamente.");
                       }
               }
       }

    public static void Menu() {
               System.out.println("----------------------");
               System.out.println("BANCO JAVALI CANSADO");
               System.out.println("----------------------");
               System.out.println("Digite: ");
               System.out.println("");
               System.out.println("1-Ver_seu_saldo");
               System.out.println("2-Sacar");
               System.out.println("3-Depositar");
               System.out.println("4-Sair");
    }

    private static void MostrarSaldo(double saldo) {
               System.out.println("Seu saldo é "+saldo);
    }

    private static double Sacar(double saldo) {
               Scanner TT = new Scanner(System.in);
               System.out.println("Quanto deseja sacar? ");
               System.out.println("R$");
               double saque = TT.nextDouble();
               saldo = saldo - saque;
               return saldo;
    }

    private static double Depositar(double saldo) {
               Scanner TT = new Scanner(System.in);
               System.out.println("Quanto deseja depositar? ");
               System.out.println("R$");
               double deposito = TT.nextDouble();
               saldo = saldo + deposito;
               return saldo;
    }

    private static void Sair() {
               Scanner TT = new Scanner(System.in);
               System.out.println("Você tem certeza que quer sair?");
               System.out.println("Digite 'S' para Sim e 'N' para Não, por favor, somente letras MAIÚSCULAS!!>_<");
               String pergunta = TT.next();
               
               switch(pergunta){
                       case "S":
                               boolean confirmacao = true;
                               System.exit(0);
                       case "N":
                               System.out.println("Joinha, prossiga!");
                       default:
                               System.out.println("Por facor verifique se sua opção é válida, ou se está escrita com letra MAIÚSCULA!!");
               }
    }
 
}
