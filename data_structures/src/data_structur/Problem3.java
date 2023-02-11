
package data_structur;
import java.util.Scanner;
/**
 *
 * @author ziade
 */

public class Problem3 {

    public static void main (String [] args){
        StopWatch Timer = new StopWatch();
        Timer.setstartime(System.currentTimeMillis());
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter no. of Islands");
        int n= sc.nextInt();
         Graph g = new Graph (n);
        System.out.println("Enter no. of one-way bridges");
        int m= sc.nextInt();
        System.out.println("Enter no. of island you want to be intially on");
        int r= sc.nextInt();
       try{ for (int i=0; i<m;i++){ 
            System.out.println("This one-way bridge connects between");
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(u == v || u>n || v>n){ throw new Bounds("");}
            else{ g.addEgde(u-1, v-1);}
            
        }
                g.topoSort(r);}
        catch(IndexOutOfBoundsException e){
            System.out.println("Please enter a valid input!");
        }
       catch(Bounds e){
       System.out.println("Please enter a valid input!");
       }
         
       Timer.setendtime(System.currentTimeMillis());
        double starttime = Timer.getstarttime();
        double endtime = Timer.getendtime();
        System.out.println("Excution time in mili seconed:\t" + Timer.gettimeelapsed(endtime, starttime)+" millisecond  ");
    }
    
    public static class Bounds extends Exception{
    
    public Bounds (String message){
    super(message);
    }}
    static class Graph {
        int V;
       linkedlist<Integer>[] adjList;

        Graph(int V) {
            this.V = V;
            adjList = new linkedlist[V];

            for (int i = 0; i < V; i++) {

                adjList[i] = new linkedlist<>();
            }
        }

        public void addEgde(int u, int v) {
            adjList[u].addFirst(v);
        }
        
 public void topoSort(int start) {
        double[] probability = new double[V];
        probability[start] = 1;
        int[] indegree = new int[V];
        Stack stack = new Stack();

        for (int i = 0; i < V; i++) {
            probability[i] = 0;
            for (int j = 0; j < adjList[i].size(); ++j) {
                 indegree[adjList[i].get(j)] += 1;
            }
        }

        probability[start] = 1;

        for(int i = 0; i < V; ++i)
        {
            if(indegree[i] == 0)
              stack.push(i);
        }

        while(!stack.isEmpty())
        {
           int v = (int) stack.pop();
           for (int i = 0; i < adjList[v].size(); ++i)
           {
                indegree[adjList[v].get(i)] -= 1;
                probability[adjList[v].get(i)] += probability[v] / (double)(adjList[v].size());
                if(indegree[adjList[v].get(i)] == 0)
                  stack.push(adjList[v].get(i));
                

           }
     
        }
   IndexOfMax(reverse(probability,probability.length));
    }

     static double[] reverse(double p[], int size) 
    { 
        double[] b = new double[size]; 
        int j = size; 
        for (int i = 0; i < size; i++) { 
            b[j - 1] = p[i]; 
            j = j - 1; 
        }
        return b;
    } 
  
        private void IndexOfMax(double[] p) {
           double max = p[0];
		int index = 0;

		for (int i = 0; i < p.length; i++) 
		{
			if (max < p[i]) 
			{
				max = p[i];
				index = i;
			}
		}

	System.out.println("The Island which you are most likely to be on is " + (index+1)) ;
        }
  }}

