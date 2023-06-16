package com.array2D;

public class Perfectnumber {
    public static void main(String[] args) {
        int num=29;
        int temp=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                temp=temp+i;
            }
        }
        if(num==temp)
        {
            System.out.println(+num+ " is a perfect number");
        }else {
            System.out.println(+num+ "is not a perfect number");
        }
    }
}
