import java.util.*;
public class studentResult{
    static String name;
    static int age;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter number of subjects");
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("enter marks for 3 subject");
        for(int i =0; i<3; i++){
            marks[i] = sc.nextInt();
        }

        Checker(name,marks,age,size);
    }

    public static void Checker(String name, int[] marks, int age, int size){
        try{
            @SuppressWarnings("unused")
            int len = name.length();
            int total = 0;
            for(int i =0; i<size; i++){
                total =total + marks[i];
            }
            System.out.println("Average marks:" + (total/size));
            System.out.println(marks[size+1]);
        } catch(NullPointerException e){
            System.out.println("Error: array is empty");
        } catch(ArithmeticException e){
            System.out.println(" wrong divison");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("wrong index");
        } finally{
            System.out.println("Result processing completed");
        }

        for(int i =0; i<3; i++){
            if(marks[i] > 100 || marks[i] <0){
                throw new ArithmeticException("InvalidMarksException.");
            }
        }

        if(age < 18){
            throw new ArithmeticException("InvalidAgeException.");
        }
    }

    

}