package i.nonelab.shrimp.View.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import i.nonelab.shrimp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PelajaranFragment extends Fragment {


    public PelajaranFragment() {
        // Required empty public constructor
    }
    public static PelajaranFragment newInstance() {
        PelajaranFragment fragment = new PelajaranFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pelajaran, container, false);
    }

}
