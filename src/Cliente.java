import java.rmi.*;
import java.util.Scanner;
public class Cliente{
    public static void main(String args[]){
        try{
            Calculadora calculadora = (Calculadora)
                     Naming.lookup("rmi://localhost:8000/calculadora");

            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(calculadora.somar(num1,num2));
            System.out.println(calculadora.subtrair(num1,num2));
            System.out.println(calculadora.multiplicar(num1,num2));
            System.out.println(calculadora.dividir(num1,num2));
        }catch(Exception e){}
    } }