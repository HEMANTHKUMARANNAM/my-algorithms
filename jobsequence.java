import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class job
{
    char jobid;
    int deadline;
    int profit;

    job(char jobid, int deadline, int profit)
    {
        this.jobid = jobid;
        this.deadline = deadline;
        this.profit = profit;
    }

}



public class jobsequence 
{
    public static void main(String[] args) 
    {

        ArrayList<job> a = new ArrayList<job>(); 

        a.add( new job('a',4,20) );
        a.add( new job('b' , 1 , 10) );
        a.add( new job('c' , 1 , 40) );
        a.add( new job('d' , 1 , 30) );

        Collections.sort(a, Comparator.comparingInt(job::profit));



    }
}
