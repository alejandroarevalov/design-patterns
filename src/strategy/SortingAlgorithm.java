package strategy;

import java.util.Collection;

public interface SortingAlgorithm {
    default void sort(int[] collectionToSort) {
        System.out.println(this.getClass().getName().split("\\.")[1] + ": ");
        executeSorting(collectionToSort);
    }

    void executeSorting(int[] collectionToSort);

    default void swap(int[] collectionToSort, int minIndex, int maxIndex) {
        int temp = collectionToSort[maxIndex];
        collectionToSort[maxIndex] = collectionToSort[minIndex];
        collectionToSort[minIndex] = temp;

    }
}
