package id.ac.unpas.profilku_173040028;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonProfile;
    Button buttonGallery;
    Button buttonContact;
    Button buttonSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeContent(ProfileFragment.newInstance(this));

        buttonProfile = (Button)findViewById(R.id.btn_profile);
        buttonGallery = (Button)findViewById(R.id.btn_gallery);
        buttonContact = (Button)findViewById(R.id.btn_contact);
        buttonSetting = (Button)findViewById(R.id.btn_setting);

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ProfileFragment.newInstance(MainActivity.this));
            }
        });

        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(GalleryFragment.newInstance(MainActivity.this));
            }
        });

        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(ContactFragment.newInstance(MainActivity.this));
            }
        });

        buttonSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeContent(SettingFragment.newInstance(MainActivity.this));
            }
        });

    }

    public void changeContent(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commitAllowingStateLoss();
    }
}
