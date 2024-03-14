

# Persona

Provides data about a specific persona.               https://alterian.atlassian.net/l/cp/kQa2X8yb

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Internal identifier for the persona |  [optional] |
|**icon** | **String** | Icon |  [optional] |
|**name** | **String** | Name of the persona |  [optional] |
|**created** | **OffsetDateTime** | Date the persona was created |  [optional] |
|**modified** | **OffsetDateTime** | Date the persona was last modified |  [optional] |
|**description** | **String** | Description for the persona |  [optional] |
|**hidden** | **Boolean** | Should this Persona be hidden by default in the UI (as an alternative to deleting it) |  [optional] |
|**links** | [**List&lt;PersonaLink&gt;**](PersonaLink.md) | Provides a link to other objects which this persona is being linked to (eg. playbooks, etc.) |  [optional] |
|**usageCounter** | **Integer** | As events flow through the system, if this persona is detected in the inbound event stream, the usage counter will be incremented.  Note that this             will not be exact but will get an approximation on how often the persona is being used.  Personas which are manually added start with a usage of zero.             Anything with a value greater than zero means that it has been seen in inbound events. |  [optional] |



