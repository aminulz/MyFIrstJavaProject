public class SetterGetter {
    public static void main(String[] args) {
        area a = new area();
        a.setBreadth(40);
        a.setLength(50);
        System.out.println(a.calculateArea());;
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