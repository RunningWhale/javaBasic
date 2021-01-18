package day31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 简单错误记录 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<File> linkedList = new LinkedList<>();
        Queue<File> queue = new LinkedList<>();
        while (sc.hasNext()) {
            boolean flag = false;
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            String[] split = s1[0].split("\\\\");
            for (File i : linkedList) {
                if (i.getName().equals(split[split.length - 1]) && i.getHang() == Integer.valueOf(s1[1])) {
                    i.num++;
                    flag = true;
                }
            }
            if (flag == false) {
                File file = new File(split[split.length - 1], Integer.valueOf(s1[1]), 1);
                linkedList.add(file);
            }
        }
        LinkedList<File> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            File remove = linkedList.remove(linkedList.size() - 1);
            linkedList1.add(remove);
        }
        while (!linkedList1.isEmpty()) {
            File remove = linkedList1.remove(linkedList1.size() - 1);
            String name = remove.getName();
            if (name.length()>8){
                String substring = name.substring(name.length() - 8);
                System.out.println(substring+ " " + remove.getHang() + " " + remove.getNum());
            }else {
                System.out.println(remove.getName()+ " " + remove.getHang() + " " + remove.getNum());

            }
        }

    }

    static class File {
        private String name;
        private int hang;
        private int num;

        public File(String name, int hang, int num) {
            this.name = name;
            this.hang = hang;
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHang() {
            return hang;
        }

        public void setHang(int hang) {
            this.hang = hang;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
