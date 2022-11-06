import java.util.Arrays;

public class MyClass {
    private String name, surname;
    private int age;
    private String[] subjects;
    private String favMeal;

    public MyClass(){

    }
    public MyClass(String name, String surname, int age, String [] subjects, String favMeal){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.subjects = subjects;
        this.favMeal = favMeal;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    String getSurname(){
        return surname;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setSubjects(String[] subjects){
        this.subjects = subjects;
    }
    String[] getSubjects(){
        return subjects;
    }
    void setFavMeal(String favMeal){
        this.favMeal = favMeal;
    }
    String getFavMeal(){
        return favMeal;
    }
    void getInfo(){
        System.out.println("Name          : " + getName());
        System.out.println("Surname       : " + getSurname());
        System.out.println("Age           : " + getAge());
        System.out.println("Subjects      : " + Arrays.toString(getSubjects()));
        System.out.println("Favourite Meal: " + getFavMeal());
        System.out.println();
    }

}
