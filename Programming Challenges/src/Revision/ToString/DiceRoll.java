package Revision.ToString;

public class DiceRoll {
    int roll(){
        double random = Math.random()*6;
        int currRoll =(int) Math.ceil(random);
        return  currRoll;
    }

    static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i=0;i<10;i++){
            System.out.println(dice.roll());
        }
    }
}
