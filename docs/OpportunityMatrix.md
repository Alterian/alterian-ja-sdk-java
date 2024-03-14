

# OpportunityMatrix

A Data transfer object (DTO) to move information about campaigns within the opportunity matrix to and from the UI             We will have one of these instances for each cell in the matrix that contains a campaign             At time of writing, we will always get and update the entire list of Opportunity Matrix elements in one go

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**businessGoalID** | **Integer** | The Id of the story that this campaign is appearing in. Basically the Y coordinate of the matrix             If the Story has been deleted then the UI will not display this campaign |  [optional] |
|**opportunityID** | **Integer** | The Id of the opportunity that this campaign is appearing in. Basically the X coordinate of the matrix             If the Opportunity has been deleted then the UI will not display this campaign |  [optional] |
|**documentID** | **Integer** | The id of the campaign document that is referenced in the cell. Required when updating |  [optional] |
|**campaignName** | **String** | The name of the campaign in this cell. Read only, provided as a convenience for populating the Opportunity matrix UI |  [optional] |
|**campaignDescription** | **String** | The description of the campaign in this cell. Read only, provided as a convenience for populating the Opportunity matrix UI |  [optional] |
|**author** | **String** | The Author of the campaign in this cell. Read only, provided as a convenience for populating the Opportunity matrix UI |  [optional] |
|**lastUpdated** | **OffsetDateTime** | The Date/Time the campaign was last updated. Read only, provided as a convenience for populating the Opportunity matrix UI |  [optional] |
|**subType** | **String** | What kind of thing is this? Used to distinguish between Silverlight campaigns (&#x3D;\&quot;Campaign\&quot;) and Campaign360 (&#x3D;\&quot;Campaign.BuildACampaign\&quot;) objects when deeplinking |  [optional] |



