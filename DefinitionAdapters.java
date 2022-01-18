package com.example.dictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Models.Definitions;
import com.example.dictionary.R;
import com.example.dictionary.ViewHolders.DefinitionViewHolders;

import java.util.List;

public class DefinitionAdapters extends RecyclerView.Adapter<DefinitionViewHolders> {

    private Context context;
    private List<Definitions> definitionList;

    public DefinitionAdapters(Context context, List<Definitions> definitionsList) {
        this.context = context;
        this.definitionList = definitionsList;
    }

    @NonNull
    @Override
    public DefinitionViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DefinitionViewHolders(LayoutInflater.from(context).inflate(R.layout.definitions_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DefinitionViewHolders holder, int position) {

        holder.textView_definition.setText("Definition: " + definitionList.get(position).getDefinition());
        holder.textView_example.setText("Example: " + definitionList.get(position).getExample());

        StringBuilder synonyms = new StringBuilder();
        StringBuilder antonyms = new StringBuilder();

        synonyms.append(definitionList.get(position).getSynonyms());
        antonyms.append(definitionList.get(position).getAntonyms());

        holder.textView_synonims.setText(synonyms);
        holder.textView_antonims.setText(antonyms);

        holder.textView_synonims.setSelected(true);
        holder.textView_antonims.setSelected(true);

    }

    @Override
    public int getItemCount() {
        return definitionList.size();
    }
}
