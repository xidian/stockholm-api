# 设备端app相关API

[第一部分API](#user-content-第一部分手机端)默认调用者为手机端

* [查询公共apps](#user-content-查询所有公共apps)
* [获取某app的公共信息](#user-content-获取某app的信息)
* [获取某设备上所有apps](#user-content-获取某设备上所有apps)
* [获取某已安装app配置信息](#user-content-获取某已安装app配置信息)
* [更新某app设置项](#user-content-更新某app设置项)

[第二部分API](#user-content-第二部分设备端)默认调用者为设备端

* [安装app](#user-content-设备请求安装app)
* [更新app设置](#user-content-更新app设置)
* [查询app的config](#user-content-查询app的config)

----
## 第一部分：手机端

### 查询所有公共apps

* GET /apps

不需要requestBody与requestHeader

### 获取某app的公共信息

* GET /app

requestHeader：

```
	PackageName: <your-package-name>
```

不需要requestBody

responseBody

```json
{
  "success": true,
  "msg": "新闻的设置项",
  "data": {
    "channels": [
      {
        "id": 1,
        "name": "内涵"
      },
      {
        "id": 2,
        "name": "政治"
      }
    ]
  }
}
```

### 获取某设备上所有apps

* GET /mobile/clock/apps

requestHeader：
```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
```

requestBody为空

responseBody

```json
	{
	  "clock": {
	    "id": 2,
	    "uuid": "123",
	    "apps": [
	      {
	        "id": 2,
	        "name": "1",
	        "type": null,
	        "packageName": "com.1"
	      },
	      {
	        "id": 3,
	        "name": "2",
	        "type": null,
	        "packageName": "com.2"
	      }
	    ]
	  }
	}
```

### 获取某已安装app配置信息
获取当前配置信息(config)和所有可用设置项(available_config)

* GET /mobile/clock/app

requestHeader：

```
	Access-Token： <your-access-token>
	UUID: <the clock uuid>
	PackageName: <your-package-name>
```

requestBody为空

responseBody
```json
{
  "success": true,
  "msg": "新闻的设置项",
  "data": {
    "id": 4,
    "name": "新闻",
    "icon": null,
    "config": {
      "channel": [
        1,
        3,
        5,
        6
      ]
    }
  }
}
```

### 更新某app设置项
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

responseBody

```json
{
  "success": true,
  "msg": "成功更新新闻",
  "data": {
    "clock_id": 3,
    "id": 21,
    "config": {
      "channel": [
        1,
        3,
        5,
        6
      ]
    },
    "app_id": 4,
    "created_at": "2016-12-29T15:24:59.000+08:00",
    "updated_at": "2016-12-29T15:51:42.000+08:00"
  }
}
```

----

## 第二部分：设备端

### 获取某已安装app的配置
设备端下载app的配置

* GET /device/app

requestHeaders

```
	UUID: <your-device-uuid>
	PackageName: <your-package-name>
```

### 查询某设备的所有apps

* GET /device/apps

requestHeaders:

```
	UUID: <your-device-uuid>
```

### 设备请求安装app
数据库中链接app和clock上

* POST /device/apps/install

	requestBody

```json
	{
		"uuid": "123123",
		"appId": 2
	}
	```

	responseBody

	```json
	{
	  "appsConfig": {
	    "config": {},
	    "app": {
	      "id": 1,
	      "name": "test_app_1",
	      "icon": null,
	      "packageName": "com.test.1"
	    }
	  }
	}
```

### 获取某app的细节
部分app的设置接受order参数

* POST /device/app/order_details

requestHeaders

```
	UUID: <your-device-uuid>
	PackageName: <your-package-name>
```

requestBody

```json
{"order": "clockAlarm"}
```
