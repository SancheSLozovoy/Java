class Insect extends Animal{
    private int wingCount;
    private boolean likeJesus;

    public Insect(){
        super();
    }

    public Insect(String area, boolean upStreamSwim, String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly){
        super(type, name, age, weight, isSwim, isWalk=true, isFly);
    }
    public void ggg(){
        System.out.println("Ggggg");
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
}