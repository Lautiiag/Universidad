# 1. Importación de dependencias y lectura de datos
if (!require(readxl)) install.packages("readxl")
library(readxl)

archivo <- file.choose()
datos <- read_excel(archivo)

# Renombrado de columnas por palabra clave para evitar errores por espacios ocultos
colnames(datos)[grep("TIEMPO", toupper(colnames(datos)))] <- "Tiempo_Estudio"
colnames(datos)[grep("SATISFACC", toupper(colnames(datos)))] <- "Satisfaccion"

# 2. Frecuencias para Tiempo en horas semanales dedicadas al estudio (Consigna a)
k_estudio <- round(1 + 3.322 * log10(nrow(datos)))
tiempo_estudio_agrupado <- cut(datos$Tiempo_Estudio, breaks = k_estudio)

freq_abs_est <- table(tiempo_estudio_agrupado)
freq_rel_est <- prop.table(freq_abs_est)

tabla_estudio <- cbind(Frecuencia_Absoluta = freq_abs_est, 
                       Frecuencia_Relativa = freq_rel_est, 
                       Frecuencia_Acumulada = cumsum(as.numeric(freq_abs_est)),
                       Frecuencia_Rel_Acumulada = cumsum(as.numeric(freq_rel_est)))

# 3. Frecuencias para Nivel de satisfacción con la Carrera (Consigna b)
# Los cálculos se hacen con valores numéricos de la tabla (1, 2, 3, 4)
freq_abs_sat <- table(datos$Satisfaccion)
freq_rel_sat <- prop.table(freq_abs_sat)

tabla_satisfaccion <- cbind(Frecuencia_Absoluta = freq_abs_sat, 
                            Frecuencia_Relativa = freq_rel_sat, 
                            Frecuencia_Acumulada = cumsum(as.numeric(freq_abs_sat)),
                            Frecuencia_Rel_Acumulada = cumsum(as.numeric(freq_rel_sat)))

# Conversión de las etiquetas de fila solo para la impresión
tabla_satisfaccion_print <- as.data.frame(tabla_satisfaccion)
etiquetas <- c("1" = "Muy satisfecho", "2" = "Satisfecho", "3" = "Insatisfecho", "4" = "Muy insatisfecho") #IMPORTANTE -> Equivalencias
rownames(tabla_satisfaccion_print) <- etiquetas[rownames(tabla_satisfaccion_print)]

# 4. Impresión de resultados
print("--- Tiempo en Horas Semanales Dedicadas al Estudio ---")
print(tabla_estudio)

print("--- Nivel de Satisfacción con la Carrera ---")
print(tabla_satisfaccion_print)