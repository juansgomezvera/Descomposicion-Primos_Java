/*
 *Programa que pide un numero al usuario y lo descompone en umeros primos.
Por Juan Sebastian Gomez Vera 00039874
 */
package descomposición.primos;



import java.util.Scanner; //Importamos libreria para escanear.
public class DescomposiciónPrimos {

    public static void main (String [ ] args) 
     {
          Scanner objEntrada = new Scanner(System.in);// creamos la variable donde se deposita el numero y se escanea.
          System.out.println("Escribe un numero para sacar sus factores primos");
          int numero = objEntrada.nextInt();
          factor(numero);
     }
//Ahora crearemos el bucle que comprueba los numero primos.
     static void factor(int numero)
     {
          int num = 2;
//Empieza por el dos y va aumentando despues de verificar si eses es un factor primo.
          while(numero!=1)
          {
               while(numero%num==0)
               {
                    System.out.println(num);
                    numero /= num;
               }
               num++;
          }
     }
}
