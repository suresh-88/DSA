import java.util.Queue;
import java.util.LinkedList;
class QPrint4
{
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.forEach(x->System.out.print(x+" "));
	}
}