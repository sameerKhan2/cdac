#!/bin/bash

echo "please enter the correct the process name"

read name 
var=$( pgrep $name)

echo "$var"



