if (!require(readxl)) install.packages("readxl")
library(readxl)
archivo<-file.choose()
datos<-read_excel(archivo)

#ACTIVIDAD 1
#Variable Cuantitavia Categórica
tabla_lenguajes<-table(datos$Lenguaje_Favorito)
tabla_lenguajes

#Variable Cuantitavia Discreta
tabla<-table(datos$Proyectos_Completados)
f_acum<-cumsum(tabla)
f_rel<-prop.table(tabla)
f_rel_acum<-cumsum(f_rel)
tabla_frecuencia<-data.frame(
  Proyectos = names(tabla),
  Frec = as.vector(tabla),
  Frec_Acum = as.vector(f_acum), 
  Frec_Rel = round(as.vector(f_rel), 3),
  Frec_Rel_Acum = round(as.vector(f_rel_acum), 3)
)
print(tabla_frecuencia, row.names = FALSE)

#ACTIVIDAD 2
set.seed(123)
tiempos<-round(rnorm(47, mean=55, sd=15), 1)
tiempos<-ifelse(tiempos<0, 0, tiempos)
tiempos
n<-length(tiempos)
k<-ceiling(1+3.322*log10(n))
k
rango<-range(tiempos)
amplitud<-ceiling((rango[2]-rango[1]) / k)
rango
amplitud
breaks<- seq(floor(rango[1]), ceiling(rango[2])+amplitud, by=amplitud)
clases<-cut(tiempos, breaks = breaks, right=FALSE)
head(clases)
tabla_tiempos<-table(clases)
f_acum<-cumsum(tabla_tiempos)
f_rel<-prop.table(tabla_tiempos)
f_rel_acum<-cumsum(f_rel)
tabla_final<-data.frame(
  Intervalo=levels(clases),
  Frecuencia=as.vector(tabla_tiempos),
  Frec_Acumulada=as.vector(f_acum),
  Frec_Relativa=round(as.vector(f_rel), 3),
  Frec_Rel_Acum=round(as.vector(f_rel_acum), 3)
)
tabla_final