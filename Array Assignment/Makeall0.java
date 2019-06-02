package p;
class Makeall0
{
 int a[][]={{1,2,3},{4,0,6},{7,8,9}};
 void makeall0(int a[][])
 {
  System.out.print("Array is:\n");
  for(int i=0;i<a.length;i++)
  { 
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
  }
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   if(a[i][j]==0)
   //System.out.print("\nNO element is 0 int the array of array");
   
  }
  System.out.print("Array is:\n");
  for(int i=0;i<a.length;i++)
  { 
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
  }
 }
 public static void main(String... s)
 {
  Makeall0 m=new Makeall0();
  m.makeall0(m.a);
 }
}