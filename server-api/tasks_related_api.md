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
