package LessonThree3;

public class LessonThree3 {
    public static void main(String[] args) {
        Person per1 = new Person("George", "Washington");
        Person per2 = new Person("Pierce", "Franklin");
        Person per3 = new Person("Abraham","Lincoln");
        Person per4 = new Person("Franklin","Roosevelt");
        Person per5 = new Person("Richard","Nixon");
        System.out.println(per1.getFirstName() + " " + per1.getLastName());
        System.out.println(per2.getFirstName() + " " + per2.getLastName());
        System.out.println(per3.getFirstName() + " " + per3.getLastName());
        System.out.println(per4.getFirstName() + " " + per4.getLastName());
        System.out.println(per5.getFirstName() + " " + per5.getLastName());
        System.out.println(per1.getAge(1816) +" :)");
    }

}
