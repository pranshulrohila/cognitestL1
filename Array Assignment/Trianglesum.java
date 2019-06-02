package p;
class Trianglesum
{
 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
 void trianglesum(int a[][])
 {
  int upsum=0;
  int lwsum=0;
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+"  ");
   System.out.print("\n");
  }
  for(int i=0;i<a.length;i++)
  {
   for(int j=i;j<a[i].length;j++)
   upsum+=a[i][j];
   for(int j=0;j<=i;j++)
   lwsum+=a[i][j];
  }
  System.out.print("Upper triangle sum is :"+upsum);
  System.out.print("\nLower triangle sum is :"+lwsum);
 }
 public static void main(String... s)
 {
  Trianglesum m=new Trianglesum();
  m.trianglesum(m.a);
 }
}