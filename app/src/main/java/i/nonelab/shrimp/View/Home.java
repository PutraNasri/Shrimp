package i.nonelab.shrimp.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import i.nonelab.shrimp.R;
import i.nonelab.shrimp.View.Fragment.BerandaFragment;
import i.nonelab.shrimp.View.Fragment.LaporanFragment;
import i.nonelab.shrimp.View.Fragment.PelajaranFragment;
import i.nonelab.shrimp.View.Fragment.ProfileFragment;
import i.nonelab.shrimp.View.Fragment.StatistikFragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Home extends AppCompatActivity {

    private ViewPager view_pager;
    private SectionsPagerAdapter viewPagerAdapter;
    private BottomNavigationView navigation;
    private View search_bar;
    MenuItem prevMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initComponent();
    }

    private void initComponent() {
        view_pager = (ViewPager) findViewById(R.id.view_pager);
        search_bar = (View) findViewById(R.id.search_bar);
     //   mTextMessage = (TextView) findViewById(R.id.search_text);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        setupViewPager(view_pager);


        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                   //     mTextMessage.setText(item.getTitle());
                        view_pager.setCurrentItem(0);
                        return true;
                    case R.id.pelajaran:
                    //    mTextMessage.setText(item.getTitle());
                        view_pager.setCurrentItem(1);
                        return true;
                    case R.id.laporan:
                        //     mTextMessage.setText(item.getTitle());
                        view_pager.setCurrentItem(2);
                        return true;
                    case R.id.statistik:
                        //     mTextMessage.setText(item.getTitle());
                        view_pager.setCurrentItem(3);
                        return true;
                    case R.id.profile:
                        //     mTextMessage.setText(item.getTitle());
                        view_pager.setCurrentItem(4);
                        return true;
                }
                return false;
            }
        });

        view_pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
            if (prevMenu != null)
                prevMenu.setChecked(false);

            else
                navigation.getMenu().getItem(0).setChecked(false);
            navigation.getMenu().getItem(i).setChecked(true);
            prevMenu=navigation.getMenu().getItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    private void setupViewPager(ViewPager viewPager) {
        viewPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(BerandaFragment.newInstance(), "Beranda");    // index 0
        viewPagerAdapter.addFragment(PelajaranFragment.newInstance(),"Pelajaran");   // index 1
        viewPagerAdapter.addFragment(LaporanFragment.newInstance(),"Laporan");    // index 2
        viewPagerAdapter.addFragment(StatistikFragment.newInstance(),"Statistik");    // index 3
        viewPagerAdapter.addFragment(ProfileFragment.newInstance(),"Proile");    // index 4

        viewPager.setAdapter(viewPagerAdapter);
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager manager) {
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
}
