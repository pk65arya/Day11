package com.array2D;

public class Reversenumber {
    public static void main(String[] args) {
        int num=9857;

        Reversenumber(num);
    }
    public static void Reversenumber(int num){

        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
