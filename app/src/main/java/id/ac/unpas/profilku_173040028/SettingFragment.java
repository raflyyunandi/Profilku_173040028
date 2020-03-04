package id.ac.unpas.profilku_173040028;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

public class SettingFragment extends Fragment {
    public static MainActivity mainActivity;

    Button btn_logout;

    public static Fragment newInstance(MainActivity activity) {
        mainActivity = activity;
        return new SettingFragment();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        View view = inflater.from(mainActivity).inflate(R.layout.fragment_setting, container, false);
        return view;
    }
}
