

# GetTokensRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientID** | **Integer** | ClientID for which to list tokens.  If \&quot;Token\&quot; parameter is an SA token, \&quot;ClientID\&quot; is used; if the \&quot;Token\&quot; parameter is a regular token, the clientID of the token is used |  [optional] |
|**cursor** | [**APICursor**](APICursor.md) |  |  [optional] |
|**includeNonUser** | **Boolean** | Include tokens which have no user set.  These types of tokens can&#39;t be used for the majority of API requests. |  [optional] |
|**includeSA** | **Boolean** | Include sa tokens in the returned list of tokens |  [optional] |
|**includeStandard** | **Boolean** | Include regular tokens in the returned list of tokens -- warning, this can be quite large |  [optional] |
|**includeStatic** | **Boolean** | Include static tokens in the returned list of tokens |  [optional] |



