public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(3, 4);
        printList(myList);

        System.out.println("After remove: ");
        System.out.println("Remove element: " + myList.remove(2));
        printList(myList);

        System.out.println("Size: " + myList.size());

        System.out.println("Contains 3? " + myList.contains(3));

        System.out.println("Index of 5: " + myList.indexOf(5));

        System.out.println("Element at index 2: " + myList.get(2));

        System.out.println("After clear and add 3: ");
        myList.clear();
        myList.add(3);
        printList(myList);
    }

    private static void printList(MyList<Integer> myList) {
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
