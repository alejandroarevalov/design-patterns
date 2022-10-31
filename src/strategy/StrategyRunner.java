package strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StrategyRunner {

    private SortableList sortableList;
    private Scanner scanner;
    private int[] array;

    public StrategyRunner(SortingAlgorithm sortingAlgorithm) throws FileNotFoundException {
        scanner = new Scanner(new File("src/numbers.txt"));

        int fileSize = scanner.nextInt();
        array = new int[fileSize];
        int index = 0;
        while(scanner.hasNextLine()) {
            array[index] = scanner.nextInt();
            index++;
        }
        sortableList = new SortableList(Arrays.copyOf(array, array.length));
        sortableList.setSortingAlgorithm(sortingAlgorithm);
    }

    public void changeSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        sortableList.setSortingAlgorithm(sortingAlgorithm);
    }

    public void resetList() {
        sortableList = new SortableList(Arrays.copyOf(array, array.length));
    }

    public void run() throws Exception {
        long initialTime = System.currentTimeMillis();
        sortableList.sort();
        sortableList.printValues();
        System.out.println("List sorted and printed in " + (System.currentTimeMillis() - initialTime) + " milliseconds");
    }

    public static void main(String[] args) throws Exception{
        StrategyRunner strategyRunner = new StrategyRunner(new BubbleSort());
        strategyRunner.run();
        // Now, changing the sorting algorithm and resetting the list
        strategyRunner.resetList();
        strategyRunner.changeSortingAlgorithm(new SelectionSort());
        strategyRunner.run();
    }
}
