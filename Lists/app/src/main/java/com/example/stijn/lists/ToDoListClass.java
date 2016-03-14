package com.example.stijn.lists;

import java.util.ArrayList;

/**
 * This class creates a ToDoList object consisting of ToDoItem objects. The class contains
 * methods to add and remove ToDoItems, get and set a ToDoList object, get and set the
 * position of a ToDoItem in the ToDoList and get the ToDoItem at that position.
 */
public class ToDoListClass {

    // fields
    private String listTitle;
    private ArrayList<ToDoItemClass> toDoList;
    private int size;
    private int position;

    // constructors
    public ToDoListClass (String listTitleArg){
        listTitle = listTitleArg;
        toDoList = new ArrayList<>();
        size = 0;
    }

    // methods

    /**
     * Adds a ToDoItem object from the ToDoItemClass from the toDoList
     */
    public void addToDo(ToDoItemClass todo) {
        toDoList.add(todo);
        size += 1;
    }

    /**
     * Remove a ToDoItem object from the ToDoItemClass from the toDoList
     */
    public void removeToDo(int position) {
        toDoList.remove(position);
        size --;
    }

    /**
     *  Returns the current toDoList
     */
    public ArrayList getToDoList() {
        return toDoList;
    }

    /**
     * Makes the given Arraylist the toDoList object
     */
    public void setToDoList(ArrayList givenList) {
        this.toDoList =  givenList;
    }

    /**
     * Returns the size of the current toDoList
     */
    public int getSize() {
        return size;
    }

    /**
     * Returns the title of the current toDoList
     */
    public String getListTitle() {
        return listTitle;
    }

    /**
     * Returns the position of a toDoItem in the toDoList
     */
    public int getPosition() {
        return position;
    }

    /**
     * Sets the position of a toDoItem in the current toDoList
     */
    public void setPosition(int pos) {
        this.position = pos;
    }

    /**
     * Returns the toDoItem on the current set position in the toDoList
     */
    public ToDoItemClass getItem () {
        return toDoList.get(position);
    }
}
