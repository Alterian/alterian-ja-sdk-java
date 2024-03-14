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
 * 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class APILastModifiedCursor {
  public static final String SERIALIZED_NAME_LAST_MODIFIED = "LastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private OffsetDateTime lastModified;

  public static final String SERIALIZED_NAME_FROM = "From";
  @SerializedName(SERIALIZED_NAME_FROM)
  private Integer from;

  public static final String SERIALIZED_NAME_TO = "To";
  @SerializedName(SERIALIZED_NAME_TO)
  private Integer to;

  public static final String SERIALIZED_NAME_TOTAL = "Total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_SORT_DESCENDING = "SortDescending";
  @SerializedName(SERIALIZED_NAME_SORT_DESCENDING)
  private Boolean sortDescending;

  public static final String SERIALIZED_NAME_SORT_PROPERTY = "SortProperty";
  @SerializedName(SERIALIZED_NAME_SORT_PROPERTY)
  private String sortProperty;

  public APILastModifiedCursor() {
  }

  public APILastModifiedCursor lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Indicates when the data structure last changed
   * @return lastModified
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }


  public APILastModifiedCursor from(Integer from) {
    this.from = from;
    return this;
  }

   /**
   * What is the first result that should be returned? Note that this is 0-based (0 is the very first row). If this value is not supplied then 0 is assumed.
   * @return from
  **/
  @javax.annotation.Nullable
  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }


  public APILastModifiedCursor to(Integer to) {
    this.to = to;
    return this;
  }

   /**
   * What is the last result that should be returned? If this value is not supplied then all results are assumed. It is safe to provide a number that is larger than the total number of results.             available.
   * @return to
  **/
  @javax.annotation.Nullable
  public Integer getTo() {
    return to;
  }

  public void setTo(Integer to) {
    this.to = to;
  }


  public APILastModifiedCursor total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * How many results are available in total? This is not used when passing the cursor to a method; it is populated (read only) when the cursor is returned from any method that uses a cursor.
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  public APILastModifiedCursor sortDescending(Boolean sortDescending) {
    this.sortDescending = sortDescending;
    return this;
  }

   /**
   * If we want to sort the resulting list, do we want it sorted in descending order?  The default is ascending.
   * @return sortDescending
  **/
  @javax.annotation.Nullable
  public Boolean getSortDescending() {
    return sortDescending;
  }

  public void setSortDescending(Boolean sortDescending) {
    this.sortDescending = sortDescending;
  }


  public APILastModifiedCursor sortProperty(String sortProperty) {
    this.sortProperty = sortProperty;
    return this;
  }

   /**
   * Property on the object by which you would like to sort.  If an invalid or null property is provided, default sorting will be applied as defined in each API method.
   * @return sortProperty
  **/
  @javax.annotation.Nullable
  public String getSortProperty() {
    return sortProperty;
  }

  public void setSortProperty(String sortProperty) {
    this.sortProperty = sortProperty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APILastModifiedCursor apILastModifiedCursor = (APILastModifiedCursor) o;
    return Objects.equals(this.lastModified, apILastModifiedCursor.lastModified) &&
        Objects.equals(this.from, apILastModifiedCursor.from) &&
        Objects.equals(this.to, apILastModifiedCursor.to) &&
        Objects.equals(this.total, apILastModifiedCursor.total) &&
        Objects.equals(this.sortDescending, apILastModifiedCursor.sortDescending) &&
        Objects.equals(this.sortProperty, apILastModifiedCursor.sortProperty);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, from, to, total, sortDescending, sortProperty);
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
    sb.append("class APILastModifiedCursor {\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    sortDescending: ").append(toIndentedString(sortDescending)).append("\n");
    sb.append("    sortProperty: ").append(toIndentedString(sortProperty)).append("\n");
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
    openapiFields.add("LastModified");
    openapiFields.add("From");
    openapiFields.add("To");
    openapiFields.add("Total");
    openapiFields.add("SortDescending");
    openapiFields.add("SortProperty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to APILastModifiedCursor
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!APILastModifiedCursor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APILastModifiedCursor is not found in the empty JSON string", APILastModifiedCursor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!APILastModifiedCursor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APILastModifiedCursor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("SortProperty") != null && !jsonObj.get("SortProperty").isJsonNull()) && !jsonObj.get("SortProperty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SortProperty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SortProperty").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APILastModifiedCursor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APILastModifiedCursor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APILastModifiedCursor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APILastModifiedCursor.class));

       return (TypeAdapter<T>) new TypeAdapter<APILastModifiedCursor>() {
           @Override
           public void write(JsonWriter out, APILastModifiedCursor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APILastModifiedCursor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APILastModifiedCursor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APILastModifiedCursor
  * @throws IOException if the JSON string is invalid with respect to APILastModifiedCursor
  */
  public static APILastModifiedCursor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APILastModifiedCursor.class);
  }

 /**
  * Convert an instance of APILastModifiedCursor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

