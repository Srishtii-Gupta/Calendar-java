import java.util.*;

public class MyClass {

 public static boolean isLeapYear(int y)
{
if((y%4==0)&&(y%100!=0)||(y%400==0))
{
    return true;
}

return false;
}

   public static int findDay(int day,int month,int year)
    {
    int y=year-(14-month)/12;
    int dy=y+y/4-y/100+y/400;
    int m=month+12*((14-month)/12)-2;
    int d=(day+dy+(31*m)/12)%7;
    return d;
    }

    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);

   System.out.println("Enter month number : ");
   int month=in.nextInt();
   System.out.println("Enter year number : ");
    int year=in.nextInt();
   String []m={"","January","February","March","April","May","June","July","August","September","October","November","December"};
   int []days={0,31,28,31,30,31,30,31,31,30,31,30,31};
   if(month==2 && isLeapYear(year))
   {
       days[month]=29;
   }
  System.out.println("\n");
   System.out.println(" "+m[month]+" "+year);
  System.out.println("\nSu Mo Tu We Th Fr Sa");
   int d=findDay(1,month,year);
   for(int i=0;i<d;i++)
   {
       System.out.print("   ");
   }

   for(int i=1;i<=days[month];i++)
   {
       System.out.printf("%2d ",i);
       if(((i+d)%7==0)||(i==days[month]))
       {
        System.out.println();
       }
   }
    }
}