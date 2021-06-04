public class Student {
    private Integer matrikelNr;
    private String firstname;
    private String lastname;
    private String kurs;
    private Integer semester;

    public Student(Integer matrikelNr, String firstname, String lastname, String kurs, Integer semester){ this.matrikelNr = matrikelNr;this.firstname  = firstname;this.lastname = lastname;this.kurs = kurs;this.semester = semester; }

    //(KISS)
    public void changeSemester(){ int i = 1;var newSemester = this.semester;newSemester = newSemester + i;this.semester  = newSemester; }

    //(DRY)
    public void changeStudentName(String firstname, String LastName){ this.firstname = firstname;this.lastname = lastname; }

    //(YAGNI)
    public void fibonacci() { int n1 = 0, n2 = 1, n3, i, count = 10;for (i = 2; i < count; ++i) { n3 = n1 + n2;n1 = n2;n2 = n3; } }

    public Integer getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNrAndFirstName(Integer matrikelNr,String firstname) { this.matrikelNr = matrikelNr;this.firstname  = firstname; }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public Integer getSemester(){
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

}
