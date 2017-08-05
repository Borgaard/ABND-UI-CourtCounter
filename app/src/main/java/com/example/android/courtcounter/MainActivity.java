package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final int FREE_THROW_POINTS = 1;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Team A*/
    public void addThreeTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }
    public void addTwoTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }
    public void addFreeThrowTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Team B */
    public void addThreeTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }
    public void addTwoTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }
    public void addFreeThrowTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
