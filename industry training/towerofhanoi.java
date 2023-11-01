import java.util.*;
public class Main
{
  public static void towerofhanoi (int n, char from, char to, char aux)
  {
    if (n == 1)
      {
	System.out.printf ("%d disc from %c to %c", n, from, to);
	// System.out.println();
      }
    else
      {
	towerofhanoi (n - 1, from, aux, to);
	System.out.println ();
	System.out.printf ("%d disc from %c to %c", n, from, to);
	System.out.println ();
	towerofhanoi (n - 1, aux, to, from);
      }
  }
  public static void main (String[]args)
  {
    System.out.println ("Hello World");
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    towerofhanoi (n, 'A', 'C', 'B');
  }
}
