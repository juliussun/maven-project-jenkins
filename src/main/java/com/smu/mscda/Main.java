package com.smu.mscda;

import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Capitalize and MD5 Encoding Start, Type the words!");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(Captalize(str));
        System.out.println(GenerateMD5hex(str));


    }

    public static String Captalize(String input){
        return StringUtils.capitalize(input);
    }

    public static String GenerateMD5hex(String input){
        return DigestUtils.md5Hex(input);
    }


}