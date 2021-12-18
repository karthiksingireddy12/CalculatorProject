package javalab2;

public class outerclass {
    private int data = 30;
    class innerclass {
        void msg(){
            System.out.println("data is "+data);
        }

        public static void main(String[] args) {
            outerclass obj = new outerclass();
            outerclass.innerclass obj2 = obj.new innerclass();
            obj2.msg();
        }
    }
}