# 设备参数API

## 设置设备参数
手机端上传设备参数

* POST /mobile/device-configs/clocks

requestBody
要求参数`uuid`和`deviceConfig`

```json
{
	"uuid": "liusining1",
	"deviceConfig": {
		"fontSize": 12
	}
}
```

responseBody

```json
{
  "success": true,
  "msg": "设置成功"
}
```

## 获取所有设备
获取某用户所有设备

* GET /clocks

requestHeader
```
Access-Token: <your-access-token>
```

responseBody
```json
{
  "success": true,
  "msg": "该用户绑定的所有设备",
  "data": {
    "active": {
      "uuid": "the uuid of your current clock",
      "name": "时光机"
    },
    "list": [
      {
        "uuid": "the uuid(s) of your other clock(s)",
        "name": "时光机"
      }
    ]
  }
}
```

## 切换当前设备

* PUT /user/devices/switch_current_clock

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

responseBody

```json
{
  "success": true,
  "msg": "切换成功"
}
```


## 重命名
给设备命名

* PUT /clock/name

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{"name": "<your-device-name>"}
```
