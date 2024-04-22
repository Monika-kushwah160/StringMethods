
package com.mycompany.stringmethod;
import java.io.*;
public class Stringbuffer
        
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer();
         StringBuffer sb1 = new StringBuffer("hello");
//         by default capacity of sb is 16
        System.out.println("capacity of sb:"+sb.capacity());
//        in stringbuffer cap=16+5(hello)=21
        System.out.println("capacity of sb1:"+sb1.capacity());

        sb.append("hello");
        System.out.println(sb);
        System.out.println("capacity of sb:"+sb.capacity());
//        append in sb so old=16 and now (16*2)+2=34
        sb.append("this is my testing string");
        System.out.println("capacity of sb:"+sb.capacity());
        
        sb1.append("this is my testing string of sb1");
        System.out.println("capacity of sb:"+sb.capacity());
        if(sb.equals(sb1))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    
}
