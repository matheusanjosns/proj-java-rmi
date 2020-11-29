import java.rmi.*;
import java.rmi.server.*;
public class CalculadoraRemota extends UnicastRemoteObject implements Calculadora{
    CalculadoraRemota() throws RemoteException{
        super();
    }
    public int somar (int num1, int num2) {
        return num1+num2;
    }   
    public int subtrair (int num1, int num2) {
        return num1-num2;
    }
    public int multiplicar (int num1, int num2) {
        return num1*num2;
    }
    public int dividir (int num1, int num2) {
        return num1/num2;
    } }