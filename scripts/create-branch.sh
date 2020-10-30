#!/bin/bash

bname=$1

if [[ -n "$bname" ]]; then
	echo ' '
	echo Creating branch $bname
	sleep 1
	echo ' '
	git checkout -b $bname
	git add .
else
	echo ' '
        echo ERROR: Provide name of the branch...

fi
	
echo ' '
echo done...


