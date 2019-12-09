package Ejercicios;
public class Ejercicio {
    
       
       public static int sacarPerimetro(int area)
       {
           return area=area*4;
       }
      
       public static int[] sacarCocienteyResto(int n1, int n2)
       {
           int[] CyR = new int[2];
           CyR[0] = n1/n2;
           CyR[1] = n1-(CyR[0]*n2);
           return CyR;
       } 
       
        public static int CocienteconDecimal(int n1, int n2)
       {
           int cociente=(int)n1/n2;
           return cociente;
       }   
        
         public static int  sacarPerimetroCirculo(int n1)
       {
           final double pi = 3.141592;
           int  perim_circulo=(int) ((int)n1*pi);
           return perim_circulo;
       }   
         
         public static double[]  sacarPerimetroySuperficieCirculo(int radio)
       {
           double[] PyS = new double[2];
           PyS[0] = Math.PI * (radio*2);
           PyS[1] = Math.PI * (radio*radio);
           return PyS;
       }   
         
         public static float[]  sacarSuperficieyPerimetroTrianguloRec(int ladoA, int ladoB)
       {
           float[] SyP = new float[2];
           float H;
           SyP[0] = Math.min(ladoA, ladoB)* (float) Math.max(ladoA, ladoB)/2;
           H= (float) Math.sqrt(Math.pow(ladoA, 2)+Math.pow(ladoB, 2));
           SyP[1] = (float) (ladoA+ladoB+H);
           return SyP;
       }  
         
         public static boolean saber_Si_es_Divisible(short NumeroIngresado[])
       {
         boolean flag;
         
         if(NumeroIngresado[1] == 2)
         {
         flag = NumeroIngresado[0] % NumeroIngresado[1] == 0;
         }
         else
         {
         flag = Math.max(NumeroIngresado[0], NumeroIngresado[1])% Math.min(NumeroIngresado[0], NumeroIngresado[1]) == 0;
         }
         
         return flag;
       }
         
       public static boolean saber_Si_se_Jubila(byte Edad, char Genero)
       {
         boolean flag = false;
         if(Edad >= 60 && (Genero == 'F' || Genero == 'f'))
         {
             flag=true;
         }
         
          if(Edad >= 65 && (Genero == 'M' || Genero == 'm'))
         {
             flag=true;
         }
         
         return flag;
       }
       
       public static byte[] saber_Si_hay_suficientes_Asientos(byte Alumnos, byte Asientos)
       {
           byte[] AyA = new byte[2];
           if(Alumnos > Asientos)
           {
               AyA[0] = 1;
               AyA[1] = (byte) ((byte) Alumnos-Asientos);
           }
           else
           {
               AyA[0] = 0;
           }
           
           return AyA;
       }
       
       public static String saber_Tipo_Triangulo(int ladoA, int ladoB, int ladoC)
       {
           String str = "";
           if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA)
           {
               str = "Triangulo Isósceles";
           }
           if(ladoA == ladoB && ladoB == ladoC)
           {
               str = "Triangulo Equilátero";
           }
           if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA)
           {
               str = "Triangulo Escaleno";
           }
               
           return str;
       }
       
       public static boolean saber_Si_es_vocal(char C)
       {
           boolean flag = C == 'A' || C == 'a' || C == 'e' || C == 'E' || C == 'I' || C == 'i' || C == 'o' || C == 'O' || C == 'u' || C == 'U';
           return flag;
       }
       
       public static String saber_el_Mes(byte mes)
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
           }
           return str;
       }
       
       public static short saber_Numero_Romano(char RC)
       {    
           short RomanoN = 0;
           switch(RC)
           {
               case 'I':{RomanoN=1;};break;
               case 'V':{RomanoN=5;};break;
               case 'X':{RomanoN=10;};break;
               case 'L':{RomanoN=50;};break;
               case 'C':{RomanoN=100;};break;
               case 'D':{RomanoN=500;};break;
               case 'M':{RomanoN=1000;};break;
               
           }
           
           return RomanoN;
       }
       
       public static float Basic_Calc(float Numeros_Ingr[], char Operando)
       {
           float Resultado=0;
           switch(Operando)
           {
               case '+':{Resultado = Numeros_Ingr[0] + Numeros_Ingr[1] ;};break;
               case '-':{Resultado = Numeros_Ingr[0] - Numeros_Ingr[1] ;};break;
               case '*':{Resultado = Numeros_Ingr[0] * Numeros_Ingr[1] ;};break;
               case '/':{Resultado = Numeros_Ingr[0] / Numeros_Ingr[1] ;};break;
           
           }
           
           return Resultado;
       }
       
       public static String generar_Asteriscos(int cant_ast)
       {
           String str="";
           for(int i=0;i<cant_ast;i++)
           {
               str = "*"+str;
               
           }
       
           return str;
       }
       
       public static float saber_Promedio(int Cant_Numeros , int[] Numeros_A_Promediar)
       {
           float Total = 0;
           for(int i=0;i<Cant_Numeros;i++)
           {
               Total=Total+Numeros_A_Promediar[i];
           }
           Total=Total/Cant_Numeros;
           return Total;
       }
       
       public static int sacar_Factorial(int n)
       {
           int Res = 1;
           for (int i=n;i>0;i--)
           {
               Res = Res * i;
           }
           return Res;
       }
}