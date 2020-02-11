public class Teacher {

    private final String name;
    private Student member;

    public Teacher(String name, Student member) {
        this.name = name;
        this.member = member;
    }

    public String getName() {
        return name;
    }

    public Student getMember() {
        return member;
    }

    public void setMember(Student member) {
        this.member = member;
    }
}
