import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescendingStocks 
{
	
	public static void main(String[] args) throws IOException 
{
		//getting input from text file
		BufferedReader in = new BufferedReader(new FileReader("C:\\sample.txt"));
        String str;
        int j;
       
      
        int ii=0;
        //storing it in List 
        List<String> a = new ArrayList<String>();
        while((str = in.readLine()) != null)
        {
            
            a.add(str);
        }
        //split by comma
        int[] m=new int[a.size()];
        int[] mo=new int[m.length];
        for( j=0;j<a.size();j++)
        {
             String b=a.get(j);
        	 String d[]=b.split(",");
        	 int[] n=new int[d.length];
        	 
        	 //replacing non numric with spaces
             for(int k=0;k<d.length;k++)
        	 {
            	 try{
        		 int i=Integer.parseInt(d[k].replaceAll("[^\\d.]", ""));
        	 n[k]=i;
           	 
            	 }catch(NumberFormatException e ){
            	 System.out.println("No values");
            	 }
        	 }
             //Adding values
             
        	 int s=0;
        	 int[] t=new int[n.length];
        	 
        	 for(int l=0;l<n.length;l++)
        	 {
        		 s= s + n[l];
        		 
             }
        	 
        	 m[j]=s;
                     	
        //Store it in another array
		}
        for(int o=0;o<m.length;o++)
        {
        	mo[o]=m[o];
        }
        int temp;
        //Descending the values
        for(int u=0;u<mo.length;u++)
        {
        	for(int v=u+1;v<mo.length; v++)
        	{
        		if(mo[u]<mo[v])
        		{
        			 temp=mo[u];
        			mo[u]=mo[v];
        			mo[v]=temp;
        		}
        	}
        	
        }
        //finding out the same values in array
        int flag=0;
        
        for(int t=0;t<mo.length;t++)
        {
        	for(int t1=t+1;t1<mo.length; t1++)
        	{
        		if(mo[t]==mo[t1])
        		{
        			 flag++;
        		}
        	}
        	
        }        
        	
        	//print the string when it not has the duplicate value and same value
        	if(flag==0){
        
        for(int y=0;y<mo.length;y++)
        {
        	for(int z=0;z<mo.length; z++)
        	{
        		if(mo[y]==m[z])
        		{
        			System.out.println(a.get(z));	 
        		}
        	}
        }
}
}}
     

