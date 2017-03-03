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
