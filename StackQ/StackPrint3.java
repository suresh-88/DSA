import java.util.Stack;
import java.util.ListIterator;
class StackPrint3
{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		ListIterator it = st.listIterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}