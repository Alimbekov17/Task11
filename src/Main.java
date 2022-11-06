import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass("Elon", "Mask", 57,
                new String[]{"Java", "TechEng", "SoftSkills"}, "Steak");
        System.out.println("        About me:");
        myClass.getInfo();


        MyClass myClass1 = new MyClass();
        while (true){
            System.out.println();
            System.out.println("Enter information about yourself: ");
            System.out.print("Name: ");
            myClass1.setName(scanner.nextLine());
            System.out.print("Surname: ");
            myClass1.setSurname(scanner.nextLine());
            System.out.print("Age: ");
            myClass1.setAge(scanner.nextInt());
            System.out.print("Your subjects (3): ");
            myClass1.setSubjects(new String[]{scanner.next(), scanner.next(), scanner.next()});
            System.out.print("Your favourite meal: ");
            myClass1.setFavMeal(scanner.next());
            System.out.println();
            System.out.println("          About you:");
            myClass1.getInfo();
            System.out.println("Please check the information you provided.");
            System.out.println("If it is correct press 'Enter' to save, if not, type 'change': ");
            String ent = scanner.nextLine();
            String enter = scanner.nextLine();
            if (Objects.equals(enter, "")){
                System.out.println("Information saved successfully!");
                break;
            } else {
                System.out.println("Please provide below new information");
                System.out.println();
            }
        }


    }
}