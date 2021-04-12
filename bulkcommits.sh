string=""
x=1
j=1
while [ $x -le 1000 ]
do
filename="touch randfile_$((j+x)) && git add . && git commit -m '$((j+x)):randfile_$((j+x))'"
echo $filename
eval "$filename"
x=$[$x+1]
done
