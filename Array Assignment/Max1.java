//to find max in array of array
package p;
class Max1
{
 int b[][]={{10,50,20,40,30},{20,15,10,25,30}};
 int max1(int b[][])
 {
  int max1=b[0][0];
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
  if(max1<b[i][j])
  {
   max1=b[i][j];
  }
  return max1;
 }
 public static void main(String... s)
 {
  Max1 m=new Max1();
  int max=m.max1(m.b);
  System.out.println("max in array of array:"+max);
 }
}