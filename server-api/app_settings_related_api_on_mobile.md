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

## 1个app的配置信息
获取当前配置信息(config)

* GET /mobile/clock/app

requestHeaders：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
	PackageName: <your-package-name>
```

responseBody["data"]
```json
{"config": "{}"}
```

## 1个app的配置（含分页）
* POST /mobile/clock/app

requestHeaders:
```
Access-Token： <your-access-token>
UUID: <the-clock-uuid>
PackageName: <your-package-name>
```

requestBody:
```json
{
	"paginate": {
		"key": "<your-key>",
		"page": 1,
		"per_page": 5
	}
}
```

responseBody:
```json
{
  "success": true,
  "msg": "分页的apps_configs",
  "data": {
    "config": "{\"channels\":[{\"categoryId\":10,\"categoryName\":\"社会\",\"checked\":false},{\"categoryId\":14,\"categoryName\":\"时政\",\"checked\":false},{\"categoryId\":15,\"categoryName\":\"段子\",\"checked\":true},{\"categoryId\":16,\"categoryName\":\"情感\",\"checked\":false},{\"categoryId\":18,\"categoryName\":\"干货\",\"checked\":false}],\"songs\":null}",
    "icon": "123123",
    "versionCode": 1,
    "appName": "新闻",
    "removable": false,
    "mobileDownloadUrl": "http://dev.app.meowtechnology.com/app_plugin/com.stockholm.news/1/news-plugin-debug.apk?e=1490268013&token=TajwQ-MmKUh07sH9pM6_47p6s81VgI8F9NuW2t_g:cuCnJkBHPusbn06dmVhjo4KcTBE=",
    "isHidden": false
  },
  "page": {
    "currentPage": 2,
    "nextPage": -1,
    "totalPages": 2
  }
}
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

## 排序

* PUT /mobile/apps/order_numbers

requestHeaders:
```
	Access-Token: <your-access-token>
	UUID: <your-device-uuid>
```

requestBody:
```json
{
	"apps": [
		{"packageName": "com.stockholm.clock", "orderNumber": 1},
		{"packageName": "com.stockholm.news", "orderNumber": 2},
		{"packageName": "com.stockholm.album", "orderNumber": 0}
		]
}
```

responseBody:
```json
{
  "success": true,
  "msg": "Reorder",
  "data": [
    {
      "packageName": "com.stockholm.news",
      "orderNumber": 2
    },
    {
      "packageName": "com.stockholm.clock",
      "orderNumber": 1
    },
    {
      "packageName": "l",
      "orderNumber": 0
    }
  ]
}
```

## 播放控制

* POST /mobile/clock/app/play

requestHeaders
```
Access-Token: <your-access-token>
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
