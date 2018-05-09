package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex = 1;


    StoryQuestion[] mStoryQuestions = {new StoryQuestion(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryQuestion(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryQuestion(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryQuestion(R.string.T4_End, R.string.empty, R.string.empty),
            new StoryQuestion(R.string.T5_End, R.string.empty, R.string.empty),
            new StoryQuestion(R.string.T6_End, R.string.empty, R.string.empty)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        if(savedInstanceState != null){
            mStoryIndex = savedInstanceState.getInt("index");
            if(mStoryIndex == 2){
                GoToT2();
            }else if(mStoryIndex == 3){
                GoToT3();
            }else if(mStoryIndex == 4){
                GoToT4();
            }else if(mStoryIndex == 5){
                GoToT5();
            }else if(mStoryIndex == 6){
                GoToT6();
            }
        }

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateQuestion(true);

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UpdateQuestion(false);

            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle b){
        super.onSaveInstanceState(b);
        b.putInt("index",mStoryIndex);

    }


    public void UpdateQuestion(boolean t1) {
        if (mStoryIndex == 1 && t1) {

            GoToT3();

        }else if(mStoryIndex == 1 && !t1){
            GoToT2();
        } else if (mStoryIndex == 2 && t1) {
            GoToT3();

        }else if(mStoryIndex == 2 && !t1){
            GoToT4();
        } else if (mStoryIndex == 3 && t1) {
            GoToT6();

        }else if(mStoryIndex == 3 && !t1){
            GoToT5();
        }

    }

    public void GoToT3() {
        mStoryIndex = 3;
        Log.d("destini","go yo t3");
        mStoryTextView.setText(mStoryQuestions[2].getQuestion());
        mButtonTop.setText(mStoryQuestions[2].getAnswer1());
        mButtonBottom.setText(mStoryQuestions[2].getAnswer2());
    }

    public void GoToT2() {
        Log.d("destini","go yo t2");
        mStoryIndex = 2;
        mStoryTextView.setText(mStoryQuestions[1].getQuestion());
        mButtonTop.setText(mStoryQuestions[1].getAnswer1());
        mButtonBottom.setText(mStoryQuestions[1].getAnswer2());
    }

    public void GoToT4() {
        Log.d("destini","go yo t4");
        mStoryIndex = 4;
        mStoryTextView.setText(mStoryQuestions[3].getQuestion());
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
    public void GoToT5() {
        Log.d("destini","go yo t5");
        mStoryIndex = 5;
        mStoryTextView.setText(mStoryQuestions[4].getQuestion());
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
    public void GoToT6() {
        Log.d("destini","go yo t6");
        mStoryIndex = 6;
        mStoryTextView.setText(mStoryQuestions[5].getQuestion());
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

}
