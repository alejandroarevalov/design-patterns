package strategy;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public void executeSorting(int[] collectionToSort) {
        for (int i = 0; i < collectionToSort.length - 1; i++) {
            for (int j = i + 1; j < collectionToSort.length; j++) {
                if (collectionToSort[i] > collectionToSort[j]) {
                    swap(collectionToSort, i, j);
                }
            }
        }
    }
}
