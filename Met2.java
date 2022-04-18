import java.util.Scanner;

public class Met2 {

    double pi = Math.PI;

    public static void main(String args[]) {

        int opc = 0;

        Met2 met2 = new Met2();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Qual operação deseja iniciar?");
            System.out.println("[1]Area Circulo\n[2]Area Triângulo\n[3]Area Quadrado\n[4]Area Retângulo");
            opc = input.nextInt();
            
            if (!(opc < 1) && !(opc > 4)) {
                break;
            }

            System.out.println("Valor invalido, tente novamente!\n");

        }

        if (opc == 1) {
            System.out.println("Digite o raio do circulo");
            double raio = input.nextDouble();
            double fina = met2.ArCirc(raio);
            System.out.println("O valor da área do circulo é: " + fina);
        } else {
            if (opc == 2) {
                System.out.println("Digite a base triângulo");
                double base = input.nextDouble();
                System.out.println("Agora digite a altura do triângulo");
                double altura = input.nextDouble();
                double result = ArRetan(base, altura);
                System.out.println("A area do triângulo é: " + result);
            } else {
                if (opc == 3) {
                    System.out.println("Digite o lado do quadrado");
                    double lado = input.nextDouble();
                    double fteste = ArQua(lado);
                    System.out.println("A area do quadrado é: " + fteste);
                } else {
                    System.out.println("Digite a base do retângulo");
                    double base1 = input.nextDouble();
                    System.out.println("Digite a altura do retângulo");
                    double altura1 = input.nextDouble();
                    double final1 = ArRetan(base1, altura1);
                    System.out.println("A area do retângulo é: " + final1);
                }
            }
        }

    }

    public static double ArQua(double lado) {
        return (lado * lado);
    }

    public static double ArRetan(double base, double altura) {
        return (base * altura);
    }

    public double ArCirc(double raio) {
        return (pi * Math.pow((raio), 2));
    }

    public static double ArTrian(double base, double altura) {
        return ((base * altura) / 2);
    }

}