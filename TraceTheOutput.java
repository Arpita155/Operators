package Operators;

public class TraceTheOutput {
    public static void main(String [] args){
        // TRACE THE OUTPUT:

        //Q1.
        /*int a=10,b=14;
        int c= a++ + ++b;
        a= --a - a-- - ++b + b++;
        b+= ++a;
        c=a-b;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);*/

        //Q2.
        /*int a=10,b=8,c=4,d=3;
        int e = c- d % a + a++ / --d + ++b;
        c = c++ + --d + a-- % 5;
        b = e++ - c++ * a++;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);
        System.out.println("d= " +d);
        System.out.println("e= " +e);*/

        //Q3.
        /*int a=1,b=2,c=3;
        int d = c- --c + a++ % b++;
        a = --a * a++;
        b = -b + ++c * d++ % ++a;
        System.out.println("a= " +a);
        System.out.println("b= " +b);
        System.out.println("c= " +c);
        System.out.println("d= " +d);*/

        //Q4.
        /*int d = 15 & 27;
        System.out.println("d= "+d);
        int e = 64 >> 3 << 2;
        System.out.println("e= "+e);
        boolean f = !(5 > 3 && 2 < 4) || (8 > 5 && 4 <= 6);
        System.out.println("f= "+f);
        int g = 100;
        g = g-- - --g + ++g;
        System.out.println("g= "+g);
        int h = 10^5^10;
        System.out.println("h= "+h);*/

        // Q5.
        /*boolean j = !(true && false)^(false||true) && true;
        System.out.println("j="+j);
        int k=1;
        k = k++ + k++ + ++k;
        System.out.println("k= " +k);
        int l =(20 >> 2)+(15<<1);
        System.out.println("l= "+l);
        boolean m = (5>=5) && (3<=4)||!(7==7);
        System.out.println("m= "+m);
        int n=8;
        n = n-- >>> 1+ ++n >> 1;
        System.out.println("n= "+n);
        int o =(15 & 22)|(14 ^ 25);
        System.out.println("o= "+o);
        */

        //Q6.
        /*boolean q = 5 > 3 == false != true;
        System.out.println("q = " + q);

        int r = (-64 >>> 3) + (32 >> 2);
        System.out.println("r = " + r);

        int s = 5;
        s = ++s + s++ + s-- + --s;
        System.out.println("s = " + s);

        int t = ~25 & 15;
        System.out.println("t = " + t);
         */

        //Q7.
        /*int u = 10;
        u = u++ * ++u - u-- / --u;
        System.out.println("u = " + u);


        boolean v = (16 >> 2 > 3) && (20 << 1 < 50);
        System.out.println("v = " + v);



        int x = (12 | 25) & (~8);
        System.out.println("x = " + x);


        int y = 2;
        y = ++y + y++ * --y - y--;
        System.out.println("y = " + y);*/

        //Q8.
        /*boolean z = !(5 != 5) && (3 < 4 || 7 >= 8) ^ true;
        System.out.println("z = " + z);

        int aa = (100 >> 3) << 4 >> 2;
        System.out.println("aa = " + aa);


        int bb = (15 & 22) ^ (14 | 25);
        System.out.println("bb = " + bb);


        int cc = 3;
        cc = cc++ - --cc + ++cc - cc--;
        System.out.println("cc = " + cc);


        int dd = (50 >>> 2) + (30 << 1) - (15 >> 1);
        System.out.println("dd = " + dd);


        int ee = 4;
        ee = ++ee * (ee++ + --ee) - ee--;
        System.out.println("ee = " + ee);*/

        //Q9.
        /*int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;


        int output2 = (a ^ b) & (a++ * b--) + (++c / --d);
        System.out.println(a);
        boolean check2 = (((a + b) * (c - d)) >= ((a / b) * (c % d)));
        int result2 = (a > b) && (c < d) ? (a << 2) : (b >> 1);
        int valid2 = ((a & b) | (c ^ d)) + ((a << 2) >> (b >> 1));

        System.out.println("output2 = " + output2);  // 2
        System.out.println("check2 = " + check2);   // true
        System.out.println("result2 = " + result2); // 1
        System.out.println("valid2 = " + valid2);   // 27
        */

        //Q10.
        /*int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;

        int output = ((a++ * --b) + (c-- / ++d)) % c;
        boolean check = ((a + b) > (c - d)) && (a * b <= c / d);
        int result = (a != 0 || b != 0) ? (a * b) : (c / d);
        boolean valid = ((a >= b) && (c < d)) || ((a != b) && (c == d));

        System.out.println("result = " + result); // result = 24
        System.out.println("output = " + output); // output = 0
        System.out.println("check = " + check); //  check = false
        System.out.println("valid = " + valid); //  valid = false
        */

        //Q11.
        /*int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;

        boolean value = (a * b + c / d) != 0 && (a - b * c / d) != 0;
        int output3 = (a % b > 4) ? (c * d) : (a / b) + (c % d);
        int result3 = (a << b) ^ (a < b ? c : d);
        boolean check3 = ((a++ * b--) > (c-- / ++d)) && (a << 2) != 0;

        System.out.println("value = " + value);  // value = true
        System.out.println("output3 = " + output3);  // output3 = 2
        System.out.println("result3 = " + result3);  // result3 = 114
        System.out.println("check3 = " + check3); //  check3 = true
        */

        //Q12.
        /*int a = 4;
        int b = 7;
        int c = 1;
        int d = 6;
        a = (b += c) * (d -= a) / (b *= c);
//        System.out.println("a = " + a);
        b = (c |= d) & (a ^= b) << (c >>= 2);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
        c = (a *= b) + (c &= d) - (a |= b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("a = " + a); // a = 22
        System.out.println("b = " + b); // b = 2
        System.out.println("c = " + c); // c = -2
        System.out.println("d = " + d);  // d = 2
         */

        //Q13.
        /*int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        int result1 = (++x * y--) + (z++ / --w);
        int value = (x++ + --y) * (z-- - ++w);
        boolean check = ((x + y) > (z - w)) && (a * b <= c / d);
        int result2 = ((a > x) || (b >c)) ? (x * y) : (z / w);

        System.out.println("result1 = " + result1); // result1 = 131
        System.out.println("result2 = " + result2); // result2 = 102
        System.out.println("value = " + value); // value = 176
        System.out.println("check = " + check);  // check = false
        */

        //Q14.
        /*int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        boolean valid = ((x >= y) && (z < w)) || ((a != b) && (c == d));
        int bits = (x << 2) + (y >> 1) | (z & 0xFF);
        int value = ((x & 0xF) << 4) | ((y & 0xF0) >> 4);
        int mask = (~x & y) | (z << 3) | (w >> 2);

        System.out.println("boolean = " + valid); // boolean = false
        System.out.println("bits = " + bits); // bits = 76
        System.out.println("value = " + value); // value = 240
        System.out.println("mask = " + mask); // mask = 97
         */

        //Q15.
        /*int x = 15;
        int y = 8;
        int z = 12;
        int w = 5;
        int a = 20;
        int b = 7;
        int c = 10;
        int d = 4;

        int result = (x++ * (y << 2)) / (--z + (w >> 1));
        int value = ((x & y) << 2) + ((z | w) >> 1);
        int output = ((x ^ y) > (a >> 2)) ? (a++ * b--) : (++c / --d);
        boolean check = (((x + y) * (z - w)) >= ((a / b) * (c % d)));

        System.out.println("result = " + result); // result = 36
        System.out.println("value = " + value); // value = 7
        System.out.println("output = " + output); // output = 140
        System.out.println("check = " + check); // check = true
         */

        //Q16.
        /*int a = 7;
        int b = 4;
        int c = 9;
        int d = 2;
        int x = 5;
        int y = 3;
        int z = 8;
        int w = 6;

        int result = (x > y) && (z < w) ? (a << 2) : (b >> 1);
        int valid = ((x & y) | (z ^ w)) & ((a << 2) ^ (b >> 1));
        int value = (x * y + z / w) | (a - b * c / d);
        int output = (x++ % y) == (a ^ b) ? (z * w) : (a / b) + (c % d);

        System.out.println("result = " + result); // result = 2
        System.out.println("value = " + value); // value = -11
        System.out.println("output = " + output); //  output = 2
        System.out.println("valid = " + valid); // valid = 14
         */

    }
}
