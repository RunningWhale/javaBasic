package 练习本;

import java.util.Formatter;

public class 保留三位小数 {
    public static void main(String[] args) {
        double pi = Math.PI;
//        使用java.util.Formatter,保留小数点后两位
        Formatter formatter = new Formatter();
        Formatter format = formatter.format("%.3f", pi);
        System.out.println(format);


//        使用BigDecimal，保留小数点后两位
//        BigDecimal bigDecimal = new BigDecimal(pi);
//        BigDecimal bigDecimal1 = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);//
//        System.out.println(bigDecimal1);

//        使用DecimalFormat,自定义输出格式
//        DecimalFormat decimalFormat = new DecimalFormat("00.00");
//        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
//        String format = decimalFormat.format(pi);
//        System.out.println(format);

//        使用String.format来实现
//        String s="%.3f";
//        String format = String.format(s, pi);
//        System.out.println(format);
    }
}
