package lecture_15_Array_Verticle_Wave;

public class Array_Transpose {
public static void main(String[] args) {
	  int [][] arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

      print(arr);
 ;
      for(int i=0;i< arr.length;i++){
          

          for(int j=0;j< arr.length;j++){

              System.out.print(arr[i][j]+" ");
          }
          System.out.println();

      }
  }

  public static void print(int arr[][]){

      for(int i=0;i< arr.length;i++){
          for(int j=i+1;j< arr.length;j++){
              int temp= arr[i][j];

              arr[i][j] = arr[j][i];
              arr[j][i]=temp;



          }


      }


}
}
