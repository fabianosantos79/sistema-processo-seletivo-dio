import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double salarioBase = 2000.00;
        String[] candidatos = {"Fabiano", "Viviane", "Fernando", "Isabela", "Marcinho", "Maria", "Expedito"};
        List<String> selecionados  = new ArrayList<String>();

        System.out.println("***** PROCESSO SELETIVO - CASE 1 *****");
        System.out.println("Digite o seu nome: ");
        String candidato = scanner.nextLine();
        System.out.println(candidato + ", digite o valor pretendido: ");
        double valor = scanner.nextDouble();

        System.out.println("*** RESULTADO ***");
        if(salarioBase > valor){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == valor) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DE OUTROS CANDIDATOS");
        }

        System.out.println("");

        System.out.println("***** PROCESSO SELETIVO - CASE 2 *****");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Digite o valor pretendido do candidato " + candidatos[i] );
            double valorPretendido = scanner.nextDouble();

            if (valorPretendido > salarioBase){
                selecionados.add(candidatos[i]);
            }
        }

        System.out.println("Candidatos selecionados: " + selecionados);
    }
}
