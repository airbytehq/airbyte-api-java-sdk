# ConnectionSchedule

schedule for when the the connection should run, per the schedule type


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `cronExpression`                                                                          | *Optional<? extends String>*                                                              | :heavy_minus_sign:                                                                        | N/A                                                                                       |
| `scheduleType`                                                                            | [com.airbyte.api.models.shared.ScheduleTypeEnum](../../models/shared/ScheduleTypeEnum.md) | :heavy_check_mark:                                                                        | N/A                                                                                       |