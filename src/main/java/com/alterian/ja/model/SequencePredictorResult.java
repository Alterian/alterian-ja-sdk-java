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
public class SequencePredictorResult {
  public static final String SERIALIZED_NAME_PROCESS_QUEUE_ID = "ProcessQueueId";
  @SerializedName(SERIALIZED_NAME_PROCESS_QUEUE_ID)
  private Integer processQueueId;

  public static final String SERIALIZED_NAME_MODEL_ID = "ModelId";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private Integer modelId;

  public static final String SERIALIZED_NAME_ENGINE_MODEL_NAME = "EngineModelName";
  @SerializedName(SERIALIZED_NAME_ENGINE_MODEL_NAME)
  private String engineModelName;

  public static final String SERIALIZED_NAME_MODEL_STATUS = "ModelStatus";
  @SerializedName(SERIALIZED_NAME_MODEL_STATUS)
  private String modelStatus;

  public static final String SERIALIZED_NAME_TEST_ACCURACY = "TestAccuracy";
  @SerializedName(SERIALIZED_NAME_TEST_ACCURACY)
  private Double testAccuracy;

  public static final String SERIALIZED_NAME_TESTL_LOSS = "TestlLoss";
  @SerializedName(SERIALIZED_NAME_TESTL_LOSS)
  private Double testlLoss;

  public static final String SERIALIZED_NAME_PREDICTION_ID = "PredictionId";
  @SerializedName(SERIALIZED_NAME_PREDICTION_ID)
  private Integer predictionId;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "DataSourceId";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private Integer dataSourceId;

  public static final String SERIALIZED_NAME_DATABASE_NAME = "DatabaseName";
  @SerializedName(SERIALIZED_NAME_DATABASE_NAME)
  private String databaseName;

  public static final String SERIALIZED_NAME_TABLE_NAME = "TableName";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public SequencePredictorResult() {
  }

  public SequencePredictorResult processQueueId(Integer processQueueId) {
    this.processQueueId = processQueueId;
    return this;
  }

   /**
   * When run asynchronously this ID can be passed to GetProcessStatus to check for completion
   * @return processQueueId
  **/
  @javax.annotation.Nullable
  public Integer getProcessQueueId() {
    return processQueueId;
  }

  public void setProcessQueueId(Integer processQueueId) {
    this.processQueueId = processQueueId;
  }


  public SequencePredictorResult modelId(Integer modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * ID for generated Model
   * @return modelId
  **/
  @javax.annotation.Nullable
  public Integer getModelId() {
    return modelId;
  }

  public void setModelId(Integer modelId) {
    this.modelId = modelId;
  }


  public SequencePredictorResult engineModelName(String engineModelName) {
    this.engineModelName = engineModelName;
    return this;
  }

   /**
   * Name for generated Model in engine
   * @return engineModelName
  **/
  @javax.annotation.Nullable
  public String getEngineModelName() {
    return engineModelName;
  }

  public void setEngineModelName(String engineModelName) {
    this.engineModelName = engineModelName;
  }


  public SequencePredictorResult modelStatus(String modelStatus) {
    this.modelStatus = modelStatus;
    return this;
  }

   /**
   * XML summary of the results of the model build
   * @return modelStatus
  **/
  @javax.annotation.Nullable
  public String getModelStatus() {
    return modelStatus;
  }

  public void setModelStatus(String modelStatus) {
    this.modelStatus = modelStatus;
  }


  public SequencePredictorResult testAccuracy(Double testAccuracy) {
    this.testAccuracy = testAccuracy;
    return this;
  }

   /**
   * Final test accuracy stat
   * @return testAccuracy
  **/
  @javax.annotation.Nullable
  public Double getTestAccuracy() {
    return testAccuracy;
  }

  public void setTestAccuracy(Double testAccuracy) {
    this.testAccuracy = testAccuracy;
  }


  public SequencePredictorResult testlLoss(Double testlLoss) {
    this.testlLoss = testlLoss;
    return this;
  }

   /**
   * Final test loss stat
   * @return testlLoss
  **/
  @javax.annotation.Nullable
  public Double getTestlLoss() {
    return testlLoss;
  }

  public void setTestlLoss(Double testlLoss) {
    this.testlLoss = testlLoss;
  }


  public SequencePredictorResult predictionId(Integer predictionId) {
    this.predictionId = predictionId;
    return this;
  }

   /**
   * ID for generated prediction
   * @return predictionId
  **/
  @javax.annotation.Nullable
  public Integer getPredictionId() {
    return predictionId;
  }

  public void setPredictionId(Integer predictionId) {
    this.predictionId = predictionId;
  }


  public SequencePredictorResult dataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * Data source containing the prediction
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public SequencePredictorResult databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Database containing the prediction
   * @return databaseName
  **/
  @javax.annotation.Nullable
  public String getDatabaseName() {
    return databaseName;
  }

  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public SequencePredictorResult tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

   /**
   * Table containing the prediction
   * @return tableName
  **/
  @javax.annotation.Nullable
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SequencePredictorResult sequencePredictorResult = (SequencePredictorResult) o;
    return Objects.equals(this.processQueueId, sequencePredictorResult.processQueueId) &&
        Objects.equals(this.modelId, sequencePredictorResult.modelId) &&
        Objects.equals(this.engineModelName, sequencePredictorResult.engineModelName) &&
        Objects.equals(this.modelStatus, sequencePredictorResult.modelStatus) &&
        Objects.equals(this.testAccuracy, sequencePredictorResult.testAccuracy) &&
        Objects.equals(this.testlLoss, sequencePredictorResult.testlLoss) &&
        Objects.equals(this.predictionId, sequencePredictorResult.predictionId) &&
        Objects.equals(this.dataSourceId, sequencePredictorResult.dataSourceId) &&
        Objects.equals(this.databaseName, sequencePredictorResult.databaseName) &&
        Objects.equals(this.tableName, sequencePredictorResult.tableName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(processQueueId, modelId, engineModelName, modelStatus, testAccuracy, testlLoss, predictionId, dataSourceId, databaseName, tableName);
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
    sb.append("class SequencePredictorResult {\n");
    sb.append("    processQueueId: ").append(toIndentedString(processQueueId)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    engineModelName: ").append(toIndentedString(engineModelName)).append("\n");
    sb.append("    modelStatus: ").append(toIndentedString(modelStatus)).append("\n");
    sb.append("    testAccuracy: ").append(toIndentedString(testAccuracy)).append("\n");
    sb.append("    testlLoss: ").append(toIndentedString(testlLoss)).append("\n");
    sb.append("    predictionId: ").append(toIndentedString(predictionId)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
    openapiFields.add("ProcessQueueId");
    openapiFields.add("ModelId");
    openapiFields.add("EngineModelName");
    openapiFields.add("ModelStatus");
    openapiFields.add("TestAccuracy");
    openapiFields.add("TestlLoss");
    openapiFields.add("PredictionId");
    openapiFields.add("DataSourceId");
    openapiFields.add("DatabaseName");
    openapiFields.add("TableName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SequencePredictorResult
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SequencePredictorResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SequencePredictorResult is not found in the empty JSON string", SequencePredictorResult.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SequencePredictorResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SequencePredictorResult` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EngineModelName") != null && !jsonObj.get("EngineModelName").isJsonNull()) && !jsonObj.get("EngineModelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EngineModelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EngineModelName").toString()));
      }
      if ((jsonObj.get("ModelStatus") != null && !jsonObj.get("ModelStatus").isJsonNull()) && !jsonObj.get("ModelStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ModelStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ModelStatus").toString()));
      }
      if ((jsonObj.get("DatabaseName") != null && !jsonObj.get("DatabaseName").isJsonNull()) && !jsonObj.get("DatabaseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DatabaseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DatabaseName").toString()));
      }
      if ((jsonObj.get("TableName") != null && !jsonObj.get("TableName").isJsonNull()) && !jsonObj.get("TableName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TableName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TableName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SequencePredictorResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SequencePredictorResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SequencePredictorResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SequencePredictorResult.class));

       return (TypeAdapter<T>) new TypeAdapter<SequencePredictorResult>() {
           @Override
           public void write(JsonWriter out, SequencePredictorResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SequencePredictorResult read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SequencePredictorResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SequencePredictorResult
  * @throws IOException if the JSON string is invalid with respect to SequencePredictorResult
  */
  public static SequencePredictorResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SequencePredictorResult.class);
  }

 /**
  * Convert an instance of SequencePredictorResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
