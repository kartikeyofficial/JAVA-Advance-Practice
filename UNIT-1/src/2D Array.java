class twoDimentionalArray{
    public static void main(String[] args) {

        int[][] inArray= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("2-d Array Position (1,1):  "+inArray[1][1]);
        System.out.println("Length Of Array: "+inArray.length);
        for(int i=0;i< inArray.length;i++){
            for(int j=0; j<inArray[i].length;j++){
                System.out.print(inArray[i][j]);
            }
            System.out.println();
        }
    }
}