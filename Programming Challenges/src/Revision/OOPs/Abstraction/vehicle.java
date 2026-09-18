package Revision.OOPs.Abstraction;

public abstract class vehicle implements transport {
  private int noOfTyres;

  public abstract void makeStartSound();

  public vehicle(int noOfTyres){
      this.noOfTyres = noOfTyres;
  }
  public int getNoOfTyres(){
      return noOfTyres;
  }
  public void setNoOfTyres(int noOfTyres){
      this.noOfTyres = noOfTyres;
  }
}
