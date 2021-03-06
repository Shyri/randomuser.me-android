package me.randomusers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import me.randomusers.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("UserArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserArray>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("UserData".equalsIgnoreCase(className)) {
      return new TypeToken<List<UserData>>(){}.getType();
    }
    
    if ("StructuredName".equalsIgnoreCase(className)) {
      return new TypeToken<List<StructuredName>>(){}.getType();
    }
    
    if ("StructuredPostal".equalsIgnoreCase(className)) {
      return new TypeToken<List<StructuredPostal>>(){}.getType();
    }
    
    if ("StructuredPicture".equalsIgnoreCase(className)) {
      return new TypeToken<List<StructuredPicture>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("UserArray".equalsIgnoreCase(className)) {
      return new TypeToken<UserArray>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("UserData".equalsIgnoreCase(className)) {
      return new TypeToken<UserData>(){}.getType();
    }
    
    if ("StructuredName".equalsIgnoreCase(className)) {
      return new TypeToken<StructuredName>(){}.getType();
    }
    
    if ("StructuredPostal".equalsIgnoreCase(className)) {
      return new TypeToken<StructuredPostal>(){}.getType();
    }
    
    if ("StructuredPicture".equalsIgnoreCase(className)) {
      return new TypeToken<StructuredPicture>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
