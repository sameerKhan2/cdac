#!/bin/bash

while read line
do
uid=$(echo "$line" |cut -d":" -f3)
if [ $uid -gt 500 ]
then
var=$(echo "$line" | grep "$uid"|cut -d":" -f1)
echo "$uid"" ---->>>> " "$var"
fi
done < /etc/passwd