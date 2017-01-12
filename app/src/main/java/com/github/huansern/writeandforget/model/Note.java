package com.github.huansern.writeandforget.model;

/**
 * Created by Aston on 1/12/2017.
 */

public class Note {

    private final String VERSION = "1.0";
    private String title;
    private String content;
    private Long created;
    private Long lastModified;
    private Integer modificationCount;
    private Double latitude;
    private Double longitude;
    private Boolean encrypted;

    public Note (){

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
