package com.example.stijn.lists;

/**
 * This class creates a toDoItem object containing a String itemTitle and a Boolean finished. The
 * class has methods to get and set the boolean or the itemTitle
 */
public class ToDoItemClass {

    // fields
    private String itemTitle;
    private Boolean finished;

    // constructors
    public ToDoItemClass() {
        itemTitle = "empty";
        finished = false;
    }

    // methods

    /**
     * Sets the Boolean of the toDoItem object to true
     */
    public void setFinished() {
        this.finished = true;
    }

    /**
     * Returns the Boolean value of the toDoItem
     */
    public boolean getFinished() {
        return finished;
    }

    /**
     * Sets the itemTitle of the toDoItem
     */
    public void setItemTitle(String newItemTitle) {
        this.itemTitle = newItemTitle;
    }

    /**
     * Returns the itemTitle of the toDoItem
     */
    public String getItemTitle() {
        return itemTitle;
    }
}
