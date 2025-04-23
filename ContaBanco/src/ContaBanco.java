
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    private static int numero;
    private static String agencia;
    private static String nomeCliente;
    private static float saldo;

    public static void main(String[] args) throws Exception {

        exibirMensagem("Olá precisamos de alguns dados para inciar o processo de abertura de conta!");
        exibirMensagem("Por favor informe os dados solicitados a seguir:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        exibirMensagem("Informe o número da conta:");
        numero = scanner.nextInt();

        exibirMensagem("Informe a agência com dígito:");
        agencia = scanner.next();

        exibirMensagem("Informe o nome do titular:");
        nomeCliente = scanner.next();

        exibirMensagem("Informe o saldo (decimais separados por ponto [.]):");
        saldo = scanner.nextFloat();

        exibirMensagem(montarMensagemFinalizacao());
    }

    private static void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    private static String montarMensagemFinalizacao() {
        String mensagemFinalizacao = "Olá " + nomeCliente + ", obrigado por ";
        mensagemFinalizacao = mensagemFinalizacao + "criar uma conta em nosso banco,";
        mensagemFinalizacao = mensagemFinalizacao + " sua agência é " + agencia;
        mensagemFinalizacao = mensagemFinalizacao + ", conta " + numero;
        mensagemFinalizacao = mensagemFinalizacao + " e seu saldo " + saldo;
        mensagemFinalizacao = mensagemFinalizacao + " já está disponível para saque.";

        return mensagemFinalizacao;
    }
}
