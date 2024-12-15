import java.util.Scanner;

class VirtualPet {
    String nome;
    int nivelDeFome = 50;
    int nivelFelicidade = 50;
    int nivelDeCansaço=50;
    int  niveldeidade=1;
    int niveldenivel=0;
    int vontadebanheiro=0;
    int medidordesujeira=0;
    public VirtualPet(String nome) {
        this.nome = nome;
    }

    public void alimentar() {
        nivelDeFome -= 10;
        System.out.println(nome + " foi alimentado. O nível de fome diminuiu.");
        if(nivelDeFome>=100){
            System.out.println("Perdeu!");
            System.exit(0);
        }
        vontadebanheiro +=1;
        System.out.println(nome + " está ficando com vontade de usar o banheiro");
        if(vontadebanheiro >=50){
            System.out.println("Seu Pet morreu de vontade de usar o banheiro :(");
            System.exit(0);
        }
    }

    public void brincar() {
        nivelFelicidade += 10;
        System.out.println(nome + " está brincando e se sentindo mais feliz.");
   medidordesujeira +=1;
        System.out.println(nome+ " está ficando  sujo");
        if (medidordesujeira >= 50){
            System.out.println("Vixi, seu PET ficou muito sujo, voce perdeu !!!");
            System.exit(0);
        }
    }

    public void verificarStatus() {
        System.out.println("Status atual de " + nome + ":");
        System.out.println("Nível de fome: " + nivelDeFome);
        System.out.println("Nível de felicidade: " + nivelFelicidade);
        System.out.println("Nível de cansaço atual é de: " + nivelDeCansaço);
        System.out.println("Nível de sujeira é de :" +medidordesujeira );
        System.out.println("Medidor de vontade de usar o banheiro é de : " +vontadebanheiro);
    }

    public void passarTempo() {
        nivelDeFome += 5;
        System.out.println(nome + " está ficando mais faminto com o passar do tempo.");
       nivelFelicidade -=30;
       nivelDeCansaço +=10;
       if(nivelFelicidade>=0){
           System.out.println("Que pena seu animal chegou ao nível 0 de felicidade!");
       }
       niveldenivel +=1;
    }
    public void cansaço() {
        nivelDeCansaço +=15;
        System.out.println( " Quanto mais ele brinca mais cansado ele fica.");
        System.out.println("Nível de cansaço de " + nome + " é: " + nivelDeCansaço);
        if(nivelDeCansaço>=100){
            System.out.println("Perdeu playboyyyyy, " +nome + "ficou muito cansado e não tankou ");
            System.exit(0);
        }
    }
    public void descansar(){
            Scanner scanner = new Scanner (System.in);

        System.out.println("Por quanto tempo deseja que seu animal descanse? (máximo: 8 horas)");

        int horasDescanso = scanner.nextInt();
        System.out.println("Seu PET descansou e agora o nível de Cansaço dele é:" +nivelDeCansaço);
        if (horasDescanso>8){
            horasDescanso = 8;
            System.out.println("O tempo máximo de descanso é de até 8 horas, reconfigurando o tempo de descanso...");
        } else if (horasDescanso < 0){
            System.out.println("Seu PET está muito cansado.... :(");
            return;
        }
        nivelDeCansaço -=15;

        System.out.println("Seu PET descansou por " + horasDescanso + " horas e agora o nível de cansaço dele é: " + nivelDeCansaço);

    }
    public void idade(){
       niveldeidade +=1 ;
        System.out.println("A idade de " +nome +  " agora é : " + niveldeidade);
        if(niveldeidade==50){
            System.out.println("Acabou o jogo");
            System.exit(0);
            nivelDeFome -=3;
            nivelFelicidade -=3;
            niveldenivel +=1;
        }
    }

}

