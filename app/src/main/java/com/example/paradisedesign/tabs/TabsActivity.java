package com.example.paradisedesign.tabs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import android.os.Bundle;
import com.example.paradisedesign.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class TabsActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    String[] arrayOfTitles = {"Menu", "Companies", "E-smm", "Depo", "Workers",
            "Products and Services", "Fatura", "Mizan", "Banka", "Ithalat", "Menkul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);


        VPadapter vPadapter = new VPadapter(this);

        viewPager.setAdapter(vPadapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) ->
        tab.setText(arrayOfTitles[position])).attach();

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

    }
}

class VPadapter extends FragmentStateAdapter {

    private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitles = new ArrayList<>();

    public VPadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }


    public void addFragment(Fragment fragment, String title) {
        fragmentArrayList.add(fragment);
        fragmentTitles.add(title);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MenuTabFragment();
            case 1:
                return new CompaniesTabFragment();
            case 2:
                return new EsmmTabFragment();
            case 3:
                return new DepoTabFragment();
            case 4:
                return new WorkersTabFragment();
            case 5:
                return new ProductsTabFragment();
            case 6:
                return new FaturaTabFragment();
            case 7:
                return new MizanTabFragment();
            case 8:
                return new BankTabFragment();
            case 9:
                return new IthalatTabFragment();
            case 10:
                return new MenkulTabFragment();
        }
        return new MenuTabFragment();
    }

    @Override
    public int getItemCount() {
        return 11;
    }
}
