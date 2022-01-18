package com.example.dictionary.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.R;

public class DefinitionViewHolders extends RecyclerView.ViewHolder {

    public TextView textView_definition, textView_example, textView_synonims, textView_antonims;

    public DefinitionViewHolders(@NonNull View itemView) {
        super(itemView);

        textView_definition = (TextView) itemView.findViewById(R.id.textView_definition);
        textView_example =  (TextView) itemView.findViewById(R.id.textView_example);
        textView_synonims = (TextView) itemView.findViewById(R.id.textView_synonims);
        textView_antonims = (TextView) itemView.findViewById(R.id.textView_antonims);

    }
}
