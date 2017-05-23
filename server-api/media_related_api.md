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
    "order": 19,
    "packageName": "<your-package-name>"
  }
}
```

## 获取播放信息

* GET /app/medium?packageName=<your-package-name>&uuid=<your-device-uuid>

responseBody
```json
{
  "success": true,
  "msg": "媒体信息",
  "data": {
    "info": "test"
  }
}
```

## 推送播放请求

* POST /app/medium/push?packageName=<your-package-name>&uuid=<your-device-uuid>

requestBody
```json
{
  "extras": {
    "order": "your order"
  }
}
```

推送内容为：
```json
{
  "extras": {
    "order": "your order",
    "packageName": "your package name",
    "timestamp": "UNIX timestamp in sec"
  }
}
