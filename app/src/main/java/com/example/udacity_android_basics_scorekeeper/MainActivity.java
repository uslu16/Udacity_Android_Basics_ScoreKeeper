package com.example.udacity_android_basics_scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamScoreA = 0;
    int teamScoreB = 0;

    TextView teamScoreADisp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//****************AAAA*******************
    public void teamScoreA1Points(View view) {
       teamScoreA = teamScoreA + 1;
       göster();
    }

    public void teamScoreA2Points(View view) {
        teamScoreA = teamScoreA + 2;
        göster();
    }

    public void teamScoreA3Points(View view) {
        teamScoreA = teamScoreA + 3;
        göster();
    }
//****************AAAA*******************

    //***************BBBB*******************
    public void teamScoreB1Points(View view) {
        teamScoreB = teamScoreB + 1;
        göster();
    }

    public void teamScoreB2Points(View view) {
        teamScoreB = teamScoreB + 2;
        göster();
    }

    public void teamScoreB3Points(View view) {
        teamScoreB = teamScoreB + 3;
        göster();
    }
//****************AAAA*******************

    public void resetScores(View view) {
        Toast.makeText(this, "Sıfırlama", Toast.LENGTH_SHORT).show();
        teamScoreA = 0;
        teamScoreB = 0;
        göster();
    }

    public void göster() {
        TextView teamScoreADisp = findViewById(R.id.teamScoreADisp);
        teamScoreADisp.setText(String.valueOf(teamScoreA));

       TextView teamScoreBDisp = findViewById(R.id.teamScoreBDisp);
        teamScoreBDisp.setText(String.valueOf(teamScoreB));

    }


}
