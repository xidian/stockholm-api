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

## 1个app的配置（含分页）
* POST /device/apps_config

requestHeaders:
```
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
