class Employee {
    void showEmployeeDetails() {
        System.out.println("Name: John Smith");
        System.out.println("Employee ID: E102");
        System.out.println("Department: Sales");
    }
}
class Manager extends Employee {
    void showManagerRole() {
        System.out.println("Role: Oversees sales department and team performance.");
    }
}
public class SingleInheritanceExample {
    public static void main(String[] args) {
        System.out.println("----- Single Inheritance Example -----");
        Manager m = new Manager();
        m.showEmployeeDetails(); 
        m.showManagerRole();     
    }
}
