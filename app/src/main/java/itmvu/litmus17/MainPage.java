package itmvu.litmus17;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import com.daimajia.slider.library.SliderLayout;
import com.firebase.client.Firebase;

public class MainPage extends AppCompatActivity {

    SharedPreferences prefs = null;
    private SliderLayout mDemoSlider;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        AppBarLayout linearLayout = (AppBarLayout) findViewById(R.id.relativeLayout);
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);



        prefs = getSharedPreferences("itmvu.litmus17", MODE_PRIVATE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Litmus'17");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mainpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {

            String shareBody = getResources().getString(R.string.link);
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Have a look at LITMUS'17, Annual fest of ITMVU. \n\n");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.frwd)));

            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    public void Hiren (View view  )

    {
        startActivity(new Intent(MainPage.this,events.class));
    }

    public void jayesh (View view  )

    {
        startActivity(new Intent(MainPage.this,registermenu.class));
    }

    public void abt (View view )
    {
        Intent intent = new Intent(this,About.class);
        startActivity(intent);
    }

    public void cntus (View view)
    {
        Intent intent = new Intent(this,contactus.class);
        startActivity(intent);
    }

    public void sch (View view)
    {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(MainPage.this, R.style.AppCompatAlertDialogStyle);
        builder.setTitle("SCHEDULE");
        builder.setMessage("Schedule of the Litmus'17 will be avaliable soon...");
        //builder.setPositiveButton("OK", null);//second parameter used for onclicklistener
        builder.setNegativeButton("Got It", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
    public void teamapp(View view)
    {
        Intent intent = new Intent(this,teamapp.class);
        startActivity(intent);
    }

    public void spo (View view)
    {
        Intent intent = new Intent(this,Sponsors.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Are you sure you want to exit ...")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        finish();
                        System.exit(0);
                    }
                }).setNegativeButton("No", null).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (animationDrawable != null && !animationDrawable.isRunning())
            animationDrawable.start();

        if (prefs.getBoolean("firstrun", true)) {
            // Do first run stuff here then set 'firstrun' as false
            // using the following line to edit/commit prefs
            Firebase.getDefaultConfig().setPersistenceEnabled(true);
            prefs.edit().putBoolean("firstrun", false).commit();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (animationDrawable != null && animationDrawable.isRunning())
            animationDrawable.stop();
    }

}
