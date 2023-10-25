package School;

public abstract class SchoolClass {
    protected String className;
    protected Schedule schedule;

    public SchoolClass(String className, Schedule schedule) {
        this.className = className;
        this.schedule = schedule;
    }

    public String getClassName() {
        return "Класс: " + className;
    }

    public String getSchedule() {
        return "Расписание класса: " + schedule.display();
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}