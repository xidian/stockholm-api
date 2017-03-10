#下载app的API
包括手机端和设备端

## 设备端下载app
得到下载链接

* GET /device/app/download

requestHeaders
```
UUID: <your-device-uuid>
PackageName: <your-package-name>
```

responseBody
```json
{"data": "url"}
```

## 手机端发送安装请求
创建绑定，并推送设备端进行下载

* POST /mobile/app/install

requestHeaders
```
Access-Token: <your-access-token>
UUID: <your-device-uuid>
```

requestBody
```json
{"packageName":"<your-package-name>"}
```

responseBody['data']
```json
{"data": "<Plugin Url>"}
```
