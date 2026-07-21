import java.util.Stack;
import java.util.Iterator;
class StackPrint2
{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		Iterator it = st.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}