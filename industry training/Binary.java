import java.util.*;
class node
{
  int n;
  node left;
  node right;
    node (int n)
  {
    this.n = n;
    this.left = null;
    this.right = null;
  }

}
class binarytree
{
  node root;
  public static node adding (node current, int n)
  {
    if (current == null)
      return new node (n);
    else if (n > current.n)
      current.right = adding (current.right, n);
    else if (n < current.n)
      current.left = adding (current.left, n);
    else
      return current;
    return current;
  }
  public static void inorder (node current)
  {
    if (current != null)
      {
	inorder (current.left);
	System.out.print (current.n + " ");
	inorder (current.right);
      }
  }
  public static void preorder (node current)
  {
    if (current != null)
      {
	System.out.print (current.n + " ");
	preorder (current.left);
	preorder (current.right);
      }
  }
  public static void postorder (node current)
  {
    if (current != null)
      {
	postorder (current.left);
	postorder (current.right);
	System.out.print (current.n + " ");
      }
  }
  public void add (int n)
  {
    root = adding (root, n);
  }
}

public class Main
{

  public static void main (String[]args)
  {
    binarytree bt = new binarytree ();
      bt.add (8);
      bt.add (3);
      bt.add (10);
      bt.add (1);
      bt.add (6);
      bt.add (14);
      bt.add (4);
      bt.add (7);
      bt.add (13);
//      bt.add(0);
      bt.inorder (bt.root);
      System.out.println ();
      bt.preorder (bt.root);
      System.out.println ();
      bt.postorder (bt.root);

  }
}
