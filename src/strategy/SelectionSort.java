package strategy;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] collectionToSort) {
        for (int i = 0; i < collectionToSort.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < collectionToSort.length; j++) {
                if (collectionToSort[j] < collectionToSort[minIndex]) {
                    minIndex = j;
                }
            }
            swap(collectionToSort, i, minIndex);
        }
    }
}
