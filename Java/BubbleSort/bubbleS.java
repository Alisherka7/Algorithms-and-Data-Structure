class bubbleS {

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - (i + 1); j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] list = { 4, 5, 2, 1, 9, 7, 6 };
        System.out.println("Unsorted array");
        for (int i : list) {
            System.out.print(i + " ");
        }
        bubbleSort(list);
        System.out.println("\n\nSelection Sorted Array");
        for (int i : list) {
            System.out.print(i + " ");
        }

    }
}
