public class binarySearch {
    public static void main(String[] args){
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = i;
            System.out.print(nums[i] + " ");
        }
        int start = 0;
        int end = nums.length;

        System.out.println();

        System.out.println(binarySearch(3,nums,start,end));
    }

    public static int binarySearch(int search, int[] arr, int start, int end){
        if (end > start){
            // creates middle variable
            int middle = (start + end) / 2;

            //if search # is less than the middle #, search left side
            if (search < arr[middle]){
                return binarySearch(search, arr, start, middle - 1);
            }
            //if search # is more than the middle #, search right side
            else if (search > arr[middle]){
                return binarySearch(search, arr, middle + 1, end);
            }
            //if search # is equal to middle #, then return middle index
            else if (search == arr[middle]){
                return middle;
            }
        }
        //Base Case
        return -1;

    }
}
