package source;


public class Students {
    private String id;
    private String name;
    private double mark;

    public Students(String id, String name, double mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public String getRanking() { // Changed return type to String
        if (mark >= 0 && mark < 5) {
            return "Fail";
        } else if (mark >= 5 && mark < 6.5) {
            return "Medium";
        } else if (mark >= 6.5 && mark < 7.5) {
            return "Good";
        } else if (mark >= 7.5 && mark < 9) {
            return "Very Good";
        } else if (mark >= 9 && mark <= 10) {
            return "Excellent";
        } else {
            return "Error";
        }
    }

    @Override
    public String toString() {
        return "Student: | " +
                "Student Id: " + id +
                ", Student Name: " + name +
                ", Student Mark: " + mark +
                ", Student Ranking: " + getRanking() +
                " |";
    }
}
