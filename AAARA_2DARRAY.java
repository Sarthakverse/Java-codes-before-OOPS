public class AAARA_2DARRAY {
    public static void main(String[] arg){

        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // using for each loop
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y);
            }
            System.out.println();
        }
    }

}
