import java.util.Scanner;
public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
    System.out.println("SISTEMA PARA DESCOBRIR O TEMPO NO PERCURSO");
    System.out.println("Você deve digitar a velocidade media:");
    System.out.println("Digite 1 para: velocidade em KM/H");
    System.out.println("Digite 2 para: velocidade em MPH");
    int escolha = sc.nextInt();

    switch (escolha) {
        case 1:  {
            System.out.println("Digite a velocidade média:");
            double valor = sc.nextDouble();
            VelocidadeEmKm velocidade = new VelocidadeEmKm(valor);
            double tempo = 15.0 / velocidade.getVelocidadeEmKm();
            tempo = velocidade.tempoEmMinutos(tempo);
            System.out.println("mostrando tudo"+ tempo);
        }
        case 2:  {
            System.out.println("Digite a velocidade média: ");
            double valorMPH = sc.nextDouble();
            VelocidadeEmMPH velocidadeEmMPH = new VelocidadeEmMPH(valorMPH);
            VelocidadeKm velocidade = new AdapterMPHParaKm(velocidadeEmMPH);
            double tempo = 15.0 / velocidade.getVelocidadeEmKm();
            tempo = velocidade.tempoEmMinutos(tempo);
            System.out.println("tempu"+tempo);
        }
    }

}
}
