#应用商店评论

##新评论、编辑评论

* GET /mobile/apps/comments/new

requestHeader
```
Access-Token: <your-access-token>
PackageName: <your-package-name>
```

##提交评论

* POST /mobile/apps/comments

requestHeader
```
Access-Token: <your-access-token>
PackageName: <your-package-name>
```

requestBody
```json
{"comment": {
    "star": 2.5,
    "content": "your content"
  }
}
```

##拉取评论

* GET /mobile/apps/comments?page=<page>

<page>为页码

requestHeader
```
PackageName: <your-package-name>
```
