package p;
import java.math.*;
class BtoD
{
 long n;
 //long n=1000000001;
 int btod(long n)
 {
  int count=0,decimal=0;
  long d;
  System.out.println("Binary number is :"+n);
  while(n>0)
  {
   d=n%10;
   //System.out.println("power of 2^count is:"+Math.pow(2,count));
   decimal+=d*Math.pow(2,count);
   n=n/10;
   count+=1;
  }
  System.out.print("Binary to Decimal is:"+decimal);
  return decimal;
 }
 BtoD(int x[])
 {
  int c=0;
  this.n=0;
  for(int i=x.length-1;i>=0;i--)
  {this.n+=x[i]*Math.pow(10,c);
  c+=1;}
 }
 public static void main(String... s)
 {
  int x[]={1,0,0,0,0,0,0,0,0,1};
  BtoD m=new BtoD(x);
  m.btod(m.n);
 }
}