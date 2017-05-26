# 获取听闻资源

## 或许频道资源

* GET /tingwen?tingwen[termId]=ID&tingwen[page]=PAGE&tingwen[limit]=LIMIT

如果没有termId，则默认为头条

responseBody
```json
{
  "success": true,
  "msg": "查询头条新闻成功!",
  "data": "转发听闻api的results部分"
}
```
