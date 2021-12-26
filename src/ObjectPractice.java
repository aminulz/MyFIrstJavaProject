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

        dog d2 = new dog();
        d2.owner="Jason";
        d2.age = 2;
        d2.breed="Retriever";
        d2.color="Golden";
        System.out.println(d2.owner +" have a " +d2.age +" years old " +d2.color +"," +d2.breed +" dog.");
    }


    public static class dog{
        String owner;
        String breed;
        int age;
        String color;
    }

}