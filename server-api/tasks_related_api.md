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
  "msg": "任务列表",
  "data": [
    {
      "task": [],
      "startTime": "13:24",
      "repeatType": 0,
      "repeatValue": "1,2,3,4",
      "packageName": "com.stockholm.clock",
      "updatedAt": "2017-08-09T21:23:24"
    }
  ]
}
```
