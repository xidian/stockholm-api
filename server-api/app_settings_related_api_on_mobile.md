# 从手机端设置app

* [获取某设备上所有apps](#user-content-获取某设备上所有apps)
* [获取某已安装app配置信息](#user-content-获取某已安装app配置信息)
* [更新某app设置项](#user-content-更新某app设置项)
* [查询公共apps](#user-content-查询所有公共apps)
* [获取某app的公共信息](#user-content-获取某app的信息)


## 获取某设备上所有apps

* GET /mobile/clock/apps

requestHeader：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
```

## 获取所有app的configs
某设备上，所有的app的参数

* GET /mobile/clock/apps_configs

requestHeaders
```
  Access-Token: <your-access-token>
  UUID: <your-device-uuid>
```

## 更新某app设置项
根据UUID和PackageName，更新某设备上某App的配置。也可以用来创建App配置信息。

* PUT /mobile/clock/app

requestHeader：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
	PackageName: <your-package-name>
```

requestBody: (备注，config只需要保证使用合法的JSON格式即可，array/object都可以)

```json
{
	"config": {
		"channel": [1,3,5,6]
	}
}
```

## 获取某已安装app配置信息
获取当前配置信息(config)

* GET /mobile/clock/app

requestHeader：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
	PackageName: <your-package-name>
```

responseBody["data"]
```json
{"config": "{}"}
```

## 设置隐藏

* PUT /mobile/apps/hide

requestHeaders:
```
	Access-Token: <your-access-token>
	UUID: <your-device-uuid>
```

requestBody:
```json
{
	"packageName": "your-package-name",
	"isHidden": true
}
```

responseBody:
```json
{
  "success": true,
  "msg": "hide/expose",
  "data": {
    "isHidden": false
  }
}
```
