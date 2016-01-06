package me.randomusers;

import java.util.List;
import me.randomusers.model.*;

public class Responses {
  
  
    public static interface UserReponseResponse {
        public void onResponse(UserReponse userReponse);
    }
    public static interface UserReponseListResponse {
        public void onResponse(List<UserReponse> userReponseList);
    }
    
  
  
    public static interface UserResponse {
        public void onResponse(User user);
    }
    public static interface UserListResponse {
        public void onResponse(List<User> userList);
    }
    
  
  
    public static interface StructuredNameResponse {
        public void onResponse(StructuredName structuredName);
    }
    public static interface StructuredNameListResponse {
        public void onResponse(List<StructuredName> structuredNameList);
    }
    
  
  
    public static interface StructuredPostalResponse {
        public void onResponse(StructuredPostal structuredPostal);
    }
    public static interface StructuredPostalListResponse {
        public void onResponse(List<StructuredPostal> structuredPostalList);
    }
    
  
  
    public static interface StructuredPictureResponse {
        public void onResponse(StructuredPicture structuredPicture);
    }
    public static interface StructuredPictureListResponse {
        public void onResponse(List<StructuredPicture> structuredPictureList);
    }
    
  
    public static interface StringResponse {
        public void onResponse(String response);
    }

    public static interface StringListResponse {
        public void onResponse(List<String> stringList);
    }
}