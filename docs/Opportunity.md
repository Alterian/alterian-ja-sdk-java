

# Opportunity



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ID** | **Integer** | ID of the opportunity as stored in the database |  [optional] |
|**name** | **String** | The (arbitrary) name of the Opportunity as decided by the marketer |  [optional] |
|**description** | **String** | A desciption of the Opportunity to explain it&#39;s purpose to the user |  [optional] |
|**group** | **String** | Group Name used to give some structure to the Opportunities within the Matrix - this should probably be an ID to another table but meh! |  [optional] |
|**colour** | **String** | Let&#39;s liven things up with a bit of colour |  [optional] |
|**icon** | **String** | Icon for quick reference and to make the grid look a bit more shiny |  [optional] |
|**items** | [**List&lt;OpportunityItem&gt;**](OpportunityItem.md) | List of the associated items (i.e. Campaigns / Journeys) linked to this Opportunity |  [optional] |



