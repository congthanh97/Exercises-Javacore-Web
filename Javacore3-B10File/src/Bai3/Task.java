
package Bai3;

import java.io.Serializable;

public class Task implements Serializable{
    private int id;
    private String title;
    private String conntent;
    private boolean done;

    public Task() {
    }

    public Task(int id, String title, String conntent, boolean done) {
        this.id = id;
        this.title = title;
        this.conntent = conntent;
        this.done = done;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConntent() {
        return conntent;
    }

    public void setConntent(String conntent) {
        this.conntent = conntent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}
