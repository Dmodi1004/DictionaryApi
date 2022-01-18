package com.example.dictionary.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dictionary.Models.Meanings;
import com.example.dictionary.R;
import com.example.dictionary.ViewHolders.MeaningsViewHolders;

import java.util.List;

import okhttp3.CookieJar;

public class MeaningAdapters extends RecyclerView.Adapter<MeaningsViewHolders> {

    private Context context;
    private List<Meanings> meaningsList;

    public MeaningAdapters(Context context, List<Meanings> meaningsList) {
        this.context = context;
        this.meaningsList = meaningsList;
    }

    @NonNull
    @Override
    public MeaningsViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MeaningsViewHolders(LayoutInflater.from(context).inflate(R.layout.meanings_list_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MeaningsViewHolders holder, int position) {

        holder.textView_partsOfSpeech.setText("Parts of speech: " + meaningsList.get(position).getPartOfSpeech());
        holder.recycler_definitions.setHasFixedSize(true);
        holder.recycler_definitions.setLayoutManager(new GridLayoutManager(context, 1));

        DefinitionAdapters definitionAdapters = new DefinitionAdapters(context, meaningsList.get(position).getDefinition());
        holder.recycler_definitions.setAdapter(definitionAdapters);

    }

    @Override
    public int getItemCount() {
        return meaningsList.size();
    }
}
