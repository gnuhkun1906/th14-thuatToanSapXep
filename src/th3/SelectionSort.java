package th3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử muốn thêm");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println("Show list");
        System.out.println(list);
        selectSort(list);
    }
    public static void selectSort(List<Integer> list){
        int min;
        for (int i = 0; i < list.size() ; i++) {
            min=i;
            for (int j = i+1; j < list.size() ; j++) {
                int temp;
                if (list.get(min)>list.get(j)){
                    temp=list.get(min);
                    list.set(min, list.get(j));
                    list.set(j, temp);
                }

            }
        }
            System.out.println(list);
    }
}
