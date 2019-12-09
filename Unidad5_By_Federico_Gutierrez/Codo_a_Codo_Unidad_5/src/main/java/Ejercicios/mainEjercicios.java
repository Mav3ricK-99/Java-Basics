//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  jdk-13_windows-x64_bin
//  Apache NetBeans IDE 11.1
//  Tambien, hace unos dias le envie ejercicios de la Unidad_6 *
package Ejercicios;
import java.util.Scanner;

public class mainEjercicios 
{
    public static void main(String[] args) 
    {
           String menustr = getMenu();
           Scanner MainScanner = new Scanner(System.in);
           int Opcion = 1;
           do
           {
               System.out.println(menustr);
               if(!MainScanner.hasNextInt()) 
                {
                    System.out.println("Debe ser un numero...");
                }
               else
                {
                   Opcion = MainScanner.nextInt();
                }
           }while(Opcion < 1 || Opcion > 30);
           
           switch(Opcion)
           {
               case 1:{Ejercicio.holaMundoPrint();}break;
               case 2:{ejercicio2();}break;
               case 3:{ejercicio3();}break;
               case 4:{ejercicio4();}break;
               case 5:{ejercicio5();}break;
               case 6:{ejercicio6();}break;
               case 7:{ejercicio7();}break;
               case 8:{ejercicio8();}break;
               case 9:{ejercicio9();}break;
               case 10:{ejercicio10();}break;
               default:{System.out.println("No hay tal ejercicio.");};break;
           }
       }
       
        public static String getMenu()
       {
           String getmenu = 
                   "1_ Procedimiento Hola Mundo.\n"+
                   "2_ Ingreso 2 Numeros - Suma - Resta.\n"+
                   "3_ Devolver si es par.\n"+
                   "4_ Devolver el Cubo.\n"+
                   "5_ Cantidad de divisores.\n"+
                   "6_ Mayor de 3.\n"+
                   "7_ Cadena repetir caracteres.\n"+
                   "8_ Numero azar.\n"+
                   "9_ Saber si es vocal.\n"+
                   "10_ Mes en texto.\n";
                   
           
           int Salto = 2;
           for(int i = 0; i < Salto; i++){
           System.out.println();
           }
           return getmenu;
       }
        public static int[] ingresoNumerosEnteros(int[] Numeros)
        {
               Scanner Numeros_Scanner = new Scanner(System.in);
              
               for(int key=0; key<Numeros.length; key++)
               {
                   System.out.println("Ingrese el numero "+(key+1));
                    while(!Numeros_Scanner.hasNextInt())
                    {
                        System.out.println("Ingrese el Numero "+(key+1));
                        Numeros_Scanner.next();
                    }
                    Numeros[key] = Numeros_Scanner.nextInt();
               }
                   
               return Numeros;
        }
        public static int ingresoNumero()
        {
            int Numero_ingr;
            Scanner Numeros_Scanner = new Scanner(System.in);
             while(!Numeros_Scanner.hasNextInt())
                    {
                        System.out.println("Ingrese un Numero entero.");
                        Numeros_Scanner.next();
                    }
                    Numero_ingr = Numeros_Scanner.nextInt();
            return Numero_ingr;
        }
        
        public static char ingresoCaracter()
        {
            System.out.println("Ingrese un Caracter. Se tomara el primer caracter que ingrese.");
            Scanner Caracter_Scanner = new Scanner(System.in);
            char Caracter = Caracter_Scanner.next().charAt(0); 
             
            return Caracter;
        }
        
        public static boolean decidirEntre2Caracteres(char a, char b, String mensaje)
        {
            boolean flag=false;
            char Caracter;
            a = Character.toLowerCase(a); 
            b = Character.toLowerCase(b); 
            Scanner IngresoChar = new Scanner(System.in);
            System.out.println(mensaje);
            Caracter = IngresoChar.next().charAt(0); 
            
            while ((Caracter != Character.toUpperCase(a)  && Caracter != a) && (Caracter != b && Caracter != Character.toUpperCase(b))) 
             {
                //Mientras el Caracter no sea Ni la minuscula ni la mayuscula del primer atributo, como asi tampoco del segundo.
                System.out.println(mensaje);
                Caracter = IngresoChar.next().charAt(0); 
             }
             if(Caracter == a || Caracter == Character.toUpperCase(a))return true;
             if(Caracter == b || Caracter == Character.toUpperCase(b))return false;
             return false;
        }
        
        public static int ingresoNumeroEntre(int min, int max, String mensaje)
        {
          int Resultado;
          System.out.println(mensaje);
          Scanner Numeros = new Scanner(System.in);

          if (Numeros.hasNextByte()) 
          {
            Resultado = Numeros.nextByte();
          } else {
            Numeros.next();  
            Resultado = 0;
          }

          while (Resultado < min || Resultado > max) 
          {
              System.out.println(mensaje);
              if (Numeros.hasNextByte()) {
                  Resultado = Numeros.nextByte();
               } else {
                 String str = Numeros.next();
                 Resultado = 0;
              }
          }
          return Resultado;
            
        }
        
        public static void ejercicio2()
        {
            int Numeros[] = new int[2];
            boolean flag;
            int Resultado;
            Numeros = ingresoNumerosEnteros(Numeros);
            flag = decidirEntre2Caracteres('S', 'R', "Indique su operando - Sumar o Restar ( S / R )");
            if(flag)
            {
                Resultado = Ejercicio.ejercicioSuma(Numeros);
            }
            else
            {
                Resultado = Ejercicio.ejercicioResta(Numeros);
            }
            System.out.println(Resultado);
        }
        
       public static void ejercicio3()
       {
           System.out.println("Ingrese un numero - Se le hara saber si es par o no.");
           int Numero = ingresoNumero();
           System.out.println(Ejercicio.esPar(Numero));
       }
       
       public static void ejercicio4()
       {
           System.out.println("Ingrese un numero - Se le devolvera el cubo del mismo.");
           int Numero = ingresoNumero();
           System.out.println(Ejercicio.cubo(Numero));
       }
       
       public static void ejercicio5()
       {
           System.out.println("Ingrese un numero - Se le devolvera la cantidad de divisores que tiene.");
           int Numero = ingresoNumero();
           System.out.println(Ejercicio.cantidadDeDivisores(Numero));
       }
       
       public static void ejercicio6()
       {
            int Numeros[] = new int[3];
            Numeros = ingresoNumerosEnteros(Numeros);
            System.out.println();
            System.out.println(Ejercicio.mayorDeTres(Numeros));
       }
       
       public static void ejercicio7()
       {
           System.out.println("Ingrese las veces que se repetira el caracter.");
           int Numero = ingresoNumero();
           char Caracter = ingresoCaracter();
           Ejercicio.imprimirSimbolo(Numero, Caracter);
       }
       
       public static void ejercicio8()
       {
           System.out.println("Ingrese un numero como limite.");
           int NumeroMax = ingresoNumero();
           while(NumeroMax == 0)
           {
                System.out.println("Ingrese un numero como limite.");
                NumeroMax = ingresoNumero();
           }
           System.out.println("Numero random es: "+Ejercicio.azar(NumeroMax));
       }
       
       public static void ejercicio9()
       {
           char Caracter = ingresoCaracter();
           System.out.println(Ejercicio.esVocal(Caracter));
       }
       
       public static void ejercicio10()
        {
          byte mes;
          String mes_en_letras;
          mes = (byte)ingresoNumeroEntre(1,12,"Indique un numero. (1 - 12)");
          mes_en_letras = Ejercicio.obtenerMesEnTexto(mes);
          System.out.println("( "+mes+" ). El mes actual es "+mes_en_letras);
        }
  }

    

