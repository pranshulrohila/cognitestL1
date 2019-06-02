//to find min in the array
package p;
class Min
{
 int a[]={1,5,2};
 int min(int x[])
 {
  System.out.print("entered array is:");
  for(int i:x)
  System.out.print(i+" ");
  int min=x[0];
  for(int i=0;i<x.length;i++)
  if(x[i]<min)
  min=x[i];
  return min;
 }
 public static void main(String... s)
 {
  Min m=new Min();
  int min=m.min(m.a);
  System.out.println("\nmin in the array:"+min);
 }
}