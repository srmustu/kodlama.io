package entities;

public class Instructor {
    private String competencyLevel;
    private String competencyArea;
    private String name;
    private String lastName;
    private int age;
    private String certificates1;
    private String certificates2;
    private String certificates3;

    public String getCompetencyLevel() {
        return competencyLevel;
    }

    public void setCompetencyLevel(String competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    public String getCompetencyArea() {
        return competencyArea;
    }

    public void setCompetencyArea(String competencyArea) {
        this.competencyArea = competencyArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCertificates1() {
        return certificates1;
    }

    public void setCertificates1(String certificates1) {
        this.certificates1 = certificates1;
    }

    public String getCertificates2() {
        return certificates2;
    }

    public void setCertificates2(String certificates2) {
        this.certificates2 = certificates2;
    }

    public String getCertificates3() {
        return certificates3;
    }

    public void setCertificates3(String certificates3) {
        this.certificates3 = certificates3;
    }
}
