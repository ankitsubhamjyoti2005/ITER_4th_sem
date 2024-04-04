import json
import boto3

dynamodb = boto3.resource('dynamodb')
table = dynamodb.Table('server-less-application')

def lambda_handler(event,context):
    respond = table.get_item(key={
        id:'0'
    })
    users = responds['Item']['user']
    users = users+1
    print(users)
    responds = table.put(Item={
        'id':'1',
        'users':users
    })

return users;