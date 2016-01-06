package me.randomusers.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class StructuredName  {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("first")
  private String first = null;
  @SerializedName("last")
  private String last = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirst() {
    return first;
  }
  public void setFirst(String first) {
    this.first = first;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLast() {
    return last;
  }
  public void setLast(String last) {
    this.last = last;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredName {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  first: ").append(first).append("\n");
    sb.append("  last: ").append(last).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


