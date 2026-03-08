import com.google.gson.Gson;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();
        Gson gson = new Gson();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n===============================");
            System.out.println(" Conversor de Moedas ");
            System.out.println("===============================");
            System.out.println("1 - USD -> BRL");
            System.out.println("2 - BRL -> USD");
            System.out.println("3 - EUR -> BRL");
            System.out.println("4 - BRL -> EUR");
            System.out.println("5 - GBP -> BRL");
            System.out.println("6 - BRL -> GBP");
            System.out.println("7 - Sair");
            System.out.println("===============================");

            System.out.print("Escolha uma opção: ");
            opcao = leitura.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando programa...");
                break;
            }

            String base = "";
            String destino = "";

            switch (opcao) {

                case 1:
                    base = "USD";
                    destino = "BRL";
                    break;

                case 2:
                    base = "BRL";
                    destino = "USD";
                    break;

                case 3:
                    base = "EUR";
                    destino = "BRL";
                    break;

                case 4:
                    base = "BRL";
                    destino = "EUR";
                    break;

                case 5:
                    base = "GBP";
                    destino = "BRL";
                    break;

                case 6:
                    base = "BRL";
                    destino = "GBP";
                    break;

                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.print("Digite o valor que deseja converter: ");
            double valor = leitura.nextDouble();

            try {

                String json = consulta.buscarMoeda(base);

                Moeda moeda = gson.fromJson(json, Moeda.class);

                Double taxa = moeda.conversion_rates.get(destino);

                if (taxa == null) {
                    System.out.println("Erro ao encontrar moeda.");
                    continue;
                }

                double resultado = valor * taxa;

                System.out.println("Valor convertido: " + resultado + " " + destino);

            } catch (Exception e) {

                System.out.println("Erro ao consultar API.");
                System.out.println(e.getMessage());

            }

        }

        leitura.close();
    }
}