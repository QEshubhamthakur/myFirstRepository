public class Star{
    public static void main(String arg[]){
        int n=4;
        for(int i=1;i<=n;i++){ 
          for(int j=1;j<=n+1-i;j++){
            System.out.print("*");
          }System.out.println();
        }     
    }   
}