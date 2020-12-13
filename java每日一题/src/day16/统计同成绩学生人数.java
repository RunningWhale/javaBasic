package day16;

import java.util.Scanner;

public class 统计同成绩学生人数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int person=sc.nextInt();//这组人数
        while (person!=0){//判断是否为 0  为0结束输入
            int[] score=new int[person];
            for(int i=0;i<score.length;i++){
                score[i]=sc.nextInt();
            }
            int find=sc.nextInt();
            int count=0;//统计同成绩出现人数
            for (int findScore:score){
                if (find==findScore){
                    count++;
                }
            }
            System.out.println(count);
            //特别注意的是这里，添加一行判断是否主动结束输入
            if (!sc.hasNext()){
                return;
            }else {
                person=sc.nextInt();
            }
        }
    }
}
