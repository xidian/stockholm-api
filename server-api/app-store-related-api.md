# 应用商店

## 获取列表

* GET /apps

requestHeader

```
UUID: <your-device-uuid>
```

按评分排序/apps?order_method=star

按下载量排序/apps?order_method=downloads

（以上2个排序方法均返回4个结果）

## 获取详情

* GET /app

requestHeader
```
PackageName: <your-package-name>
```
