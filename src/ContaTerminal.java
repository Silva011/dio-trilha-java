import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //todo import scanner
        // exibir msg
        //obter valor
        System.out.println("Por favor, digite o número da da sua Conta !");
        Scanner scannerNumero=new Scanner(System.in);
        int Numero=scannerNumero.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        Scanner scannerAgencia=new Scanner(System.in);
        String Agenecia=scannerAgencia.nextLine();
        
        System.out.println("Por favor, digite o seu nome !");;
        Scanner scannerNome=new Scanner(System.in);
        String Nome=scannerNome.nextLine();
        
        System.out.println("Por favor, digite seu saldo !");
        Scanner scannerSaldo=new Scanner(System.in);
        Double Saldo=scannerSaldo.nextDouble();

        System.out.println("Olá"+ Nome+ ",obrigado por criar uma conta em nosso banco, sua agência é "+Agenecia+ ", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
       
    }
}
