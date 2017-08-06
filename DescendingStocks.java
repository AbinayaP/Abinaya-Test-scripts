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
        int[] mo1=new int[m.length];
        int[] index=new int[m.length];
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
        	mo1[o]=m[o];
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
        //Find the duplicate values or string 
        
        for(int f=0;f<mo.length;f++){
        	for(int g=0;g<mo.length;g++)
        	{
        	if (mo[f]==mo1[g]){
        		
        		index[f]=g;
        		mo1[g]= -(mo1[g]);
        		break;
        		
        	}
        		
        	}
        }
        //print the string in descending order
        for(int y=0;y<a.size();y++){
        	System.out.println(a.get(index[y]));	
        }
        
}
}
     

