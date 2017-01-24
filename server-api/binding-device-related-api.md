# 绑定设备相关API

以下API默认调用者为设备端

## 发送registrationId

* POST /clocks/register-push-token

requestBody
要求参数`uuid`和`pushToken`

```json
{
	"uuid": "liusining1",
	"pushToken": "test"
}
```

responseBody

```json
{
  "success": true,
  "msg": "成功更新推送id"
}
```


## 设备绑定

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

## 查询绑定User数量的接口：

* POST /clocks/check-binding-status

requestBody:

	{ "uuid": "example-clock-uuid-10004" }

responseBody:

	{
	  "success": false,
	  "msg": "没有这个设备"
	}
