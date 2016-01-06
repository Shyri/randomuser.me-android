package me.randomusers.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class StructuredPicture  {
  
  @SerializedName("large")
  private String large = null;
  @SerializedName("medium")
  private String medium = null;
  @SerializedName("thumbnail")
  private String thumbnail = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLarge() {
    return large;
  }
  public void setLarge(String large) {
    this.large = large;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMedium() {
    return medium;
  }
  public void setMedium(String medium) {
    this.medium = medium;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getThumbnail() {
    return thumbnail;
  }
  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredPicture {\n");
    
    sb.append("  large: ").append(large).append("\n");
    sb.append("  medium: ").append(medium).append("\n");
    sb.append("  thumbnail: ").append(thumbnail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


