package me.randomusers.api;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.randomusers.ApiException;
import me.randomusers.ApiInvoker;
import me.randomusers.Pair;
import me.randomusers.model.UserArray;


public class UserApi {
  String basePath = "http://api.randomuser.me/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * 
   * Ask for a randomly generated user
   * @param format Format of response you want. Possible values JSON, SQL, CSV, or YAML.
   * @param seed Seeds allow you to always generate the same set of users.
   * @param nat Specify a nationality. i.e. gb
   * @param results Specify a nationality. i.e. gb
   * @return UserArray
   */
  public void getRandomUser (String format, String seed, String nat, BigDecimal results, final Response.Listener<UserArray> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "format", format));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "seed", seed));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nat", nat));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "results", results));
    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String response) {
            
            try {
              responseListener.onResponse((UserArray) ApiInvoker.deserialize(response,  "", UserArray.class));
              
              
            
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
            
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  
}

