import java.util.*;
/**
 * Classroom organizer
 *
 * @Shenwei Liang
 * @v1 nov 25, 2024
 */
public class Main{
    public static void main(String[] args){
        System.out.print("\u000C");
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        System.out.println("An ArrayList of students and grades has been created");
        while(true){
            System.out.println("Please press…");
            System.out.println("1. to add a student.");
            System.out.println("2. to remove a student.");
            System.out.println("3. to display students.");
            System.out.println("4. to update a grade.");
            System.out.println("5. to display grades.");
            System.out.println("6. to quit.");
            Scanner scan1 = new Scanner(System.in);
            int input1 = scan1.nextInt();
            if(input1 == 1){
                System.out.println("please enter the student's name to add(capitalize first letter).");
                Scanner scan2 = new Scanner(System.in);
                String input2 = scan2.nextLine();
                students.add(input2);
                grades.add(-1);
            }
            else if(input1 == 2){
                System.out.println("please enter the student's name to remove(capitalize first letter).");
                Scanner scan3 = new Scanner(System.in);
                String input3 = scan3.nextLine();
                if(getIndex(students, input3) != -1){
                    students.remove(getIndex(students, input3));
                    grades.remove(getIndex(students, input3));
                }
                else{
                    System.out.println("Student not found");
                }
            }
            else if(input1 == 3){
                System.out.println(students);
            }
            else if(input1 == 4){
                System.out.println("please enter the student's name to update grade(capitalize first letter).");
                Scanner scan4 = new Scanner(System.in);
                String input4 = scan4.nextLine();
                if(getIndex(students, input4) != -1){
                    System.out.println("Enter new grade.");
                    Scanner scan5 = new Scanner(System.in);
                    int input5 = scan5.nextInt();
                    grades.set(getIndex(students, input4), input5);
                }
                else{
                    System.out.println("Student not found");
                }
            }
            else if(input1 == 5){
                System.out.println("please enter the student's name to display grade(capitalize first letter).");
                Scanner scan6 = new Scanner(System.in);
                String input6 = scan6.nextLine();
                if(getIndex(students, input6) != -1){
                    System.out.println(grades.get(getIndex(students, input6)));
                }
                else{
                    System.out.println("Student not found");
                }                
            }
            else if(input1 == 6){
                break;
            }
        }
    }

    public static int getIndex(ArrayList<String> n, String word){
        int indexNum = -1;
        for(int i = 0; i < n.size(); i++){
            if(n.get(i).equals(word)){
                indexNum = i;
            }
        }
        return indexNum;
    }
}