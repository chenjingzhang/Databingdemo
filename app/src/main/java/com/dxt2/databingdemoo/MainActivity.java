package com.dxt2.databingdemoo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dxt2.databingdemoo.bean.Person;
import com.dxt2.databingdemoo.bean.Person1;
import com.dxt2.databingdemoo.databinding.ActivityMainBinding;
import com.dxt2.databingdemoo.fragment.ContentFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.layout_container,new ContentFragment()).commit();

        Person1 person1=new Person1();
        ObservableField<String> field =new ObservableField<>();
        field.set("萌萌哒");
        person1.setName(field);
        activityMainBinding.setPerson1(person1);


        List<Person> list = new ArrayList<>();
        Person p = new Person();
        p.setName("a");
        p.setGender("wm");
        p.setVip(true);
        p.setIcon("http://pic53.nipic.com/file/20141122/19938643_092524538424_2.jpg");
        list.add(p);

        Person p1 =new Person();
        p1.setName("b");
        p1.setGender("m");
        p1.setVip(false);
        p1.setIcon("http://img3.redocn.com/tupian/20151015/dongmankatongxiangrikuinvhai_5095902.jpg");
        list.add(p1);
        activityMainBinding.setPersons(list);
    }
}
