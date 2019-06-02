package p;
class Matrixadd
{
 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
 int b[][]={{1,2,3},{4,5,6},{7,8,9}};
 void matrixadd(int a[][],int b[][])
 {
  int c[][]=new int[a.length][a.length];
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\t\t");
   for(int j=0;j<a.length;j++)
   System.out.print(b[i][j]+" ");
   System.out.print("\n");
  }
  for(int i=0;i<a.length;i++)
  for(int j=0;j<a[i].length;j++)
  c[i][j]=a[i][j]+b[i][j];
  for(int i=0;i<a.length;i++)
  { 
   System.out.print("\t");
   for(int j=0;j<a[i].length;j++)  
   System.out.print(c[i][j]+" ");
   System.out.print("\n");
  }
 }
 public static void main(String... s)
 {
  Matrixadd m=new Matrixadd();
  m.matrixadd(m.a,m.b);
 }
}