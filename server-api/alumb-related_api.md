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
##下载图片
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
  downloadUrls:[
    "<url1>",
    "<url2>",
    "..."
  ]
}
```
