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

## 查询某设备的所有apps

* GET /device/apps

requestHeaders:

```
	UUID: <your-device-uuid>
```
