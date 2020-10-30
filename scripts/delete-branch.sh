#!/bin/bash

bname=$1

if [[ -n "$bname" ]]; then
	echo ' '
	echo Deleting branch $bname
	sleep 1
	echo ' '
	#git branch -D 
	git push origin --delete $bname
else
	echo ' '
        echo ERROR: Provide name of the branch...

fi
	
echo ' '
echo done...


