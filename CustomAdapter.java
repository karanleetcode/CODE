package com.example.acer.myapplication;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by win-8 on 05-02-2017.
 */

public class CustomAdapter extends ArrayAdapter<Contacts2> implements CompoundButton.OnCheckedChangeListener{
    private final Context context;
    private final ArrayList<Contacts2> array;
    TextView wordName;
    Switch s;
    final DBHandler2 dbHandler2;
    final DBHandler dbHandler;

    public CustomAdapter(Context context, ArrayList<Contacts2> array2) {
        super(context, -1, array2);
        this.context = context;
        this.array = array2;
        dbHandler2 = new DBHandler2(context);
        dbHandler = new DBHandler(context);

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.list_item_example2, parent, false);
        final Contacts2 cn = array.get(position);
        wordName = (TextView) rowView.findViewById(R.id.wordName);
        wordName.setText(cn.getWordName());
        s = (Switch) rowView.findViewById(R.id.switchButton);
        s.setOnCheckedChangeListener(this);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Toast.makeText(context,cn.getWordName(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(context,Main2Activity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("wordname",cn.getWordName());
                view.getContext().startActivity(intent);

            }
        });
        return rowView;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        View v=(View)buttonView.getParent();
        TextView t=v.findViewById(R.id.wordName);

        String x=t.getText().toString();
        if(isChecked){
            Toast.makeText(context,x+":checked:", Toast.LENGTH_SHORT).show();
            dbHandler2.addContact(new Contacts2(0,x,"1"));
            dbHandler.updateStarTo1(x);
            Toast.makeText(context,"word updated", Toast.LENGTH_SHORT).show();
        }else{
            dbHandler2.deleteWord(x);
            Toast.makeText(context,"word deleted", Toast.LENGTH_SHORT).show();
            dbHandler.updateStarTo0(x);
        }
    }
}
