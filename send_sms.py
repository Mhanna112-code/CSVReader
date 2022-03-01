# Download the helper library from https://www.twilio.com/docs/python/install
import os
from twilio.rest import Client


# Find your Account SID and Auth Token at twilio.com/console
# and set the environment variables. See http://twil.io/secure
account_sid = 'ACe80363affb3159884c3e124ad6a7674f'
auth_token = 'd28c58ff7ff860f2af444a56502fe997'
client = Client(account_sid, auth_token)

message = client.messages \
                .create(
                     body="We're no strangers to love",
                     from_='+19124553556',
                     to='+14058813600'
                 )

print(message.sid)
