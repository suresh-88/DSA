import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;
class QPrint2
{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		Iterator it = q.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}