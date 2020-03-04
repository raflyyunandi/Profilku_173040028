package id.ac.unpas.profilku_173040028;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment{
    public static MainActivity mainActivity;

    public static Fragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new ProfileFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        View view = inflater.from(mainActivity).inflate(R.layout.fragment_profile, container, false);
        return view;
    }
}
