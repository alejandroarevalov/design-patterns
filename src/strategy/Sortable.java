package strategy;

import java.util.stream.IntStream;

public abstract class Sortable {

    protected int[] sortableCollection;
    private SortingAlgorithm sortingAlgorithm;

    protected void sort() throws Exception {
        if (sortingAlgorithm == null) {
            throw new Exception("No such sorting algorithm assigned to the collection");
        }
        sortingAlgorithm.sort(sortableCollection);
    }

    protected void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void printValues() {
        IntStream.range(0, sortableCollection.length).forEach(seq -> {
            System.out.print("Index: " + seq + " --> Value: " + sortableCollection[seq] + " | ");
            if (seq % 5 == 0 && seq != 0) {
                System.out.println();
            }
        });
        System.out.println();
    }
}
