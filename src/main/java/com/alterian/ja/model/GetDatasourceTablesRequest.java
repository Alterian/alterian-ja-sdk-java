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
import com.alterian.ja.model.APICursor;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * GetDatasourceTablesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GetDatasourceTablesRequest {
  public static final String SERIALIZED_NAME_CURSOR = "Cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private APICursor cursor;

  public static final String SERIALIZED_NAME_DATABASE_I_D = "DatabaseID";
  @SerializedName(SERIALIZED_NAME_DATABASE_I_D)
  private Integer databaseID;

  public static final String SERIALIZED_NAME_INCLUDE_DISABLED = "IncludeDisabled";
  @SerializedName(SERIALIZED_NAME_INCLUDE_DISABLED)
  private Boolean includeDisabled;

  public static final String SERIALIZED_NAME_INCLUDE_INVISIBLE = "IncludeInvisible";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INVISIBLE)
  private Boolean includeInvisible;

  public static final String SERIALIZED_NAME_INCLUDE_JOINS = "IncludeJoins";
  @SerializedName(SERIALIZED_NAME_INCLUDE_JOINS)
  private Boolean includeJoins;

  public static final String SERIALIZED_NAME_INCLUDE_LINKS = "IncludeLinks";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LINKS)
  private Boolean includeLinks;

  public static final String SERIALIZED_NAME_MINIMAL_RESULTS = "MinimalResults";
  @SerializedName(SERIALIZED_NAME_MINIMAL_RESULTS)
  private Boolean minimalResults;

  public static final String SERIALIZED_NAME_NAME_FILTER = "NameFilter";
  @SerializedName(SERIALIZED_NAME_NAME_FILTER)
  private String nameFilter;

  public static final String SERIALIZED_NAME_RESOLUTION_TABLE_I_D = "ResolutionTableID";
  @SerializedName(SERIALIZED_NAME_RESOLUTION_TABLE_I_D)
  private Integer resolutionTableID;

  public GetDatasourceTablesRequest() {
  }

  public GetDatasourceTablesRequest cursor(APICursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public APICursor getCursor() {
    return cursor;
  }

  public void setCursor(APICursor cursor) {
    this.cursor = cursor;
  }


  public GetDatasourceTablesRequest databaseID(Integer databaseID) {
    this.databaseID = databaseID;
    return this;
  }

   /**
   * Supply a database ID to filter the result to just the tables within this database. Ignore this parameter to fetch all tables, which can be slow.
   * @return databaseID
  **/
  @javax.annotation.Nullable
  public Integer getDatabaseID() {
    return databaseID;
  }

  public void setDatabaseID(Integer databaseID) {
    this.databaseID = databaseID;
  }


  public GetDatasourceTablesRequest includeDisabled(Boolean includeDisabled) {
    this.includeDisabled = includeDisabled;
    return this;
  }

   /**
   * Should disabled tables be included in the output?Default false
   * @return includeDisabled
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeDisabled() {
    return includeDisabled;
  }

  public void setIncludeDisabled(Boolean includeDisabled) {
    this.includeDisabled = includeDisabled;
  }


  public GetDatasourceTablesRequest includeInvisible(Boolean includeInvisible) {
    this.includeInvisible = includeInvisible;
    return this;
  }

   /**
   * Should invisible tables be included in the output? Default false
   * @return includeInvisible
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeInvisible() {
    return includeInvisible;
  }

  public void setIncludeInvisible(Boolean includeInvisible) {
    this.includeInvisible = includeInvisible;
  }


  public GetDatasourceTablesRequest includeJoins(Boolean includeJoins) {
    this.includeJoins = includeJoins;
    return this;
  }

   /**
   * Should joined table information be included in the output? Default false, as this can be large
   * @return includeJoins
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeJoins() {
    return includeJoins;
  }

  public void setIncludeJoins(Boolean includeJoins) {
    this.includeJoins = includeJoins;
  }


  public GetDatasourceTablesRequest includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * Should linked table information be included in the output? Default false, as this can be large
   * @return includeLinks
  **/
  @javax.annotation.Nullable
  public Boolean getIncludeLinks() {
    return includeLinks;
  }

  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }


  public GetDatasourceTablesRequest minimalResults(Boolean minimalResults) {
    this.minimalResults = minimalResults;
    return this;
  }

   /**
   * Exclude attributes, etc. from the results
   * @return minimalResults
  **/
  @javax.annotation.Nullable
  public Boolean getMinimalResults() {
    return minimalResults;
  }

  public void setMinimalResults(Boolean minimalResults) {
    this.minimalResults = minimalResults;
  }


  public GetDatasourceTablesRequest nameFilter(String nameFilter) {
    this.nameFilter = nameFilter;
    return this;
  }

   /**
   * Optionally filter on the name
   * @return nameFilter
  **/
  @javax.annotation.Nullable
  public String getNameFilter() {
    return nameFilter;
  }

  public void setNameFilter(String nameFilter) {
    this.nameFilter = nameFilter;
  }


  public GetDatasourceTablesRequest resolutionTableID(Integer resolutionTableID) {
    this.resolutionTableID = resolutionTableID;
    return this;
  }

   /**
   * Optionally filter to include only those results that can be directly resolved to the specified table (i.e those that are 1:1 or *:1 joined such that there is a maximum of one linked candidate row per resolution row
   * @return resolutionTableID
  **/
  @javax.annotation.Nullable
  public Integer getResolutionTableID() {
    return resolutionTableID;
  }

  public void setResolutionTableID(Integer resolutionTableID) {
    this.resolutionTableID = resolutionTableID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDatasourceTablesRequest getDatasourceTablesRequest = (GetDatasourceTablesRequest) o;
    return Objects.equals(this.cursor, getDatasourceTablesRequest.cursor) &&
        Objects.equals(this.databaseID, getDatasourceTablesRequest.databaseID) &&
        Objects.equals(this.includeDisabled, getDatasourceTablesRequest.includeDisabled) &&
        Objects.equals(this.includeInvisible, getDatasourceTablesRequest.includeInvisible) &&
        Objects.equals(this.includeJoins, getDatasourceTablesRequest.includeJoins) &&
        Objects.equals(this.includeLinks, getDatasourceTablesRequest.includeLinks) &&
        Objects.equals(this.minimalResults, getDatasourceTablesRequest.minimalResults) &&
        Objects.equals(this.nameFilter, getDatasourceTablesRequest.nameFilter) &&
        Objects.equals(this.resolutionTableID, getDatasourceTablesRequest.resolutionTableID);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, databaseID, includeDisabled, includeInvisible, includeJoins, includeLinks, minimalResults, nameFilter, resolutionTableID);
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
    sb.append("class GetDatasourceTablesRequest {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    databaseID: ").append(toIndentedString(databaseID)).append("\n");
    sb.append("    includeDisabled: ").append(toIndentedString(includeDisabled)).append("\n");
    sb.append("    includeInvisible: ").append(toIndentedString(includeInvisible)).append("\n");
    sb.append("    includeJoins: ").append(toIndentedString(includeJoins)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
    sb.append("    minimalResults: ").append(toIndentedString(minimalResults)).append("\n");
    sb.append("    nameFilter: ").append(toIndentedString(nameFilter)).append("\n");
    sb.append("    resolutionTableID: ").append(toIndentedString(resolutionTableID)).append("\n");
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
    openapiFields.add("Cursor");
    openapiFields.add("DatabaseID");
    openapiFields.add("IncludeDisabled");
    openapiFields.add("IncludeInvisible");
    openapiFields.add("IncludeJoins");
    openapiFields.add("IncludeLinks");
    openapiFields.add("MinimalResults");
    openapiFields.add("NameFilter");
    openapiFields.add("ResolutionTableID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetDatasourceTablesRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetDatasourceTablesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetDatasourceTablesRequest is not found in the empty JSON string", GetDatasourceTablesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetDatasourceTablesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetDatasourceTablesRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Cursor`
      if (jsonObj.get("Cursor") != null && !jsonObj.get("Cursor").isJsonNull()) {
        APICursor.validateJsonElement(jsonObj.get("Cursor"));
      }
      if ((jsonObj.get("NameFilter") != null && !jsonObj.get("NameFilter").isJsonNull()) && !jsonObj.get("NameFilter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NameFilter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NameFilter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetDatasourceTablesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetDatasourceTablesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetDatasourceTablesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetDatasourceTablesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetDatasourceTablesRequest>() {
           @Override
           public void write(JsonWriter out, GetDatasourceTablesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetDatasourceTablesRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetDatasourceTablesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetDatasourceTablesRequest
  * @throws IOException if the JSON string is invalid with respect to GetDatasourceTablesRequest
  */
  public static GetDatasourceTablesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetDatasourceTablesRequest.class);
  }

 /**
  * Convert an instance of GetDatasourceTablesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

