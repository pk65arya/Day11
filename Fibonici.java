package com.array2D;


    public class Fibonici {
        public static void main(String[] args) {
            int firstnum=0,secondnum=1,num=10;
            System.out.println("fibonici numbers ");

            for(int i=0;i<=num;i++) {
                System.out.println(firstnum +"");

                int result = firstnum + secondnum;
                firstnum = secondnum;
                secondnum = result;
            }
        }
    }


