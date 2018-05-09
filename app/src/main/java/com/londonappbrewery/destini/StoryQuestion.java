package com.londonappbrewery.destini;

public class StoryQuestion {

    private int mQuestion;
    private int mAnswer1;
    private int mAnswer2;

    public StoryQuestion(int question, int answer1, int answer2) {
        mQuestion = question;
        mAnswer1 = answer1;
        mAnswer2 = answer2;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public int getAnswer1() {
        return mAnswer1;
    }

    public void setAnswer1(int answer1) {
        mAnswer1 = answer1;
    }

    public int getAnswer2() {
        return mAnswer2;
    }

    public void setAnswer2(int answer2) {
        mAnswer2 = answer2;
    }
}
