//Создайте структуру классов, которые могли бы использоваться в работе школы. В школе должны
//храниться списки учеников, сотрудников школы и её инвентаре, информация о расписании и т.д.
package School;

public class Main {
    public static void main(String[] args){
        Employees em1 = new Employees("Дж. Джона", "Джеймесон", "Физика");

        Students st1 = new Students("Максим", "Иванов", 0);
        st1.addMark(5);
        st1.addMark(4);
        st1.addMark(3);
        System.out.println(st1.display());

        Schedule sc1 = new Schedule("12-12-2023", "12:00","Физикиа");
        Schedule sc2 = new Schedule("12-12-2023", "12:50","Математика");
        Schedule sc3 = new Schedule("12-12-2023", "13:40","География");
        System.out.println(sc1.display());

        Inventory inv1 = new Inventory("Парты", 300);
        Inventory inv2 = new Inventory("Стулья", 600);
        System.out.println(inv1.display());

        School sc = new School();
        sc.addStudent(st1);
        sc.addInv(inv1);
        sc.addInv(inv2);
        Class7B t7b = new Class7B(sc2);
        System.out.println(t7b.getClassName());
        System.out.println(t7b.getSchedule());
        sc.addEmpl(em1);
        System.out.println(sc.display());
    }
}