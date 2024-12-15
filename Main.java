import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal de Estimação Virtual!");
        System.out.println("Digite o nome do seu animal de estimação:");
        String nomePet = scanner.nextLine();
        System.out.println("Que nome bonito é este  " + nomePet);
        VirtualPet pet = new VirtualPet(nomePet);

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar " + nomePet);
            System.out.println("2. Brincar com " + nomePet);
            System.out.println("3. Verificar o status de " + nomePet);
            System.out.println("4. Descansar o PET" );
            System.out.println("5. Sair do jogo");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pet.alimentar();
                    pet.verificarStatus(); //Coloquei esse daiiiii
                    break;
                case 2:
                    pet.brincar();
                    pet.cansaço();
                    pet.idade();
                    pet.verificarStatus();
                    pet.idade();
                    break;
                case 3:
                    pet.verificarStatus();
                    pet.descansar();
                    pet.idade();
                    break;
                case 4:
                    pet.descansar();
                    pet.idade();
                    break;
                case 5:
                    System.out.println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!");
                    return;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            pet.passarTempo(); // Simula o tempo que passa após cada ação
        }
    }
}
