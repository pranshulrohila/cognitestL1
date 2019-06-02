package p;
class Median
{
 int a[]={1,2,3,4,5,6,7,8,9};
 float median(int a[])
 {
  float med=(float)a.length/2;
  System.out.print("Array is:");
  for(int i=0;i<a.length;i++)
  System.out.print(a[i]+" ");
  System.out.print("\nIndex of Median of the array is:"+(int)med+" ,Median element is:"+a[(int)med]);
  return med;
 }
 public static void main(String... s)
 {
  Median m=new Median();
  m.median(m.a);
 }
}