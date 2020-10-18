#!/bin/bash

read name

id=$(ps -elf |grep "$name" |awk -F' ' '{print $5}')

echo $id
