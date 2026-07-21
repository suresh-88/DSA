import java.util.Scanner;
class TernarySearch {
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
        int result = ternarySearch(arr,n,key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
    public static int ternarySearch(int arr[],int n,int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == key)
                return mid1;
            else if (arr[mid2] == key)
                return mid2;
			else if(key>arr[mid1]&&key<arr[mid2]){
                low = mid1 + 1;
                high = mid2 - 1;
            }
            else if (key < arr[mid1])
                high = mid1 - 1;
            else
                low = mid2 + 1;
        }
        return -1;
    }
}
