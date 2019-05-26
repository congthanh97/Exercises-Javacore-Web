
package com.demo;


public class Answer {
    private String ans;

    public Answer() {
    }

    public Answer(String ans) {
        this.ans = ans;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Answer{" + "ans=" + ans + '}';
    }
    
    
}
