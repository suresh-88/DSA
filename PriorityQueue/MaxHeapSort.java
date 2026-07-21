import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

class MaxHeapSort
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of array elements");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++)
			pq.add(arr[i]);
		for(int i=0;i<n;i++)
			arr[i] = pq.poll();
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
	}
}