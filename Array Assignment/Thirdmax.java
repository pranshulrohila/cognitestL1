package p;
class Thirdmax
{
 int a[]={1,2,3,4,5,6,7,8,9,0};
 int thirdmax(int a[])
 {
  int max=a[0];
  System.out.print("Array is:");
  for(int i=0;i<a.length;i++)
  System.out.print(a[i]+" ");
  for(int i=0;i<a.length-1;i++)
  {
   for(int j=i+1;j<a.length;j++)
   if(a[i]>max)
   max=a[i];
  }
  System.out.print("\nMaximum in the array is:"+max);
 return max;
 }
 public static void main(String... s)
 {
  Thirdmax m=new Thirdmax();
  m.thirdmax(m.a);
 }
}