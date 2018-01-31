package com.stockholm.api.account.customization;


import android.os.Parcel;
import android.os.Parcelable;

public class CustomizationBean implements Parcelable {

    private int location = -1;
    private int haveChildren = -1;
    private int tailPlateNumber = -1;
    private int sex = -1;
    private int age = -1;

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getHaveChildren() {
        return haveChildren;
    }

    public void setHaveChildren(int haveChildren) {
        this.haveChildren = haveChildren;
    }

    public int getTailPlateNumber() {
        return tailPlateNumber;
    }

    public void setTailPlateNumber(int tailPlateNumber) {
        this.tailPlateNumber = tailPlateNumber;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.location);
        dest.writeInt(this.haveChildren);
        dest.writeInt(this.tailPlateNumber);
        dest.writeInt(this.sex);
        dest.writeInt(this.age);
    }

    public CustomizationBean() {
    }

    protected CustomizationBean(Parcel in) {
        this.location = in.readInt();
        this.haveChildren = in.readInt();
        this.tailPlateNumber = in.readInt();
        this.sex = in.readInt();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<CustomizationBean> CREATOR = new Parcelable.Creator<CustomizationBean>() {
        @Override
        public CustomizationBean createFromParcel(Parcel source) {
            return new CustomizationBean(source);
        }

        @Override
        public CustomizationBean[] newArray(int size) {
            return new CustomizationBean[size];
        }
    };

}