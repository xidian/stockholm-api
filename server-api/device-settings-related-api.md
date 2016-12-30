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
