#!/bin/bash



while read line

do

uid=$(echo "$line" | awk -F':' '{print $3}')

username=$(echo "$line" | awk -F':' '{print $1}')

if [ "$uid" -gt 500 ]
        then
                echo "$username"
fi

done < /etc/passwd