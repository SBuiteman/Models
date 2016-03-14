package com.example.stijn.lists;
/**
 * Created by Stijn on 23/02/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * This class contains an getView method which takes in the list from MainActivity and
 * builds the ListView. The class takes in a ToDoListClass Object.
 */
public class AdapterActivity extends ArrayAdapter<ToDoListClass> {
    public Context layoutMAContext;
    public MainActivity mainActivity;
    public ToDoListClass toDoListClass;

    public AdapterActivity(Context context, ArrayList<ToDoListClass> ToDos) {
        super(context, R.layout.single_row_layout, ToDos);

        layoutMAContext = context;
    }

    /**
     * Handles the layout of the ListView for both MainActivity.
     */
    public View getView(int position, View view, ViewGroup parent) {

        toDoListClass.setPosition(position);
        final ToDoItemClass toDo = toDoListClass.getItem();
        mainActivity = new MainActivity();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) layoutMAContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_row_layout, parent, false);
        }

        TextView textview = (TextView) view.findViewById(R.id.toDOTextView);

        textview.setText(toDo.getItemTitle());

        return view;
    }
}