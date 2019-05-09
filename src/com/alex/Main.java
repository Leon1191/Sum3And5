package com.alex;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
	for (int i = 1; i < 10001; i++){
	    if (i % 3 == 0 && i % 5 == 0 && count < 5){
            System.out.println(i);
            count++;
            sum += i;
        }
    }
        System.out.println(sum);
    }
}
