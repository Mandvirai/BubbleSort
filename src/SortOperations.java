interface SortOperations {

    public void sortm1(int arr1[]);

}

    class Sort implements SortOperations {


        public void sortm1(int arr1[]) {

            int temp = 0;
            for (int i = 0; i < arr1.length - 1; i++) {
                for (int j = 0; j < arr1.length - 1; j++) {
                    if (arr1[j] > arr1[j + 1]) {
                        temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i] + " ");
            }


        }
    }
    class Test1{
        public static void main(String[] args){
            int arr[] = {12,5,67,3,8};
            Sort sr = new Sort();
            sr.sortm1(arr);
        }







}
