package in.KartikeyCoding.Challenge43;

public class testArray {
    static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5,6});
        ArrayOperations.nested nest = opr.new nested();
        System.out.println(nest.meanofArray());
    }
}
