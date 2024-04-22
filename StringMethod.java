

package com.mycompany.stringmethod;

import java.util.Arrays;


public class StringMethod {

    public static void main(String[] args)
    {
        String a = "Monika";
        String b = "Kushwah";
        String c = "Monika";
        String d = "kushwah";
//       1. euals() method
        System.out.println(a.equals(c));
        System.out.println(b.equals(d));
        
//        2. equalsIgnoreCase()

        System.out.println(b.equalsIgnoreCase(d));
        
//        3. length() method

        System.out.println(a.length());
        
//      4. charAt() method  
        
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(a.length()-1));
        
        String str = "My name is monika kushwah";
//        5. indexOf() method
        System.out.println(str.indexOf("is"));
        System.out.println(str.lastIndexOf("ka"));
//       6. subString() method
        System.out.println(str.substring(5));
        System.out.println("length of str:"+str.length());
//        7.split() method
        String[] n = str.split(" ");
        System.out.println("after split the length of str:"+n.length);
//        convert String to array 
        System.out.println(Arrays.toString(n));
//        8.toLowerCase() method
        System.out.println(a.toLowerCase());
//        9.toUpperCse() method

        System.out.println(a.toUpperCase());
        
//        10. trim() method
         String k = "    hello    ";
         System.out.println(k);
        System.out.println(k.trim());
//        11.contains() method
        System.out.println(b.contains("Kush"));
    }
}
