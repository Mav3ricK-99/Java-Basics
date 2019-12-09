//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  GitHub _ https://github.com/Mav3ricK-99 | Developed By Mav3ricK
//  jdk-13_windows-x64_bin
//Apache NetBeans IDE 11.1
package Ejercicios;
import java.util.Scanner;
public class Codo_a_Codo_Main
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
               case 3:{Ejercicio3();}break;
               case 4:{Ejercicio4();}break;
               case 5:{Ejercicio5();}break;
               case 6:{Ejercicio6();}break;
               case 7:{Ejercicio7();}break;
               case 8:{Ejercicio8();}break;
               case 9:{Ejercicio9();}break;
               case 10:{Ejercicio10();}break;
               case 11:{Ejercicio11();}break;
               case 12:{Ejercicio12();}break;
               case 13:{Ejercicio13();}break;
               case 14:{Ejercicio14();}break;
               case 15:{Ejercicio15();}break;
               case 16:{Ejercicio16();}break;
               case 17:{Ejercicio17();}break;
               case 18:{Ejercicio18();}break;
               case 19:{Ejercicio19();}break;
               case 20:{Ejercicio20();}break;
               case 21:{Ejercicio21();}break;
               case 22:{Ejercicio22();}break;
               case 23:{Ejercicio23();}break;
               case 24:{Ejercicio24();}break;
               case 25:{Ejercicio25();}break;
               case 26:{Ejercicio26();}break;
               case 27:{Ejercicio27();}break;
               case 28:{Ejercicio28();}break;
               case 29:{Ejercicio29();}break;
               case 30:{Ejercicio30();}break;
               default:{System.out.println("No hay tal ejercicio.");};break;
           }
       }
       
       public static String getMenu()
       {
           String getmenu = 
                   "1_ Perimetro de un Cuadrado."
                   + "\n2_ Cocientes y Restos."
                   + "\n3_ Cocientes con Decimales."
                   + "\n4_ Diametro de un Circulo."
                   + "\n5_ Perimetro y Superficie de un Circulo."
                   + "\n6_ Superficie y Perimetro Triangulo Rectangulo."
                   + "\n7_ Saber si es Par o Impar."
                   + "\n8_ Saber si es edad para Jubilarse."
                   + "\n9_ Sillas Disponibles."
                   + "\n10_ Saber si es divisible el mayor por el menor."
                   + "\n11_ Saber que triangulo es."
                   + "\n12_ Saber es vocal."
                   + "\n13_ Saber que mes es."
                   + "\n14_ Saber que numero Romano es."
                   + "\n15_ Calculadora Basica."
                   + "\n16_ 10 Numeros siguientes."
                   + "\n17_ Ingreso 1 Numero y * hasta 10."
                   + "\n18_ Lo mismo que el de arriba pero con while."
                   + "\n19_ Filas de * (Reversa)"
                   + "\n20_ Promedio notas alumnos"
                   + "\n21_ Factorial de un numero Natural"
                   + "\n22_ Filas de * "
                   + "\n23_ Ingreso numeros hasta 0 . max y minimo."
                   + "\n24_ Promedio peso de alumnos."
                   + "\n25_ Pedir contraseña eureka"
                   + "\n26_ Pedir numeros y mostrar max, min y promedio"
                   + "\n27_ Pedir $$$ por mes."
                   + "\n28_ Login admin, 1234"
                   + "\n29_ Ingreso de 2 numeros y sumarlos hasta ingreso 0 0."
                   + "\n30_ Pedir 2 Numeros y Dividirlos.";
           
           int Salto = 2;
           for(int i = 0; i < Salto; i++){
           System.out.println();
           }
           return getmenu;
       }
       
       public static void Ejercicio1()
       {
           int perim;
           Scanner Area = new Scanner(System.in);
           do
           {
           System.out.println("Ingrese el Area.");
           }while(!Area.hasNextInt());
           int area = Area.nextInt();
           perim=Ejercicio.sacarPerimetro(area);
           System.out.println("El Perimetro de un cuadrado con area " + area + " es " + perim);
       }
       
        public static void Ejercicio2()
       {
           int Numero1, Numero2;
           int array[];
           try (Scanner Numeros = new Scanner(System.in)) {
               System.out.println("Ingrese el Primer numero.");
               Numero1 = Numeros.nextInt();
               
               System.out.println("Ingrese el Segundo numero.");
               Numero2 = Numeros.nextInt();
              
           }
            array=Ejercicio.sacarCocienteyResto(Numero1, Numero2);
            System.out.println("("+Numero1 + " " + Numero2 +"). El Cociente es: " + array[0] + " y el resto: " + array[1]);
       }
        
       public static void Ejercicio3()
       {
           int Numero1, Numero2, Res;
           try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese el Primer numero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese el Primer numero.");
                    Numeros.next();
                }
                Numero1 = Numeros.nextInt();

                System.out.println("Ingrese el Segundo numero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese el Segundo numero.");
                    Numeros.next();
                }
                Numero2 = Numeros.nextInt();
            }
           
               Res=Ejercicio.CocienteconDecimal(Numero1, Numero2);
               System.out.println("("+Numero1 + " " + Numero2 +"). El Cociente en decimales es: " + Res);
           
       }
      public static void Ejercicio4()
      {
          int diametro,res;
          
          try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese el Diametro del Circulo.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese el Diametro del Circulo.");
                    Numeros.next();
                }
                diametro = Numeros.nextInt();
                
            }
          res = Ejercicio.sacarPerimetroCirculo(diametro);
          System.out.println("("+diametro+"). El Perimetro del Circulo es "+res);
      }
      
          public static void Ejercicio5()
      {
          int radio;
          double[] PyS;
          try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese el Radio del Circulo.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese el Radio del Circulo.");
                    Numeros.next();
                }
                radio = Numeros.nextInt();
                
            }
          PyS = Ejercicio.sacarPerimetroySuperficieCirculo(radio);
          System.out.println("Para radio "+radio+" El perimetro es "+PyS[0]+" Y superficie "+ PyS[1]);
      }
          public static void Ejercicio6()
      {
          int ladoA, ladoB;
          float[] SyP;
          Scanner Numeros = new Scanner(System.in);
          System.out.println("Ingrese el lado A del Triangulo rectangulo");
          ladoA = Numeros.nextInt();
          System.out.println("Ingrese el lado B del Triangulo rectangulo");
          ladoB = Numeros.nextInt();
          SyP = Ejercicio.sacarSuperficieyPerimetroTrianguloRec(ladoA,ladoB);
          System.out.println("(Para el Lado A "+ladoA+" Y el Lado B "+ladoB+") El perimetro es "+SyP[0]+" Y la superficie "+SyP[1]);
      }
          public static void Ejercicio7()
      {
          var NumerosIngrs = new short[2];
          NumerosIngrs[1]=2;
          boolean ParOno;
          try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese un Numero entero.");
                while(!Numeros.hasNextShort())
                {   
                    System.out.println("Ingrese un Numero entero.");
                    Numeros.next();
                }
                NumerosIngrs[0] = Numeros.nextShort();
               
            }
          ParOno = Ejercicio.saber_Si_es_Divisible(NumerosIngrs);
          if(ParOno)
          {
              System.out.println("El numero "+NumerosIngrs[0]+ " es Par.");
          }
          else
          {
              System.out.println("El numero "+NumerosIngrs[0]+ " es Impar.");
          }
      }
          public static void Ejercicio8()
      {
          byte Edad;
          char Genero;
          boolean Jubilacion;
          System.out.println("Indique su Edad en numeros. ( 1 - 127 )");
          Scanner Numeros = new Scanner(System.in);

          if (Numeros.hasNextByte()) 
          {
            Edad = Numeros.nextByte();
          } else {
            Numeros.next();  
            Edad = 0;
          }

          while (Edad < 1 || Edad > 127) 
          {
              System.out.println("Indique su Edad en numeros. ( 1 - 127 )");
              if (Numeros.hasNextByte()) {
                  Edad = Numeros.nextByte();
               } else {
                 String str = Numeros.next();
                 Edad = 0;
              }
          }
          
          System.out.println("Indique su Genero. ( F - M )");
          Genero = Numeros.next().charAt(0); 
          while ((Genero != 'M' && Genero != 'm') && (Genero != 'f' && Genero != 'F')) 
          {
              System.out.println("Indique su Genero. ( F - M )");
              Genero = Numeros.next().charAt(0); 
          }
          
          Jubilacion = Ejercicio.saber_Si_se_Jubila(Edad, Genero);
          if(Jubilacion)
          { 
              System.out.println("Con "+Edad+" años te puedes Jubilar.");
          }
          else
          {
              System.out.println("Con "+Edad+" años no te puedes Jubilar.");
          }
      }
          
        public static void Ejercicio9()
        {
            byte Asientos, Alumnos;
            byte[] AyA;
            try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese la cantidad de Alumnos");
                while(!Numeros.hasNextByte())
                {
                    System.out.println("Ingrese la cantidad de Alumnos");
                    Numeros.next();
                }
                Alumnos = Numeros.nextByte();
                
                System.out.println("Ingrese la cantidad de Asientos");
                while(!Numeros.hasNextByte())
                {
                    System.out.println("Ingrese la cantidad de Asientos");
                    Numeros.next();
                }
                Asientos = Numeros.nextByte();
                
            }
            
            AyA=Ejercicio.saber_Si_hay_suficientes_Asientos(Alumnos, Asientos);
            
            if(AyA[0] == 1)
            {
                System.out.println("( Alumnos "+Alumnos+" . Sillas "+ Asientos + ".) Faltan "+ AyA[1] + " Asientos.");
            }
            else
            {
                System.out.println("( Alumnos "+Alumnos+" . Sillas "+ Asientos + ".) No faltan asientos.");
            }
            
        }
        
        public static void Ejercicio10()
        {
          var NumerosIngrs = new short[2];
          boolean flag;
          for(int i=0;i<2;i++)
          {
            System.out.println("Ingrese un Numero "+(i+1)+". ( 0 - 100 )");
            Scanner Numeros = new Scanner(System.in);

            if (Numeros.hasNextByte()) 
            {
              NumerosIngrs[i] = Numeros.nextByte();
            } else {
              Numeros.next();  
              NumerosIngrs[i] = 0;
            }

            while (NumerosIngrs[i] < 0 || NumerosIngrs[i] > 100) 
            {
                System.out.println("Ingrese el Numero "+(i+1)+". ( 0 - 100 )");
                if (Numeros.hasNextByte()) 
                {
                    NumerosIngrs[i] = Numeros.nextByte();
                } 
                else 
                {
                   String str = Numeros.next();
                   NumerosIngrs[i] = 0;
                }
            }
          }
          flag = Ejercicio.saber_Si_es_Divisible(NumerosIngrs);
          short max = (short) Math.max(NumerosIngrs[0], NumerosIngrs[1]);
          short min = (short) Math.min(NumerosIngrs[0], NumerosIngrs[1]);
          if (flag)
          {
              System.out.println("El numero "+max+" es divisible por "+min+".");
          }
          else
          {
              System.out.println("El numero "+max+" no es divisible por "+min+".");
          }
        }
        public static void Ejercicio11()
        {
          int ladoA = 0, ladoB = 0, ladoC = 0;
          boolean flag = false;
          Scanner Numeros = new Scanner(System.in);
          while(!flag)
          {
          System.out.println("Ingrese el lado A del Triangulo rectangulo");
          ladoA = Numeros.nextInt();
          System.out.println("Ingrese el lado B del Triangulo rectangulo");
          ladoB = Numeros.nextInt();
          System.out.println("Ingrese el lado C del Triangulo rectangulo");
          ladoC = Numeros.nextInt();
          if(ladoA > (ladoB+ladoC) || ladoB > (ladoA+ladoC) || ladoC > (ladoB+ladoA))
          {
              System.out.println("Triangulo no Valido, ingrese los datos nuevamente.");
          }
          else{flag=true;}
          }
          String tipo_triangulo = Ejercicio.saber_Tipo_Triangulo(ladoA, ladoB, ladoC);
          System.out.println("Es un "+tipo_triangulo);
        }
        
        public static void Ejercicio12()
        {
          char Caracter;
          Scanner Ej12 = new Scanner(System.in);
          System.out.println("Ingrese un Caracter.");
          Caracter = Ej12.next().charAt(0); 
          boolean flag = Ejercicio.saber_Si_es_vocal(Caracter);
          if(flag)
          {
              System.out.println("La letra "+Caracter+" es una vocal.");
          }
          else
          {
              System.out.println("La letra "+Caracter+" no es una vocal.");
          }
        }
        
        public static void Ejercicio13()
        {
          byte mes;
          String mes_en_letras;
          System.out.println("Indique un numero. (1 - 12)");
          Scanner Numeros = new Scanner(System.in);

          if (Numeros.hasNextByte()) 
          {
            mes = Numeros.nextByte();
          } else {
            Numeros.next();  
            mes = 0;
          }

          while (mes < 1 || mes > 12) 
          {
              System.out.println("Indique un numero. (1 - 12)");
              if (Numeros.hasNextByte()) {
                  mes = Numeros.nextByte();
               } else {
                 String str = Numeros.next();
                 mes = 0;
              }
          }
          mes_en_letras = Ejercicio.saber_el_Mes(mes);
          System.out.println("( "+mes+" ). El mes actual es "+mes_en_letras);
        }
        
        public static void Ejercicio14()
        {
            char nRomanoC = 0;
            short nRomanoN;
            boolean flag = false;
            Scanner Numero_R = new Scanner(System.in);
            while(!flag)
            {
                System.out.println("Ingrese un Numero Romano. ( I - V - X - L - C - D - M )");
                nRomanoC = Numero_R.next().charAt(0);
                if(nRomanoC == 'I' || nRomanoC == 'V' || nRomanoC == 'X' || nRomanoC == 'L' || nRomanoC == 'C' || nRomanoC == 'D' || nRomanoC == 'M')
                {
                    flag = true;
                }
                else
                {
                    System.out.println(nRomanoC);
                    System.out.println("No existe ese numero Romano ( "+nRomanoC+" ), asegurate ingresarlo en Mayuscula.");
                    flag = false;
                }
               
            }
            nRomanoN = Ejercicio.saber_Numero_Romano(nRomanoC);
            System.out.println("El numero Romano "+nRomanoC+" equivale a "+nRomanoN+" en decimales.");
        }
        
        public static void Ejercicio15()
        {
            float Numeros_Ingr[] = new float[2];
            float Resultado = 0;
            char Operando;
            
            Scanner Calc_Basic = new Scanner(System.in);
            for(int i=0;i<2;i++)
            {
                System.out.println("Ingrese el Numero "+(i+1)+".");
               
                while(!Calc_Basic.hasNextFloat())
                {
                    System.out.println("Ingrese el Numero "+(i+1)+".");
                    Calc_Basic.next();
                }
                Numeros_Ingr[i] = Calc_Basic.nextFloat();
            }
            System.out.println("Ahora ingrese un Operando ( + , - , * , / ).");
            Operando = Calc_Basic.next().charAt(0); 
            
            while ((Operando != '/' && Operando != '+' ) && (Operando != '-' && Operando != '*') || (Operando == '/' && Numeros_Ingr[1] == 0)) 
            {
                if(Operando == '/' && Numeros_Ingr[1] == 0)
                {
                    System.out.println("No se puede dividir por 0.");
                    Operando = '0';
                }
                
                System.out.println("Ahora ingrese un Operando ( + , - , * , / ).");
                Operando = Calc_Basic.next().charAt(0); 
                
            }
            Resultado = Ejercicio.Basic_Calc(Numeros_Ingr,Operando);
            System.out.println("El resultado de la ecuacion "+Numeros_Ingr[0]+" "+Operando+" "+Numeros_Ingr[1]+" Fue de "+Resultado);
            
        }
        
        public static void Ejercicio16()
        {
            int NumeroIngr;
        
             try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese un numero entero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un numero entero.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
            }
            
            for (int i=1;i<11;i++)
            {
                System.out.println(NumeroIngr+i);
            }
        }
        
        public static void Ejercicio17()
        {
             int NumeroIngr;
             try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese un numero entero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un numero entero.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
            }
             
            for (int i=1;i<11;i++)
            {
                System.out.println("El numero "+NumeroIngr+" Multiplicado por "+i+" es "+NumeroIngr*i);
            }
        }
        
        public static void Ejercicio18()
        {
             int NumeroIngr;
             try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese un numero entero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un numero entero.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
            }
            int i = 1;
            while(i<11)
            {
                
                System.out.println("El numero "+NumeroIngr+" Multiplicado por "+i+" es "+NumeroIngr*i);
            i++;
            }
        }
        
        public static void Ejercicio19()
        {
            int NumeroIngr;
            String CadenaAst;
            
             try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese la cantidad de asteriscos.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese la cantidad de asteriscos.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
            }
             
            CadenaAst = Ejercicio.generar_Asteriscos(NumeroIngr);
            System.out.println(CadenaAst);
           for(int i=0;i<NumeroIngr;i++)
           {
              CadenaAst = CadenaAst.substring(0, CadenaAst.length()-1);
              System.out.println(CadenaAst);
           }
        }
        
        public static void Ejercicio20()
        {
            int CantNotas;
            float Promedio;
            Scanner Numeros = new Scanner(System.in);
            
            System.out.println("Indique la cantidad de notas a ingresar.");
            while(!Numeros.hasNextInt())
            {
                System.out.println("Indique la cantidad de notas a ingresar.");
                Numeros.next();
            }
            CantNotas = Numeros.nextInt();
            
            int[] Notas = new int[CantNotas];
            for(int i= 0;i < CantNotas;i++)
            {
                System.out.println("Ingrese la nota N"+(i+1)); 
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese la nota N"+(i+1)); 
                    Numeros.next();
                }
                Notas[i] = Numeros.nextInt();
            }
            Promedio = Ejercicio.saber_Promedio(CantNotas,Notas);
            System.out.println("El promedio de las notas ingresadas es "+Promedio);
        }
        
        public static void Ejercicio21()
        {
          int NumeroIngr;
          int Factorial = 0;
          System.out.println("Ingrese un Numero Natural.");
          Scanner Numeros = new Scanner(System.in);

          if (Numeros.hasNextInt()) 
          {
            NumeroIngr = Numeros.nextInt();
          } else {
            Numeros.next();  
            NumeroIngr = -1;
          }

          while (NumeroIngr < 0 ) 
          {
              System.out.println("Ingrese un Numero Natural.");
                if (Numeros.hasNextInt()) {
                  NumeroIngr = Numeros.nextInt();
               } else {
                 String str = Numeros.next();
                 NumeroIngr = -1;
              }
          }
          
          Factorial = Ejercicio.sacar_Factorial(NumeroIngr);
          System.out.println("El factorial del Numero " + NumeroIngr + " es " +Factorial);
        }
        
        public static void Ejercicio22()
        {
            int NumeroIngr;
            String CadenaAst="";
            
             try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese la cantidad de asteriscos.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese la cantidad de asteriscos.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
            }
             
            while(NumeroIngr != 0)
            {
                CadenaAst = CadenaAst+"*";
                System.out.println(CadenaAst);
                NumeroIngr--;
            }
            
        }
        
        public static void Ejercicio23()
        {
            int NumeroIngr, min=0, max=0;
            Scanner Numeros = new Scanner(System.in);
            do{
                System.out.println("Ingrese un numero Entero. 0 para salir.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un numero Entero. 0 para salir.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
                if(NumeroIngr>max)
                {
                    max=NumeroIngr;
                }
                if(NumeroIngr!=0)
                {
                    if(NumeroIngr<min)
                    {
                        min=NumeroIngr;
                    }
                    else if(min==0)
                    {
                        min=NumeroIngr;
                    }
                }
            
            }while(NumeroIngr!=0);
            
            System.out.println("El numero maximo fue "+max+". Y el minimo "+ min);
        }
        
        public static void Ejercicio24()
        {
            float PesoAlumno,TotalPesos=0, CantAlumnos=0;
            Scanner Numeros = new Scanner(System.in);
            do{
                System.out.println("Ingrese el peso del Alumno. 0 para salir");
                while(!Numeros.hasNextFloat())
                {
                    System.out.println("Ingrese el peso del Alumno. 0 para salir");
                    Numeros.next();
                }
                PesoAlumno=Numeros.nextFloat();
                TotalPesos = TotalPesos+PesoAlumno;
                CantAlumnos++;
            }while(PesoAlumno!=0);
            float prom = TotalPesos/(CantAlumnos-1);
           String ImprResultado = String.format("El promedio de el peso de los Alumnos es de (%.2f)", prom);
           System.out.println(ImprResultado);
        }
        
        public static void Ejercicio25()
        {
            byte attemps=0;
            String get_pass = "";
            Scanner Scanner_pass = new Scanner(System.in);
            while(!"eureka".equals(get_pass) && attemps < 3)
            {

                System.out.println("Ingrese la contraseña. (No es eureka)");
                while(!Scanner_pass.hasNext())
                 {
                    System.out.println("Ingrese la contraseña. (No es eureka)");
                    Scanner_pass.next();
                 }
                get_pass = Scanner_pass.nextLine();
                attemps = (byte) ((byte)attemps+1);
            }
            if(attemps == 3 && !"eureka".equals(get_pass))
            {
                System.out.println("Se ha quedad sin intentos, intente mas tarde.");
            }
                
        }
        
        public static void Ejercicio26()
        {
            int NumeroIngr, min=0, max=0, total_ingr=0, cant_ingr=0;
            float prom = 0;
            Scanner Numeros = new Scanner(System.in);
            do{
                System.out.println("Ingrese un numero Entero. 0 para salir.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un numero Entero. 0 para salir.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
                total_ingr=total_ingr+NumeroIngr;
                cant_ingr++;
                if(NumeroIngr>max)
                {
                    max=NumeroIngr;
                }
                if(NumeroIngr!=0)
                {
                    if(NumeroIngr<min)
                    {
                        min=NumeroIngr;
                    }
                    else if(min==0)
                    {
                        min=NumeroIngr;
                    }
                }
            
            }while(NumeroIngr!=0);
            prom = (float)((float)total_ingr/(cant_ingr-1)); 
            System.out.println("El numero maximo fue "+max+". el numero minimo "+ min + " Y el promedio "+prom);
        
        } 
        public static void Ejercicio27()
        {
            int NumeroIngr, TotalAnual=0, Meses_ingr=0;
            float prom;
            Scanner Numeros = new Scanner(System.in);
            for(int i=0;i<12;i++)
            {
                System.out.println("Ingrese un valor para el mes "+(i+1)+" . Valor negativo para salir.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese un valor para el mes "+(i+1)+" . Valor negativo para salir.");
                    Numeros.next();
                }
                NumeroIngr = Numeros.nextInt();
                Meses_ingr++;
                if(NumeroIngr<0)
                {
                    i=13;
                }
                else
                {
                    TotalAnual=TotalAnual+NumeroIngr;
                }
            }
            prom = (float)((float)TotalAnual/(Meses_ingr-1));
            System.out.println("El promedio de los "+(Meses_ingr+1)+" meses fue de "+prom);
        }
        
        public static void Ejercicio28()
        {
            String get_pass = "", user = "";
            Scanner Scanner_pass = new Scanner(System.in);
            while(!"1234".equals(get_pass) || !"admin".equals(user))
            {

                System.out.println("Ingrese el usuario. (No es admin)");
                while(!Scanner_pass.hasNext())
                 {
                    System.out.println("Ingrese el usuario. (No es admin)");
                    Scanner_pass.next();
                 }
                user = Scanner_pass.nextLine();
                
                System.out.println("Ingrese la contraseña. (No es 1234)");
                while(!Scanner_pass.hasNext())
                 {
                    System.out.println("Ingrese la contraseña. (No es 1234)");
                    Scanner_pass.next();
                 }
                get_pass = Scanner_pass.nextLine();
            }
        }
        
        public static void Ejercicio29()
        {
            int[] Numeros_ingr = new int[2];
            Scanner Numeros = new Scanner(System.in);
            Numeros_ingr[0]=1;
            Numeros_ingr[1]=1;
            while(Numeros_ingr[0] != 0 || Numeros_ingr[1] != 0)
            {
                for(int i=0;i<2;i++)
               {
                   System.out.println("Ingrese el numero "+(i+1)+" . Ingrese dos 0 para salir.");
                   while(!Numeros.hasNextInt())
                    {
                       System.out.println("Ingrese el numero "+(i+1)+" . Ingrese dos 0 para salir.");
                       Numeros.next();
                    }
                   Numeros_ingr[i] = Numeros.nextInt();
                }
            if(Numeros_ingr[0] != 0 && Numeros_ingr[1] != 1)
            {
                System.out.println("La suma es "+(Numeros_ingr[0]+Numeros_ingr[1]));
            }
            }
            
        }
        
        public static void Ejercicio30()
        {
            int Numero1,Numero2=0;
            try (Scanner Numeros = new Scanner(System.in)) 
            {
                System.out.println("Ingrese el Primer numero.");
                while(!Numeros.hasNextInt())
                {
                    System.out.println("Ingrese el Primer numero.");
                    Numeros.next();
                }
                Numero1 = Numeros.nextInt();

                while(Numero2==0)
                {
                    System.out.println("Ingrese el Segundo numero.");
                    while(!Numeros.hasNextInt())
                    {
                        System.out.println("Ingrese el Segundo numero.");
                        Numeros.next();
                    }
                    Numero2 = Numeros.nextInt();
                }
               
            }
            
            System.out.println("la division entre ambos numeros es "+(float)((float)Numero1/Numero2));
        }
               
 }
