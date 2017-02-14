#日历日程

##所有日程
查看某设备上的所有日程

* GET /mobile/apps_configs/calendar_events

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

##创建/更新日程

* POST /mobile/apps_configs/calendar_events

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{
  "calendarEvent": {
    "eventId": "如果要更新日程，请发送id；如果创建日程，可忽略id",
    "time": "",
    "name": "",
    "repeatType": "",
	  "repeatValue": ""
  }
}
```

responseBody["data"]
```json
{
  "eventId": 7,
}
```

##删除日程

* POST /mobile/apps_configs/calendar_events/delete

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{
  "eventId": 1
}
```
