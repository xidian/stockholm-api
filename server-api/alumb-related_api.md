# 设置相册

##上传图片（获得上传token）

* POST /mobile/apps_configs/album_images
requestHeader
```
Access-Token: <your-access-token>
```
requestBody
```json
{"key": "<your-image-key>"}
```

备注：your-image-key是uuid和图片名称拼成的字符串，例如`a02c36138a15/yourimage.png`

responseBody["data"]
```json
{
  "uptoken": "<the-token-you-will-get>",
  "bucket": "meow-album-test",
  "key": "test-1.jpg"
}
```

回传的key可能与请求的key不一样，这是为了防止文件重名。
