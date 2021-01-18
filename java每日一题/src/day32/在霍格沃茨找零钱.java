package day32;

import java.util.Scanner;

public class 在霍格沃茨找零钱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String a = sc.next();
        String[] split = p.split("\\.");
        int priceP = (Integer.valueOf(split[0]) * 17 + Integer.valueOf(split[1])) * 29 + Integer.valueOf(split[2]);
        String[] split1 = a.split("\\.");
        int priceA = (Integer.valueOf(split1[0]) * 17 + Integer.valueOf(split1[1])) * 29 + Integer.valueOf(split1[2]);
        int i = priceA - priceP;
        int r3 = i % 29;
        i -= r3;
        i /= 29;
        int r2 = i % 17;
        i -= r2;
        i /= 17;
        int r1 = i;
        String result = "";
        result += r1 + "." + Math.abs(r2) + "." + Math.abs(r3);
        System.out.println(result);

    }
}
