package me.randomusers.model;

import me.randomusers.model.UserData;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class User  {
  
  @SerializedName("user")
  private UserData user = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public UserData getUser() {
    return user;
  }
  public void setUser(UserData user) {
    this.user = user;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


