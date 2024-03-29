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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Types of resources that can have permissions applied to them.
 */
@JsonAdapter(ResourceType.Adapter.class)
public enum ResourceType {
  
  /**
   * Virtually all documents are under this resource type, except for campaigns below
   */
  Document(1),
  
  /**
   * Campaign document
   */
  Campaign(2),
  
  /**
   * A &quot;Module&quot; in IMS.  Never used.
   */
  Module(3),
  
  /**
   * 
   */
  Folder(4),
  
  /**
   * Files which are stored in IMS&#39;s sql system
   */
  File(5),
  
  /**
   * The term node and tool are used somewhat interchangeably in areas.
   */
  Node(6),
  
  /**
   * A datasource, typically an engine datasource
   */
  Datasource(7),
  
  /**
   * Database contained within a datasource
   */
  DatasourceDatabase(8),
  
  /**
   * Table which is contained within a datasource&#39;s database
   */
  DatasourceTable(9),
  
  /**
   * Column which is contained within a datasource&#39;s table
   */
  DatasourceColumn(10),
  
  /**
   * 
   */
  UserOrGroup(11),
  
  /**
   * A folder in which nodes and tools are stored
   */
  NodeFolder(12),
  
  /**
   * FTP Servers
   */
  FTPSite(13),
  
  /**
   * A folder in which FTP sites can be stored
   */
  FTPSiteFolder(14),
  
  /**
   * Folder for an EM Mapping
   */
  EMMappingFolder(15),
  
  /**
   * Mapping to an EM Account
   */
  EMMapping(16),
  
  /**
   * Folder for an external agent
   */
  ExternalAgentFolder(17),
  
  /**
   * External agent, omni-tactic
   */
  ExternalAgent(18),
  
  /**
   * Metric
   */
  Metric(19),
  
  NUMBER_unknown_default_open_api(11184809);

  private Integer value;

  ResourceType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceType fromValue(Integer value) {
    for (ResourceType b : ResourceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return NUMBER_unknown_default_open_api;
  }

  public static class Adapter extends TypeAdapter<ResourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return ResourceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    Integer value = jsonElement.getAsInt();
    ResourceType.fromValue(value);
  }
}

