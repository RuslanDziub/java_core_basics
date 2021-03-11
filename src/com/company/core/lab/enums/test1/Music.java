package com.company.core.lab.enums.test1;

public enum Music {
    DO("do"),
    RE("re"),
    MI("mi"),
    FA("fa"),
    SOL("sol"),
    LA("la"),
    SI("si");

    private String title;

    Music(String title) { this.title = title; }

    public String getTitle() { return title; }

    public boolean hasTitle() {
        return title != null;
    }
}
