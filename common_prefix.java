import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class common_prefix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Count : ");
        int c = sc.nextInt();

        sc.nextLine();  // Consume newline left-over

        String[] array = new String[c];

        for (int i = 0; i < c; i++)
        {
            System.out.print("Enter String["+ (i+1) +"] : ");
            array[i] = sc.nextLine();
        }

        System.out.println("Common String = " + Common_prefix(array) );

        sc.close();

    }

    public static String Common_prefix(String array[])
    {
        if(array.length ==0 )
        {
            return "";
        }

        if( array.length == 1 )
        {
            return array[0];
        }

        Arrays.sort(array, Comparator.comparing(s->s.length()));

        int array_length = array.length;

        int len = array[0].length();


        for (int i = 0; i < len; i++)
        {
            for(int j = 1; j < array_length; j++)
            {
                if(  array[0].charAt(i) != array[j].charAt(i)  )
                {
                    return array[0].substring(0,i);
                }
            }
        }

        return null;
    
    }


}
