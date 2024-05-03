import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double salarioBase = 2000.00;

        System.out.println("***** PROCESSO SELETIVO *****");
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


    }
}
