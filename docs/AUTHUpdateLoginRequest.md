

# AUTHUpdateLoginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalAuthentication** | **Boolean** | True if you want this login to use external authentication [NT, SAML] |  [optional] |
|**loginId** | **UUID** | Id of the login |  [optional] |
|**name** | **String** | Login name |  [optional] |
|**newPassword** | **String** | If you want to change the password, provide it here.  If ExternalAuth is true, this is ignored.  It must pass the password complexity rules. |  [optional] |
|**siteId** | **Integer** | Id of the CM Site (typically 1) |  [optional] |
|**userId** | **Integer** | User Id to associate with the login.  Pass NULL to disassociate the login with a user. |  [optional] |



