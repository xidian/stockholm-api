# 通用推送接口

## 手机端发往设备端

* POST /mobile/push

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{
	"whisper": "your-content",
	"extras": {"order": "..."}
}
```
extras里面的json写任何字段都行


## 设备端发往手机端
发往所有家庭成员

* POST /device/push

requestHeader
```
UUID: <your-device-uuid>
```

requestBody
```json
{
	"whisper": "your-content",
	"extras": {"order": "..."}
}
```
extras里面的json写任何字段都行
