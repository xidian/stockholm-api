# 设备端app相关API

[第一部分API](#user-content-第一部分手机端)默认调用者为手机端

[第二部分API](#user-content-第二部分设备端)默认调用者为设备端

----
## 第一部分：手机端

### 1.查询所有apps的API：

* GET /apps

不需要requestBody与requestHeader

### 2.获取所有跟当前用户绑定的设备APP及配置信息

* GET /mobile/apps

requestHeader：
	Access-Token： QMHrMxbsrFhvj7qM0Cbypg1472117692

requestBody为空

### 3.获取跟当前用户绑定的设备的全部设备端app

* GET /mobile/clocks/:clock\_id/apps

requestHeader：
	Access-Token： QMHrMxbsrFhvj7qM0Cbypg1472117692
requestBody为空

responseBody

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

### 4.获取跟当前用户绑定的指定设备的指定app的配置信息：

* GET /mobile/clocks/:clock\_id/apps/:app\_id

requestHeader：

	Access-Token： QMHrMxbsrFhvj7qM0Cbypg1472117692

requestBody为空

### 5.根据app\_id，将指定设备与app关联起来并配置config（可以理解为用户从我们的应用商店初次安装这个应用到指定clock上）：

* POST /mobile/clocks/:clock\_id/apps

requestHeader：

	Access-Token： QMHrMxbsrFhvj7qM0Cbypg1472117692

requestBody:** (备注，config只需要保证使用合法的JSON格式即可，数组/object都可以)**

	{
		"appId": "APP_ID", (备注，这里填入想关联并配置config的AppId)
		"config": {
			"testKey": "configValue",
			"testKey2": "configValue2"
		}
	}

### 6.根据clock\_id和app\_id，更新指定表盘的指定App的配置信息：

* POST /mobile/clocks/:clock\_id/apps/:app\_id

requestHeader：

	Access-Token： QMHrMxbsrFhvj7qM0Cbypg1472117692

requestBody: (备注，config只需要保证使用合法的JSON格式即可，数组/object都可以)

	{
		"config": "a valid json config"
	}

----

## 第二部分：设备端

### 1.安装并进行配置某一指定id的app到clock上（表端安装app时使用）：

* POST /device/apps/install

### 2.更新指定app的config（更新app设置项）：

* PUT /device/apps/:app\_id/config

TBC：表端的 No.5 与 No.6 接口其实已经完成了，但由于现阶段我们不需要从表端推送回去的流程，故先不更新这两个API，等功能需要的时候再添加

### 3.查询clock安装过的指定app的config：

POST /device/apps/:app\_id
(备注：app\_id可以从No.3的表端接口获得)

requestBody:

	{
		"uuid": "example-clock-uuid-10004"
	}

### 4.查询clock安装过的所有app的configs（例如设备恢复时候使用）：

POST /device/apps

requestBody:

	{
	"uuid": "example-clock-uuid-10004"
	}
