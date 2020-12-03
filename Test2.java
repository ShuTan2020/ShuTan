package com.hfxt.common;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入明文");
        String pwd = sc.nextLine();
        char[]ch = pwd.toCharArray();
        for(int i=0;i<pwd.length();i++){
            if(ch[i]>='A'&& ch[i]<'Z'){
                ch[i]+=1;
                ch[i]=Character.toLowerCase(ch[i]);
            } else if(ch[i]=='Z'){
                ch[i]='A';
            }else {
                if (ch[i]>='a'&&ch[i]<='c') {
                    ch[i]= '2';
                }
                if (ch[i]>='d'&&ch[i]<='f') {
                    ch[i]= '3';
                }
                if (ch[i]>='g'&&ch[i]<='i') {
                    ch[i]= '4';
                }
                if (ch[i]>='j'&&ch[i]<='l') {
                    ch[i]= '5';
                }
                if (ch[i]>='m'&&ch[i]<='o') {
                    ch[i]= '6';
                }
                if (ch[i]>='p'&& ch[i]<='s') {
                    ch[i]= '7';
                }
                if (ch[i]>='t'&&ch[i]<='v') {
                    ch[i]= '8';
                }
                if(ch[i]>='w'&&ch[i]<='z'){
                    ch[i]='9';
                }
            }
        }
        System.out.println(ch);
    }
}
