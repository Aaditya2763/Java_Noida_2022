package lecture_30;

public class quickSort{ public static void main(String[] args) {
    int[] arr = {5, 7, 2, 3, 8, 1, 4};

    quickSort(arr,0,arr.length-1);

    for (int i = 0; i < arr.length ; i++) {

        System.out.print(arr[i]+" ");

    }



}

private static void quickSort(int[] arr, int si, int ei) {

    if(si>=ei){
        return;
}


int idx= Partition(arr,si,ei);
    quickSort(arr,si,idx-1);
    quickSort(arr,idx+1,ei);

}

private static int Partition(int[] arr, int si, int ei) {
    int item = arr[ei];
    int idx = si;

    for (int i = si; i < ei; i++) {

        if (arr[i] <= item) {
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            idx++;


        }

    }

    int temp = arr[ei];
    arr[ei] = arr[idx];
    arr[idx] = temp;
    return idx;
}


}
