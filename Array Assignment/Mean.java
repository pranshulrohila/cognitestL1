package p;
class Mean
{
 int a[]={2,3,4,5,6,7,8,9,0};
 float mean(int a[])
 {
  float mean=0;
  System.out.print("Array is:");
  for(int i=0;i<a.length;i++)
  {
   System.out.print(a[i]+" ");
   mean+=a[i];
  }
  System.out.print("\nMean of the array is:"+(float)mean/a.length);
  return mean;
 }
 public static void main(String... s)
 {
  Mean m=new Mean();
  m.mean(m.a);
 }
}