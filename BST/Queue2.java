import java.util.Scanner;
import java.util.Stack;
class Queue2{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enqueue(int x){
        s1.push(x);
    }
    int dequeue(){
        if(s1.isEmpty())
            return -1;
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int x = s2.pop();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return x;
    }
    int front(){
        if(s1.isEmpty())
            return -1;
        while(!s1.isEmpty())
            s2.push(s1.pop());
        int x = s2.peek();
        while(!s2.isEmpty())
            s1.push(s2.pop());
        return x;
    }
    void printQueue(){
        for(Integer t : s1)
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
        Queue2 q = new Queue2();
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