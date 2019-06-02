//to sort arrary of array
package p;
class Sort1
{
 int x[][]={{5,1,2},{6,3,4,7}};
 void sort1(int a[][])
 {
  int n=0;
  System.out.println("entered array of array:");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   {
    n+=1;
    System.out.print(a[i][j]+" ");
   }
  System.out.print("\n");
  }
  int c[]=new int[n];
  int k=0;
  for(int i=0;i<a.length;i++)
  for(int j=0;j<a[i].length;j++)
  {
   c[k]=a[i][j];
   k+=1;
  }
  for(int i=0;i<c.length;i++)
  for(int j=i;j<c.length;j++)
  if(c[i]>c[j])
  {
   int temp=c[i];
   c[i]=c[j];
   c[j]=temp;
  }
  int d=0;
  for(int i=0;i<a.length;i++)
  for(int j=0;j<a[i].length;j++)
  {
   a[i][j]=c[d];
   d+=1;
  }
  System.out.println("\nsorted array of array:");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
  }
 }
 public static void main(String... s)
 {
  Sort1 s1=new Sort1();
  s1.sort1(s1.x);
 }
}