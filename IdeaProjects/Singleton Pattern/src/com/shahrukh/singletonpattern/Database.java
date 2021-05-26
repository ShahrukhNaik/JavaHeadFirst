package com.shahrukh.singletonpattern;

public class Database {
    private String name;

    private Database(String name) {
        this.name = name;
    }
    private static Database instance;

    public static synchronized Database getInstance(String name){
        if(null==instance){
            instance=new Database(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database" +
                "name='" + name + '\'';
    }
}
