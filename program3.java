class program3
{
public static void main(String args[])
{
int X=28;
int sum=0;
while(X>0)
{
sum=sum+X%10;
X=X/10;
if(X==0&&sum>9)
{
X=sum;
sum=0;
}
if(sum<=9&&X==0)
break;
}
if(sum==1)
System.out.println("The given number is a magic number");
else
System.out.println("The given number is not a magic number");
}
}
