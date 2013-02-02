mogrify -format eps *.png
latex main.tex
bibtex main.aux
pdflatex main.tex
pdflatex main.tex