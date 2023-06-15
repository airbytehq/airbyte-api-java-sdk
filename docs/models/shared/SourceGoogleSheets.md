# SourceGoogleSheets

The values required to configure the source.


## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `credentials`                                                                            | *Object*                                                                                 | :heavy_check_mark:                                                                       | Credentials for connecting to the Google Sheets API                                      |                                                                                          |
| `rowBatchSize`                                                                           | *Long*                                                                                   | :heavy_minus_sign:                                                                       | Number of rows fetched when making a Google Sheet API call. Defaults to 200.             |                                                                                          |
| `sourceType`                                                                             | [SourceGoogleSheetsGoogleSheets](../../models/shared/SourceGoogleSheetsGoogleSheets.md)  | :heavy_check_mark:                                                                       | N/A                                                                                      |                                                                                          |
| `spreadsheetId`                                                                          | *String*                                                                                 | :heavy_check_mark:                                                                       | Enter the link to the Google spreadsheet you want to sync                                | https://docs.google.com/spreadsheets/d/1hLd9Qqti3UyLXZB2aFfUWDT7BG-arw2xy4HR3D-dwUb/edit |