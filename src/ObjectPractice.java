import java.util.Scanner;

public class ObjectPractice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        dog d1 = new dog();
        d1.owner="Liam";
        d1.age = 4;
        d1.breed="Husky";
        d1.color="White";
        System.out.println(d1.owner +" have a " +d1.age +" years old " +d1.color +"," +d1.breed +" dog.");

//        Using Setter-Getter method
        dog d2 = new dog();
        d2.setOwner("Jason");
        d2.setAge(2);
        d2.setBreed("Pug");
        d2.setColor("Golden");
        System.out.println(d2.getOwner() +" have a " +d2.getAge() +" years old " +d2.getColor() +"," +d2.getBreed() +" dog.");
    }


    public static class dog{
        String owner;
        String breed;
        int age;
        String color;

        public void setOwner(String o){
            owner = o;
        }
        public String getOwner (){
            return owner;
        }
        public void setBreed(String b){
            breed = b;
        }
        public String getBreed (){
            return breed;
        }
        public void setAge(int a){
            age = a;
        }
        public int getAge (){
            return age;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String c) {
            color = c;
        }
    }

}