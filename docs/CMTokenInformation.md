

# CMTokenInformation

Definition of a token for the CM system.  A token is a GUID which is passed to ALL calls into CM and this token typically has a @see(ALUser) assigned to it to enforce permissions.  Some methods require an SA [system admin] token to call.             Those calls which have permissions MUST have a user token provided.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | Internal ID of the token |  [optional] |
|**loginID** | **UUID** | Authentication system&#39;s login ID for this token [if applicable] |  [optional] |
|**token** | **UUID** | Actual GUID of the token.  This is what you would use to pass to API methods. |  [optional] |
|**timezoneID** | **Integer** | Timezone of the user associated with this token |  [optional] |
|**userID** | **Integer** | User associated with this token |  [optional] |
|**clientID** | **Integer** | Client associated with this token |  [optional] |
|**lastActivity** | **OffsetDateTime** | Last time this token was actually used for something |  [optional] |
|**created** | **OffsetDateTime** | When this token was created |  [optional] |
|**culture** | **String** | The culture of the user associated with this token |  [optional] |
|**isStatic** | **Boolean** | Is this token a static token?  If so, it won&#39;t be purged as part of the normal purge process |  [optional] |
|**isSAtoken** | **Boolean** | Is this an SA token?  If so, it will have access to more system admin functions. |  [optional] |



