import java.util.Scanner;
abstract class Number{
    abstract void displayNum(int n);
}
class HexNum extends Number{
    void displayNum(int n)
    {
        int r,num=n;
        String S="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0)
        {
            r=num%16;
            S=hex[r]+S;
            num=num/16;
        }
        System.out.println("Hexadecimal Value: "+S);
    }
}
class OctNum extends Number{
    void displayNum(int n)
    {
        int r,num=n;
        String S="";
        char oct[]={'0','1','2','3','4','5','6','7'};
        while(num>0)
        {
            r=num%8;
            S=oct[r]+S;
            num=num/8;
        }
        System.out.println("Octal Value: "+S);
    }
}
class assign_8b
{
    public static void main(String args[])
    {
        int n;
        Number ob;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        ob=new HexNum();
        ob.displayNum(n);
        ob=new OctNum();
        ob.displayNum(n);
        sc.close();
    }
}
