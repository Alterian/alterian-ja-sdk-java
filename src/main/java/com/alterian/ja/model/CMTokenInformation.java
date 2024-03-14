/*
 * Journey Analytics API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 6.35.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.ja.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alterian.ja.JSON;

/**
 * Definition of a token for the CM system.  A token is a GUID which is passed to ALL calls into CM and this token typically has a @see(ALUser) assigned to it to enforce permissions.  Some methods require an SA [system admin] token to call.             Those calls which have permissions MUST have a user token provided.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CMTokenInformation {
  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_LOGIN_I_D = "LoginID";
  @SerializedName(SERIALIZED_NAME_LOGIN_I_D)
  private UUID loginID;

  public static final String SERIALIZED_NAME_TOKEN = "Token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private UUID token;

  public static final String SERIALIZED_NAME_TIMEZONE_I_D = "TimezoneID";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_I_D)
  private Integer timezoneID;

  public static final String SERIALIZED_NAME_USER_I_D = "UserID";
  @SerializedName(SERIALIZED_NAME_USER_I_D)
  private Integer userID;

  public static final String SERIALIZED_NAME_CLIENT_I_D = "ClientID";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private Integer clientID;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "LastActivity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CULTURE = "Culture";
  @SerializedName(SERIALIZED_NAME_CULTURE)
  private String culture;

  public static final String SERIALIZED_NAME_IS_STATIC = "IsStatic";
  @SerializedName(SERIALIZED_NAME_IS_STATIC)
  private Boolean isStatic;

  public static final String SERIALIZED_NAME_IS_S_ATOKEN = "IsSAtoken";
  @SerializedName(SERIALIZED_NAME_IS_S_ATOKEN)
  private Boolean isSAtoken;

  public CMTokenInformation() {
  }

  public CMTokenInformation ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Internal ID of the token
   * @return ID
  **/
  @javax.annotation.Nullable
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }


  public CMTokenInformation loginID(UUID loginID) {
    this.loginID = loginID;
    return this;
  }

   /**
   * Authentication system&#39;s login ID for this token [if applicable]
   * @return loginID
  **/
  @javax.annotation.Nullable
  public UUID getLoginID() {
    return loginID;
  }

  public void setLoginID(UUID loginID) {
    this.loginID = loginID;
  }


  public CMTokenInformation token(UUID token) {
    this.token = token;
    return this;
  }

   /**
   * Actual GUID of the token.  This is what you would use to pass to API methods.
   * @return token
  **/
  @javax.annotation.Nullable
  public UUID getToken() {
    return token;
  }

  public void setToken(UUID token) {
    this.token = token;
  }


  public CMTokenInformation timezoneID(Integer timezoneID) {
    this.timezoneID = timezoneID;
    return this;
  }

   /**
   * Timezone of the user associated with this token
   * @return timezoneID
  **/
  @javax.annotation.Nullable
  public Integer getTimezoneID() {
    return timezoneID;
  }

  public void setTimezoneID(Integer timezoneID) {
    this.timezoneID = timezoneID;
  }


  public CMTokenInformation userID(Integer userID) {
    this.userID = userID;
    return this;
  }

   /**
   * User associated with this token
   * @return userID
  **/
  @javax.annotation.Nullable
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }


  public CMTokenInformation clientID(Integer clientID) {
    this.clientID = clientID;
    return this;
  }

   /**
   * Client associated with this token
   * @return clientID
  **/
  @javax.annotation.Nullable
  public Integer getClientID() {
    return clientID;
  }

  public void setClientID(Integer clientID) {
    this.clientID = clientID;
  }


  public CMTokenInformation lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Last time this token was actually used for something
   * @return lastActivity
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }


  public CMTokenInformation created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * When this token was created
   * @return created
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public CMTokenInformation culture(String culture) {
    this.culture = culture;
    return this;
  }

   /**
   * The culture of the user associated with this token
   * @return culture
  **/
  @javax.annotation.Nullable
  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }


  public CMTokenInformation isStatic(Boolean isStatic) {
    this.isStatic = isStatic;
    return this;
  }

   /**
   * Is this token a static token?  If so, it won&#39;t be purged as part of the normal purge process
   * @return isStatic
  **/
  @javax.annotation.Nullable
  public Boolean getIsStatic() {
    return isStatic;
  }

  public void setIsStatic(Boolean isStatic) {
    this.isStatic = isStatic;
  }


  public CMTokenInformation isSAtoken(Boolean isSAtoken) {
    this.isSAtoken = isSAtoken;
    return this;
  }

   /**
   * Is this an SA token?  If so, it will have access to more system admin functions.
   * @return isSAtoken
  **/
  @javax.annotation.Nullable
  public Boolean getIsSAtoken() {
    return isSAtoken;
  }

  public void setIsSAtoken(Boolean isSAtoken) {
    this.isSAtoken = isSAtoken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CMTokenInformation cmTokenInformation = (CMTokenInformation) o;
    return Objects.equals(this.ID, cmTokenInformation.ID) &&
        Objects.equals(this.loginID, cmTokenInformation.loginID) &&
        Objects.equals(this.token, cmTokenInformation.token) &&
        Objects.equals(this.timezoneID, cmTokenInformation.timezoneID) &&
        Objects.equals(this.userID, cmTokenInformation.userID) &&
        Objects.equals(this.clientID, cmTokenInformation.clientID) &&
        Objects.equals(this.lastActivity, cmTokenInformation.lastActivity) &&
        Objects.equals(this.created, cmTokenInformation.created) &&
        Objects.equals(this.culture, cmTokenInformation.culture) &&
        Objects.equals(this.isStatic, cmTokenInformation.isStatic) &&
        Objects.equals(this.isSAtoken, cmTokenInformation.isSAtoken);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, loginID, token, timezoneID, userID, clientID, lastActivity, created, culture, isStatic, isSAtoken);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CMTokenInformation {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    loginID: ").append(toIndentedString(loginID)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    timezoneID: ").append(toIndentedString(timezoneID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    culture: ").append(toIndentedString(culture)).append("\n");
    sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
    sb.append("    isSAtoken: ").append(toIndentedString(isSAtoken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ID");
    openapiFields.add("LoginID");
    openapiFields.add("Token");
    openapiFields.add("TimezoneID");
    openapiFields.add("UserID");
    openapiFields.add("ClientID");
    openapiFields.add("LastActivity");
    openapiFields.add("Created");
    openapiFields.add("Culture");
    openapiFields.add("IsStatic");
    openapiFields.add("IsSAtoken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CMTokenInformation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CMTokenInformation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CMTokenInformation is not found in the empty JSON string", CMTokenInformation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CMTokenInformation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CMTokenInformation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("LoginID") != null && !jsonObj.get("LoginID").isJsonNull()) && !jsonObj.get("LoginID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoginID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LoginID").toString()));
      }
      if ((jsonObj.get("Token") != null && !jsonObj.get("Token").isJsonNull()) && !jsonObj.get("Token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Token").toString()));
      }
      if ((jsonObj.get("Culture") != null && !jsonObj.get("Culture").isJsonNull()) && !jsonObj.get("Culture").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Culture` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Culture").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CMTokenInformation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CMTokenInformation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CMTokenInformation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CMTokenInformation.class));

       return (TypeAdapter<T>) new TypeAdapter<CMTokenInformation>() {
           @Override
           public void write(JsonWriter out, CMTokenInformation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CMTokenInformation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CMTokenInformation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CMTokenInformation
  * @throws IOException if the JSON string is invalid with respect to CMTokenInformation
  */
  public static CMTokenInformation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CMTokenInformation.class);
  }

 /**
  * Convert an instance of CMTokenInformation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

