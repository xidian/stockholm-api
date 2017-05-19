# 设置时钟

## 发送重置请求

* POST /clocks/ask_for_reset

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

若发送成功，则返回success: true，否则false

## 重置

* POST /clocks/reset

requestHeaders
```
UUID: <your-device-uuid>
```

## 核对时间

* GET /clocks/time

responseBody
```json
{
  "success": true,
  "msg": "时间",
  "data": "2017-05-19T11:38:50.472+08:00"
}
```
