# 媒体播放接口

## 更新播放

* PUT /app/medium?packageName=YOUR_PACKAGE_NAME&uuid=YOUR_DEVICE_UUID

requestBody
```json
{
  "medium": {
    "info": "your medium info"
  }
}
```

推送信息（发往手机端）：
```json
{
  "extras": {
    "order": 19
  }
}
```

## 获取播放信息

* GET /app/medium?uuid=<your-device-uuid>

responseBody
```json
{
  "success": true,
  "msg": "媒体信息",
  "data": {
    "info": "test",
    "packageName": "com.stockholm.news"
  }
}
```
