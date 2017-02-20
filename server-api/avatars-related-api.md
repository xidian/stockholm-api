#头像相关接口

##上传头像
获得上传所需token

* POST /user/avatar

requestHeader
```
Access-Token: <your-access-token>
```

responseBody["data"]
```json
{
  "key": "avatar18561543693",
  "uptoken": "token"
}
```

##下载头像

* GET /user/avatar

requestHeader
```
Access-Token: <your-access-token>
```

responseBody["data"]直接是一个下载地址
