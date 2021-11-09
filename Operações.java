package Calculadora;

public class Operações {
    private final float numero1;
    private final float numero2;
public Operações(float numero1, float numero2){
    this.numero1=numero1;
    this.numero2=numero2;
}
public float somar(){
    return(numero1+numero2);}
public float subtrair(){
    return(numero1-numero2);}
public float dividir(){
    return(numero1/numero2);}
public float multiplicar(){
    return(numero1*numero2);}
}


