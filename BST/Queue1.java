import java.util.Scanner;
import java.util.Stack;
class Queue1<T>{
    Stack<T> s1 = new Stack<>();
    Stack<T> s2 = new Stack<>();
    void enqueue(T x){
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(x);
        while(!s2.isEmpty())
            s1.push(s2.pop());
    }
    T dequeue(){
        return s1.pop();
    }
    T front(){
        return s1.peek();
    }
    void printQueue(){
        for(T t : s1)
            System.out.print(t+" ");
        System.out.println();
    }
}

class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of Queue values : ");
        int n = sc.nextInt();
        Queue1<Integer> q = new Queue1<>();
        System.out.println("Enter values : ");
        for(int i=0;i<n;i++){
            int f = sc.nextInt();
            q.enqueue(f);
        }
        q.printQueue();
        System.out.println(q.dequeue());
        System.out.println(q.front());
        q.printQueue();
    }
    
}