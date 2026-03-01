public class Employee {
    private String name;
    // private String id;
    // private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

// public class Manager extends Employee {
//     private String department;
//     private double bonus;

//     public String getDepartment() {
//         return this.department;
//     }

//     public void setDepartment(String dprt) {
//         this.department = dprt;
//     }
// }

// public class Developer extends Manager {
//     private String programmingLanguage;
//     private int projectCount;

//     public String getProgrammLang() {
//         return this.programmingLanguage;
//     }

//     public void setProgrammLang(String lang) {
//         this.programmingLanguage = lang;
//     }

//     public static void main(String[] args) {
//         Developer newDev = new Developer();

//         newDev.setDepartment("frontend");
//         System.out.println(newDev.getDepartment());

//         newDev.setProgrammLang("javascript");
//         System.out.println(newDev.getProgrammLang());

//         newDev.setName("Fransheska");
//         System.out.println(newDev.getName());
//     }
// }
