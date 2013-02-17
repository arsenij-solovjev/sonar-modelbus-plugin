mogrify -format eps *.png
mogrify -format eps *.jpg
latex main.tex
bibtex main.aux
pdflatex main.tex
pdflatex main.tex