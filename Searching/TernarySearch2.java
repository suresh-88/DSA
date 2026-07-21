import java.util.Scanner;
class TernarySearch2 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter element to search:");
        int key = sc.nextInt();
        int result = tSearch(arr,0,n-1,key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
    public static int tSearch(int arr[],int low,int high,int key) {
        if (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == key)
                return mid1;
            else if (arr[mid2] == key)
                return mid2;
			else if(key>arr[mid1]&&key<arr[mid2])
				return tSearch(arr,mid1+1,mid2-1,key);
            else if (key < arr[mid1])
                return tSearch(arr,low,mid1-1,key);
            else
                return tSearch(arr,mid2+1,high,key);
        }
        return -1;
    }
}
