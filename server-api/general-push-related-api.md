#通用推送接口

##手机端发往设备端

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{
	"whisper": "your-content",
	"extras": "your-extras"
}
```

##设备端发往手机端
发往所有家庭成员

requestHeader
```
UUID: <your-device-uuid>
```

requestBody
```json
{
	"whisper": "your-content",
	"extras": "your-extras"
}
```
