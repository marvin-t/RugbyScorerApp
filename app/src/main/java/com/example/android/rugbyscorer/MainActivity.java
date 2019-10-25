package com.example.android.rugbyscorer;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.rugbyscorer.R;
//  import android.view.Menu;
//  import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team A
    int foulsTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    // Tracks the fouls for Team B
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 5 points.
     */
    public void addTryForTeamA(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addConversionForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addPenaltyForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the foul for Team A button is clicked.
     */
    public void addFoulForTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        String message = "Fouls: " + foulsTeamA;
        displayMessageA(message);
    }

    /**
     * Increase the score for Team B by 5 points.
     */
    public void addTryForTeamB(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addConversionForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addPenaltyForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the foul for Team A button is clicked.
     */
    public void addFoulForTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        String message = "Fouls: " + foulsTeamB;
        displayMessageB(message);
    }

    /**
     * Reset score for both Teams
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayMessageA("");
        displayForTeamB(scoreTeamB);
        displayMessageB("");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessageA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.foul_team_A);
        priceTextView.setText(message);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessageB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.foul_team_B);
        priceTextView.setText(message);
    }
}
