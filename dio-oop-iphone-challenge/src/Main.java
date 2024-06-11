import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha uma ação:");
            System.out.println("1. Tocar música");
            System.out.println("2. Pausar música");
            System.out.println("3. Selecionar música");
            System.out.println("4. Ligação telefônica");
            System.out.println("5. Atender chamada");
            System.out.println("6. Iniciar correio de voz");
            System.out.println("7. Exibir página da internet");
            System.out.println("8. Adicionar nova aba no navegador");
            System.out.println("9. Atualizar página da internet");
            
            System.out.print("Escolha: ");
            int escolha = scanner.nextInt();
            
            iPhone iphone = new iPhone();
            
            switch (escolha) {
                case 1 -> iphone.getReprodutorMusical().tocar();
                case 2 -> iphone.getReprodutorMusical().pausar();
                case 3 -> {
                    System.out.print("Digite o nome da música: ");
                    scanner.nextLine(); // Limpa o buffer
                    String musica = scanner.nextLine();
                    iphone.getReprodutorMusical().selecionarMusica(musica);
                }
                case 4 -> {
                    System.out.print("Digite o número para ligar: ");
                    String numero = scanner.next();
                    iphone.getAparelhoTelefonico().ligar(numero);
                }
                case 5 -> iphone.getAparelhoTelefonico().atender();
                case 6 -> iphone.getAparelhoTelefonico().iniciarCorreioVoz();
                case 7 -> {
                    System.out.print("Digite a URL da página: ");
                    scanner.nextLine(); // Limpa o buffer
                    String url = scanner.nextLine();
                    iphone.getNavegadorNaInternet().exibirPagina(url);
                }
                case 8 -> iphone.getNavegadorNaInternet().adicionarNovaAba();
                case 9 -> iphone.getNavegadorNaInternet().atualizarPagina();
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
