//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  jdk-13_windows-x64_bin
//  Apache NetBeans IDE 11.1
//  Tambien, hace unos dias le envie ejercicios de la Unidad_6 *
package Ejercicios;
import java.util.Random;
public class Ejercicio 
{
    public static void holaMundoPrint()
    {
        System.out.println("Hola Mundo.");
    }
    
    public static int ejercicioSuma(int Numeros[])
    {
        int Res = 0;
        for(int i=0; i<Numeros.length; i++)
        {
            Res=Res+Numeros[i];
        }
        return Res;
    }
    
    public static int ejercicioResta(int Numeros[])
    {
        int Res = Numeros[0];
        for(int i=1; i<Numeros.length; i++)
        {
            Res=Res-Numeros[i];
        }
        return Res;
    }
    
    public static boolean esPar(int numero)
    {
        boolean par=false;
        return numero % 2 == 0;
    }
    
    public static int cubo(int numero)
    {
        return (int) Math.pow(numero,3);
    }
    
    public static int cantidadDeDivisores(int numero)
    {
        int CantDivisores=0;
        for(int i=1;i<=numero;i++)
        {
            if(numero % i == 0)
            {
                CantDivisores++;
            }
        }
        return CantDivisores;
    }
    
    public static int mayorDeTres(int Numeros[])
    {
        int Max = Math.max(Numeros[0], Numeros[1]);
        Max = Math.max(Max, Numeros[2]);
        return Max;
    }
    
    public static void imprimirSimbolo(int veces, char caracter)
    {
        for(int i=0;i<veces;i++)System.out.print(caracter);
    }
    
    public static int azar(int numeromax)
    {
        Random NumerosR = new Random();
        int NumeroRand = NumerosR.nextInt(numeromax-0);
        return NumeroRand;
    }
    
    public static boolean esVocal(char C)
    {
       boolean flag = C == 'A' || C == 'a' || C == 'e' || C == 'E' || C == 'I' || C == 'i' || C == 'o' || C == 'O' || C == 'u' || C == 'U';
       return flag;
    }
    
    public static String obtenerMesEnTexto(byte mes)
       {
           String str = "";
           switch(mes)
           {
               case 1:{str="Enero";};break;
               case 2:{str="Febrero";};break;
               case 3:{str="Marzo";};break;
               case 4:{str="Abril";};break;
               case 5:{str="Mayo";};break;
               case 6:{str="Junio";};break;
               case 7:{str="Julio";};break;
               case 8:{str="Agosto";};break;
               case 9:{str="Septiembre";};break;
               case 10:{str="Octubre";};break;
               case 11:{str="Noviembre";};break;
               case 12:{str="Diciembre";};break;
               default: {str="";};break;
           }
           return str;
       }
}
