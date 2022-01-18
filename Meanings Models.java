package com.example.dictionary.Models;

import java.util.List;

public class Meanings {
    String partOfSpeech = "";
    List<Definitions> definitions = null;

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public List<Definitions> getDefinition() {
        return definitions;
    }

    public void setDefinition(List<Definitions> definition) {
        this.definitions = definition;
    }
}
