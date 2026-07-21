import java.util.PriorityQueue;
import java.util.Iterator;
class MinHeapTraversal
{
	public static void main(String args[]){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.add(3);
		pq.add(2);
		pq.add(1);
		Iterator it = pq.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}