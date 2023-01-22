package com.example.xplore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.xplore.databinding.ActivityCreateProfileBinding;

import org.json.JSONException;
import org.json.JSONObject;
public class CreateProfile extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCreateProfileBinding binding;
    EditText firstName;
    EditText lastName;
    EditText city;
    EditText age;
    EditText university;
    EditText major;
    EditText minor;
    EditText dietaryRestrictions;
    EditText interests;
    EditText year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_create_profile);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        this.firstName = (EditText)findViewById(R.id.firstName);
        this.lastName = (EditText)findViewById(R.id.lastName);
        this.city= (EditText)findViewById(R.id.city);
        this.age=(EditText)findViewById(R.id.date_of_birth);
        this.university=(EditText)findViewById(R.id.University);
        this.major=(EditText)findViewById(R.id.Major);
        this.minor=(EditText)findViewById(R.id.Minor);
        this.dietaryRestrictions=(EditText)findViewById(R.id.dietaryRestrictions);
        this.interests=(EditText)findViewById(R.id.Interests);
        this.year=(EditText)findViewById(R.id.Year);
        Button createProfileButton =this.findViewById(R.id.CreateProfileSubmit);
        createProfileButton.setOnClickListener(v->{
            try {
                this.createProfile();
                Intent intent = new Intent(CreateProfile.this, MainActivity.class);
                startActivity(intent);
            }
            catch(Exception e){
                int i=0;
            }
        });
    }

    private void createProfile() throws JSONException {
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