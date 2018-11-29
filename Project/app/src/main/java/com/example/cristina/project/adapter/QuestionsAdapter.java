package com.example.cristina.project.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.example.cristina.project.R;
import com.example.cristina.project.model.Question;

import java.util.List;

public class QuestionsAdapter  extends BaseAdapter {
    private List<Question> lista;
    LayoutInflater layoutInflater;




    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    QuestionsAdapter(Context context, List<Question> lista ){
        layoutInflater=LayoutInflater.from(context);
        this.lista=lista;

    }
    @Override
    public int getCount(){
        return lista.size();
    }
    @Override
    public long getItemId(int position){
        return  position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.questions_item);
        }
    }}
