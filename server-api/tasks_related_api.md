# 任务相关

## 所有任务

* GET /app/task_configs

requestHeaders
```
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

responseBody
```json
{
  "success": true,
  "msg": "所有的tasks",
  "data": [
    {
      "taskConfigId": 1,
      "startTime": null,
      "repeatType": null,
      "repeatValue": null,
      "updatedAt": "2017-06-06T19:42:56.000+08:00",
      "task": [
        {
          "taskId": 1,
          "priority": null,
          "packageName": "com.stockholm.news"
        }
      ]
    }
  ]
}
```

## 根据id查任务

* GET /app/task_config?key=KEY&identifier=IDENTIFIER&value=INTEGER

requestHeaders
```
PackageName: <your-package-name>
UUID: <your-device-uuid>
```

example `/app/task_config?key=alarmList&identifier=clockAlarmId&value=3`

responseBody
```json
{
  "success": true,
  "msg": "你的任务列表",
  "data": {
    "taskConfigId": 11,
    "startTime": "2017-06-06 12:12:00",
    "repeatType": 0,
    "repeatValue": "1,2,3",
    "updatedAt": "2017-06-06T21:48:31.000+08:00",
    "task": []
  }
}
```

## 开关任务

* POST /app/task_config/switch

requestHeaders
```
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

requestBody
```json
{
  "taskConfigId": 1,
  "open": true
}
```
