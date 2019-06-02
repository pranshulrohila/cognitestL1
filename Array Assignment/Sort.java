package p;
class Sort
{
 int b[]={10,50,20,40,30};
 void sort(int a[])
 {
  System.out.print("entered array is:");
  for(int i:a)
  System.out.print(i+" ");
  for(int i=0;i<a.length;i++)
  for(int j=i;j<a.length;j++)
  if(a[i]>a[j])
  {
   int temp=a[i];
   a[i]=a[j];
   a[j]=temp;
  }
  System.out.print("\nsorted array:");
  for(int i=0;i<a.length;i++)
  System.out.print(a[i]+" ");
 }
 public static void main(String... s)
 {
  Sort m=new Sort();
  m.sort(m.b);
 }
}