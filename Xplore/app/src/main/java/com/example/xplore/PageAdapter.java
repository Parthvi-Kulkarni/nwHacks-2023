package com.example.xplore;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    int numCount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numCount = numCount;
    }

    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Bali bali = new Bali();
                return bali;
            case 1:
                Peru peru = new Peru();
                return peru;
            case 2:
                Napes napes = new Napes();
                return napes;
            case 3:
                Tulum tulum = new Tulum();
                return tulum;
            case 4:
                Budapest budapest = new Budapest();
                return budapest;
            case 5:
                KualaLampur kualaLampur = new KualaLampur();
                return kualaLampur;
            case 6:
                Barcelona barcelona = new Barcelona();
                return barcelona;
        }
        return null;
    }

    @Override
    public int getCount() {
        return numCount;
    }
}
