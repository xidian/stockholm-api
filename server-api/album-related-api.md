# 设置相册

##上传图片（获得上传token）

* POST /mobile/apps_configs/album_images
requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```
requestBody
要求参数：上传图片的数量。

```json
{ "count": 10 }
```

responseBody["data"]
```json
{
  "uptoken": "<the-token-you-will-get>",
  "bucket": "meow-album-test",
  "key": "test-1.jpg"
}
```
##设备端下载图片
设备端获得下载url

* GET /device/apps_configs/album_images
requestHeader
```
UUID: <your-device-uuid>
```

responseBody["data"]
```json
{
  "config":{},
  "downloadUrls":[
    "<url1>",
    "<url2>",
    "..."
  ]
}
```

##手机端下载

* GET /mobile/apps_configs/album_images

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

responseBody['data']
```json
{
  "downloadUrls":[
    "<url1>",
    "<url2>",
    "..."
  ]
}
```

##删除图片

* POST /mobile/apps_configs/album_images/delete

requestHeader
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{"key": ["201703081512520800AhmSFnRd", "201103081512520800AhmSFwer"]}
```
如果只有一张图片，也可以不放在数组里

responseBody
```json
{"data": [
    "201703081512520800AhmSFnRd"
  ]
}
```
