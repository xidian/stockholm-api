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

responseBody["data"]
```json
[
	{
		"uuid": "<first-uuid>",
		"name": "<your clock's name>"
	}
]
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
