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
class SortByName implements Comparator <Student>
{
	public int compare(Student s1,Student s2)
	{
		if(s1.name.compareTo(s2.name)==0)
			return 0;
		else if(s2.name.compareTo(s1.name)>0)
			return 1;
		else
			return -1;
	}
}
public class SortBySname2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of records ");
		int n=sc.nextInt();
		Student al[] = new Student[n];
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
			al[i-1] = new Student(r,nm,b,t,c);
		}
		Arrays.sort(al,new SortByName());
		for(int i=0;i<n;i++)
			System.out.println(al[i]);
	}
}