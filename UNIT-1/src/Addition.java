class Addition{
    int operator1;
    int operator2;

    int add(){
        return operator1+operator2;
    }
}
class demoAddition{
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.operator1=10;
        obj.operator2=20;
        System.out.println("Result: "+ obj.add());
    }
}