package me.randomusers.model;

import me.randomusers.model.StructuredName;
import me.randomusers.model.StructuredPicture;
import me.randomusers.model.StructuredPostal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class UserData  {
  
  @SerializedName("gender")
  private String gender = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("salt")
  private String salt = null;
  @SerializedName("md5")
  private String md5 = null;
  @SerializedName("sha1")
  private String sha1 = null;
  @SerializedName("sha256")
  private String sha256 = null;
  @SerializedName("registered")
  private String registered = null;
  @SerializedName("dob")
  private String dob = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("cell")
  private String cell = null;
  @SerializedName("DNI")
  private String DNI = null;
  @SerializedName("version")
  private String version = null;
  @SerializedName("nationality")
  private String nationality = null;
  @SerializedName("name")
  private StructuredName name = null;
  @SerializedName("location")
  private StructuredPostal location = null;
  @SerializedName("picture")
  private StructuredPicture picture = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSalt() {
    return salt;
  }
  public void setSalt(String salt) {
    this.salt = salt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSha1() {
    return sha1;
  }
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getSha256() {
    return sha256;
  }
  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getRegistered() {
    return registered;
  }
  public void setRegistered(String registered) {
    this.registered = registered;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCell() {
    return cell;
  }
  public void setCell(String cell) {
    this.cell = cell;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDNI() {
    return DNI;
  }
  public void setDNI(String DNI) {
    this.DNI = DNI;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNationality() {
    return nationality;
  }
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public StructuredName getName() {
    return name;
  }
  public void setName(StructuredName name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public StructuredPostal getLocation() {
    return location;
  }
  public void setLocation(StructuredPostal location) {
    this.location = location;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public StructuredPicture getPicture() {
    return picture;
  }
  public void setPicture(StructuredPicture picture) {
    this.picture = picture;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  salt: ").append(salt).append("\n");
    sb.append("  md5: ").append(md5).append("\n");
    sb.append("  sha1: ").append(sha1).append("\n");
    sb.append("  sha256: ").append(sha256).append("\n");
    sb.append("  registered: ").append(registered).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  cell: ").append(cell).append("\n");
    sb.append("  DNI: ").append(DNI).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  nationality: ").append(nationality).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  picture: ").append(picture).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


