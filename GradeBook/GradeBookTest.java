//Figura 3.6: GradeBookTest.java
//Criando e manipulando um objeto GradeBook

import java.util.Scanner;

public class GradeBookTeste
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    GradeBook myGradeBook = new GradeBook();

    System.out.printf("Please enter the course name: ");
    String theName = input.nextLine();
    myGradeBook.setCourseName(theName);
    System.out.println();

    myGradeBook.displayMessage();
  }
}
