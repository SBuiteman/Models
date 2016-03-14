package com.example.stijn.lists;

import android.content.Context;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contains a singleton holding an arraylist of ToDoItemObjects, this is the list
 * showing all ToDoLists that have been made. The arraylist is stored as a singleton. This class
 * also contains a funtion to write  to WriteListFile and read from ReadListFile a textfile as a
 * means to save ToDoLists.
 */

public class ToDoManager {

    // fields
    private String file;
    private ArrayList<ToDoListClass> mainList;
    private Context context;

    private static ToDoManager ourInstance = null;

    /**
     * This function is called to get the list viewed in the MainActivity and shows all the
     * stored ToDoLists.
     */
    public static ToDoManager getInstance(Context context) {
        if(ourInstance == null) {
            ourInstance = new ToDoManager("main", new ArrayList<ToDoListClass>(), context);
        }
        return ourInstance;
    }

    private ToDoManager(String filename, ArrayList<ToDoListClass> toDoLists, Context layoutMAContext){
        file = filename;
    }

    /**
     * This method can be called to write in the contents of a file specified by a String passed to it
     * when the method is called to store an Arraylist holding ToDoItem objects.
     */
    public void writeListFile(String file, ArrayList<ToDoListClass> listSize) {
        // write input to listSafe.txt, each item on a new line
        try {
            OutputStream outputstr = context.openFileOutput(file, Context.MODE_PRIVATE);
            PrintStream out = new PrintStream(outputstr);
            int i = 0;
            while (i < listSize.size()) {
                out.println(listSize.get(i));
                i++;
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method can be called to read the contents of a file specified by a String passed to it
     * when the method is called to make an Arraylist containing ToDoItem objects.
     */
    public ArrayList<ToDoListClass> readListFile(String file) {
        try {
            // read the file and add a to-do for each newline.
            Scanner scan = new Scanner(context.openFileInput(file));
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                // line = titel van list
                mainList.add(new ToDoListClass(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mainList;
    }
}
