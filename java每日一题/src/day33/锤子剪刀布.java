package day33;

import java.util.*;

public class 锤子剪刀布 {
    public static void main(String[] args) {
        HashMap<String, Integer> 甲 = new HashMap<>();
        HashMap<String, Integer> 乙 = new HashMap<>();
        甲.put("C", 0);
        甲.put("J", 0);
        甲.put("B", 0);
        乙.put("C", 0);
        乙.put("J", 0);
        乙.put("B", 0);
        int ping = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String jia = sc.next();
            String yi = sc.next();
            if (jia.equals("C")) {
                if (yi.equals("C")) {
                    ping++;
                } else if (yi.equals("J")) {
                    甲.put("C", 甲.get("C") + 1);
                } else {
                    乙.put("B", 乙.get("B") + 1);
                }
            } else if (jia.equals("J")) {
                if (yi.equals("C")) {
                    乙.put("C", 乙.get("C") + 1);
                } else if (yi.equals("J")) {
                    ping++;
                } else {
                    甲.put("J", 甲.get("J") + 1);
                }
            } else {
                if (yi.equals("C")) {
                    甲.put("B", 甲.get("B") + 1);
                } else if (yi.equals("J")) {
                    乙.put("J", 乙.get("J") + 1);
                } else {
                    ping++;
                }
            }
        }
        int winjia = 甲.get("C") + 甲.get("J") + 甲.get("B");
        int winyi = N - winjia - ping;
        System.out.println(winjia + " " + ping + " " + winyi);
        System.out.println(winyi + " " + ping + " " + winjia);
        Iterator<Map.Entry<String, Integer>> iterator = 甲.entrySet().iterator();
        String maxJia = null;
        int maxJiaNum = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() > maxJiaNum) {
                maxJiaNum = next.getValue();
                maxJia = next.getKey();
            } else if (next.getValue() == maxJiaNum) {
                if (maxJia == null) {
                    maxJiaNum = next.getValue();
                    maxJia = next.getKey();
                }
//                else {
//                    if (Byte.valueOf(maxJia) > Byte.valueOf(next.getKey())) {
//                        maxJiaNum = next.getValue();
//                        maxJia = next.getKey();
//                    }
//                }
            }
        }
        Iterator<Map.Entry<String, Integer>> iterator1 = 乙.entrySet().iterator();
        String maxYi = null;
        int maxYiNum = 0;
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> next = iterator1.next();
            if (next.getValue() > maxYiNum) {
                maxYiNum = next.getValue();
                maxYi = next.getKey();
            } else if (next.getValue() == maxYiNum) {
                if (maxYi == null) {
                    maxYiNum = next.getValue();
                    maxYi = next.getKey();
                }
//                else {
//                    if (Byte.valueOf(maxYi) > Byte.valueOf(next.getKey())) {
//                        maxYiNum = next.getValue();
//                        maxYi = next.getKey();
//                    }
//                }
            }
        }
        /*if (maxJia == null) {
            System.out.print("B");
        }
        System.out.print(" ");
        if (maxYi == null) {
            System.out.print("B");
        }*/
        System.out.println(maxJia + " " + maxYi);
    }

}
