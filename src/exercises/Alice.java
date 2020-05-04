package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] blargs){
        String prose = "" +
                "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her" +
                " sister was reading, but it had no pictures or conversations in it, 'and what" +
                " is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What term are you searching for?");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();

        boolean presentBool = prose.toLowerCase().contains(searchTerm);

        int searchTermIndex = prose.indexOf(searchTerm);

        System.out.println("It is " + presentBool + " that: '" + searchTerm + "' is in the prose at index: " + searchTermIndex);
    }
}
