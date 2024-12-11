# DestinationSftpJson


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `destinationType`                                       | [SftpJson](../../models/shared/SftpJson.md)             | :heavy_check_mark:                                      | N/A                                                     |                                                         |
| `destinationPath`                                       | *String*                                                | :heavy_check_mark:                                      | Path to the directory where json files will be written. | /json_data                                              |
| `host`                                                  | *String*                                                | :heavy_check_mark:                                      | Hostname of the SFTP server.                            |                                                         |
| `password`                                              | *String*                                                | :heavy_check_mark:                                      | Password associated with the username.                  |                                                         |
| `port`                                                  | *Optional\<Long>*                                       | :heavy_minus_sign:                                      | Port of the SFTP server.                                | 22                                                      |
| `username`                                              | *String*                                                | :heavy_check_mark:                                      | Username to use to access the SFTP server.              |                                                         |