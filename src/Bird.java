class Bird extends Animal{
    private String area;
    private boolean winterFly;

    public Bird(){
        super();
    }

    public Bird(String area, boolean winterFly, String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly){
        super(type, name, age, weight, isSwim, isWalk, isFly = true);
        this.area = area;
        this.winterFly = winterFly;
    }
    public void chir(){
        System.out.println("Chick-chiric");
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}