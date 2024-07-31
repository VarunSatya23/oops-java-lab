class program2
{
    public static void main(String args[])
{
    double a=4;
    double b=2;
    double c=0;
    double D=Math.sqrt(b*b-4*a*c);
    double x=(-b-D)/(2*a);
    double y=(-b+D)/(2*a);
    if (D>0)
    {
        System.out.println("The roots are real&distinct");
        System.out.println("The roots are::"+x+","+y);
    }
    else if(D==0)
    {
        System.out.println("The roots are real and equal");
        System.out.println("The roots are::"+x+","+y);
    }
    else
    {
        System.out.println("The roots are complex");
        
    }

    }

    }

