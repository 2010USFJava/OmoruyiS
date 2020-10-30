#!/bin/bash

bname=$1

if [[ -n "$bname" ]]; then
	echo ' '
	echo Creating branch $bname
	sleep 1
	echo ' '
	git checkout -b $bname
	sleep 1
	git push origin $bname
	sleep 1
	
	echo ' '
	echo Returning to main branch
	echo ' '
	git checkout main
else
	echo ' '
        echo ERROR: Provide name of the branch...

fi
	
echo ' '
echo done...


