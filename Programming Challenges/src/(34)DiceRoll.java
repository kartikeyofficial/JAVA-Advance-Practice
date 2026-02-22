class Dice {
    int roll(){
        double random = Math.random() * 6;
        return (int)Math.ceil(random);
    }
    static void main(String[] args) {
       Dice dc = new Dice();
       for (int i=0;i<10;i++){
           System.out.println(dc.roll());
       }
    }
}
