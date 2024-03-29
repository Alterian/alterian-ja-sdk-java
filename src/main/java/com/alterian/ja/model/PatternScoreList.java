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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
public class PatternScoreList {
  public static final String SERIALIZED_NAME_ITEMS = "Items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<String> items;

  public static final String SERIALIZED_NAME_SCORES = "Scores";
  @SerializedName(SERIALIZED_NAME_SCORES)
  private List<Double> scores;

  public PatternScoreList() {
  }

  public PatternScoreList items(List<String> items) {
    this.items = items;
    return this;
  }

  public PatternScoreList addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @javax.annotation.Nullable
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }


  public PatternScoreList scores(List<Double> scores) {
    this.scores = scores;
    return this;
  }

  public PatternScoreList addScoresItem(Double scoresItem) {
    if (this.scores == null) {
      this.scores = new ArrayList<>();
    }
    this.scores.add(scoresItem);
    return this;
  }

   /**
   * 
   * @return scores
  **/
  @javax.annotation.Nullable
  public List<Double> getScores() {
    return scores;
  }

  public void setScores(List<Double> scores) {
    this.scores = scores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternScoreList patternScoreList = (PatternScoreList) o;
    return Objects.equals(this.items, patternScoreList.items) &&
        Objects.equals(this.scores, patternScoreList.scores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, scores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternScoreList {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    scores: ").append(toIndentedString(scores)).append("\n");
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
    openapiFields.add("Items");
    openapiFields.add("Scores");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PatternScoreList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PatternScoreList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatternScoreList is not found in the empty JSON string", PatternScoreList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PatternScoreList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatternScoreList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("Items") != null && !jsonObj.get("Items").isJsonNull() && !jsonObj.get("Items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Items` to be an array in the JSON string but got `%s`", jsonObj.get("Items").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Scores") != null && !jsonObj.get("Scores").isJsonNull() && !jsonObj.get("Scores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scores` to be an array in the JSON string but got `%s`", jsonObj.get("Scores").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatternScoreList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatternScoreList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatternScoreList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatternScoreList.class));

       return (TypeAdapter<T>) new TypeAdapter<PatternScoreList>() {
           @Override
           public void write(JsonWriter out, PatternScoreList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatternScoreList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatternScoreList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatternScoreList
  * @throws IOException if the JSON string is invalid with respect to PatternScoreList
  */
  public static PatternScoreList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatternScoreList.class);
  }

 /**
  * Convert an instance of PatternScoreList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

