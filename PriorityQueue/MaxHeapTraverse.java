import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;
class MaxHeapTraverse
{
	public static void main(String args[]){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		Iterator it = pq.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}