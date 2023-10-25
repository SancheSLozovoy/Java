package School;

import java.util.ArrayList;
import java.util.List;
public class Students implements Marks{
    private String name;
    private String lastname;
    private List<Integer> marks;
    private int marksCount;

    public Students(String name, String lastname, int marksCount) {
        this.name = name;
        this.lastname = lastname;
        this.marksCount = 0;

        marks = new ArrayList<Integer>();
    }

    public String getFullName(){
        return name+" "+lastname;
    }
    @Override
    public void addMark(int mark){
        marks.add(mark);
        marksCount++;
    }

    @Override
    public void delMark(Marks mark){
        marks.remove(mark);
        marksCount--;
    }

    public String display(){
        return "Студент: " + getFullName() + "\n" +
                "Количество оценок: " + marksCount;
    }
}
