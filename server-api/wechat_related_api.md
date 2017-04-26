# 绑定微信

## 绑定
登录状态下绑定

* POST /user/wechat

requestHeader
```
Access-Token: <your-access-token>
```

requestBody
```json
{"code": "your wechat authorization code"}
```

## 微信登录

* POST /user/wechat/login

requestBody
```json
{"code": "your wechat authorization code"}
```

登录成功，返回：

```json
{
  "success": true,
  "msg": "登录成功",
  "data": {
    "user": {},
    "accessToken": "your-access-token",
    "wechat": "your wechat nickname"
  }
}
```

微信未绑定，返回：

```json
{
  "success": true,
  "msg": "登录成功",
  "data": {
    "nickname": "your wechat nickname",
    "headimgurl": "your wechat avatar url",
    "unionid": "your unionid"
  }
}
```
