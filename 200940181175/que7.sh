#!/bin/bash

cat /etc/passwd | cut -d":" -f1 > username.txt

while read line 
do
type=$(passwd -S "$line" |grep "L")
if [ -n $type ]
then
echo "Locked"
else
echo "Not locked"
fi
done < username.txt