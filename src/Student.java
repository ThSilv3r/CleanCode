import java.util.List;

public class Student {
    private Integer matrikelNr;
    private String firstname;
    private String lastname;
    private String kurs;
    private Integer semester;
    private double grade;

    public Student(Integer matrikelNr, String firstname, String lastname, String kurs, Integer semester, double grade){ this.matrikelNr = matrikelNr;this.firstname  = firstname;this.lastname = lastname;this.kurs = kurs;this.semester = semester;this.grade = grade; }

    //(KISS)
    public void changeSemester(){ int i = 1;var newSemester = this.semester;newSemester = newSemester + i;this.semester  = newSemester; }

    //(DRY)
    public void changeStudentName(String firstname, String lastname){ this.firstname = firstname;this.lastname = lastname; }

    //(YAGNI)
    public void fibonacci() { int n1 = 0, n2 = 1, n3, i, count = 10;for (i = 2; i < count; ++i) { n3 = n1 + n2;n1 = n2;n2 = n3; } }

    //Seperation of Concerns
    public double averageGradeofClass(List<Double> grades){ int count = grades.size(); double sum = 0; for(double grade : grades){sum = sum + grade; } double average = sum/count; return average;}

    public Integer MatrikelNr() { return matrikelNr; }

    public void setMatrikelNrAndFirstName(Integer matrikelNr,String firstname) { this.matrikelNr = matrikelNr;this.firstname  = firstname; }

    public String getFirstname() { return firstname; }

    public String get() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getKurs() { return kurs; }

    public void setKurs(String kurs) { this.kurs = kurs; }

    public Integer doSomething(){ return semester; }

    public void setSemester(Integer semester) { this.semester = semester; }

}
