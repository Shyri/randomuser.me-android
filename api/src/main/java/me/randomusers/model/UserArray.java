package me.randomusers.model;

import java.util.*;
import me.randomusers.model.User;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class UserArray  {
  
  @SerializedName("results")
  private List<User> results = null;
  @SerializedName("nationality")
  private String nationality = null;
  @SerializedName("seed")
  private String seed = null;
  @SerializedName("version")
  private String version = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<User> getResults() {
    return results;
  }
  public void setResults(List<User> results) {
    this.results = results;
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
  public String getSeed() {
    return seed;
  }
  public void setSeed(String seed) {
    this.seed = seed;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserArray {\n");
    
    sb.append("  results: ").append(results).append("\n");
    sb.append("  nationality: ").append(nationality).append("\n");
    sb.append("  seed: ").append(seed).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


