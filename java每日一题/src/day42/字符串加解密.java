package day42;

import java.util.Scanner;

public class 字符串加解密 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (sc.hasNext()) {
            num++;
            String next = sc.next();
            char[] chars = next.toCharArray();
            if (num % 2 == 1) {
                String jiami = jiami(chars);
                System.out.println(jiami);
            } else {
                String jiemi = jiemi(chars);
                System.out.println(jiemi);
            }
        }
    }

    private static String jiemi(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'a') {
                    s += "Z";
                } else {
                    char c = (char) (chars[i] - 1);
                    s += String.valueOf(c).toUpperCase();

                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'A') {
                    s += "z";
                } else {
                    char c = (char) (chars[i] - 1);
                    s += String.valueOf(c).toLowerCase();
                }
            } else {
                if (chars[i] == '0') {
                    s += "9";
                } else {
                    char c = (char) (chars[i] - 1);
                    s += String.valueOf(c);
                }
            }
        }
        return s;
    }

    private static String jiami(char[] chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'z') {
                    s += "A";
                } else {
                    char c = (char) (chars[i] + 1);
                    s += String.valueOf(c).toUpperCase();
                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'Z') {
                    s += "a";
                } else {
                    char c = (char) (chars[i] + 1);
                    s += String.valueOf(c).toLowerCase();
                }
            } else {
                if (chars[i] == '9') {
                    s += "0";
                } else {
                    char c = (char) (chars[i] + 1);
                    s += String.valueOf(c);
                }
            }
        }
        return s;
    }

/*
    public static String jiami(char[] chars) {
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                String s = "";
                boolean flag = false;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] >= 'A' && chars[j] <= 'Z') {
                        s = String.valueOf(chars[j]).toLowerCase();
                        flag = true;
                        break;
                    } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                        s = String.valueOf(chars[j]).toUpperCase();
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    strings[i] = s;
                } else {
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[j] >= 'A' && chars[j] <= 'Z') {
                            s = String.valueOf(chars[j]).toLowerCase();
                            flag = true;
                            break;
                        } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                            s = String.valueOf(chars[j]).toUpperCase();
                            flag = true;
                            break;
                        }
                    }
                    strings[i] = s;
                }
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                String s = "";
                boolean flag = false;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] >= 'A' && chars[j] <= 'Z') {
                        s = String.valueOf(chars[j]).toLowerCase();
                        flag = true;
                        break;
                    } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                        s = String.valueOf(chars[j]).toUpperCase();
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    strings[i] = s;
                } else {
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[j] >= 'A' && chars[j] <= 'Z') {
                            s = String.valueOf(chars[j]).toLowerCase();
                            flag = true;
                            break;
                        } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                            s = String.valueOf(chars[j]).toUpperCase();
                            flag = true;
                            break;
                        }
                    }
                    strings[i] = s;
                }
            } else {
                strings[i] = String.valueOf((Integer.valueOf(chars[i]) + 1) % 10);
            }
        }
        return Arrays.toString(strings);
    }

    public static String jiemi(char[] chars) {
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                String s = "";
                boolean flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (chars[j] >= 'A' && chars[j] <= 'Z') {
                        s = String.valueOf(chars[j]).toLowerCase();
                        flag = true;
                        break;
                    } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                        s = String.valueOf(chars[j]).toUpperCase();
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    strings[i] = s;
                } else {
                    for (int j = chars.length-1; j >= 0; j--) {
                        if (chars[j] >= 'A' && chars[j] <= 'Z') {
                            s = String.valueOf(chars[j]).toLowerCase();
                            flag = true;
                            break;
                        } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                            s = String.valueOf(chars[j]).toUpperCase();
                            flag = true;
                            break;
                        }
                    }
                    strings[i] = s;
                }
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                String s = "";
                boolean flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (chars[j] >= 'A' && chars[j] <= 'Z') {
                        s = String.valueOf(chars[j]).toLowerCase();
                        flag = true;
                        break;
                    } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                        s = String.valueOf(chars[j]).toUpperCase();
                        flag = true;
                        break;
                    }
                }
                if (flag == true) {
                    strings[i] = s;
                } else {
                    for (int j = chars.length; j >= 0; j--) {
                        if (chars[j] >= 'A' && chars[j] <= 'Z') {
                            s = String.valueOf(chars[j]).toLowerCase();
                            flag = true;
                            break;
                        } else if (chars[j] >= 'a' && chars[j] <= 'z') {
                            s = String.valueOf(chars[j]).toUpperCase();
                            flag = true;
                            break;
                        }
                    }
                    strings[i] = s;
                }
            } else {
                if (chars[i] == '0') {
                    strings[i] = String.valueOf(9);
                } else {
                    strings[i] = String.valueOf(chars[i] - 49);
                }
            }
        }
        return Arrays.toString(strings);
    }*/
}
