package views;

import java.util.Scanner;

public class Views {

    Scanner sc = new Scanner(System.in);

    public String getInput(String text){
        System.out.println(text);
        return sc.nextLine();
    }
}
