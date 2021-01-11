package day25;

import java.util.Scanner;

public class 人民币转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String money = sc.next();
            String[] split = money.split("\\.");
            String[] zhengshu = split[0].split("");
            String[] zheng = new String[zhengshu.length];
            for (int i = 0; i < zhengshu.length; i++) {
                zheng[i] = zhengshu[zhengshu.length - 1 - i];
            }
            String[] xiaoshu = split[1].split("");
            String result = "";
            for (int i = 0; i < zheng.length; i++) {
                int num = Integer.valueOf(zheng[i]);
                switch (num) {
                    case 0:
                        if (i == 0 && num == 0) {
                            zheng[i] = " ";
                        } else if (num == 0) {
                            if (zheng[i - 1].equals(" ")) {
                                zheng[i] = " ";
                            } else if (zheng[i - 1].equals("零")) {
                                zheng[i] = " ";
                            } else if (i == 5) {
                                zheng[i] = " ";
                            } else {
                                zheng[i] = "零";
                            }
                        }
                        break;
                    case 1:
                        if (i == 1 || i == 5) {
                            zheng[i] = " ";
                        } else {
                            zheng[i] = "壹";
                        }
                        break;
                    case 2:
                        zheng[i] = "贰";
                        break;
                    case 3:
                        zheng[i] = "叁";
                        break;
                    case 4:
                        zheng[i] = "肆";
                        break;
                    case 5:
                        zheng[i] = "伍";
                        break;
                    case 6:
                        zheng[i] = "陆";
                        break;
                    case 7:
                        zheng[i] = "柒";
                        break;
                    case 8:
                        zheng[i] = "捌";
                        break;
                    case 9:
                        zheng[i] = "玖";
                        break;
                }
                if (num == 0 && i == 4) {
                    zheng[i] += "万";
                    continue;
                } else if (num == 0) {
                    continue;
                }
                switch (i) {
                    case 1:
                        zheng[i] += "拾";
                        break;
                    case 2:
                        zheng[i] += "佰";
                        break;
                    case 3:
                        zheng[i] += "仟";
                        break;
                    case 4:
                        zheng[i] += "万";
                        break;
                    case 5:
                        zheng[i] += "拾";
                        if (zheng[4].equals("0") || zheng[4].equals(" ")) {
                            zheng[i] += "万";
                        }
                        break;
                    case 6:
                        zheng[i] += "佰";
                        if (zheng[4].equals("0") || zheng[4].equals(" ")) {
                            zheng[i] += "万";
                        }
                        break;
                    case 7:
                        zheng[i] += "仟";
                        if (zheng[4].equals("0") || zheng[4].equals(" ")) {
                            zheng[i] += "万";
                        }
                        break;
                    case 8:
                        zheng[i] += "亿";
                        break;
                    case 9:
                        zheng[i] += "拾";
                        break;
                    case 10:
                        zheng[i] += "佰";
                        break;
                }
            }
            for (int i = zheng.length - 1; i >= 0; i--) {
                result += zheng[i];
            }
            result = result.replace(" ", "");
            if (!result.equals("")) {
                result += "元";
            }
            if (!xiaoshu[0].equals("0") || !xiaoshu[1].equals("0")) {
                for (int i = 0; i < xiaoshu.length; i++) {
                    int num = Integer.valueOf(xiaoshu[i]);
                    switch (num) {
                        case 0:
                            xiaoshu[i] = " ";
                            break;
                        case 1:
                            xiaoshu[i] = "壹";
                            break;
                        case 2:
                            xiaoshu[i] = "贰";
                            break;
                        case 3:
                            xiaoshu[i] = "叁";
                            break;
                        case 4:
                            xiaoshu[i] = "肆";
                            break;
                        case 5:
                            xiaoshu[i] = "伍";
                            break;
                        case 6:
                            xiaoshu[i] = "陆";
                            break;
                        case 7:
                            xiaoshu[i] = "柒";
                            break;
                        case 8:
                            xiaoshu[i] = "捌";
                            break;
                        case 9:
                            xiaoshu[i] = "玖";
                            break;
                    }
                    if (xiaoshu[i].equals(" ")) {
                        continue;
                    }
                    if (i == 0) {
                        xiaoshu[i] += "角";
                    } else if (i == 1) {
                        xiaoshu[i] += "分";
                    }
                    result += xiaoshu[i];
                }
                result = "人民币" + result;
                result = result.replace(" ", "");
                System.out.println(result);
            } else {
                result = "人民币" + result;
                result = result.replace(" ", "");
                System.out.println(result + "整");
            }

        }
    }
}
