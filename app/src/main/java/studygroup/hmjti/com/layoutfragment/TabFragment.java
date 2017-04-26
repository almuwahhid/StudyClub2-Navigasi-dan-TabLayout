package studygroup.hmjti.com.layoutfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class TabFragment extends AppCompatActivity {

    TabLayout tl;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_fragment);
        tl = (TabLayout) findViewById(R.id.tab_layout);
        vp = (ViewPager) findViewById(R.id.pager);

        vp.setAdapter(new Adapterku(getSupportFragmentManager()));
        tl.setupWithViewPager(vp);
        tl.setSelectedTabIndicatorColor(getResources().getColor(android.R.color.holo_red_dark));
        tl.setTabGravity(TabLayout.GRAVITY_FILL);
        tl.getTabAt(0).setIcon(R.drawable.home);
        tl.getTabAt(1).setIcon(R.drawable.about);

//        getActionBar().setDisplayHomeAsUpEnabled(true);
//        getActionBar().setTitle("Halaman Tab Layout");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    class Adapterku extends FragmentPagerAdapter{

        public Adapterku(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return new Home();
            }else if(position==1){
                return new About();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
