#!/bin/bash

echo "please enter user name "

read var

echo "please enter password "

read pass

sudo useradd -m "$var" -p "$pass"  