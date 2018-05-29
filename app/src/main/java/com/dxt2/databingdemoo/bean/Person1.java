package com.dxt2.databingdemoo.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/5/29 0029.
 */

public class Person1{

//以下变量会自动触发值改变事件，使用 get 和 set 来访问
    private ObservableField<String> name = new ObservableField<>();
    private ObservableField<String> gender = new ObservableField<>();
    private ObservableInt age = new ObservableInt();
    private ObservableBoolean isVip = new ObservableBoolean();
    private ObservableField<String> icon = new ObservableField<>();

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public void setGender(ObservableField<String> gender) {
        this.gender = gender;
    }

    public void setAge(ObservableInt age) {
        this.age = age;
    }

    public void setIsVip(ObservableBoolean isVip) {
        this.isVip = isVip;
    }

    public void setIcon(ObservableField<String> icon) {
        this.icon = icon;
    }

    public ObservableField<String> getName() {
        return name;
    }

    public ObservableField<String> getGender() {
        return gender;
    }

    public ObservableInt getAge() {
        return age;
    }

    public ObservableBoolean getIsVip() {
        return isVip;
    }

    public ObservableField<String> getIcon() {
        return icon;
    }
    public void clickName(View view) {
        name.set("点击了"+name.get());
        Toast.makeText(view.getContext(), "用户名：" +name.get(), Toast.LENGTH_LONG).show();

    }
}
