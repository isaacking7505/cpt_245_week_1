public class DataTypes {

    private static void displayValues(String name, int age, double cashOnHand, boolean isStudent) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Cash On Hand: " + cashOnHand); 
        System.out.println("Is Student: " + isStudent);
    }

    public static void main(String[] args) {

        String name = "Brett";
        int age = 25;
        double cashOnHand = 10.25;
        boolean isStudent = false;

        
        displayValues(name, age, cashOnHand, isStudent);
    }
}
