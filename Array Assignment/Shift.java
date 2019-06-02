package p;
class Shift
{
 int a[]={1,2,3,-1,-5,-4,-2,-3,0};
 void shift(int a[])
 {
  System.out.print("Array is:");
  for(int i:a)
  System.out.print(i+" ");
  for(int i=0;i<a.length;i++)
  for(int j=0;j<a.length;j++)
  if(a[i]<a[j])
  {
   int t=a[i];
   a[i]=a[j];
   a[j]=t;
  }
  for(int i=0;i<a.length;i++)
  for(int j=0;j<a.length&&a[i]<0;j++)
  if(a[i]>a[j])
  {
   int t1=a[i];
   a[i]=a[j];
   a[j]=t1;
  }
  System.out.print("\nAfter shifting array is:");
  for(int i:a)
  System.out.print(i+" "); 
 }
 public static void main(String... s)
 {
  Shift m=new Shift();
  m.shift(m.a);
 }
}