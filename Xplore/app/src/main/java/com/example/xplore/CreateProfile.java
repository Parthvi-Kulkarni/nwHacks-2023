package com.example.xplore;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import com.example.xplore.databinding.ActivityCreateProfileBinding;

import org.json.JSONException;
import org.json.JSONObject;
public class CreateProfile extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCreateProfileBinding binding;
    EditText firstName = (EditText)findViewById(R.id.firstName);
    EditText lastName = (EditText)findViewById(R.id.lastName);
    EditText city= (EditText)findViewById(R.id.city);
    EditText age=(EditText)findViewById(R.id.date_of_birth);
    EditText university=(EditText)findViewById(R.id.University);
    EditText major=(EditText)findViewById(R.id.Major);
    EditText minor=(EditText)findViewById(R.id.Minor);
    EditText dietaryRestrictions=(EditText)findViewById(R.id.dietaryRestrictions);
    EditText interests=(EditText)findViewById(R.id.Interests);
    EditText year=(EditText)findViewById(R.id.Year);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCreateProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_create_profile);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        Button createProfileButton =this.findViewById(R.id.CreateProfileSubmit);
        createProfileButton.setOnClickListener(v->{
            try {
                this.createProfile();
            }
            catch(Exception e){
                int i=0;
            }
        });
    }

    private void createProfile() throws JSONException {
        RequestQueue queue = Volley.newRequestQueue(this);
        JSONObject profileParams = new JSONObject();
//        profileParams.put("userId",this.);
        profileParams.put("firstName", this.firstName.getText().toString());
        profileParams.put("lastName", this.lastName.toString());
        profileParams.put("age", this.age);
        profileParams.put("currentCity", this.city.toString());
        profileParams.put("university", this.university.toString());
        profileParams.put("year", this.year.toString());
        profileParams.put("major", this.major.toString());
        profileParams.put("minor", this.minor.toString());
        profileParams.put("interests", this.interests.toString());
        profileParams.put("dietaryRestrictions", this.dietaryRestrictions.toString());
        profileParams.put("question1", "Chill");
        profileParams.put("question2", "Active");
        profileParams.put("question3", "Active");
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_create_profile);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}