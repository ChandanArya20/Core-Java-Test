import jdk.dynalink.linker.support.CompositeGuardingDynamicLinker;

import java.util.Arrays;
import java.util.List;

public class Wrapper {
    public static void main(String[] args) {

//      Integer i = new Integer(23);  //deprecated since java 9

        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
//        Integer i2 = Integer.valueOf("ten");  //NumberformatException

        Integer i3 = 10;  //prefer way


        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        Character c = Character.valueOf('c');
        System.out.println(c);

        
        int a=12;
        
        Integer ax=a;
        Integer ax1=Integer.valueOf(a);

        System.out.println(ax);

        int i = ax.intValue();
        int ix = ax;

        String num="1234";
        int nump = Integer.parseInt(num);  //convert strig o primitive type
        System.out.println(num);
        System.out.println(nump);

        String num2="twelve";
//        int i4 = Integer.parseInt(num2);  //NumberFormatException: For input string: "twelve"
//        System.out.println(i4);

        System.out.println();

        Number r =12.5;

        System.out.println(r.floatValue()+12);


        System.out.println(Integer.MAX_VALUE+"   "+Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE+"   "+Byte.MIN_VALUE);
        System.out.println(Double.MAX_VALUE+"   "+Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE+"   "+Float.MIN_VALUE);
        System.out.println(Character.MAX_VALUE+"   "+Character.MIN_VALUE);

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isAlphabetic(','));
        System.out.println(Character.isLetter('t'));
        System.out.println(Character.isLetter('4'));
        System.out.println(Character.isLetterOrDigit('t'));
        System.out.println(Character.isLowerCase('h'));
        System.out.println(Character.isUpperCase('h'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isSpaceChar(' '));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('R'));



    }
}