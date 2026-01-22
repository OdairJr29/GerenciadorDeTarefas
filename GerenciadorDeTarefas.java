import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next(); // descarta entrada inválida
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o 


            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\n--- Tarefas ---");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                    }
                    break;
                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Não há tarefas para remover.");
                    } else {
                        System.out.println("\nInforme o número da tarefa para remover:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        System.out.print("Número: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine(); // limpa o 


                        if (indice < 1 || indice > tarefas.size()) {
                            System.out.println("Número inválido.");
                        } else {
                            String removida = tarefas.remove(indice - 1);
                            System.out.println("Tarefa removida: " + removida);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}