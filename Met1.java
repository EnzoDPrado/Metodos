import java.util.Scanner;
class Met1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double valor1 = entrada("Digite o primeiro valor!");
        double valor2 = entrada("Digite o segundo valor!");

        double somar = somar(valor1, valor2);
        double diferenca = subtrair(valor1, valor2);
        double produto= multiplicar(valor1, valor2);
        double quociente = divisao(valor1, valor2);

        saida(valor1, '+', valor2, somar);
        saida(valor1, '-', valor2, diferenca);
        saida(valor1, '*', valor2, produto);
        saida(valor1, '/', valor2, quociente);
        
    }


    //método para somar
    public static double somar(double n1, double n2){
        return(n1+n2);
    }

    //método para subtrair
    public static double subtrair(double n1, double n2){
        return(n1-n2);
    }

    //método para multiplicar 
    public static double multiplicar(double n1, double n2){
        return(n1*n2);
    }

    //método para dividir
    public static double divisao(double n1, double n2){
        if(n2 == 0){
            return -1;
        }
         return(n1/n2);
    }

    //método para entrada de dados
    public static double entrada(String frase){
        Scanner input = new Scanner(System.in);
        System.out.println(frase);
        double numero = input.nextDouble();
        return numero;
    }

    //método para exibir a saida
    public static void saida(double val1,char op, double val2, double result){
        System.out.println(val1 + " " + op + " " + val2 + " = " + result);

        
    }
    

} 

