package common;

public class Manager extends Employee{

    private int numberOfReportee;
    private String projectName;

    public Manager(int empID, String name, int numberOfReportee, String projectName) {
        super(empID, name);
        this.numberOfReportee = numberOfReportee;
        this.projectName = projectName;
    }

    public void setNumberOfReportee(int numberOfReportee) {
        this.numberOfReportee = numberOfReportee;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


}
