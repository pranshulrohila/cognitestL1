//to find max in array
package p;
class Max
{
 int a[]={1,5,2};
 int max(int  x[])
 {
  System.out.print("entered array is:");
  for(int i:x)
  System.out.print(i+" ");
  int max=x[0];
  for(int i=0;i<x.length;i++)
  if(x[i]>max)
  max=x[i];  
  return max;
 }
 public static void main(String... s)
 {
  Max m=new Max();
  int max=m.max(m.a);
  System.out.println("\nmax in the array:"+max);
 }
}