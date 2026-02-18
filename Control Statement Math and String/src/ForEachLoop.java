public class ForEachLoop {
    static void main(String[] args) {
        String[] array = new String[]{
                "Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"
        };
        PrintArray(array);

    }
    public static  void PrintArray(String[] Array){
        for ( String newArray: Array) {
            System.out.print(newArray+"  ");
        }
    }
}
