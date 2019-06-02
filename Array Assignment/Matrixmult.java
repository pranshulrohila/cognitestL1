package p;
class Matrixmult
{
 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
 int b[][]={{1,2,3},{4,5,6},{7,8,9}};
 void matrixmult(int a[][],int b[][])
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
  for(int k=0;k<a.length;k++)
  c[i][j]=c[i][j]+a[i][k]*b[k][j];
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
  Matrixmult m=new Matrixmult();
  m.matrixmult(m.a,m.b);
 }
}