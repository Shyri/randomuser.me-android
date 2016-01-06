package me.randomusers.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class StructuredPostal  {
  
  @SerializedName("street")
  private String street = null;
  @SerializedName("city")
  private String city = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("zip")
  private String zip = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPostal {\n");
    
    sb.append("  street: ").append(street).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


