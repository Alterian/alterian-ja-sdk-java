

# APIMetadata

A class that contains information about the API itself in a format suitable for parsing by another application

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the method or class that the validation rules apply to |  [optional] |
|**validationRules** | **Map&lt;String, String&gt;** | A list of name-object pairs. The name is the parameter (of the method) or property name (of the class), and the object is the list of @see(ValidationRule) rules that apply to it             Each rule has it&#39;s own type to determine how it is evaluated, but if they all pass then the data is valid. |  [optional] |



