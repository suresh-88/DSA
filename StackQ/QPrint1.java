import java.util.Queue;
import java.util.LinkedList;
class QPrint1
{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		for(Integer x:q)
			System.out.print(x+" ");
	}
}