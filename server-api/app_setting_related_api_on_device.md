# 设备端设置app

## 获取某已安装app的配置
设备端下载app的配置

* GET /device/apps_config

requestHeaders
```
	UUID: <your-device-uuid>
	PackageName: <your-package-name>
```

responseBody["data"]
```json
{"config": "{}"}
```

## 设备端更新设置项

* PUT /device/apps_config

requestHeaders
```
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

requestBody
```json
{"config": "config"}
```

## 查询所有apps和排序

* GET /device/apps

requestHeaders:

```
	UUID: <your-device-uuid>
```

responseBody:
```json
{
  "success": true,
  "msg": "Apps and their orders",
  "data": [
    {
      "packageName": "com.stockholm.news",
      "isHidden": false,
      "orderNumber": 0
    }
  ]
}
```

## 播放控制（设备端）

* POST /device/apps_config/play

requestHeaders
```
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

requestBody
```json
{
	"key": "currentSong",
	"value": "1",
	"order": 201
}
```
