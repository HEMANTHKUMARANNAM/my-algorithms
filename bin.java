import java.util.ArrayList;
import java.util.Collections;

public class bin 
{
    public static void main(String[] args) 
    {
        int weight[] = { 2, 5, 4, 7, 1, 3, 8 };
		int c = 10;
        ArrayList<Integer> list =  new ArrayList<Integer>();

        for (int i = 0; i < weight.length ; i++) 
        {
            list.add(weight[i]);
        }

        Collections.sort(list , Collections.reverseOrder() );

        System.out.println("LIST = " + list);


        int bin = 0;

        while(!list.isEmpty()) 
        {
            System.out.print("BIN " + (bin+1) + " = ");
            int binsize = c;
            for (int i = 0; i < list.size(); )
            {
                if(list.get(i) <= binsize )
                {
                    System.out.print(list.get(i) + " ");
                    binsize = binsize - list.get(i);;
                    list.remove(i);
                }
                else
                {
                    i++;
                }
            }
            bin++;
            System.out.println("");
        }

        System.out.println("BINS REQUIRED IS " + bin);


    }
}


// PS C:\Users\heman\Desktop\my algorithms> cd "c:\Users\heman\Desktop\my algorithms\" ; if ($?) { javac bin.java } ; if ($?) { java bin }
// LIST = [8, 7, 5, 4, 3, 2, 1]
// BIN 1 = 8 2
// BIN 2 = 7 3
// BIN 3 = 5 4 1
// BINS REQUIRED IS 3