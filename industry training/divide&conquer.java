import java.util.*;
public class Main
{
  public static int binary (int arr[], int start, int end, int search)
  {
    while (start <= end)
      {
	int mid = (start + end) / 2;
	if (arr[mid] == search)
	  return 1;
	else if (arr[mid] <= search)
	    return binary (arr, mid + 1, end, search);
	else if (arr[mid] >= search)
	    return binary (arr, start, mid - 1, search);
      }
    return 0;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int arr[] = new int[n];
    int i;
    for (i = 0; i < n; i++)
      arr[i] = sc.nextInt ();
    int search = sc.nextInt ();
    Arrays.sort (arr);
    int ele = binary (arr, 0, arr.length - 1, search);
    if (ele == 1)
      System.out.println ("search element is found");
    else
      System.out.println ("search element is not found");

  }
}

//75 56 59 29 22 25 61 108 122 82
//82
//22 25 29 56 59 61 75 82 108 122
