class EmployeeML {
    void showEmployeeDetails() {
        System.out.println("Name: Alice Johnson");
        System.out.println("Employee ID: E205");
        System.out.println("Department: IT");
    }
}

class ManagerML extends EmployeeML {
    void showManagerRole() {
        System.out.println("Role: Manages IT projects and oversees developers.");
    }
}

class TeamLeadML extends ManagerML {
    void showTeamLeadTasks() {
        System.out.println("Task: Leads a team of software developers.");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        System.out.println("\n----- Multilevel Inheritance Example -----");
        TeamLeadML tl = new TeamLeadML();
        tl.showEmployeeDetails(); // from EmployeeML
        tl.showManagerRole();     // from ManagerML
        tl.showTeamLeadTasks();   // from TeamLeadML
    }
}
