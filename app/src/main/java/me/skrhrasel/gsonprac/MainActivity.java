package me.skrhrasel.gsonprac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
/*
        Address address = new Address("Bangladesh","Dhaka");

        List<FamilyMember>family = new ArrayList<>();
        family.add(new FamilyMember("Wife","22"));
        family.add(new FamilyMember("Daughter","4"));

        Employee employee = new Employee("Rasel",26,"rasel@gmail.com",address,family);
        String json = gson.toJson(family);

  //      String json = "{\"age\":26,\"firstName\":\"Rasel\",\"mail\":\"rasel@gmail.com\"}";

*/
        //String json = "{\"address\":{\"city\":\"Dhaka\",\"country\":\"Bangladesh\"},\"age\":26,\"family\":[{\"age\":\"22\",\"role\":\"Wife\"},{\"age\":\"4\",\"role\":\"Daughter\"}],\"first_name\":\"Rasel\",\"mail\":\"rasel@gmail.com\"}";
        //Employee employee = gson.fromJson(json,Employee.class);


        String json ="[{\"age\":\"22\",\"role\":\"Wife\"},{\"age\":\"4\",\"role\":\"Daughter\"}]";

        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        ArrayList<FamilyMember> family = gson.fromJson(json,familyType);

        //FamilyMember[] family = gson.fromJson(json,FamilyMember[].class);



    }
}
