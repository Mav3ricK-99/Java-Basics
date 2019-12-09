import java.util.Random;
public class Ejercicio 
{
    public static void recorrerArray(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            if(i == array.length-1)
            {
                System.out.print(array[i]+ ".");
            }
            else
            {
                System.out.print(array[i]+ ", ");
            }
        }
    }
    
    public static void recorrerArray_Y_dividir(int[] array, int Dividendo)
    {
        float Res=0;
        for(int i=0;i<array.length;i++)
        {
            Res= (float)array[i]/Dividendo;
            if(i == array.length-1)
            {
                System.out.print(Res+ ".");
            }
            else
            {
                System.out.print(Res+ ", ");
            }
        }
    }
   
    public static boolean[] llenarArrayboolean(boolean[] array)
    {
        int rand=0;
        Random r = new Random();
        for(int i=0;i < array.length;i++)
        {
            rand = r.nextInt(2);
            array[i] = rand == 1;
            
        }
        return array;
    }
    
    public static void recorrerArray_V_o_F(boolean[] array, String str1, String str2)
    {
        int verdadero = 0, falso = 0;
        for(int i=0;i < array.length;i++)
        {
           if(array[i] == true)
           {
               verdadero++;
           }
           else if(array[i] == false)
           {
               falso++;
           }
        }
        
        System.out.println(str1 + verdadero);
        System.out.println(str2 + falso);
        
    }
    
    public static boolean is_capicua(String Numero)
    {
        switch(Numero.length())
        {
            case 2:{if(Numero.charAt(0) == Numero.charAt(1))return true;};break;
            case 3:{
                if((Numero.charAt(0) == Numero.charAt(1)) && (Numero.charAt(1) == Numero.charAt(2)))
                {return true;}
                if(Numero.charAt(0) == Numero.charAt(2))
                {return true;}};break;
            case 4:
            {
                if((Numero.charAt(0) == Numero.charAt(1)) && (Numero.charAt(2) == Numero.charAt(3)) && (Numero.charAt(0) == Numero.charAt(3)))
                {return true;}
                if(Numero.charAt(0) == Numero.charAt(3))
                {
                if(Numero.charAt(1) == Numero.charAt(2))return true;
                }break;
            }
            
        }
        return false;
    }
    
    public static String Iniciales(String phrase)
    {
        String Inic = "";
        phrase.trim();
        for(int i=phrase.length(); i > 0 ; i--)
        {
           if(phrase.charAt(i-1) == ' ')
            {
              Inic = phrase.charAt(i) + Inic;
            }
        }
        Inic = phrase.charAt(0)+Inic;
        
        return Inic.toUpperCase();
    }
    
    public static byte contarPalabras(String phrase)
    {
        byte Palabras = 1;
        for(int i=1; i < phrase.length() ; i++)
        {
          if(phrase.charAt(i) == ' ' && phrase.charAt(i-1) != ' ')
            {
              Palabras++;
            }
        }
       return Palabras;
    }
    
    public static String[] capitalizeIniciales(String nombreingr)
    {
        String Nombre = nombreingr.toLowerCase();
        Nombre = nombreingr.trim();
        String[] str = Nombre.split(" ");

        for(int i=0; i< str.length; i++)
        {
            str[i] = (str[i]).substring(0,1).toUpperCase() + (str[i]).substring(1);
        }

        return str;
    }
    
    public static int[] ordenarArray(int[] Array)
    {
        int i, j, auxiliar;
        for (i = 0; i < Array.length - 1; i++) 
        {
            for (j = 0; j < Array.length - i - 1; j++) 
            {
                if (Array[j + 1] < Array[j]) 
                {
                    auxiliar = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = auxiliar;
                }
            }
        }
        return Array;
    }
    
}
