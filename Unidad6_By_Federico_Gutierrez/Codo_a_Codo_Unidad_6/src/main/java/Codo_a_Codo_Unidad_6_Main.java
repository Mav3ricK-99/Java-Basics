//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  jdk-13_windows-x64_bin
//Apache NetBeans IDE 11.1
//package Ejercicios;
import java.util.Scanner;

public class Codo_a_Codo_Unidad_6_Main 
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
               case 1:{Ejercicio1();}break;
               case 2:{Ejercicio2();}break;
               case 18:{Ejercicio18();}break;
               case 19:{Ejercicio19();}break;
               case 24:{Ejercicio24();}break;
               case 25:{Ejercicio25();}break;
               case 28:{Ejercicio28();}break;
               case 29:{Ejercicio29();}break;
               case 30:{Ejercicio30();}break;
               default:{System.out.println("No hay tal ejercicio.");};break;
           }
       }
       
        public static String getMenu()
       {
           String getmenu = 
                   "1_ Ingresar un array.\n"+
                   "2_ Valores de un array divididos por 2.\n"+
                   "3_ Cantidad de butacas ocupadas y vacias.\n"+
                   "4_ Alumnado para cada aula.\n"+
                   "5_ Numeros Capicua. \n"+
                   "6_ Iniciales en Mayuscula.\n"+
                   "7_ Cantidad de palabras.\n"+
                   "8_ Ingreso Nombre y Apellido.\n"+
                   "9_ Ordenamiento burbuja.\n";
           
           int Salto = 2;
           for(int i = 0; i < Salto; i++){
           System.out.println();
           }
           return getmenu;
       }
        public static void ingresoArray(int[]array,String str)
        {
            for(int i=0;i<array.length;i++)
            {
                System.out.println(str+(i+1));
                Scanner EjercicioScanner = new Scanner(System.in);
                while(!EjercicioScanner.hasNextInt())
                {
                    System.out.println(str+(i+1));
                    EjercicioScanner.next();
                }
                array[i] = EjercicioScanner.nextInt();
            }
        }
        
        public static int ingresoIntmenorA(int Numero, int Max)
        {
            Scanner EjercicioScanner = new Scanner(System.in);
            
                if (EjercicioScanner.hasNextInt()) 
                {
                    Numero = EjercicioScanner.nextInt();
                }
                else
                {
                    EjercicioScanner.next();  
                    Numero = (Max+1);
                }
                        
                while (Numero > Max) 
                {
                    System.out.println("El alumnado debe ser menor a "+Max);
                    if (EjercicioScanner.hasNextInt()) 
                    {
                        Numero = EjercicioScanner.nextInt();
                    } 
                    else 
                    {
                       String str = EjercicioScanner.next();
                       Numero = (Max+1);
                    }
                }
                return Numero;
         }
        
        public static String ingresoString(int min, int max, String mensaje, byte PalabrasRequeridas, byte PalabrasMaximo)
        {
            String str;
            byte pal=0;
            Scanner EjercicioScanner = new Scanner(System.in);
            if (EjercicioScanner.hasNextLine()) 
                {
                    str = EjercicioScanner.nextLine();
                }
                else
                {
                    EjercicioScanner.next();  
                    str = "";
                }
                pal = Ejercicio.contarPalabras(str);
                while (str.length() < min || str.length() > max || str.trim().length() == 0 || pal < PalabrasRequeridas || pal > PalabrasMaximo) 
                {
                    System.out.println(mensaje);
                    if (EjercicioScanner.hasNextLine())
                    {
                        str = EjercicioScanner.nextLine();
                    } 
                    else 
                    {
                      str = "";
                    }
                    pal = Ejercicio.contarPalabras(str);
                }
               
            return str;
        }
        
       public static void Ejercicio1()
       {
           int[] Array = new int[5];
           ingresoArray(Array , "Ingrese un valor para la posicion ");
           Ejercicio.recorrerArray(Array);
       }
       
       public static void Ejercicio2()
       {
           int[] Array = new int[5];
           ingresoArray(Array , "Ingrese un valor para la posicion ");
           Ejercicio.recorrerArray_Y_dividir(Array, 2);
       }
       
       public static void Ejercicio18()
       {
           boolean[] Butacas = new boolean[30];
           Butacas = Ejercicio.llenarArrayboolean(Butacas);
           Ejercicio.recorrerArray_V_o_F(Butacas, "Asientos desocupados: ", "Asientos ocupados: ");
       }
       
       public static void Ejercicio19()
       {
           int Alumnado=0, valor1, valor2, valor3, MaxAlumnado = 40;
           String[][] Aulas = {{"Azul", "Verde", "Amarillo"},{"40","35","30"}};
           
            for (String[] Aula : Aulas) 
           {
               if(Aula == Aulas[Aulas.length-1])
               {
                   System.out.println("");
               }
               for (String Aula1 : Aula) 
               {
                   
                   System.out.print(Aula1 + " ");
               }
           }
           System.out.println("");
           System.out.println("Ingrese la cantidad de Alumnos - (Debe ser menor a 40)");
           Alumnado = ingresoIntmenorA(Alumnado,MaxAlumnado);
           if (Alumnado > 0 && Alumnado < 31) 
           {
            System.out.println("Amarillo");   
           }
           else if(Alumnado > 30 && Alumnado < 36)
           {
            System.out.println("Verde"); 
           }
           else if(Alumnado > 35 && Alumnado < 41)
           {
            System.out.println("Azul");
           }
       }
       
     public static void Ejercicio24()
     {
         String NumeroIngr;
         short max = 4, min = 2;
         boolean capicua;
         System.out.println("Ingrese un numero. 10 - 9999");
         NumeroIngr = ingresoString(min, max, "El numero debe ser entre 2 y 4 Digitos (Inclusive).", (byte)1, (byte) 120);
         capicua=Ejercicio.is_capicua(NumeroIngr);
       
         if(capicua == true)
           {
                System.out.println("El numero ingresado es capicua.");
           }
          else
          {
               System.out.println("El numero ingresado NO es capicua.");
          }
         
      
     }
     
     public static void Ejercicio25()
     {
         String Phrase="", InicialesStr = "";
         System.out.println("Ingrese un texto.");
         Phrase = ingresoString(3, 32, "Debe ingresar una palabra de almenos 3 letras.", (byte)1, (byte) 120);
         InicialesStr = Ejercicio.Iniciales(Phrase);
         System.out.println(InicialesStr);
     }
     
    public static void Ejercicio28()
    {
        String Phrase="";
        Byte pal=0;
        System.out.println("Ingrese un texto.");
        Phrase = ingresoString(3, 32, "Debe ingresar una palabra de almenos 3 letras.", (byte)1, (byte) 120);
        pal = Ejercicio.contarPalabras(Phrase);
        System.out.println("La cantidad de palabras fueron "+pal);
    }
    
    public static void Ejercicio29()
    {
        String Phrase="";
        String[] NombreCompl = new String[60];
        System.out.println("Ingrese su Nombre y Apellido.");
        Phrase = ingresoString(3, 60, "Debe ingresar una palabra de almenos 3 letras. Y debe contener almenos 2 palabras.", (byte)2, (byte) 6);
        NombreCompl = Ejercicio.capitalizeIniciales(Phrase);
        
        for (String NombreCompl1 : NombreCompl) {
            System.out.print(NombreCompl1 + " ");
        }
        
    }
    
    public static void Ejercicio30()
    {
        int[] Array = new int[5];
        System.out.println("Ingrese 5 datos Enteros.");
        ingresoArray(Array, "Ingrese el dato numero ");
        Array=Ejercicio.ordenarArray(Array);
        for (int Elem : Array) {
            System.out.print(Elem + ". ");
        }
    }
}