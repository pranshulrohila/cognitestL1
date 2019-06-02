package p;
class Prntdiagonalwise
{
 int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
 void prntdiagonalwise(int a[][])
 {
  System.out.print("Array is:\n");
  for(int i=0;i<a.length;i++)
  { 
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
  }
  System.out.print("\nDiagonal wise array is:\n");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   {
    int k=i+j;
    switch(k)
    {
     case 0:
     System.out.print(a[i][j]+" ");break;
     case 1:
     System.out.print(a[i][j]+" ");break;
     case 2:
     System.out.print(a[i][j]+" ");break;
     case 3:
     System.out.print(a[i][j]+" ");break;
     case 4:
     System.out.print(a[i][j]+" ");break;
    }
    break;
   } 
   System.out.print("\n");
   continue;
  }
  /*System.out.print("\n");
  for(int i:a)
  System.out.print(i+" ");*/
 }
 public static void main(String... s)
 {
  Prntdiagonalwise m=new Prntdiagonalwise();
  m.prntdiagonalwise(m.a);
 }
}