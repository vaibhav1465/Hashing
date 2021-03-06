import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longest_Subarray_of_given_sum{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
    int p=0;
    int m=0;
    int sum=sc.nextInt();
    HashMap<Integer,Integer> h=new HashMap<>();
    for(i=0;i<n;i++)
    {
        p+=a[i];
        if(h.containsKey(p-sum))
        {
            int t=h.get(p-sum);
            m=Math.max(m,i-t);
            //System.out.println(h);
        }
        else if(p==sum)
        {
            m=Math.max(m,i+1);
            //System.out.println(h);
        }
        if(!h.containsKey(p))
        h.put(p,i);
    }
        System.out.println(m);
    }
 }

