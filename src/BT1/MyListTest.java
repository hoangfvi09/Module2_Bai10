package BT1;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList=new MyList<Integer>(10);
        myList.add(0,0);
        myList.add(1,1);
        myList.add(2,2);
        myList.add(3,3);

        System.out.println("Initial list: ");
        myList.printOutList();

        myList.add(15,15);
        myList.add(16);
        System.out.println("List after adding:");
        myList.printOutList();

        myList.remove(3);
        System.out.println("List after remove:");
        myList.printOutList();
        Object[] newList=myList.clone();
        System.out.println("Cloned List:");
        for(int i=0;i<newList.length;i++){
            System.out.println("element "+i+ ":"+newList[i]);
        }
        myList.clear();
        System.out.println("List after clearing:");
        myList.printOutList();

//        System.out.println("Index of 15 is "+myList.indexOf(15));
//        System.out.println("Index of 10 is "+myList.indexOf(10));


    }
}
