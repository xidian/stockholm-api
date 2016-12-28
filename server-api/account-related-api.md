# 账号密码相关API

以下API默认调用者为手机端

## **1.注册API：**

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

## **2.登陆API：**

* POST /users/login

每次login都更新user.device_token

requestBody:

	{
		"user": {
			"phoneNumber": "18514760073",
			"password": "testpassword"
		},
		"device": {
			"pushToken": "baidu_push_channel_id",
			"platform": 1 (备注：这一项是整数，0代表android，1代表ios)
		}
	}

responseExample:

	{
	  "success": true,
	  "msg": "ok",
	  "data": {
	    "user": {
	      "id": 12,
	      "phoneNumber": "18514760073"
	    },
	    "isFresh": true,
	    "accessToken": "XAllpqfc5Mt7WZu8YBoWsw1482486131"
	  }

## **3. 更新密码**

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

## **4. 发送短信验证码**

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

## **5. 验证验证码**

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

## **6.更新推送token与设备平台的接口**

* POST /users/:id/update-device-token

requestBody

	{
		"device": {
			"pushToken": "apns push token",
			"platform": 1 (备注：这一项是整数，0代表android，1代表ios)
		}
	}

使用极光推送的Android设备无需使用这个借口
