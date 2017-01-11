#设置clock（app）闹钟

## 获取所有闹钟
获取某设备上所有闹钟

* GET /mobile/apps_configs/clock_alarms

requestHeaders

  Access-Token: <your-access-token>
  UUID: <your-device-uuid>

## 创建闹钟
给某设备创建闹钟

* POST /mobile/apps_configs/clock_alarms

requestHeaders

  Access-Token: <your-access-token>
  UUID: <your-device-uuid>

requestBody

```json
{
	"time": "13:10",
	"ring": "ring",
	"repeatType": 1,
	"name": "test2",
	"status": false
}
```

## 更新闹钟
更新某设备上的某个闹钟

* PUT /mobile/apps_configs/clock_alarm

requestHeaders

  Access-Token: <your-access-token>
  UUID: <your-device-uuid>

requestBody

```json
{
  "clockAlarmId": 1,
  "time": "13:10",
	"ring": "ring",
	"repeatType": 1,
	"name": "test2",
	"status": false
}
```

## 删除闹钟

* DELETE /mobile/apps_configs/clock_alarm

requestHeaders

  Access-Token: <your-access-token>
  UUID: <your-device-uuid>

requestBody

```json
{
  "clockAlarmId": 1
}
```
