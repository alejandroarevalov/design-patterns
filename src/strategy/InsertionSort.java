package strategy;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public void executeSorting(int[] collectionToSort) {
        for (int i = 0; i < collectionToSort.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (collectionToSort[j] < collectionToSort[j - 1]) {
                    swap(collectionToSort, j - 1, j);
                }
            }
        }
    }
}