
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int contador = 0 ;
        int entrada1,entrada2,resultado;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Entre com o primeiro numero inteiro");
            entrada1 = input.nextInt() ;
            System.out.println("Entre com o segundo numero inteiro \nque por sua vez deve ser maior que o primeiro");
            entrada2 = input.nextInt();

            if(entrada2 < entrada1 ){
                throw new ParametrosInvalidosException();
            }else{
                resultado = entrada2 - entrada1;
            }

            while( contador <= resultado){
                System.out.println("Imprimindo o numero " + contador);
                contador++;
            }
    
            
        }catch(InputMismatchException e ){
            System.out.println("ERRO: ENTRE APENAS COM NUMEROS INTEIROS");
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        
        finally{
            input.close();
        }
            
        
    }
}
