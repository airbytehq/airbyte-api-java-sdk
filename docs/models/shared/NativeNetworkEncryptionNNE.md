# NativeNetworkEncryptionNNE

The native network encryption gives you the ability to encrypt database connections, without the configuration overhead of TCP/IP and SSL/TLS and without the need to open and listen on different ports.


## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `encryptionAlgorithm`                                                                                    | [Optional\<EncryptionAlgorithm>](../../models/shared/EncryptionAlgorithm.md)                             | :heavy_minus_sign:                                                                                       | This parameter defines the database encryption algorithm.                                                |
| `encryptionMethod`                                                                                       | [Optional\<DestinationOracleEncryptionMethod>](../../models/shared/DestinationOracleEncryptionMethod.md) | :heavy_minus_sign:                                                                                       | N/A                                                                                                      |