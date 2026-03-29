 class ConcatenateString {
    static void main(String[] args) {
        System.out.println(conca("Kumar","Kartikey"));
        System.out.println(conca("Rajput"));
        System.out.println(conca("Is a", "Good Boy"));

    }

    public static String conca(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str: strs){
            sb.append(str).append(" ");
        }
        return  sb.toString();
    }

}
