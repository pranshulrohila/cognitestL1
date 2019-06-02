//to find min in array of array
package p;
class Min1
{
 int b[][]={{10,50,20,40,30},{20,15,10,25,30}};
 int min1(int b[][])
 {
  int min1=b[0][0];
  System.out.print("\nentered array of array:\n");
  for(int i=0;i<b.length;i++)
  {
   for(int j=0;j<b[i].length;j++)
   {
    System.out.print(b[i][j]+" ");
   }
   System.out.print("\n");
  }
  for(int i=0;i<b.length;i++)
  for(int j=0;j<b[i].length;j++)
  if(b[i][j]<min1)
  min1=b[i][j];
  return min1;
 }
 public static void main(String... s)
 {
  Min1 m=new Min1();
  int min=m.min1(m.b);
  System.out.println("min in 2-d array:"+min);
 }
}