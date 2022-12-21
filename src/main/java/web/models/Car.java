package web.models;

public class Car {
    private  int id;
    private String model;
    private int series;
    private int issueAge;

    public Car(int id, String model, int series, int issueAge) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.issueAge = issueAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getIssueAge() {
        return issueAge;
    }

    public void setIssueAge(int issueAge) {
        this.issueAge = issueAge;
    }
}
