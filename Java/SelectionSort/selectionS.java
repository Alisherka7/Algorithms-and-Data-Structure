class selectionS {

    public static void selectionSort(int[] list) {

        int i, j, maxNum, maxIndex, temp = 0;

        for (i = list.length - 1; i >= 0; i--) {
            // you start iterating from the end of the list
            // which means that the elements between i and the end of the list are sorted
            maxNum = list[i];
            maxIndex = i;
            for (j = 0; j < i; j++) {
                // you have to iterate through the nonsorted elements
                if (list[j] > maxNum) {
                    maxNum = list[j];
                    maxIndex = j;
                }
            }
            if (maxNum > list[i]) {
                // if you found an element that is bigger then the current element
                // then it should be set as the current element
                temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int[] list = { 4, 5, 2, 1, 9, 7, 6 };
        System.out.println("Unsorted array");
        for (int i : list) {
            System.out.print(i + " ");
        }
        selectionSort(list);
        System.out.println("\n\nSelection Sorted Array");
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
