package Operators;

public class All_Operator {
    public static void main(String[] args){

        //  (++)Pre-Increment , Post-Increment(++) and (--)Pre-Decrement ,Post-Decrement(--):

        //1.
//        int a=5;
//        int b=a++;
//        System.out.println(a);  // 6
//        System.out.println(b);  // 5

        //2.
//        int a=5;
//        int b= a++;
//        System.out.println(b++);  // 5
//        System.out.println(a+b);   // 12

        //3.
//        int a= 5;
//        a--;
//        int b=a++;
//        a=b--;
//        System.out.println(a);  // 4
//        System.out.println(b);  // 3

        //4.
//        int a= 5;
//        int b= 10;
//        int c=a+++b;
//        c--;
//        b=--a+c--;
//        System.out.println(a);  // 5
//        System.out.println(b);  // 19
//        System.out.println(c);  // 13

        //5.
//        int a= 5;
//        int b= 10;
//        int c=a+++b+++a;
//        System.out.println(a);  // 6
//        System.out.println(b);  // 11
//        System.out.println(c);  // 21

        //6.
//        int a= 5;
//        int b= 10;
//        int c= a+++b++;
//        b= a;
//        c = b---a--+c++;
//        System.out.println(a);  // 5
//        System.out.println(b);  // 5
//        System.out.println(c);   // 15

        //7.
//        int a= 5;
//        int b= 10;
//        int c = b++ - --a;
//        System.out.println(a);  // 4
//        System.out.println(b);  // 11
//        System.out.println(c);  // 6

        //8.
//        int a= 5;
//        int b= 10;
//        int c = --b+--b+b++-++b+a++ - --a;
//        System.out.println(a);  // 5
//        System.out.println(b);  // 10
//        System.out.println(c);  /// 15

        //9.
//        int a= 5;
//        int b= 10;
//        int c= ++a - --b+b++;
//        a= c-- + ++c+c;
//        b=a++ + --b;
//        c= c-a+b++ + ++c;
//        System.out.println(a);  // 19
//        System.out.println(b);  // 28
//        System.out.println(c);  // 21

        //10.
//        int a= 5;
//        int b= 10;
//        int c= ++a - --b*b++;
//        System.out.println(a);  // 6
//        System.out.println(b);   // 10
//        System.out.println(c);  // -75

        //11.
        // Short Circuiting
//        int a=5;
//        int b=10;
//        int c = a++ > 8 || b++ <15;

        // SOME QUESTION OF OPERATOR FOR PRACTICE

        //12.
//        int x=5;
//        int y= --x+x--;
//        System.out.println(x);  // 3
//        System.out.println(y);  // 8

        //13.
//        int x=5;
//        int y=x++ + ++x * --x;
//        System.out.println(x);  //6
//        System.out.println(y);  //47

        //14.
//        int x=10;
//        int y=5;
//        int z=x++ + --y * ++x;
//        System.out.println(x);  // 12
//        System.out.println(y);  // 4
//        System.out.println(z);  // 58

        //15.
//        int a=11;
//        int b=22;
//        int c= a+b+a++ +b++ + ++a + ++b;
//        System.out.println(a);  // 13
//        System.out.println(b);  // 24
//        System.out.println(c);  // 103

        //16.
//        int a=1;
//        int b=2;
//        int c,d;
//        c=++b;
//        d=a++;
//        c++;
//        b++;
//        ++a;
//        System.out.println(a);  // 3
//        System.out.println(b); // 4
//        System.out.println(c);  // 4

        //17.
//        int a=2,b=1,c=1,d=3,e=4,f=6;
//        int X =a<<f++ + ++b - c*e++ +d;
//        System.out.println(X);  // 256

        //18.
//        int a=8;
//        int b=5;
//        int c=2;
//        int res = a-b+(a*c)%b;
//        System.out.println(res); // 4

        //19.
//        int a=7;
//        int b=a<<2;
//        int c= b>>1;
//        System.out.println(b+c); // 42

        //20.
//        int x=10;
//        int y=20;
//        boolean res =(x < y) && (y > (x * 2) ) || (x == 10);
//        System.out.println(res);  // true

        //21.
//        int a=5;
//        int b=10;
//        boolean flag = (a+b==15)&&(a-b>-10);
//        System.out.println(flag);  // true

        //22.
//        int x=5;
//        int y=x++ + ++x;
//        System.out.println(x); // 7
//        System.out.println(y); // 12

        //23.
//        int b=20;
//        b/=(b-5)*2/5;
//        System.out.println(b);  // 3

        //24.
//        int a=10;
//        int b=20;
//        int c=5;
//        int result=(a>b)?a:((b>c)?b:c);
//        System.out.println(result); // 20

        //25.
//        int x=4;
//        int y=8;
//        int result = (x+y>10)?((x>y)?"X is greater" : "y is greater");
//        System.out.println(result);

        //26.
//        int a=5,b=8,c=3,d=6;
//        int result=(a|b)&(c^d);
//        System.out.println(result); // 5

        //27.
//        int a=12,b=25;
//        int result=a^b;
//        result=result>>2;
//        System.out.println(result);  // 5

        //28.
//        int a=6,b=4,c=8;
//        int result=(a>b)?((a>c)?a:((b>c)?b:c)):b;
//        System.out.println(result); // 8

        //29.
//        int a=10,b=5,c=20;
//        int result=a+b*c/b-a%b;
//        System.out.println(result);  // 30

        //30.
//        int a=4,b=3,c=2;
//        int result=a*b/c+a%b-c;
//        System.out.println(result); // 5

//        int a=3,b=7;
//        boolean result=(a&b)!=0&&(a|b)<10;
//        System.out.println(result); // true

        //31.
//        int x=5,y=10;
//        boolean result =(x>y)?false:(x<y)?true:false;
//        System.out.println(result); // true

        //32.
//        int a=9,b=5;
//        int result=(a&b)|(~a);
//        System.out.println(result);  // ans should be -10 but it gives -9

        //33.
//        int a=10,b=3,c=5;
//        int result = a-b*c+a/b%c;3
//        System.out.println(result); // -2



    }
}