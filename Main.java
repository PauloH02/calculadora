package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um Número: ");
        float v1 = scan.nextFloat();
        System.out.println("Informe o sinal da operação: ");
        scan.nextLine();
        String sinal = scan.nextLine();
        System.out.println("Informe outro Número: ");
        float v2 = scan.nextFloat();
Operações oper = new Operações(v1, v2);
        System.out.println("Resultado é: ");
switch(sinal){
    case "+":
        System.out.println(oper.somar());
        break;
    case "-":
        System.out.println(oper.subtrair());
        break;
    case "/":
        System.out.println(oper.dividir());
        break;
    case "*":
        System.out.println(oper.multiplicar());
        break;
}
    }
}
