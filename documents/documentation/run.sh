#!/bin/sh

#cd graphics
#mogrify -format eps *.pdf
#cd ..
rm -f *.aux *.bbl *.blg *.dvi *.log *.pdf
latex main.tex
bibtex main.aux
pdflatex main.tex
pdflatex main.tex
rm -f *.dvi
