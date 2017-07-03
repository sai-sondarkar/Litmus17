package itmvu.litmus17;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class events extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        AppBarLayout linearLayout = (AppBarLayout) findViewById(R.id.event);
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Chakravyuh(), "Chakravyuh");
        adapter.addFragment(new technovision(), "Technovision");
        adapter.addFragment(new Magnif(), "Magnif");
        adapter.addFragment(new Scifun(), "Scifun");
        adapter.addFragment(new Kalakriti(),"Kalakriti");
        viewPager.setAdapter(adapter);
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_events, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

  /*      if(id==android.R.id.home)
        {
            onBackPressed();
        }
*/

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {

            String shareBody = getResources().getString(R.string.link);
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Have a look at LITMUS'16, Annual fest of ITMVU. \n\n");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.frwd)));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


   /* @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
*/
    // Chakravyuh
   public void c1 (View view )
   {
       Intent intent = new Intent(this,Chakravyuh_Cricket.class);
       startActivity(intent);
   }

    public void c2 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Basketball.class);
        startActivity(intent);
    }

    public void c3 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Football.class);
        startActivity(intent);
    }

    public void c4 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Vollyball.class);
        startActivity(intent);
    }

    public void c5 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Carrom.class);
        startActivity(intent);
    }

    public void c6 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Chess.class);
        startActivity(intent);
    }

    public void c7 (View view )
    {
        Intent intent = new Intent(this,Chakravyuh_Girls_Gully_Cricket.class);
        startActivity(intent);
    }

    //Technovision

    public void t1 (View view )
    {
        Intent intent = new Intent(this, Technovision_Fury_Of_Tracks.class);
        startActivity(intent);
    }

    public void t2 (View view)
    {
        Intent intent = new Intent(this,Technovision_Code_To_Win.class);
        startActivity(intent);
    }

    public void t3(View view)
    {
        Intent intent = new Intent(this,Technovision_Fiery_Fighters.class);
        startActivity(intent);
    }

    public void t4(View view)
    {
        Intent intent = new Intent(this,Technovision_Speeding_Machines.class);
        startActivity(intent);
    }

    public void t5(View view)
    {
        Intent intent = new Intent(this,Technovision_The_Artsy_Lens.class);
        startActivity(intent);
    }

    public void t6(View view)
    {
        Intent intent = new Intent(this,Technovision_Construo.class);
        startActivity(intent);
    }
    public void t7(View view)
    {
        Intent intent = new Intent(this,Technovision_Bridge_The_Gap.class);
        startActivity(intent);
    }
    public void t8(View view)
    {
        Intent intent = new Intent(this,Technovision_Shift_To_Beat.class);
        startActivity(intent);
    }
    public void t9(View view)
    {
        Intent intent = new Intent(this,Technovision_Hit_It_To_Win_It.class);
        startActivity(intent);
    }

    public void t10(View view)
    {
        Intent intent = new Intent(this,Technovision_Reclamation.class);
        startActivity(intent);
    }

    public void t11(View view)
    {
        Intent intent = new Intent(this,Technovision_Ladder_Claimbers.class);
        startActivity(intent);
    }

    public void t12(View view)
    {
        Intent intent = new Intent(this,Technovision_Mini_Militia.class);
        startActivity(intent);
    }


    public void t13 (View view )
    {
        Intent intent = new Intent(this,Technovision_Bomb_Squad.class);
        startActivity(intent);
    }

    public void t14 (View view)
    {
        Intent intent = new Intent(this,Technovision_Robo_Soccer.class);
        startActivity(intent);
    }

    public void t15 (View view)
    {
        Intent intent = new Intent(this,Technovision_Fifa_16.class);
        startActivity(intent);
    }

    public void t16(View view)
    {
        Intent intent = new Intent(this,Technovision_Robo_Puzzle.class);
        startActivity(intent);
    }

    public void t17(View view)
    {
        Intent intent = new Intent(this,Technovision_Rainbow_6_Siege.class);
        startActivity(intent);
    }

    //Magnif

    public void m1 (View view)
    {
        Intent intent = new Intent (this,Magnif_Blind_Fold.class);
        startActivity(intent);
    }

    public void m2 (View view)
    {
        Intent intent = new Intent (this,Magnif_Snakes.class);
        startActivity(intent);
    }

    public void m3 (View view)
    {
        Intent intent = new Intent (this,Magnif_Tug_Of_War.class);
        startActivity(intent);
    }

    public void m4 (View view)
    {
        Intent intent = new Intent (this,Magnif_Takeshis_Castle.class);
        startActivity(intent);
    }

    public void m5 (View view)
    {
        Intent intent = new Intent (this,Magnif_Treasure_Hunt.class);
        startActivity(intent);
    }

    public void m6 (View view)
    {
        Intent intent = new Intent (this,Magnif_Wheel_of_Dare.class);
        startActivity(intent);
    }

    public void m7 (View view)
    {
        Intent intent = new Intent (this,Magnif_Pyramid_Of_ITM.class);
        startActivity(intent);
    }

    public void m8 (View view)
    {
        Intent intent = new Intent (this,Magnif_Lakhati_Maro_Bottle_Pado.class);
        startActivity(intent);
    }

    public void m9 (View view)
    {
        Intent intent = new Intent (this,Magnif_Clean_The_Board.class);
        startActivity(intent);
    }

    public void m10 (View view)
    {
        Intent intent = new Intent (this,Magnif_Lit_The_Candle.class);
        startActivity(intent);
    }

    public void m11 (View view)
    {
        Intent intent = new Intent (this,Magnif_Great_Boss.class);
        startActivity(intent);
    }

    public void m12 (View view)
    {
        Intent intent = new Intent (this,Magnif_Quiz_Tactic.class);
        startActivity(intent);
    }

    public void m13 (View view)
    {
        Intent intent = new Intent (this,Magnif_Creative_Extempore.class);
        startActivity(intent);
    }

    public void m14 (View view)
    {
        Intent intent = new Intent (this,Magnif_Film_Making.class);
        startActivity(intent);
    }

    public void m15 (View view)
    {
        Intent intent = new Intent (this,Magnif_Wrist_Wrestling.class);
        startActivity(intent);
    }

    //Scifun

    public void s1 (View view)
    {
        Intent intent = new Intent (this,Scifun_Poster_Presentation.class);
        startActivity(intent);
    }

    public void s2 (View view)
    {
        Intent intent = new Intent (this,Scifun_Model_Making.class);
        startActivity(intent);
    }

    public void s3 (View view)
    {
        Intent intent = new Intent (this,Scifun_Painter_Paradise.class);
        startActivity(intent);
    }

    public void s4 (View view)
    {
        Intent intent = new Intent (this,Scifun_Clay_Modelling.class);
        startActivity(intent);
    }

    public void s5 (View view)
    {
        Intent intent = new Intent (this,Scifun_Card_Creation.class);
        startActivity(intent);
    }

    public void s6 (View view)
    {
        Intent intent = new Intent (this,Scifun_Object_Decor.class);
        startActivity(intent);
    }

    public void s7 (View view)
    {
        Intent intent = new Intent (this,Scifun_Quizard.class);
        startActivity(intent);
    }

    public void s8 (View view)
    {
        Intent intent = new Intent (this,Scifun_One_Minute_Games.class);
        startActivity(intent);
    }

    public void s9 (View view)
    {
        Intent intent = new Intent (this,Scifun_Best_Out_Of_Waste.class);
        startActivity(intent);
    }

    //Kalakriti

    public void k1 (View view)
    {
        Intent intent = new Intent (this,Kalakriti_Dancellenium.class);
        startActivity(intent);
    }

    public void k2 (View view)
    {
        Intent intent = new Intent (this,Kalakriti_Curtain_Up.class);
        startActivity(intent);
    }
    public void k3 (View view)
    {
        Intent intent = new Intent (this,Kalakriti_Sound_At_Sight_And_Unplugged.class);
        startActivity(intent);
    }
    public void k4 (View view)
    {
        Intent intent = new Intent (this,Kalakriti_Fashion_Fusion.class);
        startActivity(intent);
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
