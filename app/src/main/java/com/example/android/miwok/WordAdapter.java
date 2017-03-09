package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rgade on 3/9/17.
 */

public class WordAdapter extends ArrayAdapter<com.example.android.miwok.Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();



    public WordAdapter(Activity context, ArrayList<com.example.android.miwok.Word> words){
        super(context, 0, words);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        com.example.android.miwok.Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        englishTextView.setText(currentWord.getDefaultTranslation());
        return listItemView;



















    }
}
