package th2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class illustrationBubbleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số phần tử muốn thêm");
        int count=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <count ; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println("Show list");
        System.out.println(list);
        bubbleSort(list);
    }
    public static void bubbleSort(List<Integer> list) {
        int temp;
        for (int i = 0; i <list.size()-1 ; i++) {
            System.out.println("Vòng lặp thứ "+i);
            for (int j = 0; j < list.size()-1-i ; j++) {
                System.out.println("vòng lặp thứ "+i+"."+j);
                System.out.println(list.get(j)+">"+(list.get(j+1)));
                if (list.get(j)>(list.get(j+1))) {
                    System.out.println("Swap"+list.get(j)+"with"+(list.get(j+1)));
                    temp=list.get(j);
                    list.set(j,(list.get(j+1)));
                    list.set((j+1),temp);
                }
                System.out.println(list);
            }
        }
        System.out.println(list);
    }
}
