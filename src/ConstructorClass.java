public class ConstructorClass {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.setLength(10);
        rec.setWidth(20);
        System.out.println(rec.getArea());

        System.out.println("");
        rectangle rec2 = new rectangle(10, 500);
        System.out.println(rec2.getArea());
    }
}

class rectangle{
    float length;
    float width;

    public rectangle(float l, float w){
        this.width=w;
        this.length=l;
    }
    public rectangle(){

    }

    public void setLength(float lenth) {
        this.length = lenth;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }
}
