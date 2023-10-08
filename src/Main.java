public class Main {
    public static void main(String[] args) {
//        Animal tiger = new Animal();
//        tiger.age  = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
//        tiger.display();
//        tiger.rename("Антон");
//        tiger.display();
//
//
//        Animal sparrow = new Animal();
//        sparrow.age = 3;
//        sparrow.weight = 2;
//        sparrow.isSwim = false;
//        sparrow.isWalk = true;
//        sparrow.isFly = true;
//        sparrow.display();
//        sparrow.holiday(2);
//        sparrow.display();
//
//
//        Animal cat = new Animal("Кот", "Мурка", 2, 4, true, true, false);
//        cat.holiday(2);
//        cat.rename("Барсик");
//        cat.display();
//        System.out.println(cat.getAge());
//        System.out.println(cat.getName());
//        System.out.println(cat.getWeight());
//        System.out.println(cat.getType());
//        System.out.println(cat.getSwim());
//        System.out.println(cat.getWalk());
//        System.out.println(cat.getFly());

        Bird b = new Bird("На югах", true, "Птица", "Bob", 13, 3.6, false, false);
        b.display();
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chir();

        Fish f = new Fish("крупная", false, "Рыба", "Сельдь", 1, 2, false, false);
        f.display();
        f.setSquamo("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquamo());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect(1, false, "Насекомое", "Жукич", 1, 0.2, false, false);
        i.setWingCount(4);
        i.display();
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggg();
    }
}