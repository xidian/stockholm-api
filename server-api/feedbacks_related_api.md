# 用户反馈

## 提交反馈

* POST /feedbacks

requestHeaders
```
Access-Token: <your-access-token>
```

requestBody
```json
{
	"feedback": {
		"content": "your feedback",
		"contact": "your contact info"
	}
}
```
