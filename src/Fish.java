class Fish extends Animal{
    private String squamo;
    private boolean upStreamSwim;


    public Fish(){
        super();
    }
    public Fish(String squamo, boolean upStreamSwim, String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly){
        super(type, name, age, weight, isSwim = true, isWalk, isFly);
    }
    public void bul_bul(){
        System.out.println("Bul-bul");
    }

    public String getSquamo() {
        return squamo;
    }

    public void setSquamo(String squamo) {
        this.squamo = squamo;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
}