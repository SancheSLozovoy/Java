package PZ_14.Aniamals;

class Animal{
    static String name;
    static String type;
    static int age;
    static double weight;
    static boolean isSwim;
    static boolean isWalk;
    static boolean isFly;
    static String description;
    static int counter;

    {
        type = "NON";
        name = "No name";
        age = 0;
        weight = 0;
        isFly = false;
        isSwim = false;
        isWalk = false;
    }
    static{
        counter = 0;
        description = "Класс Animal с полями: type(тип животного), name(имя животного), age(возраст животного)," +
                " weight(вес животного), isFly, isWalk, isSwim (возможность животного летать, гулять и плавать соответственно)\n";
    }
    public Animal(){
        counter += 1;
    }
    public Animal(String type, String name){
        counter += 1;
        setType(type);
        setName(name);
    }

    public Animal(String type, int age){
        this.type = type;
        this.name = "No Name";
        this.age = 0;
        this.weight = 0.0;
        this.isFly = false;
        this.isSwim = false;
        this.isWalk = false;
    }
    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isSwim = isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public boolean getSwim() {
        return isSwim;
    }
    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public boolean getFly() {
        return isFly;
    }
    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean getWalk() {
        return isWalk;
    }
    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public void display(){
        System.out.println("Тип: "+type);
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age);
        System.out.println("Вес: "+weight);
        System.out.println("Умеет летать: "+(isFly ? "Да" : "Нет"));
        System.out.println("Умеет ходить: "+(isWalk ? "Да" : "Нет"));
        System.out.println("Умеет плавать: "+(isSwim ? "Да" : "Нет")+"\n");
    }

    public static void aima(int age){
        System.out.println("How old are u ma nigga??");
        System.out.println("Im " + age);
    }


    public void rename(String newName){
        this.name = newName;
    }

    public void holiday(){
        this.weight = weight + 0.1;
    }
    public void holiday(double m){
        this.weight = weight + 0.1 * m;
    }
    public void holiday(double m, int n){
        this.weight = n*(weight + 0.1 * m);
    }
}