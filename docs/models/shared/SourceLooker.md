# SourceLooker


## Fields

| Field                                                                                                                                                                                                              | Type                                                                                                                                                                                                               | Required                                                                                                                                                                                                           | Description                                                                                                                                                                                                        | Example                                                                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `clientId`                                                                                                                                                                                                         | *String*                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                 | The Client ID is first part of an API3 key that is specific to each Looker user. See the <a href="https://docs.airbyte.com/integrations/sources/looker">docs</a> for more information on how to generate this key. |                                                                                                                                                                                                                    |
| `clientSecret`                                                                                                                                                                                                     | *String*                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                 | The Client Secret is second part of an API3 key.                                                                                                                                                                   |                                                                                                                                                                                                                    |
| `domain`                                                                                                                                                                                                           | *String*                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                 | Domain for your Looker account, e.g. airbyte.cloud.looker.com,looker.[clientname].com,IP address                                                                                                                   | domainname.looker.com                                                                                                                                                                                              |
| `runLookIds`                                                                                                                                                                                                       | List<*String*>                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                 | The IDs of any Looks to run                                                                                                                                                                                        |                                                                                                                                                                                                                    |
| `sourceType`                                                                                                                                                                                                       | [com.airbyte.api.models.shared.Looker](../../models/shared/Looker.md)                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                 | N/A                                                                                                                                                                                                                |                                                                                                                                                                                                                    |