# output as png image
set terminal png size 600,600
# save file to "benchmark.png"
set output "benchmark.png"
# graph a title
#set title "Benchmarking"
# nicer aspect ratio for image size
set size 1,0.7
# y-axis grid
set grid y
# x-axis label
set xlabel "request"
# y-axis label
set ylabel "response time (ms)"
# plot data from "server1.txt" and "server2.txt" using column 9 with smooth sbezier lines
plot "ftl.tsv" using 9 smooth sbezier with lines title "FTL", \
     "httl.tsv" using 9 smooth sbezier with lines title "HTTL", \
     "vm.tsv" using 9 smooth sbezier with lines title "VM"
