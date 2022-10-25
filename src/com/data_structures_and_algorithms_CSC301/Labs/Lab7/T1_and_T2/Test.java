package com.data_structures_and_algorithms_CSC301.Labs.Lab7.T1_and_T2;
import java.io.File;
import java.util.*;

// Moutasim El Ayoubi - 1080415
public class Test {

    public static void main(String[] args) {
        System.out.println("-------------------------------Task 1 ------------------------------------");
        //create a linked list named "Your ID_Books" containing at least four elements
        LinkedList<Book> myBooks_1080415 = new LinkedList<>();
        //Add a new book cotaining your name as an author and your ID as the book's ISBN
        //....................................................................        
        myBooks_1080415.add(new Book(978014311, 288, "How to own your own mind", "Napoleon Hill"));
        myBooks_1080415.add(new Book(93884341, 849, "The Law of Success in Sixteen Lessons", "Napoleon Hill"));
        myBooks_1080415.add(new Book(07352112, 320, "Atomic Habits", "James Clear "));
        myBooks_1080415.add(new Book(17847011, 240, "Designing Your Life: For Fans of Atomic Habits", "Bill and Dave"));
        myBooks_1080415.add(new Book(1080415, 240, "Designing Your Life: For Fans of Atomic Habits", "Moutasim El Ayoubi"));

        //Get the first and last book
        myBooks_1080415.getFirst();
        myBooks_1080415.getLast();

        //Add two books one to the head of the list and one to the tail of the list
        myBooks_1080415.addFirst(new Book(1783253630, 208, "The Power Of Letting Go", "John Purkiss "));
        myBooks_1080415.addLast(new Book(32554323, 208, "Cookbook", "John"));

        //Create two iterators that can iterate through the list forward and backward
        System.out.println("-------Iterating the books forward--------");
        for (Book book : myBooks_1080415) {
            System.out.println(book);
        }

        System.out.println("-------Iterating the books backward--------");
        Iterator it = myBooks_1080415.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        //Now remove the first and last book
        myBooks_1080415.removeFirst();
        myBooks_1080415.removeLast();

        System.out.println("-------------------------------Task 2 --------------------------------------");
        try {
            LinkedList<Book> list = readData(200);
            System.out.println("from the call: ");
            for (Book b : list) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//end main()

        public static LinkedList readData(int pages) throws Exception {

        LinkedList<Book> newList = new LinkedList<>();
        File file = new File("BooksInfo.txt");

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            long ISBN = input.nextInt();
            int pagesContained = input.nextInt();
            String title = input.next();
            String authorName = input.next();
           //read the data from the file
            if (pagesContained == pages) {
                newList.add(new Book(ISBN, pagesContained, title, authorName));
            }
           //if (....... == pages) 
                //......................add the book to newList
        }//end while
        input.close();
        return newList;
    }
}


