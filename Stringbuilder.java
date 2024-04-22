
package com.mycompany.stringmethod;
import java.util.*;

public class Stringbuilder 
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("Monka");
        System.out.println(sb.capacity());
        sb.insert(3, "i");
        System.out.println(sb);
        sb.insert(6, "kushwah");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(3));
    }
}
