package day10;

public abstract class Test02 {
    public static void main(String[] args) {
        Object o=new Object(){
            public boolean equals(Object o){
                return true;
            }
        };
        System.out.println(o.equals("dd"));
    }


}
