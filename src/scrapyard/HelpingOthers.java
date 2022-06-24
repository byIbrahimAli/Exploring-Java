package scrapyard;

import java.util.Scanner;

public class HelpingOthers {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        String students[] = new String[4];
        int marks[] = new int[4];
        for(String stud: students ){
            System.out.println("Enter Name:");
            stud = input.nextLine();
        }
        for(int i = 0 ; i < marks.length; i++){
           System.out.println("enter Grade:");
           marks[i] = input.nextInt();
           if(i == (marks.length - 1)){
             count++;
             System.out.println("Total is " + count);
            }
        }   
    }
}