package p;
class Matrixxpose
{
 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
 void matrixxpose(int a[][])
 {
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<(a[i].length);j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
   }
  System.out.print("\n");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   { 
    //System.out.print("\t");
    System.out.print(a[j][i]+" ");
   }
   System.out.print("\n");
  }
 }
 public static void main(String... s)
 {
  Matrixxpose m=new Matrixxpose();
  m.matrixxpose(m.a);
 }
}