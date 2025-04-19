import java.io.*;
import java.util.Scanner;
class BOO {
    public static void main(String[] args) {
        String s = "Boobalans"; 
        String r = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;  
        }
        System.out.println(r);
    }
}

