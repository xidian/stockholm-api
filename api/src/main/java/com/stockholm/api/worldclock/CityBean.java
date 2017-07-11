package com.stockholm.api.worldclock;


import android.os.Parcel;
import android.os.Parcelable;

public class CityBean implements Parcelable {

    public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() {
        @Override
        public CityBean createFromParcel(Parcel source) {
            return new CityBean(source);
        }

        @Override
        public CityBean[] newArray(int size) {
            return new CityBean[size];
        }
    };

    private int id;
    private String cnname;
    private String enname;
    private String latitude;
    private String longitude;
    private String timezone;
    private String encountry;
    private String cncountry;

    public CityBean() {
    }

    protected CityBean(Parcel in) {
        this.id = in.readInt();
        this.cnname = in.readString();
        this.enname = in.readString();
        this.latitude = in.readString();
        this.longitude = in.readString();
        this.timezone = in.readString();
        this.encountry = in.readString();
        this.cncountry = in.readString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public String getEnname() {
        return enname;
    }

    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getEncountry() {
        return encountry;
    }

    public void setEncountry(String encountry) {
        this.encountry = encountry;
    }

    public String getCncountry() {
        return cncountry;
    }

    public void setCncountry(String cncountry) {
        this.cncountry = cncountry;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.cnname);
        dest.writeString(this.enname);
        dest.writeString(this.latitude);
        dest.writeString(this.longitude);
        dest.writeString(this.timezone);
        dest.writeString(this.encountry);
        dest.writeString(this.cncountry);
    }

}