#!/bin/bash


echo "please enter correct path"

read path

if [ -d $path ]
then 
echo " this is a directory"
elif [ -f $path ]
then
echo "it's file"
else
echo "please write correct path"
fi