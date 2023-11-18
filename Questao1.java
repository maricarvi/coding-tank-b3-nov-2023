import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valor do financiamento
        System.out.print("Digite o valor do financiamento: ");
        double valorFinanciamento = scanner.nextDouble();

        // Taxa de juros
        System.out.print("Digite a taxa de juros (em porcentagem): ");
        double taxaJuros = scanner.nextDouble() / 100;

        // Tempo pagamento
        System.out.print("Digite o número de meses para pagamento: ");
        int tempoPagamento = scanner.nextInt();

        // Valor amortização
        double amortizacao = valorFinanciamento / tempoPagamento;

        // Saldo devedor
        double saldoDevedor = valorFinanciamento;

        double totalPago = 0;
        double totalJuros = 0;
        double totalAmortizado = 0;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com juros de %.2f%% ao mês%n",
                amortizacao, valorFinanciamento, taxaJuros * 100);

        // parcelas mensais
        for (int i = 1; i <= tempoPagamento; i++) {
            double jurosMensal = saldoDevedor * taxaJuros;
            double prestacao = jurosMensal + amortizacao;

            saldoDevedor -= amortizacao;


            totalPago += prestacao;
            totalJuros += jurosMensal;
            totalAmortizado += amortizacao;

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f%n",
                    i, jurosMensal, prestacao, saldoDevedor);
        }

        // Mostrar totais
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f%n",
                totalPago, totalJuros, totalAmortizado);

    }
}

