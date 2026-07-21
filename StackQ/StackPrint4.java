import java.util.Stack;
class StackPrint4
{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		st.forEach(x->System.out.print(x+" "));
	}
}