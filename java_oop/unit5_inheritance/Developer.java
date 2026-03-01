public class Developer extends Employee {
    private String programmingLanguage;
    // private int projectCount;

    public String getProgrammLang() {
        return this.programmingLanguage;
    }

    public void setProgrammLang(String lang) {
        this.programmingLanguage = lang;
    }

    public static void main(String[] args) {
        Developer newDev = new Developer();

        newDev.setProgrammLang("javascript");
        System.out.println(newDev.getProgrammLang());

        newDev.setName("Fransheska");
        System.out.println(newDev.getName());
    }
}
