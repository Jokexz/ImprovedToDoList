package sg.edu.rp.c346.improvedtodolist;

import java.util.Calendar;

/**
 * Created by 15039523 on 17/7/2017.
 */

public class ToDoItem {



    //define the data items in the top row
    private String title;
    private Calendar date;
    private  boolean isImportant;

    public ToDoItem(String title, Calendar date, boolean isImportant) {
        this.title = title;
        this.date = date;
        this.isImportant = isImportant;
    }
    //getter and setter
    public String getTitle() {

        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }



    public void setDate(Calendar date) {
        this.date = date;
    }
    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;}
    public Calendar getDate() {
        return date;
    }


    public boolean isImportant(){
            return isImportant;


    }
    public void setImportant(boolean important){
        isImportant = important;
    }

    @Override
    public String toString() {
        return "ToDoItem{"+
                "title+'"+getTitle() + '\'' +
                ", date=" + getDateString()+
                ", isImportant=" + isImportant+
                '}';

    }

    }


