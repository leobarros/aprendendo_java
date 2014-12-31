//Figura 3.7: GradeBook.java
//classe GradeBook que contém uma variável de instância
//courseName e métodos para configurar e obter seu valor

public class GradeBook
{
  private String courseName; // nome do curso para esse GradeBook

  public void setCourseName(String name)
  {
    couseName = name;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public void displayMessage()
  {
    System.out.printf("Welcome to the GradeBook for\n%s!\n", getCourseName());
  }
}
