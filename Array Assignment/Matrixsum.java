package p;
class Matrixsum
{
 int a[][]={{10,20,30},{50,10,30},{10,20,20}};
 void matrixsum(int a[][])
 {
  int c[][]=new int[a.length+2][a.length+2];
  c[a.length][a.length]=0;
  c[0][a.length]=0;
  c[1][a.length]=0;
  c[2][a.length]=0;
  c[a.length][0]=0;
  c[a.length][1]=0;
  c[a.length][2]=0;
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a[i].length;j++)
   System.out.print(a[i][j]+" ");
   System.out.print("\n");
  }
  System.out.print("\n");
  for(int i=0;i<a.length;i++)
  {
   for(int j=0;j<a.length;j++)
   {
    c[i][j]=a[i][j];
    if(i==j)
    c[a.length][a.length]=c[a.length][a.length]+c[i][j];
    if(i==0&&j<a.length)
    c[0][a.length]+=c[0][j];
    if(i==1&&j<a.length)
    c[1][a.length]+=c[1][j];
    if(i==2&&j<a.length)
    c[2][a.length]+=c[2][j];
   }
   c[a.length][0]+=c[i][0];
   c[a.length][1]+=c[i][1];
   c[a.length][2]+=c[i][2];
  }
  int ss=0;
  for(int i=0;i<a.length;i++)
  ss+=a[i][a.length-1-i];
  for(int i=0;i<c.length-1;i++)
  {
   for(int j=0;j<c.length-1;j++)
   {
    if(i==c.length-2&&j==0)
    System.out.print(ss+"  ");
    if(j==0&&i!=c.length-2)
    System.out.print("    ");
    System.out.print(c[i][j]+"  ");
   } 
   System.out.print("\n");
  } 
 }
 public static void main(String... s)
 {
  Matrixsum m=new Matrixsum();
  m.matrixsum(m.a);
 }
}