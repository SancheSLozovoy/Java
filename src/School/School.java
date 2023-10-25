package School;

import java.util.ArrayList;
import java.util.List;

public class School{
    private int emplCount;
    private String directorName;
    private String name;
    private List<Students> students;
    private List<Employees> employees;
    private List<Inventory> inventories;

    private static final String description;


    public School() {
        this.emplCount = 0;
        this.directorName = "O. O. Omagad";
        this.name = "The Best School in The World";

        students = new ArrayList<>();
        employees = new ArrayList<>();
        inventories = new ArrayList<>();
    }

    public void addEmpl(Employees empl){
        employees.add(empl);
        emplCount++;
    }
    public void delEmpl(Employees empl){
        employees.remove(empl);
        emplCount--;
    }

    public void addStudent(Students student){
        students.add(student);
    }
    public void delStudent(Students student){
        students.remove(student);
    }

    public void addInv(Inventory inv){
        inventories.add(inv);
    }
    public void delInv(Inventory inv){
        inventories.remove(inv);
    }

    public String getName(){
        return name;
    }


    public String display(){
        return "\n"+ description+"\n" + "Название школы: " + getName() + "\n" +
                "В ней преподают: " + emplCount + " " + "Учителей";
    }

    static{
        description = "Описание школы";
    }

}
