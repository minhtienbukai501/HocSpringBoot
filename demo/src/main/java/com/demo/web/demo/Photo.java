package com.demo.web.demo;

public class Photo {
    private String id;
    private String fileName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public Photo(){}

    @Override
    public String toString() {
        return "Photo{" +
                "id='" + id + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }
}
