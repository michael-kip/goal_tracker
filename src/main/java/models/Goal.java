package models;

public class Goal {
    private String title;
    private String category;
    private String description;
    private String subjectGoalRefersTo;

    public Goal(String title, String category, String description, String subjectGoalRefersTo){
        this.title = title;
        this.category = category;
        this.description = description;
        this.subjectGoalRefersTo = subjectGoalRefersTo;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getSubjectGoalRefersTo() {
        return subjectGoalRefersTo;
    }
}
