package itmvu.litmus17;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;


public class Technovision_Fury_Of_Tracks extends AppCompatActivity {

    private Toolbar toolbar;
    AnimationDrawable animationDrawable;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technovision_fury_of_tracks);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        AppBarLayout linearLayout = (AppBarLayout) findViewById(R.id.linearLayout3);
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }

    public void loc (View view)
    {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(Technovision_Fury_Of_Tracks.this, R.style.AppCompatAlertDialog);
        builder.setTitle("LOCATION");
        builder.setMessage("Nr. Basket Ball Court ,ITM Vocational Univeristy");
        //builder.setPositiveButton("OK", null);//second parameter used for onclicklistener
        builder.setNegativeButton("Yeah", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning())
            animationDrawable.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning())
            animationDrawable.stop();
    }

}
