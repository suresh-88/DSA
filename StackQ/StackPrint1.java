import java.util.Stack;
class StackPrint1
{
	public static void main(String args[]){
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		for(Integer x:st)
			System.out.print(x+" ");
	}
}