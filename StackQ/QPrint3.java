import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;
class QPrint3
{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		ListIterator it = q.listIterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}