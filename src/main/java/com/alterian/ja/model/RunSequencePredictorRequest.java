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
import com.alterian.ja.model.ModelSnapshotOptions;
import com.alterian.ja.model.SequencePredictorPredictionOptions;
import com.alterian.ja.model.SequencePredictorTrainingOptions;
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
 * RunSequencePredictorRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RunSequencePredictorRequest {
  public static final String SERIALIZED_NAME_EVENT_STREAM_ID = "EventStreamId";
  @SerializedName(SERIALIZED_NAME_EVENT_STREAM_ID)
  private Integer eventStreamId;

  public static final String SERIALIZED_NAME_IS_PUBLIC = "IsPublic";
  @SerializedName(SERIALIZED_NAME_IS_PUBLIC)
  private Boolean isPublic;

  public static final String SERIALIZED_NAME_IS_SYNCHRONOUS = "IsSynchronous";
  @SerializedName(SERIALIZED_NAME_IS_SYNCHRONOUS)
  private Boolean isSynchronous;

  public static final String SERIALIZED_NAME_MODEL_ID = "ModelId";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private Integer modelId;

  public static final String SERIALIZED_NAME_PREDICTION_OPTIONS = "PredictionOptions";
  @SerializedName(SERIALIZED_NAME_PREDICTION_OPTIONS)
  private SequencePredictorPredictionOptions predictionOptions;

  public static final String SERIALIZED_NAME_PREDICTION_SNAPSHOT_OPTIONS = "PredictionSnapshotOptions";
  @SerializedName(SERIALIZED_NAME_PREDICTION_SNAPSHOT_OPTIONS)
  private ModelSnapshotOptions predictionSnapshotOptions;

  public static final String SERIALIZED_NAME_TRAINING_OPTIONS = "TrainingOptions";
  @SerializedName(SERIALIZED_NAME_TRAINING_OPTIONS)
  private SequencePredictorTrainingOptions trainingOptions;

  public static final String SERIALIZED_NAME_TRAINING_SNAPSHOT_OPTIONS = "TrainingSnapshotOptions";
  @SerializedName(SERIALIZED_NAME_TRAINING_SNAPSHOT_OPTIONS)
  private ModelSnapshotOptions trainingSnapshotOptions;

  public RunSequencePredictorRequest() {
  }

  public RunSequencePredictorRequest eventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
    return this;
  }

   /**
   * Event Stream ID
   * @return eventStreamId
  **/
  @javax.annotation.Nullable
  public Integer getEventStreamId() {
    return eventStreamId;
  }

  public void setEventStreamId(Integer eventStreamId) {
    this.eventStreamId = eventStreamId;
  }


  public RunSequencePredictorRequest isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Set to true for a public model or prediction that should be shared across users. Set to false for the model and prediction to be associated with the token&#39;s user
   * @return isPublic
  **/
  @javax.annotation.Nullable
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }


  public RunSequencePredictorRequest isSynchronous(Boolean isSynchronous) {
    this.isSynchronous = isSynchronous;
    return this;
  }

   /**
   * Set to false to run asynchronously. In this mode, the ProcessQueueId result property will be populated and can be passed to GetProcessStatus to check for completion
   * @return isSynchronous
  **/
  @javax.annotation.Nullable
  public Boolean getIsSynchronous() {
    return isSynchronous;
  }

  public void setIsSynchronous(Boolean isSynchronous) {
    this.isSynchronous = isSynchronous;
  }


  public RunSequencePredictorRequest modelId(Integer modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Specify this to use an existing model rather than training a new one
   * @return modelId
  **/
  @javax.annotation.Nullable
  public Integer getModelId() {
    return modelId;
  }

  public void setModelId(Integer modelId) {
    this.modelId = modelId;
  }


  public RunSequencePredictorRequest predictionOptions(SequencePredictorPredictionOptions predictionOptions) {
    this.predictionOptions = predictionOptions;
    return this;
  }

   /**
   * Get predictionOptions
   * @return predictionOptions
  **/
  @javax.annotation.Nullable
  public SequencePredictorPredictionOptions getPredictionOptions() {
    return predictionOptions;
  }

  public void setPredictionOptions(SequencePredictorPredictionOptions predictionOptions) {
    this.predictionOptions = predictionOptions;
  }


  public RunSequencePredictorRequest predictionSnapshotOptions(ModelSnapshotOptions predictionSnapshotOptions) {
    this.predictionSnapshotOptions = predictionSnapshotOptions;
    return this;
  }

   /**
   * Get predictionSnapshotOptions
   * @return predictionSnapshotOptions
  **/
  @javax.annotation.Nullable
  public ModelSnapshotOptions getPredictionSnapshotOptions() {
    return predictionSnapshotOptions;
  }

  public void setPredictionSnapshotOptions(ModelSnapshotOptions predictionSnapshotOptions) {
    this.predictionSnapshotOptions = predictionSnapshotOptions;
  }


  public RunSequencePredictorRequest trainingOptions(SequencePredictorTrainingOptions trainingOptions) {
    this.trainingOptions = trainingOptions;
    return this;
  }

   /**
   * Get trainingOptions
   * @return trainingOptions
  **/
  @javax.annotation.Nullable
  public SequencePredictorTrainingOptions getTrainingOptions() {
    return trainingOptions;
  }

  public void setTrainingOptions(SequencePredictorTrainingOptions trainingOptions) {
    this.trainingOptions = trainingOptions;
  }


  public RunSequencePredictorRequest trainingSnapshotOptions(ModelSnapshotOptions trainingSnapshotOptions) {
    this.trainingSnapshotOptions = trainingSnapshotOptions;
    return this;
  }

   /**
   * Get trainingSnapshotOptions
   * @return trainingSnapshotOptions
  **/
  @javax.annotation.Nullable
  public ModelSnapshotOptions getTrainingSnapshotOptions() {
    return trainingSnapshotOptions;
  }

  public void setTrainingSnapshotOptions(ModelSnapshotOptions trainingSnapshotOptions) {
    this.trainingSnapshotOptions = trainingSnapshotOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunSequencePredictorRequest runSequencePredictorRequest = (RunSequencePredictorRequest) o;
    return Objects.equals(this.eventStreamId, runSequencePredictorRequest.eventStreamId) &&
        Objects.equals(this.isPublic, runSequencePredictorRequest.isPublic) &&
        Objects.equals(this.isSynchronous, runSequencePredictorRequest.isSynchronous) &&
        Objects.equals(this.modelId, runSequencePredictorRequest.modelId) &&
        Objects.equals(this.predictionOptions, runSequencePredictorRequest.predictionOptions) &&
        Objects.equals(this.predictionSnapshotOptions, runSequencePredictorRequest.predictionSnapshotOptions) &&
        Objects.equals(this.trainingOptions, runSequencePredictorRequest.trainingOptions) &&
        Objects.equals(this.trainingSnapshotOptions, runSequencePredictorRequest.trainingSnapshotOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventStreamId, isPublic, isSynchronous, modelId, predictionOptions, predictionSnapshotOptions, trainingOptions, trainingSnapshotOptions);
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
    sb.append("class RunSequencePredictorRequest {\n");
    sb.append("    eventStreamId: ").append(toIndentedString(eventStreamId)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    isSynchronous: ").append(toIndentedString(isSynchronous)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    predictionOptions: ").append(toIndentedString(predictionOptions)).append("\n");
    sb.append("    predictionSnapshotOptions: ").append(toIndentedString(predictionSnapshotOptions)).append("\n");
    sb.append("    trainingOptions: ").append(toIndentedString(trainingOptions)).append("\n");
    sb.append("    trainingSnapshotOptions: ").append(toIndentedString(trainingSnapshotOptions)).append("\n");
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
    openapiFields.add("EventStreamId");
    openapiFields.add("IsPublic");
    openapiFields.add("IsSynchronous");
    openapiFields.add("ModelId");
    openapiFields.add("PredictionOptions");
    openapiFields.add("PredictionSnapshotOptions");
    openapiFields.add("TrainingOptions");
    openapiFields.add("TrainingSnapshotOptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunSequencePredictorRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunSequencePredictorRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunSequencePredictorRequest is not found in the empty JSON string", RunSequencePredictorRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunSequencePredictorRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunSequencePredictorRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `PredictionOptions`
      if (jsonObj.get("PredictionOptions") != null && !jsonObj.get("PredictionOptions").isJsonNull()) {
        SequencePredictorPredictionOptions.validateJsonElement(jsonObj.get("PredictionOptions"));
      }
      // validate the optional field `PredictionSnapshotOptions`
      if (jsonObj.get("PredictionSnapshotOptions") != null && !jsonObj.get("PredictionSnapshotOptions").isJsonNull()) {
        ModelSnapshotOptions.validateJsonElement(jsonObj.get("PredictionSnapshotOptions"));
      }
      // validate the optional field `TrainingOptions`
      if (jsonObj.get("TrainingOptions") != null && !jsonObj.get("TrainingOptions").isJsonNull()) {
        SequencePredictorTrainingOptions.validateJsonElement(jsonObj.get("TrainingOptions"));
      }
      // validate the optional field `TrainingSnapshotOptions`
      if (jsonObj.get("TrainingSnapshotOptions") != null && !jsonObj.get("TrainingSnapshotOptions").isJsonNull()) {
        ModelSnapshotOptions.validateJsonElement(jsonObj.get("TrainingSnapshotOptions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunSequencePredictorRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunSequencePredictorRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunSequencePredictorRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunSequencePredictorRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RunSequencePredictorRequest>() {
           @Override
           public void write(JsonWriter out, RunSequencePredictorRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunSequencePredictorRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunSequencePredictorRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunSequencePredictorRequest
  * @throws IOException if the JSON string is invalid with respect to RunSequencePredictorRequest
  */
  public static RunSequencePredictorRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunSequencePredictorRequest.class);
  }

 /**
  * Convert an instance of RunSequencePredictorRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

