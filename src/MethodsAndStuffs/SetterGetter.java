package MethodsAndStuffs;

public class SetterGetter {
    public static void main(String[] args) {
        area a = new area();
        a.setBreadth(40);
        a.setLength(50);
        System.out.println(a.calculateArea());
        System.out.println(a.getBreadth());
        System.out.println(a.getLength());
        area b = a;
        System.out.println(b.getLength());
        System.out.println(b.getBreadth());
    }

    static class area{
        double length;
        double breadth;

        public double calculateArea(){
            double area = length * breadth;
            return area;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getBreadth() {
            return breadth;
        }

        public void setBreadth(double breadth) {
            this.breadth = breadth;
        }
    }
}