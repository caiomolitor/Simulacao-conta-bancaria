import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe seu número: ");
        int numero=scanner.nextInt();

        System.out.println("Informe sua agência: ");
        String agencia=scanner.next();

        System.out.println("Informe seu nome: ");
        String nomeCliente=scanner.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenomeCliente=scanner.next();

        System.out.println("Informe seu saldo: ");
        double saldo=scanner.nextDouble();

        System.out.println("Olá "+nomeCliente.concat(" ").concat(sobrenomeCliente)+" obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta "+numero+" e seu saldo de R$"+saldo+" já está disponível para saque.");
    }
}
