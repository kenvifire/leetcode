## solution 1
awk '{if(NR==10) print $0}' file.txt

## solution 2
head -10 file.txt | tail -1
