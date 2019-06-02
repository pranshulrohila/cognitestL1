package p;
class MergeSort
{
 int a[]={1,5,2};
 int b[]={3,4,6,7};
 void mergesort(int x[],int y[])
 {
  int c[];
  int n=x.length+y.length;
  c=new int[n];
  for(int i=0;i<x.length;i++)
  c[i]=x[i];
  for(int i=n-1;i>=0;i--)
  c[i]=c[n-1-i];
  for(int i=0;i<y.length;i++)
  c[i]=y[i];
  //for(int z:c)
  //System.out.print(z+" ");
  Sort s=new Sort();
  s.sort(c); 
}
 public static void main(String... s)
 {
  MergeSort m=new MergeSort();
  m.mergesort(m.a,m.b);
 }
}