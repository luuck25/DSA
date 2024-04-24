package Java.Problems;

public class QuickSortImplement {




    public static void main(String[] args) {

        int[] quickarray={10,16,8,12,15,6,3,9,5};

        getPartition(quickarray);

    }


    public static void getPartition(int[] qArray) {
        int i = 0;
        int j = qArray.length - 1;
        int pivot = qArray[i];

        for (int element = 1; element < qArray.length; element++) {

            while(qArray[element]<qArray[i])
            {

            }

        }
    }
}
