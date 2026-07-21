import java.util.*;
class Student
{
	int roll,total;
	String name,branch;
	float cgpa;
	Student(int r,String n,String b,int t,float c)
	{
		roll=r;
		name=n;
		branch=b;
		total=t;
		cgpa=c;
	}
	@Override
    public String toString() {
        return roll + " " + name + " " + branch + " "+total+" "+cgpa;
    }
}
class SortByCgpa implements Comparator <Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.cgpa==s2.cgpa)
			return 0;
		else if(s1.cgpa>s2.cgpa)
			return 1;
		else
			return -1;
	}
}
public class MinHeapRecords
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of records ");
		int n=sc.nextInt();
		PriorityQueue<Student> pq = new PriorityQueue<>(new SortByCgpa());
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter student "+i+" roll:");
			int r=sc.nextInt();
			System.out.print("Enter student "+i+" name:");
			String nm=sc.next();
			System.out.print("Enter student "+i+" branch:");
			String b=sc.next();
			System.out.print("Enter student "+i+" total:");
			int t=sc.nextInt();
			System.out.print("Enter student "+i+" cgpa:");
			float c=sc.nextFloat();
			System.out.println();
			Student s1 = new Student(r,nm,b,t,c);
			pq.add(s1);
		}
		
		Iterator it = pq.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}