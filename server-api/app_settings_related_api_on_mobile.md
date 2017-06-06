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

可选Header:
```
LocalNetwork: <any-value>
```
带此header则不发push给设备端

requestBody: (备注，config只需要保证使用合法的JSON格式即可，array/object都可以)

```json
{
	"config": {
		"channel": [1,3,5,6]
	}
}
```

## 增量更新设置项

* PUT /mobile/clock/app

requestHeader：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
	PackageName: <your-package-name>
```

可选Header:
```
LocalNetwork: <any-value>
ConfigDataType: 1
```
LocalNetwork: 带此header则不发push给设备端
ConfigDataType为0是代表更新一个键值对,为1时代表更新一个键值对中的数组

带此header则不发push给设备端

requestBody:
```json
{
  "key": "like",
  "value": "{\"songId\":\"1773403104\"}",
  "cmd": 0
}
```
举例说明：只更新config中"like"这个字段，这个字段是一个array（根据header中ConfigDataType判断）,对这个字段执行插入（根据cmd为0），插入的值为{"songId":"1773403104"}。

|值|描述|
|----|----|
|null|配合ConfigDataType为0使用，更新指定字段|
|0|在对应数组中插入一个Hash（配合ConfigDataType为1使用）|
|1|在对应数组中删除一个Hash（配合ConfigDataType为1使用）|
|2|更新对应hash，且id（或任何作为标记的主键必须放在hash的第一位）|

## 增量更新设置项和任务

* PUT /mobile/clock/app_with_task

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

requestBody
```json
{
	"appsConfig": {
		"key": "alarmList",
		"value": {"clockAlarmId":1,"name":"闹钟","repeatType":0,"ring":"华尔兹","status":true,"time":"15:47"},
		"cmd": 0
	},
	"taskConfig": {
		"task": {},
		"startTime": "2017-06-06T14:16:31",
		"repeatType": 0,
		"repeatValue": "1,2,3,4"
	}
}
```

responseBody
```json
{
	"success": true,
	"msg": "更新成功",
	"data": "更新后的config"
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

## 检查订阅

* POST /mobile/clock/app/check_subscription

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

requestBody
```json
{
	"key": "like",
	"item": "{\"songId\":\"773403104\"}"
}
```

responseBody
```json
{
  "success": true,
  "msg": "订阅状态",
	"data": {
		"subscribed": true
	}
}
```

如果订阅，则success为true。
