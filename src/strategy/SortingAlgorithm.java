package strategy;

import java.util.Collection;

public interface SortingAlgorithm {
    void sort(int[] collectionToSort);

    default void swap(int[] collectionToSort, int minIndex, int maxIndex) {
        int temp = collectionToSort[maxIndex];
        collectionToSort[maxIndex] = collectionToSort[minIndex];
        collectionToSort[minIndex] = temp;

    }
}
