package sg.edu.rp.c346.improvedtodolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;



    //Modify your data class name <ToDoItem>
    ArrayList<ToDoItem> toDoList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<ToDoItem> objects){
        super(context,resource,objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        //Standard code don't need to modify.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        // step 2 :code ourselves : Obtain the UI Elements and assign to Variables.
        TextView tvTitle =(TextView) rowView.findViewById(R.id.textViewTitle);
        TextView tvDate = (TextView) rowView.findViewById(R.id.textViewDate);
        ImageView ivImpt = (ImageView) rowView.findViewById(R.id.imageViewImpt);

        // Obtain the to-do item based on the "position"

        ToDoItem currentItem = toDoList.get(position);

        //Set the TextView to display corresponding information
        tvTitle.setText(currentItem.getTitle());
        tvDate.setText(currentItem.getDateString());

        //Set the Image depending on 'isImportant' field
        if (currentItem.isImportant() == true){
            ivImpt.setImageResource(R.drawable.impt);
        }else{
            ivImpt.setImageResource(R.drawable.todo);
        }
        return rowView;
    }
}
