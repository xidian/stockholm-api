# 账号密码相关API

以下API默认调用者为手机端

* [注册](#user-content-注册api)
* [登录](#user-content-登陆api)
* [登出](@user-content-登出)
* [更新密码](#user-content-更新密码)
* [发送短信验证码](#user-content-发送短信验证码)
* [验证验证码](#user-content-验证验证码)
* [更新用户推送地址](#user-content-更新用户推送地址)

## 注册API

* POST /users/register

requestBody:

	{
		"code": "123456",
		"user":{
	 		"phoneNumber": "18514760074",
			"password": "test-password-11"
		},
		"device":{
			"pushToken": "baidu_push_channel_id",
			"platform": 0 (备注：这一项是整数，0代表android，1代表ios)
		}
	}

platform默认是0

responseExample:

	{
	  "success": true,
	  "msg": "ok",
	  "data": {
	    "user": {
	      "id": 13,
	      "phoneNumber": "18514760074",
	    }
	  }
	}

## 登陆

* POST /users/login

每次login都更新user.device_token

requestHeader
```
SerialNumber: <your-serial-number>
```

requestBody:
```json
	{
		"user": {
			"phoneNumber": "18514760073",
			"password": "testpassword"
		},
		"device": {
			"pushToken": "baidu_push_channel_id",
			"platform": 1
		}
	}
```
(备注：platform是整数，0代表android，1代表ios)

responseBody["data"]:
```json
{
  "user": {
    "accountId": 10002,
    "username": "小喵用户",
    "phoneNumber": "18514760073",
    "avatar": null
  },
  "isFresh": false,
  "accessToken": "23LkjCKFKs"
}
```

## 登出

* POST /users/logout

requestHeaders

	Access-Token: <your-access-token>

## 忘记密码

* PUT /users/update-password

requestBody:

	{
		"phoneNumber": "111",
		"code": "194940",
		"password": "qweqwe"
	}

responseBody:

	{
	  "success": true,
	  "msg": "修改密码成功"
	}

## 发送短信验证码

* POST /verification_codes

requestBody:

	{
		"flag": 1,
		"phoneNumber": "18514760073"
	}
备注，flag 标号 0代表注册过程，1代表找回密码过程

responseBody

	{I
	  "success": true,
	  "msg": "ok"
	  "data":
		     {
			"phoneNumber": "18514760073"
		      }
	}

## 验证验证码

* POST /verification_codes/verify

requestBody:

	{
		"phoneNumber": "18514760073"
		"code": "485401"
	}

responseBody:

	{
	  "success": true,
	  "msg": "ok"
	  "data":
		     {
				"phoneNumber": "18514760073"
			      }
	}

## 更新用户推送地址
在不同设备登录时，需要更新用户的推送地址

* POST /users/:id/update-device-token

requestBody

	{
		"device": {
			"pushToken": "apns push token",
			"platform": 1 (备注：这一项是整数，0代表android，1代表ios)
		}
	}

使用极光推送的Android设备无需使用这个借口

## 更新手机号

* PUT /user/phone_number

requestHeader
```
Access-Token: <your-access-token>
```

requestBody
```json
{
	"code": "123123",
	"phoneNumber": "A NEW PHONE NUMBER"
}
```

## 更新用户名

* PUT /user/username

requestHeader
```
Access-Token: <your-access-token>
```

requestBody
```json
{"username": "A NEW NAME"}
```

## 更新密码

* PUT /user/password

requestHeader
```
Access-Token: <your-access-token>
```

requestBody
```json
{
	"oldPwd": "YOUR OLD PASSWORD",
	"newPwd": "NEW PASSWORD"
}
```

## 检查序列号

* POST /users/check_serial_number

requestBody
```json
{"phoneNumber": "<your-phone-number"}
```
