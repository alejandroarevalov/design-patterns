package strategy;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] collectionToSort) {
        for (int i = 0; i < collectionToSort.length; i++) {
            for (int j = i; j > 0; j--) {
                if (collectionToSort[j] < collectionToSort[j-1]) {
                    swap(collectionToSort, j-1, j);
                }
            }
        }
    }
}
