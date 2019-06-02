package p;
class Trianglemax
{
 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
 void trianglemax(int a[][])
 {
  int upmax=a[0][0];
  int lwmax=a[0][0];
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+"  ");
   System.out.print("\n");
  }
  for(int i=0;i<a.length;i++)
  {
   for(int j=i;j<a[i].length;j++)
   if(upmax<a[i][j])
   upmax=a[i][j];
   for(int j=0;j<=i;j++)
   if(lwmax<a[i][j])
   lwmax=a[i][j];
  }
  System.out.print("Maximum element in the Upper triangle is :"+upmax);
  System.out.print("\nMaximum element in the Lower triangle is :"+lwmax);
 }
 public static void main(String... s)
 {
  Trianglemax m=new Trianglemax();
  m.trianglemax(m.a);
 }
}