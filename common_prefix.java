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

        String[] array = new String[c];

        for (int i = 0; i < c; i++)
        {
            System.out.print("Enter String["+ (i+1) +"] : ");
            array[i] = sc.next();
        }

        Arrays.sort(array, Comparator.comparing(s->s.length()));

        int len = array[0].length();

        for (int i = 0; i < len; i++)
        {
            for(int j = 1; j < len; j++)
            {
                if(  )
            }
        }

        System.out.println("Common String = " + array);

    }
}
