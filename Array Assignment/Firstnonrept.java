package p;
class BtoD
{
 int n=1010;
 int btod(int n)
 {
  int decimal=0;
  while(n>0)
  {
   int d,count=0;
   d=n%10;
   decimal+=d*2^count;
   count+=1;
   n=n/10;
  }
  System.out.print("Binary to Decimal is:"+decimal);
 }
 public static void main(String... s)
 {
  BtoD m=new BtoD();
  m.btod(m.a);
 }
}