package i.nonelab.shrimp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.security.SecureRandom;

import i.nonelab.shrimp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StatistikFragment extends Fragment {


    public StatistikFragment() {
        // Required empty public constructor
    }
    public static StatistikFragment newInstance() {
        StatistikFragment fragment = new StatistikFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_statistik, container, false);
    }

}
