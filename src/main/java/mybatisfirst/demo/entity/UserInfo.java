package mybatisfirst.demo.entity;

import java.sql.Timestamp;

/**
 *
 */
public class UserInfo {
    private String openId;
    private String nickName;
    private String avatarUrl;
    private int genger;
    private String province;
    private String city;
    private String country;
    private Timestamp creatTime;
    private Timestamp modifiedTime;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getGenger() {
        return genger;
    }

    public void setGenger(int genger) {
        this.genger = genger;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Timestamp creatTime) {
        this.creatTime = creatTime;
    }

    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "openId='" + openId + '\'' +
                ", nickName='" + nickName + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", genger=" + genger +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", creatTime=" + creatTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }

    public UserInfo(String openId, String nickName, String avatarUrl, int genger, String province, String city, String country, Timestamp creatTime) {
        this.openId = openId;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.genger = genger;
        this.province = province;
        this.city = city;
        this.country = country;
        this.creatTime = creatTime;
    }
}
