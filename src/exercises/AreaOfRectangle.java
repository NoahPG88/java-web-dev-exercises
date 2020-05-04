package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        String question1 = "What is the height of the rectangle?";
        System.out.println(question1);
        Integer height = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        String question2 = "What is the width of the rectangle?";
        System.out.println(question2);
        Integer width = input2.nextInt();

        System.out.println("The area of your rectangle is: " + width*height);

    }
}
