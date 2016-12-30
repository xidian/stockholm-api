# 绑定设备相关API

以下API默认调用者为设备端

## 1.与手机进行绑定的API：

表端发送以下信息：

* POST /clocks/bind

requestBody:

```json
{
 	"uuid": "liusining1",
 	"installedApps": "com.1,com.2"
}
```

requestHeader：

	Access-Token： <user's access token>

responseBody:

	{
	  "success": true,
	  "msg": "成功绑定用户：test10",
	}

`clocks_users`中间表生成一条记录。

## 2.查询绑定User数量的接口：

* POST /clocks/check-binding-status

requestBody:

	{ "uuid": "example-clock-uuid-10004" }

responseBody:

	{
	  "success": false,
	  "msg": "没有这个设备"
	}
