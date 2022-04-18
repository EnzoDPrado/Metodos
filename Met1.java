import java.util.Scanner;
class Met1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double sim = input.nextDouble();
        double nao = input.nextDouble();

        double teste1 = somar(sim, nao);
        System.out.println("somar= " + teste1);

        double teste2 = subtrair(sim, nao);
        System.out.println("Subtrair= " + teste2);

        double teste3= multiplicar(sim, nao);
        System.out.println("Multiplicar= " + teste3);

        double teste4 = divisao(sim, nao);
        System.out.println("divisão= " + teste4);



    }

    public static double somar(double n1, double n2){
        return(n1+n2);
    }

    public static double subtrair(double n1, double n2){
        return(n1-n2);
    }

    public static double multiplicar(double n1, double n2){
        return(n1*n2);
    }

    public static double divisao(double n1, double n2){
        if(n2 == 0){
            System.out.println("É impossível dividir por 0");
            System.exit(0);
        }
         return(n1/n2);
        
        
    }

} 

