package PracticePackage;

public class staticClass {
    public static void main(String[] args) {
        counter c1 = new counter();
        c1.incrementCounter();

        counter c2 = new counter();
        c2.incrementCounter();
//        System.out.println(counter.areaCalculate(10, 20));

    }
}
class counter{
    static int c = 0;
    public void incrementCounter(){
        c++;
        System.out.println(c);
    }

//    public static int areaCalculate(int l, int w){
//        return l * w;
//    }
}
