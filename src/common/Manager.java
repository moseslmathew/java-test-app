package common;

public class Manager extends Employee{

    private int numberOfReportees;
    private String projectName;

    public int getNumberOfReportees(int i) {
        return numberOfReportees;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setNumberOfReportees(int numberOfReportees) {
        this.numberOfReportees = numberOfReportees;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


}
