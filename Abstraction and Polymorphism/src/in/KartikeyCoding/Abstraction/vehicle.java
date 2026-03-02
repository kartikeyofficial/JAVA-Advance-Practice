package in.KartikeyCoding.Abstraction;

public abstract class vehicle implements Transport,Import {
    private int noOftyres;

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("Get Set Go");
    }

    public vehicle(int noOftyres) {
        this.noOftyres = noOftyres;
    }

    public int getNoOftyres() {
        return noOftyres;
    }

    public void setNoOftyres(int noOftyres) {
        this.noOftyres = noOftyres;
    }

    public void commute(){
        System.out.println("Going");
    }
}
