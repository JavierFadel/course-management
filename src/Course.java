// Main Class.
public class Course {
    // Code goes here.
    private String title, desc, teacher, university, location;

    // Getter setter for title.
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    // TODO: too many setter getters! make a general function?u
    public void setDesc(String desc) { this.desc = desc; }
    public String getDesc() { return desc; }

    public void setTeacher(String teacher) { this.teacher = teacher; }
    public String getTeacher() { return teacher; }

    public void setUniversity(String university) { this.university = university; }
    public String getUniversity() { return university; }

    public void setLocation(String location) { this.location = location; }
    public String getLocation() { return location; }

    public static void main(String[] args) {
        // Setting the values.
        Teacher teacherOne = new Teacher();
        teacherOne.setName("Andy");

        Instance instanceOne = new Instance();
        instanceOne.setName("Duke University");
        instanceOne.setLocation("North Carolina");

        Category math = new Category();
        math.setName("Math");
        math.setDesc("Math is shit!");
        math.taunt();

        // Setting the course value.
        Course basicMath = new Course();

        basicMath.setTitle("Algebra 101");
        basicMath.setDesc("Bla bla bla");
        basicMath.setTeacher(teacherOne.getName());
        basicMath.setUniversity(instanceOne.getName());
        basicMath.setLocation(instanceOne.getLocation());

        // Return course value.
        System.out.println(basicMath.getTitle() + ", " + basicMath.getTeacher() + ", " + basicMath.getUniversity());
    }
}
